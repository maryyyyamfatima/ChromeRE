package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10984w80 implements InterfaceC6219iF3 {
    public final Executor a;
    public final InterfaceC9269r80 b;
    public final AF3 c;

    public C10984w80(Executor executor, InterfaceC9269r80 interfaceC9269r80, AF3 af3) {
        this.a = executor;
        this.b = interfaceC9269r80;
        this.c = af3;
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void b(AF3 af3) {
        this.a.execute(new RunnableC10641v80(this, af3));
    }

    @Override // defpackage.InterfaceC6219iF3
    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
