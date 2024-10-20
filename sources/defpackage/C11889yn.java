package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11889yn implements InterfaceC7652mR2 {
    public final InterfaceC7652mR2 a;
    public final Executor g;
    public final Exception h = new Exception("AutocloseableRouter allocated at:");
    public boolean i;

    public C11889yn(InterfaceC7559m90 interfaceC7559m90, C9026qR2 c9026qR2) {
        this.a = c9026qR2;
        this.g = AbstractC9987tE0.a(interfaceC7559m90);
    }

    @Override // defpackage.A51
    public final InterfaceC11102wV1 n0() {
        return this.a.n0();
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        return this.a.A(c8697pU1);
    }

    @Override // defpackage.EV1
    public final boolean Y(C8697pU1 c8697pU1, DV1 dv1) {
        return this.a.Y(c8697pU1, dv1);
    }

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.i = true;
    }

    public final void finalize() {
        if (!this.i) {
            this.g.execute(new RunnableC11546xn(this));
            throw new IllegalStateException("Warning: Router objects should be explicitly closed when no longer required otherwise you may leak handles.", this.h);
        }
        super.finalize();
    }
}
