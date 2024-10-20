package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.c;
import androidx.fragment.app.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC7423lm0 extends c implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler b0;
    public boolean k0;
    public Dialog m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final RunnableC5705gm0 c0 = new RunnableC5705gm0(this);
    public final DialogInterfaceOnCancelListenerC6049hm0 d0 = new DialogInterfaceOnCancelListenerC6049hm0(this);
    public final DialogInterfaceOnDismissListenerC6392im0 e0 = new DialogInterfaceOnDismissListenerC6392im0(this);
    public int f0 = 0;
    public int g0 = 0;
    public boolean h0 = true;
    public boolean i0 = true;
    public int j0 = -1;
    public final C6735jm0 l0 = new C6735jm0(this);
    public boolean q0 = false;

    public void onCancel(DialogInterface dialogInterface) {
    }

    public final void N0(int i) {
        this.f0 = 2;
        this.g0 = R.style.Theme.Panel;
        if (i != 0) {
            this.g0 = i;
        }
    }

    public void Q0(h hVar, String str) {
        this.o0 = false;
        this.p0 = true;
        hVar.getClass();
        C10547us c10547us = new C10547us(hVar);
        c10547us.p = true;
        c10547us.g(0, this, str, 1);
        c10547us.e(false);
    }

    public final void P0(C10547us c10547us, String str) {
        this.o0 = false;
        this.p0 = true;
        c10547us.g(0, this, str, 1);
        this.n0 = false;
        this.j0 = c10547us.e(false);
    }

    public final void dismissAllowingStateLoss() {
        L0(true, false);
    }

    public final void L0(boolean z, boolean z2) {
        if (this.o0) {
            return;
        }
        this.o0 = true;
        this.p0 = false;
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.m0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.b0.getLooper()) {
                    onDismiss(this.m0);
                } else {
                    this.b0.post(this.c0);
                }
            }
        }
        this.n0 = true;
        if (this.j0 >= 0) {
            h M = M();
            int i = this.j0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Bad id: ", i));
            }
            M.u(new C10748vT0(M, i, 1), z);
            this.j0 = -1;
            return;
        }
        C10547us c10547us = new C10547us(M());
        c10547us.p = true;
        c10547us.i(this);
        if (!z) {
            c10547us.e(false);
        } else {
            c10547us.e(true);
        }
    }

    public final Dialog getDialog() {
        return this.m0;
    }

    public final boolean getShowsDialog() {
        return this.i0;
    }

    @Override // androidx.fragment.app.c
    public void f0(Context context) {
        Object obj;
        super.f0(context);
        G02 g02 = this.W;
        g02.getClass();
        G02.a("observeForever");
        C6735jm0 c6735jm0 = this.l0;
        AE1 ae1 = new AE1(g02, c6735jm0);
        IT2 it2 = g02.b;
        ET2 a = it2.a(c6735jm0);
        if (a != null) {
            obj = a.g;
        } else {
            ET2 et2 = new ET2(c6735jm0, ae1);
            it2.i++;
            ET2 et22 = it2.g;
            if (et22 == null) {
                it2.a = et2;
                it2.g = et2;
            } else {
                et22.h = et2;
                et2.i = et22;
                it2.g = et2;
            }
            obj = null;
        }
        CE1 ce1 = (CE1) obj;
        if (ce1 instanceof BE1) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (ce1 == null) {
            ae1.e(true);
        }
        if (this.p0) {
            return;
        }
        this.o0 = false;
    }

    @Override // androidx.fragment.app.c
    public void g0(Bundle bundle) {
        super.g0(bundle);
        this.b0 = new Handler();
        this.i0 = this.C == 0;
        if (bundle != null) {
            this.f0 = bundle.getInt("android:style", 0);
            this.g0 = bundle.getInt("android:theme", 0);
            this.h0 = bundle.getBoolean("android:cancelable", true);
            this.i0 = bundle.getBoolean("android:showsDialog", this.i0);
            this.j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.c
    public final void x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x0(layoutInflater, viewGroup, bundle);
        if (this.L != null || this.m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.m0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.c
    public final LayoutInflater m0(Bundle bundle) {
        LayoutInflater m0 = super.m0(bundle);
        boolean z = this.i0;
        if (!z || this.k0) {
            return m0;
        }
        if (z && !this.q0) {
            try {
                this.k0 = true;
                Dialog M0 = M0(bundle);
                this.m0 = M0;
                if (this.i0) {
                    O0(M0, this.f0);
                    Context K = K();
                    if (K instanceof Activity) {
                        this.m0.setOwnerActivity((Activity) K);
                    }
                    this.m0.setCancelable(this.h0);
                    this.m0.setOnCancelListener(this.d0);
                    this.m0.setOnDismissListener(this.e0);
                    this.q0 = true;
                } else {
                    this.m0 = null;
                }
            } finally {
                this.k0 = false;
            }
        }
        Dialog dialog = this.m0;
        return dialog != null ? m0.cloneInContext(dialog.getContext()) : m0;
    }

    public void O0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog M0(Bundle bundle) {
        return new DialogC8536p00(B0(), this.g0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.n0) {
            return;
        }
        L0(true, true);
    }

    @Override // androidx.fragment.app.c
    public void s0(Bundle bundle) {
        Dialog dialog = this.m0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.g0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.h0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.i0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.j0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.c
    public void c0() {
        this.f11484J = true;
    }

    @Override // androidx.fragment.app.c
    public void w0(Bundle bundle) {
        Bundle bundle2;
        this.f11484J = true;
        if (this.m0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.m0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.c
    public void t0() {
        this.f11484J = true;
        Dialog dialog = this.m0;
        if (dialog != null) {
            this.n0 = false;
            dialog.show();
            View decorView = this.m0.getWindow().getDecorView();
            decorView.setTag(com.android.chrome.R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(com.android.chrome.R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(com.android.chrome.R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.c
    public void u0() {
        this.f11484J = true;
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.c
    public void k0() {
        this.f11484J = true;
        Dialog dialog = this.m0;
        if (dialog != null) {
            this.n0 = true;
            dialog.setOnDismissListener(null);
            this.m0.dismiss();
            if (!this.o0) {
                onDismiss(this.m0);
            }
            this.m0 = null;
            this.q0 = false;
        }
    }

    @Override // androidx.fragment.app.c
    public void l0() {
        this.f11484J = true;
        if (!this.p0 && !this.o0) {
            this.o0 = true;
        }
        G02 g02 = this.W;
        g02.getClass();
        G02.a("removeObserver");
        CE1 ce1 = (CE1) g02.b.b(this.l0);
        if (ce1 == null) {
            return;
        }
        ce1.f();
        ce1.e(false);
    }

    @Override // androidx.fragment.app.c
    public final ZS0 G() {
        return new C7079km0(this, new LS0(this));
    }
}
