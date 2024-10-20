package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class R83 {
    public static void a(int i, String str) {
        new C6861k72(V60.a).b(i, str);
    }

    public static void b(int i, String str, int i2, C4705dr2 c4705dr2, C4705dr2 c4705dr22, C4705dr2 c4705dr23, C4705dr2 c4705dr24, String str2, String str3, int i3, int i4, int i5, boolean z) {
        Bitmap decodeResource;
        Context context = V60.a;
        Resources resources = context.getResources();
        PO a = X72.a("sharing", new C7893n72(i, str, i2));
        a.a.f(str2);
        K62 k62 = a.a;
        k62.e(str3);
        J62 j62 = new J62();
        j62.d = K62.c(str3);
        k62.k(j62);
        k62.w = context.getColor(i5);
        k62.r = str;
        k62.k = 1;
        a.l(i3);
        k62.d(true);
        k62.g(-1);
        if (c4705dr2 != null) {
            if (!z || Build.VERSION.SDK_INT < 31) {
                a.f(c4705dr2);
            } else {
                k62.g = c4705dr2.a;
            }
        }
        if (c4705dr22 != null) {
            a.i(c4705dr22);
        }
        if (c4705dr23 != null) {
            a.a(R.drawable.f47170_resource_name_obfuscated_res_0x7f0901d8, resources.getString(R.string.f87660_resource_name_obfuscated_res_0x7f140a9c), c4705dr23, 26);
        }
        if (c4705dr24 != null) {
            a.a(R.drawable.f47090_resource_name_obfuscated_res_0x7f0901cf, resources.getString(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4), c4705dr24, 27);
        }
        if (i4 != 0 && (decodeResource = BitmapFactory.decodeResource(resources, i4)) != null) {
            a.j(decodeResource);
        }
        W72 d = a.d();
        C6861k72 c6861k72 = new C6861k72(context);
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(i, notification);
    }
}
