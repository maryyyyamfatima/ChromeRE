package defpackage;

import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class JX0 extends AbstractC4411d0 {
    public final QX0 a;
    public QX0 g;
    public boolean h = false;

    public final Object clone() {
        JX0 jx0 = (JX0) this.a.l(PX0.NEW_BUILDER);
        jx0.m(b1());
        return jx0;
    }

    @Override // defpackage.InterfaceC7327lV1
    public final QX0 b() {
        return this.a;
    }

    public JX0(QX0 qx0) {
        this.a = qx0;
        this.g = (QX0) qx0.l(PX0.NEW_MUTABLE_INSTANCE);
    }

    public final JX0 m(QX0 qx0) {
        if (this.h) {
            l();
            this.h = false;
        }
        QX0 qx02 = this.g;
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        c7931nE2.b(qx02.getClass()).a(qx02, qx0);
        return this;
    }

    public final void n(byte[] bArr, int i, XF0 xf0) {
        if (this.h) {
            l();
            this.h = false;
        }
        try {
            C7931nE2.c.a(this.g).f(this.g, bArr, 0, 0 + i, new C2254Rj(xf0));
        } catch (C1127Ir1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C1127Ir1.h();
        }
    }

    public void l() {
        QX0 qx0 = (QX0) this.g.l(PX0.NEW_MUTABLE_INSTANCE);
        QX0 qx02 = this.g;
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        c7931nE2.b(qx0.getClass()).a(qx0, qx02);
        this.g = qx0;
    }

    @Override // defpackage.InterfaceC7327lV1
    public final boolean isInitialized() {
        return QX0.p(this.g, false);
    }

    @Override // defpackage.InterfaceC6983kV1
    /* renamed from: k */
    public QX0 b1() {
        if (this.h) {
            return this.g;
        }
        QX0 qx0 = this.g;
        qx0.getClass();
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        c7931nE2.b(qx0.getClass()).b(qx0);
        this.h = true;
        return this.g;
    }

    /* renamed from: i */
    public final QX0 j() {
        QX0 b1 = b1();
        b1.getClass();
        if (QX0.p(b1, true)) {
            return b1;
        }
        throw new C6827k14();
    }
}
