package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jD2 */
/* loaded from: classes.dex */
public final class C6550jD2 extends DialogInterfaceOnCancelListenerC7423lm0 implements InterfaceC5864hD2 {
    public final C6208iD2 r0 = new C6208iD2(this);

    @Override // androidx.fragment.app.c, defpackage.InterfaceC5864hD2
    public final /* bridge */ /* synthetic */ Activity getActivity() {
        return (VS0) super.getActivity();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        C6208iD2 c6208iD2 = this.r0;
        c6208iD2.getClass();
        if (OP0.b == null) {
            c6208iD2.a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.r0.d(viewGroup);
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.r0.e();
        this.f11484J = true;
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        this.r0.f(this.L);
    }
}
