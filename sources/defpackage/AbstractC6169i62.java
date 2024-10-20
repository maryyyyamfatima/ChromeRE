package defpackage;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i62 */
/* loaded from: classes.dex */
public abstract class AbstractC6169i62 {
    public final int a;
    public final int b;
    public final C6964kR2 c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public String g;
    public CharSequence h;
    public Bitmap i;
    public int j;
    public Bitmap k;
    public Bitmap l;
    public C4705dr2 m;
    public C4705dr2 n;
    public final ArrayList o = new ArrayList(2);
    public C5825h62 p;
    public int q;
    public long[] r;
    public boolean s;
    public long t;
    public boolean u;
    public Bitmap v;

    public abstract W72 c(C7893n72 c7893n72);

    public AbstractC6169i62(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
        this.b = resources.getDimensionPixelSize(R.dimen.notification_large_icon_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_height);
        this.c = new C6964kR2(dimensionPixelSize, dimensionPixelSize2, Math.min(dimensionPixelSize, dimensionPixelSize2) / 2, -6908266, resources.getDisplayMetrics().density * 28.0f);
    }

    public final void b(Bitmap bitmap, String str, C4705dr2 c4705dr2, int i, String str2) {
        ArrayList arrayList = this.o;
        if (arrayList.size() == 2) {
            throw new IllegalStateException("Cannot add more than 2 actions.");
        }
        if (bitmap != null) {
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            new Canvas(bitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        arrayList.add(new C5825h62(bitmap, g(str), c4705dr2, i, str2));
    }

    public final Bitmap f() {
        Bitmap bitmap = this.v;
        CharSequence charSequence = this.f;
        if (bitmap == null || bitmap.getWidth() == 0) {
            if (charSequence != null) {
                return this.c.b(charSequence.toString(), true);
            }
            return null;
        }
        int width = bitmap.getWidth();
        int i = this.b;
        int i2 = this.a;
        return (width > i2 || bitmap.getHeight() > i) ? Bitmap.createScaledBitmap(bitmap, i2, i, false) : bitmap;
    }

    public final Notification d(Context context) {
        CharSequence charSequence;
        PO a = X72.a(this.g, null);
        a.a.e(context.getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f1406ef));
        a.l(com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        int i = Build.VERSION.SDK_INT;
        if (i > 23) {
            a.n(this.f);
        } else {
            a.h(this.f);
            a.a.l = false;
        }
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            a.m(Icon.createWithBitmap(bitmap.copy(bitmap.getConfig(), true)));
        } else if (i <= 23 && (charSequence = this.f) != null) {
            a.j(this.c.b(charSequence.toString(), true));
        }
        return a.c();
    }

    public static CharSequence g(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT != 23) {
            return true;
        }
        String[] strArr = {"samsung", "yulong", "lenovo", "zuk", "hisense", "leeco"};
        for (int i = 0; i < 6; i++) {
            if (Build.MANUFACTURER.equalsIgnoreCase(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void a(PO po, C5825h62 c5825h62) {
        E62 e62;
        PendingIntent pendingIntent = c5825h62.d.a;
        CharSequence charSequence = c5825h62.c;
        Bitmap bitmap = c5825h62.b;
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = bitmap;
            e62 = new E62(iconCompat, charSequence, pendingIntent);
        } else {
            int i = c5825h62.a;
            e62 = new E62(i != 0 ? IconCompat.b(null, "", i) : null, charSequence, pendingIntent, new Bundle());
        }
        if (c5825h62.e == 1) {
            C7283lM2 c7283lM2 = new C7283lM2("key_text_reply", c5825h62.g, true, new Bundle(), new HashSet());
            if (e62.f == null) {
                e62.f = new ArrayList();
            }
            e62.f.add(c7283lM2);
        }
        K62 k62 = po.a;
        int i2 = c5825h62.f;
        if (i2 != -1) {
            F62 a = e62.a();
            a.j = U62.b(1, i2, po.b, new C4705dr2(a.j, c5825h62.d.b, 0));
            k62.b.add(a);
            return;
        }
        k62.b.add(e62.a());
    }
}
