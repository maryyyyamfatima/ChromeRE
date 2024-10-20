package defpackage;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uv2 */
/* loaded from: classes.dex */
public final class DialogFragmentC10568uv2 extends DialogFragment implements InterfaceC5864hD2 {
    public final C6208iD2 a = new C6208iD2(this);

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6208iD2 c6208iD2 = this.a;
        c6208iD2.getClass();
        if (OP0.b == null) {
            c6208iD2.a.dismissAllowingStateLoss();
        }
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.d(viewGroup);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a.f(getView());
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.a.e();
        super.onDestroy();
    }
}
