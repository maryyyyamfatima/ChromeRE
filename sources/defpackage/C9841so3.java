package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: so3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9841so3 extends AbstractC11362xE3 {
    public final long s() {
        if (b(4) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long q() {
        if (b(6) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final String n() {
        int b = b(8);
        if (b != 0) {
            return d(b + this.a);
        }
        return null;
    }

    public final float o() {
        int b = b(10);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final long l() {
        if (b(12) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final int v() {
        int b = b(14);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final UF0 u() {
        UF0 uf0 = new UF0();
        int b = b(16);
        if (b == 0) {
            return null;
        }
        uf0.c(a(b + this.a), this.b);
        return uf0;
    }

    public final float r() {
        int b = b(18);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final long w() {
        if (b(20) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final int x() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final boolean p() {
        int b = b(24);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final int t() {
        int b = b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int j() {
        int b = b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final String m() {
        int b = b(30);
        if (b != 0) {
            return d(b + this.a);
        }
        return null;
    }

    public final long h() {
        if (b(32) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final float i() {
        int b = b(34);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public static int k(UP0 up0, long j, long j2, int i, float f, long j3, int i2, int i3, float f2, long j4, int i4, boolean z, int i5, int i6, int i7, long j5, float f3) {
        up0.o(16);
        up0.b(15, f3);
        up0.c(14, (int) j5);
        up0.e(13, i7);
        up0.c(12, i6);
        up0.c(11, i5);
        up0.c(9, i4);
        up0.c(8, (int) j4);
        up0.b(7, f2);
        up0.e(6, i3);
        up0.c(5, i2);
        up0.c(4, (int) j3);
        up0.b(3, f);
        up0.e(2, i);
        up0.c(1, (int) j2);
        up0.c(0, (int) j);
        up0.a(10, z, false);
        return up0.i();
    }
}
