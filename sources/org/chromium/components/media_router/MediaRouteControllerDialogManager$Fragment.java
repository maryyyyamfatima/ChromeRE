package org.chromium.components.media_router;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.mediarouter.app.d;
import defpackage.AbstractC1015Hv;
import defpackage.AbstractC6958kQ1;
import defpackage.C0885Gv;
import defpackage.OP1;
import defpackage.PP1;
import defpackage.QP1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaRouteControllerDialogManager$Fragment extends OP1 {
    public final C0885Gv t0;
    public final AbstractC1015Hv u0;
    public final AbstractC6958kQ1 v0;

    public MediaRouteControllerDialogManager$Fragment() {
        Handler handler = new Handler();
        this.t0 = new C0885Gv();
        handler.post(new QP1(this));
    }

    public MediaRouteControllerDialogManager$Fragment(AbstractC1015Hv abstractC1015Hv, PP1 pp1) {
        new Handler();
        this.t0 = new C0885Gv();
        this.u0 = abstractC1015Hv;
        this.v0 = pp1;
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

    @Override // defpackage.OP1, defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void u0() {
        super.u0();
        this.t0.a(getActivity());
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AbstractC1015Hv abstractC1015Hv = this.u0;
        if (abstractC1015Hv == null) {
            return;
        }
        abstractC1015Hv.d.a();
        abstractC1015Hv.c.j(this.v0);
        abstractC1015Hv.e = null;
    }

    @Override // defpackage.OP1
    public final d R0(Context context) {
        d dVar = new d(context);
        dVar.setCanceledOnTouchOutside(true);
        return dVar;
    }
}
