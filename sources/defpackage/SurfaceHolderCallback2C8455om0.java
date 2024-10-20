package defpackage;

import J.N;
import android.view.Surface;
import android.view.SurfaceHolder;
import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.androidoverlay.DialogOverlayImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: om0 */
/* loaded from: classes2.dex */
public final class SurfaceHolderCallback2C8455om0 implements SurfaceHolder.Callback2 {
    public final /* synthetic */ C9141qm0 a;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        InterfaceC8798pm0 interfaceC8798pm0;
        C9141qm0 c9141qm0 = this.a;
        if (c9141qm0.b == null || (interfaceC8798pm0 = c9141qm0.a) == null) {
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        DialogOverlayImpl dialogOverlayImpl = (DialogOverlayImpl) interfaceC8798pm0;
        Object obj = ThreadUtils.a;
        if (dialogOverlayImpl.h == null || dialogOverlayImpl.a == null) {
            return;
        }
        int MpcpmTlm = N.MpcpmTlm(surface);
        dialogOverlayImpl.j = MpcpmTlm;
        long j = MpcpmTlm;
        X9 x9 = (X9) dialogOverlayImpl.a;
        x9.getClass();
        S9 s9 = new S9(0);
        s9.b = j;
        C6068hp1 c6068hp1 = x9.a;
        c6068hp1.g.A(s9.c(c6068hp1.a, new C5953hV1(0)));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        InterfaceC8798pm0 interfaceC8798pm0;
        C9141qm0 c9141qm0 = this.a;
        if (c9141qm0.b == null || (interfaceC8798pm0 = c9141qm0.a) == null) {
            return;
        }
        DialogOverlayImpl dialogOverlayImpl = (DialogOverlayImpl) interfaceC8798pm0;
        Object obj = ThreadUtils.a;
        if (dialogOverlayImpl.h != null) {
            dialogOverlayImpl.e();
            dialogOverlayImpl.c();
        }
        c9141qm0.a = null;
    }

    public SurfaceHolderCallback2C8455om0(C9141qm0 c9141qm0) {
        this.a = c9141qm0;
    }
}
