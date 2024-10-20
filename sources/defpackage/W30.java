package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W30 extends AbstractDialogInterfaceOnCancelListenerC0365Cv {
    public final C5348fk k;
    public final C5800h21 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W30(DA1 da1, C5800h21 c5800h21) {
        super(da1);
        Object obj = C8543p11.c;
        this.k = new C5348fk(0);
        this.l = c5800h21;
        da1.c("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        this.g = true;
        if (this.k.isEmpty()) {
            return;
        }
        this.l.f(this);
    }

    @Override // defpackage.AbstractDialogInterfaceOnCancelListenerC0365Cv
    public final void m(int i, ConnectionResult connectionResult) {
        this.l.d(i, connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        if (this.k.isEmpty()) {
            return;
        }
        this.l.f(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.g = false;
        C5800h21 c5800h21 = this.l;
        c5800h21.getClass();
        synchronized (C5800h21.w) {
            if (c5800h21.p == this) {
                c5800h21.p = null;
                c5800h21.q.clear();
            }
        }
    }

    @Override // defpackage.AbstractDialogInterfaceOnCancelListenerC0365Cv
    public final void n() {
        HandlerC10413uU3 handlerC10413uU3 = this.l.s;
        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(3));
    }
}
