package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mG1 */
/* loaded from: classes2.dex */
public final class C7596mG1 extends C7034ke3 {
    public C7596mG1(Profile profile) {
        super(9, "android.permission.ACCESS_COARSE_LOCATION", profile);
    }

    @Override // defpackage.C7034ke3
    public final boolean e() {
        return RG1.b().d();
    }

    @Override // defpackage.C7034ke3
    public final boolean n(Context context) {
        if (d(context) && e()) {
            return false;
        }
        BrowserContextHandle browserContextHandle = this.a;
        return N.MJSt3Ocq(browserContextHandle, 4) || N.MB23OvTV(browserContextHandle, 4);
    }

    @Override // defpackage.C7034ke3
    public final Intent h() {
        if (e()) {
            return null;
        }
        return RG1.b().c();
    }

    @Override // defpackage.C7034ke3
    public final String i(Context context) {
        Resources resources = context.getResources();
        if (d(context)) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1401e3);
        }
        return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1401e2);
    }
}
