package org.chromium.components.media_router;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.FrameLayout;
import defpackage.AbstractC1015Hv;
import defpackage.C0885Gv;
import defpackage.C9700sP1;
import defpackage.DialogC11072wP1;
import defpackage.DialogC9357rP1;
import defpackage.RunnableC10043tP1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaRouteChooserDialogManager$Fragment extends C9700sP1 {
    public static final /* synthetic */ int w0 = 0;
    public final C0885Gv t0;
    public final AbstractC1015Hv u0;
    public boolean v0;

    public MediaRouteChooserDialogManager$Fragment() {
        Handler handler = new Handler();
        this.t0 = new C0885Gv();
        handler.post(new RunnableC10043tP1(this));
    }

    public MediaRouteChooserDialogManager$Fragment(AbstractC1015Hv abstractC1015Hv) {
        new Handler();
        this.t0 = new C0885Gv();
        this.u0 = abstractC1015Hv;
    }

    @Override // defpackage.C9700sP1
    public final DialogC9357rP1 S0(Context context) {
        DialogC11072wP1 dialogC11072wP1 = new DialogC11072wP1(this, context, this.g0);
        dialogC11072wP1.setCanceledOnTouchOutside(true);
        return dialogC11072wP1;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void t0() {
        Activity activity = getActivity();
        C0885Gv c0885Gv = this.t0;
        c0885Gv.getClass();
        int systemUiVisibility = ((FrameLayout) activity.getWindow().getDecorView()).getSystemUiVisibility();
        c0885Gv.a = systemUiVisibility;
        c0885Gv.b = (systemUiVisibility & 1024) != 0;
        super.t0();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void u0() {
        super.u0();
        this.t0.a(getActivity());
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.v0) {
            return;
        }
        this.u0.d.a();
    }
}
