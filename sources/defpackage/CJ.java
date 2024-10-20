package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CJ {
    public long a = 0;
    public CJ b;

    public final void h(int i) {
        if (i >= 64) {
            c();
            this.b.h(i - 64);
        } else {
            this.a |= 1 << i;
        }
    }

    public final void c() {
        if (this.b == null) {
            this.b = new CJ();
        }
    }

    public final void a(int i) {
        if (i >= 64) {
            CJ cj = this.b;
            if (cj != null) {
                cj.a(i - 64);
                return;
            }
            return;
        }
        this.a &= ~(1 << i);
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        }
        c();
        return this.b.d(i - 64);
    }

    public final void g() {
        this.a = 0L;
        CJ cj = this.b;
        if (cj != null) {
            cj.g();
        }
    }

    public final void e(int i, boolean z) {
        if (i >= 64) {
            c();
            this.b.e(i - 64, z);
            return;
        }
        long j = this.a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (z2 || this.b != null) {
            c();
            this.b.e(0, z2);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.b.f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.a = j3;
        long j4 = j - 1;
        this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        CJ cj = this.b;
        if (cj != null) {
            if (cj.d(0)) {
                h(63);
            }
            this.b.f(0);
        }
        return z;
    }

    public final int b(int i) {
        CJ cj = this.b;
        if (cj == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        return Long.bitCount(this.a) + cj.b(i - 64);
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
