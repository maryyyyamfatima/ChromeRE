package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mw4 */
/* loaded from: classes.dex */
public final class C7831mw4 extends DialogInterfaceOnCancelListenerC7423lm0 {
    public final C6781jt4 r0 = new C6781jt4(this, new C7813mt4(), Js4.b, Es4.a, Gs4.a);

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void f0(Context context) {
        super.f0(context);
        this.r0.d();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        int i;
        boolean isInMultiWindowMode;
        super.g0(bundle);
        this.r0.g.a(2);
        if (Build.VERSION.SDK_INT >= 24) {
            isInMultiWindowMode = ((VS0) getActivity()).isInMultiWindowMode();
            if (isInMultiWindowMode) {
                i = R.style.Theme.Black.NoTitleBar;
                N0(i);
            }
        }
        i = R.style.Theme.Black.NoTitleBar.Fullscreen;
        N0(i);
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6781jt4 c6781jt4 = this.r0;
        c6781jt4.g.a(3);
        c6781jt4.f();
        FrameLayout frameLayout = c6781jt4.i;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void k0() {
        super.k0();
        C6781jt4 c6781jt4 = this.r0;
        c6781jt4.g.a(12);
        c6781jt4.i = null;
        c6781jt4.h = null;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void l0() {
        super.l0();
        C6781jt4 c6781jt4 = this.r0;
        c6781jt4.g.a(14);
        c6781jt4.l.c();
        c6781jt4.n = false;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        this.r0.a(bundle);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void u0() {
        super.u0();
        this.r0.g.a(11);
    }

    @Override // androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        this.r0.g.a(4);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        C6781jt4 c6781jt4 = this.r0;
        c6781jt4.g.a(6);
        c6781jt4.c(bundle);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
        this.r0.g.a(7);
    }

    @Override // androidx.fragment.app.c
    public final void e0() {
        this.f11484J = true;
        this.r0.d();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void c0() {
        this.f11484J = true;
        this.r0.g.a(5);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        this.r0.g.a(8);
    }

    @Override // androidx.fragment.app.c
    public final void p0() {
        this.f11484J = true;
        this.r0.g.a(9);
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        this.f11484J = true;
        C6781jt4 c6781jt4 = this.r0;
        c6781jt4.g.a(13);
        c6781jt4.l.c();
    }
}
