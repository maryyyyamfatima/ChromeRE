package org.chromium.chrome.browser.signin;

import android.os.Bundle;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractActivityC4038bu3;
import defpackage.C10547us;
import defpackage.C4998ej;
import defpackage.ZX1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncConsentActivity extends AbstractActivityC4038bu3 {
    public static final /* synthetic */ int B = 0;

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e027b);
        h h0 = h0();
        if (h0.A(R.id.fragment_container) == null) {
            Bundle bundleExtra = getIntent().getBundleExtra("SigninActivity.FragmentArgs");
            SyncConsentFragment syncConsentFragment = new SyncConsentFragment();
            syncConsentFragment.E0(bundleExtra);
            C10547us c10547us = new C10547us(h0);
            c10547us.g(R.id.fragment_container, syncConsentFragment, null, 1);
            c10547us.e(false);
        }
    }

    @Override // defpackage.LM
    public final ZX1 p0() {
        return new ZX1(new C4998ej(this));
    }
}
