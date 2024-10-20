package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sP1 */
/* loaded from: classes.dex */
public class C9700sP1 extends DialogInterfaceOnCancelListenerC7423lm0 {
    public DialogC9357rP1 r0;
    public C6614jQ1 s0;

    public C9700sP1() {
        this.h0 = true;
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final void R0() {
        if (this.s0 == null) {
            Bundle bundle = this.l;
            if (bundle != null) {
                this.s0 = C6614jQ1.b(bundle.getBundle("selector"));
            }
            if (this.s0 == null) {
                this.s0 = C6614jQ1.c;
            }
        }
    }

    public final void T0(C6614jQ1 c6614jQ1) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        R0();
        if (this.s0.equals(c6614jQ1)) {
            return;
        }
        this.s0 = c6614jQ1;
        Bundle bundle = this.l;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("selector", c6614jQ1.a);
        E0(bundle);
        DialogC9357rP1 dialogC9357rP1 = this.r0;
        if (dialogC9357rP1 != null) {
            dialogC9357rP1.f(c6614jQ1);
        }
    }

    public DialogC9357rP1 S0(Context context) {
        return new DialogC9357rP1(context, 0);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        DialogC9357rP1 S0 = S0(K());
        this.r0 = S0;
        R0();
        S0.f(this.s0);
        return this.r0;
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        DialogC9357rP1 dialogC9357rP1 = this.r0;
        if (dialogC9357rP1 == null) {
            return;
        }
        dialogC9357rP1.getWindow().setLayout(VP1.a(dialogC9357rP1.getContext()), -2);
    }
}
