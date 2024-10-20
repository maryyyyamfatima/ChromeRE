package defpackage;

import android.content.Intent;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.signin.SigninFirstRunFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ma3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1563Ma3 implements Callback {
    public final /* synthetic */ SigninFirstRunFragment a;

    public /* synthetic */ C1563Ma3(SigninFirstRunFragment signinFirstRunFragment) {
        this.a = signinFirstRunFragment;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Intent intent = (Intent) obj;
        int i = SigninFirstRunFragment.k0;
        SigninFirstRunFragment signinFirstRunFragment = this.a;
        if (intent != null) {
            signinFirstRunFragment.startActivityForResult(intent, 1);
        } else {
            AbstractC0399Db3.a(signinFirstRunFragment.getActivity());
        }
    }
}
