package defpackage;

import J.N;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lj */
/* loaded from: classes2.dex */
public final class C7404lj implements D30 {
    public long a;
    public C7873n40 g;
    public boolean h;

    public C7404lj(C11788yV1 c11788yV1) {
        C4422d14 c4422d14;
        this.a = 0L;
        if ((!c11788yV1.b.isValid() || (c4422d14 = c11788yV1.c) == null || (c4422d14.c == 0 && c4422d14.b == 0) || c11788yV1.d == 0) ? false : true) {
            long E0 = c11788yV1.b.E0();
            C4422d14 c4422d142 = c11788yV1.c;
            this.a = N.MsjrrfZt(E0, c4422d142.c, c4422d142.b, c11788yV1.d);
            c11788yV1.b.close();
            C4422d14 c4422d143 = c11788yV1.c;
            if (c4422d143 != null) {
                c4422d143.c = 0L;
                c4422d143.b = 0L;
            }
            c11788yV1.d = 0L;
            return;
        }
        this.a = 0L;
        this.g = null;
        this.h = false;
    }

    public C7404lj(long j) {
        this.a = j;
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        this.h = true;
    }

    public final void a() {
        long E0 = this.g.n0().E0();
        if (!this.h) {
            N.MylsTJ$B(this.a, E0);
        } else {
            N.MpISG4bN(this.a);
        }
        this.g = null;
    }

    public final void finalize() {
        try {
            long j = this.a;
            if (j != 0) {
                N.MgnCh9Wp(j);
            }
        } finally {
            super.finalize();
        }
    }
}
