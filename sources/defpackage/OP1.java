package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OP1 extends DialogInterfaceOnCancelListenerC7423lm0 {
    public d r0;
    public C6614jQ1 s0;

    public OP1() {
        this.h0 = true;
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public d R0(Context context) {
        return new d(context);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        d R0 = R0(K());
        this.r0 = R0;
        return R0;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public void u0() {
        super.u0();
        d dVar = this.r0;
        if (dVar != null) {
            dVar.h(false);
        }
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        d dVar = this.r0;
        if (dVar != null) {
            dVar.p();
        }
    }
}
