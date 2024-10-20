package defpackage;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F11 extends AbstractBinderC6794jw {
    public final WeakReference a;

    public F11(I11 i11) {
        this.a = new WeakReference(i11);
    }

    @Override // defpackage.InterfaceC11157wf1
    public final void H(SignInResponse signInResponse) {
        I11 i11 = (I11) this.a.get();
        if (i11 == null) {
            return;
        }
        i11.a.i(new E11(i11, i11, signInResponse));
    }
}
