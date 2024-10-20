package defpackage;

import J.N;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.WatcherImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7873n40 implements DV1, A51 {
    public final C7529m40 a = new C7529m40(this);
    public final InterfaceC11102wV1 g;
    public final WatcherImpl h;
    public DV1 i;
    public D30 j;

    @Override // defpackage.A51
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC11102wV1 n0() {
        WatcherImpl watcherImpl = this.h;
        long j = watcherImpl.a;
        if (j != 0) {
            watcherImpl.b = null;
            N.MPTT407x(watcherImpl, j);
        }
        long j2 = watcherImpl.a;
        if (j2 != 0) {
            N.Mi32vqDA(watcherImpl, j2);
            watcherImpl.a = 0L;
        }
        InterfaceC11102wV1 g1 = this.g.g1();
        DV1 dv1 = this.i;
        if (dv1 != null) {
            dv1.close();
        }
        return g1;
    }

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        WatcherImpl watcherImpl = this.h;
        long j = watcherImpl.a;
        if (j != 0) {
            watcherImpl.b = null;
            N.MPTT407x(watcherImpl, j);
        }
        long j2 = watcherImpl.a;
        if (j2 != 0) {
            N.Mi32vqDA(watcherImpl, j2);
            watcherImpl.a = 0L;
        }
        this.g.close();
        DV1 dv1 = this.i;
        if (dv1 != null) {
            this.i = null;
            dv1.close();
        }
    }

    public C7873n40(InterfaceC11102wV1 interfaceC11102wV1, WatcherImpl watcherImpl) {
        this.g = interfaceC11102wV1;
        this.h = watcherImpl;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            InterfaceC11102wV1 interfaceC11102wV1 = this.g;
            ByteBuffer byteBuffer = c8697pU1.a;
            List list = c8697pU1.b;
            C10759vV1 c10759vV1 = C10759vV1.c;
            interfaceC11102wV1.p(byteBuffer, list);
            return true;
        } catch (HY1 e) {
            b(e);
            return false;
        }
    }

    public final void b(HY1 hy1) {
        close();
        D30 d30 = this.j;
        if (d30 != null) {
            try {
                d30.b(hy1);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public static ResultAnd e(InterfaceC11102wV1 interfaceC11102wV1, DV1 dv1) {
        C10073tV1 c10073tV1 = C10073tV1.c;
        ResultAnd z = interfaceC11102wV1.z();
        int i = z.a;
        if (i != 0) {
            return new ResultAnd(i, Boolean.FALSE);
        }
        C10416uV1 c10416uV1 = (C10416uV1) z.b;
        if (dv1 != null) {
            try {
                return new ResultAnd(z.a, Boolean.valueOf(dv1.A(new C8697pU1(ByteBuffer.wrap(c10416uV1.a), c10416uV1.c))));
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return new ResultAnd(i, Boolean.FALSE);
    }
}
