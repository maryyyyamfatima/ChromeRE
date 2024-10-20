package org.chromium.chrome.browser.autofill.settings;

import J.N;
import android.os.Bundle;
import android.view.View;
import com.android.chrome.R;
import defpackage.A43;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC5103f04;
import defpackage.C0780Ga;
import defpackage.C1293Jy2;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AndroidPaymentAppsFragment extends AbstractC0123Ay2 {
    public static final /* synthetic */ int j0 = 0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1407ef);
        C1293Jy2 c1293Jy2 = this.c0;
        Q0(c1293Jy2.a(c1293Jy2.a));
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        super.v0(view, bundle);
        this.d0.p0(null);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        N0().a0();
        N0().W = true;
        C0780Ga c0780Ga = new C0780Ga(this);
        Object obj = ThreadUtils.a;
        if (!N.M1X7xdZV("ServiceWorkerPaymentApps")) {
            PostTask.c(AbstractC5103f04.a, new A43(c0780Ga));
        } else {
            N.MFeChwbo(c0780Ga);
        }
    }
}
