package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12167zc0 implements InterfaceC11481xc0 {
    public final PendingIntent a;
    public final int b;
    public Bitmap c;
    public String d;
    public final boolean e;
    public final boolean f;

    public C12167zc0(int i, Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z, boolean z2) {
        this.b = i;
        this.c = bitmap;
        this.d = str;
        this.a = pendingIntent;
        this.e = z;
        this.f = z2;
    }

    public final BitmapDrawable c(Activity activity) {
        if (this.e) {
            return new LN3(activity, this.c);
        }
        return new BitmapDrawable(activity.getResources(), this.c);
    }

    public static C12167zc0 b(Context context, Bundle bundle, boolean z, boolean z2) {
        boolean z3;
        if (bundle == null) {
            return null;
        }
        if (z2 && !bundle.containsKey("android.support.customtabs.customaction.ID")) {
            return null;
        }
        int m = AbstractC2281Ro1.m("android.support.customtabs.customaction.ID", 0, bundle);
        Bitmap bitmap = (Bitmap) AbstractC2281Ro1.r("android.support.customtabs.customaction.ICON", bundle);
        Bitmap bitmap2 = bitmap == null ? null : bitmap;
        if (bitmap2 == null) {
            AbstractC4851eH1.a("CustomTabs", "Invalid action button: bitmap not present in bundle!", new Object[0]);
            return null;
        }
        String d = d(bundle);
        if (TextUtils.isEmpty(d)) {
            AbstractC4851eH1.a("CustomTabs", "Invalid action button: content description not present in bundle!", new Object[0]);
            try {
                bundle.remove("android.support.customtabs.customaction.ICON");
            } catch (Throwable unused) {
                AbstractC4851eH1.a("CustomTabs", "Failed to remove icon extra from the intent", new Object[0]);
            }
            bitmap2.recycle();
            return null;
        }
        boolean z4 = m == 0 || AbstractC2281Ro1.i(bundle, "android.support.customtabs.customaction.SHOW_ON_TOOLBAR", false);
        if (!z4 || a(context, bitmap2)) {
            z3 = z4;
        } else {
            AbstractC4851eH1.f("CustomTabs", "Button's icon not suitable for toolbar, putting it to bottom bar instead.See: https://developer.android.com/reference/android/support/customtabs/CustomTabsIntent.html#KEY_ICON", new Object[0]);
            z3 = false;
        }
        PendingIntent pendingIntent = (PendingIntent) AbstractC2281Ro1.r("android.support.customtabs.customaction.PENDING_INTENT", bundle);
        if (z3 && pendingIntent == null) {
            AbstractC4851eH1.f("CustomTabs", "Invalid action button on toolbar: pending intent not present in bundle!", new Object[0]);
            try {
                bundle.remove("android.support.customtabs.customaction.ICON");
            } catch (Throwable unused2) {
                AbstractC4851eH1.a("CustomTabs", "Failed to remove icon extra from the intent", new Object[0]);
            }
            bitmap2.recycle();
            return null;
        }
        return new C12167zc0(m, bitmap2, d, pendingIntent, z, z3);
    }

    public static String d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String u = AbstractC2281Ro1.u("android.support.customtabs.customaction.DESCRIPTION", bundle);
        if (TextUtils.isEmpty(u)) {
            return null;
        }
        return u;
    }

    public static boolean a(Context context, Bitmap bitmap) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f42310_resource_name_obfuscated_res_0x7f080804);
        return bitmap.getHeight() >= dimensionPixelSize && (bitmap.getWidth() / bitmap.getHeight()) * dimensionPixelSize <= dimensionPixelSize * 2;
    }
}
