package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y80 */
/* loaded from: classes.dex */
public final class C11670y80 implements InterfaceC6219iF3, InterfaceC7371ld2, InterfaceC2872Wc2, InterfaceC0663Fc2 {
    public final Executor a;
    public final InterfaceC9269r80 b;
    public final AF3 c;

    public C11670y80(VV0 vv0, C5887hI0 c5887hI0, AF3 af3) {
        this.a = vv0;
        this.b = c5887hI0;
        this.c = af3;
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void b(AF3 af3) {
        this.a.execute(new RunnableC11327x80(this, af3));
    }

    @Override // defpackage.InterfaceC7371ld2
    public final void a(Object obj) {
        this.c.n(obj);
    }

    @Override // defpackage.InterfaceC2872Wc2
    public final void c(Exception exc) {
        this.c.m(exc);
    }

    @Override // defpackage.InterfaceC0663Fc2
    public final void d() {
        AF3 af3 = this.c;
        synchronized (af3.a) {
            if (af3.c) {
                return;
            }
            af3.c = true;
            af3.d = true;
            af3.b.b(af3);
        }
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
