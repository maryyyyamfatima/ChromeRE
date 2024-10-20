package defpackage;

import J.N;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v51, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10624v51 implements InterfaceC10281u51 {
    public long a;
    public final CoreImpl g;

    public AbstractC10624v51(CoreImpl coreImpl, long j) {
        this.g = coreImpl;
        this.a = j;
    }

    public AbstractC10624v51(AbstractC10624v51 abstractC10624v51) {
        this.g = abstractC10624v51.g;
        long j = abstractC10624v51.a;
        abstractC10624v51.a = 0L;
        this.a = j;
    }

    @Override // defpackage.InterfaceC10281u51, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            this.a = 0L;
            CoreImpl coreImpl = this.g;
            coreImpl.getClass();
            int MLQe1QEw = N.MLQe1QEw(coreImpl, j);
            if (MLQe1QEw != 0) {
                throw new HY1(MLQe1QEw);
            }
        }
    }

    @Override // defpackage.InterfaceC10281u51
    public final boolean isValid() {
        return this.a != 0;
    }

    @Override // defpackage.InterfaceC10281u51
    public final V14 L0() {
        return new W14(this);
    }

    @Override // defpackage.InterfaceC10281u51
    public final InterfaceC7559m90 J0() {
        return this.g;
    }

    @Override // defpackage.InterfaceC10281u51
    public final long E0() {
        long j = this.a;
        this.a = 0L;
        return j;
    }

    public final void finalize() {
        if (isValid()) {
            AbstractC4851eH1.f("HandleImpl", "Handle was not closed.", new Object[0]);
            long j = this.a;
            CoreImpl coreImpl = this.g;
            coreImpl.getClass();
            N.MLQe1QEw(coreImpl, j);
        }
        super.finalize();
    }
}
