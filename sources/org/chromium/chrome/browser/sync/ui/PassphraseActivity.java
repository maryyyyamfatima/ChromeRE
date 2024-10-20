package org.chromium.chrome.browser.sync.ui;

import J.N;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.appcompat.app.a;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractC1658Mt3;
import defpackage.C10547us;
import defpackage.C1202Jg1;
import defpackage.C12272zt3;
import defpackage.C5007ek2;
import defpackage.C7629mN;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.InterfaceC10062tT0;
import defpackage.InterfaceC8788pk2;
import java.util.ArrayList;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PassphraseActivity extends a implements InterfaceC8788pk2, InterfaceC10062tT0 {
    public static final /* synthetic */ int z = 0;
    public C5007ek2 y;

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7629mN.a().d(false);
        h h0 = h0();
        if (h0.l == null) {
            h0.l = new ArrayList();
        }
        h0.l.add(this);
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        if (CoreAccountInfo.a(C1202Jg1.b(d).b(1)) == null) {
            finish();
            return;
        }
        if (getFragmentManager().findFragmentByTag("passphrase_fragment") != null) {
            return;
        }
        if (!AbstractC1658Mt3.b().h()) {
            if (this.y == null) {
                this.y = new C5007ek2(this);
                AbstractC1658Mt3.b().a(this.y);
            }
            h h0 = h0();
            h0.getClass();
            C10547us c10547us = new C10547us(h0);
            c10547us.c();
            new SpinnerDialogFragment().P0(c10547us, "spinner_fragment");
            return;
        }
        h h02 = h0();
        h02.getClass();
        C10547us c10547us2 = new C10547us(h02);
        c10547us2.c();
        new PassphraseDialogFragment().P0(c10547us2, "passphrase_fragment");
    }

    @Override // defpackage.InterfaceC8788pk2
    public final void F() {
        Object obj = ThreadUtils.a;
        if (!C12272zt3.j) {
            if (AbstractC1658Mt3.b() != null) {
                C12272zt3.i = new C12272zt3();
            }
            C12272zt3.j = true;
        }
        C12272zt3.i.B();
        finish();
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.y != null) {
            AbstractC1658Mt3.b().l(this.y);
            this.y = null;
        }
    }

    @Override // defpackage.InterfaceC8788pk2
    public final boolean t(String str) {
        if (str.isEmpty() || !N.MVem29BX(((SyncServiceImpl) AbstractC1658Mt3.b()).c, str)) {
            return false;
        }
        finish();
        return true;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SpinnerDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
        @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
        public final Dialog M0(Bundle bundle) {
            ProgressDialog progressDialog = new ProgressDialog(getActivity());
            progressDialog.setMessage(N().getString(R.string.0_resource_name_obfuscated_res_0x7f140ae8));
            return progressDialog;
        }
    }
}
