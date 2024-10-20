package defpackage;

import android.content.Context;
import com.android.chrome.R;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class O40 {
    public static KH a;

    public static boolean a(WebContents webContents, R40 r40, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str) {
        if (a == null) {
            return false;
        }
        if (!((webContents == null || webContents.isDestroyed() || webContents.s() != 2) ? false : true)) {
            return false;
        }
        KH kh = a;
        WindowAndroid Q0 = webContents.Q0();
        kh.getClass();
        P40 p40 = new P40(Q0, new C5233fP((Context) Q0.j.get()), r40, z, z2, z3, z4, z5, z6, str);
        p40.getWindow().getAttributes().windowAnimations = R.style.f97100_resource_name_obfuscated_res_0x7f15021a;
        p40.show();
        return true;
    }
}
