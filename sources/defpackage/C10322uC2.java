package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.base.AccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uC2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10322uC2 implements A2 {
    public final Context a;
    public final int b;
    public C9636sC2 c;
    public final BitmapDrawable e;
    public final HashMap d = new HashMap();
    public final C12157za2 f = new C12157za2();
    public final HashMap g = new HashMap();

    public final void d(AccountInfo accountInfo) {
        BitmapDrawable bitmapDrawable;
        if (accountInfo == null) {
            return;
        }
        String str = accountInfo.d;
        boolean isEmpty = TextUtils.isEmpty(str);
        Bitmap bitmap = accountInfo.f;
        String str2 = accountInfo.e;
        boolean z = (isEmpty && TextUtils.isEmpty(str2) && bitmap == null) ? false : true;
        HashMap hashMap = this.d;
        if (!z) {
            String email = accountInfo.getEmail();
            if ((hashMap.get(email) != null ? (C9636sC2) hashMap.get(email) : this.c) == null) {
                return;
            }
        }
        String email2 = accountInfo.getEmail();
        int i = this.b;
        Context context = this.a;
        if (bitmap != null) {
            bitmapDrawable = AbstractC6770js.a(context.getResources(), bitmap, i);
        } else {
            bitmapDrawable = this.e;
        }
        C9636sC2 c9636sC2 = hashMap.get(email2) != null ? (C9636sC2) hashMap.get(email2) : this.c;
        if (c9636sC2 != null) {
            Point point = c9636sC2.d;
            int i2 = point.x;
            int i3 = c9636sC2.c;
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(i2 + i3, i), Math.max(point.y + i3, i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            bitmapDrawable.setBounds(0, 0, i, i);
            bitmapDrawable.draw(canvas);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            int i4 = i3 / 2;
            canvas.drawCircle(point.x + i4, point.y + i4, i4 + c9636sC2.e, paint);
            int i5 = point.x;
            int i6 = point.y;
            Drawable drawable = c9636sC2.b;
            drawable.setBounds(i5, i6, i5 + i3, i3 + i6);
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
        }
        this.g.put(email2, new C6073hq0(bitmapDrawable, email2, str, str2));
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9979tC2) c11814ya2.next()).u(email2);
            }
        }
    }

    public C10322uC2(Context context, int i, C9636sC2 c9636sC2) {
        this.a = context;
        this.b = i;
        this.c = c9636sC2;
        Drawable a = AbstractC2884Wf.a(context, R.drawable.f51120_resource_name_obfuscated_res_0x7f090374);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        a.setBounds(0, 0, i, i);
        a.draw(canvas);
        this.e = new BitmapDrawable(context.getResources(), createBitmap);
        D2.b().g(new C8265oC2(this));
    }

    public static C10322uC2 b(Context context) {
        return new C10322uC2(context, context.getResources().getDimensionPixelSize(R.dimen.f42690_resource_name_obfuscated_res_0x7f08082b), null);
    }

    public final C6073hq0 c(String str) {
        C6073hq0 c6073hq0 = (C6073hq0) this.g.get(str);
        return c6073hq0 == null ? new C6073hq0(this.e, str, null, null) : c6073hq0;
    }

    public final void a(InterfaceC9979tC2 interfaceC9979tC2) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = this.f;
        if (c12157za2.isEmpty()) {
            D2.b().g(new Callback() { // from class: nC2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    C10322uC2 c10322uC2 = C10322uC2.this;
                    c10322uC2.getClass();
                    ((C2) obj2).h.a(c10322uC2);
                }
            });
        }
        c12157za2.a(interfaceC9979tC2);
    }

    public final void e(InterfaceC9979tC2 interfaceC9979tC2) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = this.f;
        c12157za2.d(interfaceC9979tC2);
        if (c12157za2.isEmpty()) {
            D2.b().g(new Callback() { // from class: mC2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    C10322uC2 c10322uC2 = C10322uC2.this;
                    c10322uC2.getClass();
                    ((C2) obj2).h.d(c10322uC2);
                }
            });
        }
    }
}
