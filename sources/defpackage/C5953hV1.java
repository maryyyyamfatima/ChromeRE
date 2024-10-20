package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hV1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5953hV1 {
    public static final C4638dg0 e = new C4638dg0(24, 0);
    public static final C4638dg0 f = new C4638dg0(32, 1);
    public final C4638dg0 a;
    public final int b;
    public final int c;
    public long d;

    public C5953hV1(int i) {
        this.a = e;
        this.b = i;
        this.c = 0;
        this.d = 0L;
    }

    public C5953hV1(int i, int i2, long j) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = j;
    }

    public C5953hV1(C8697pU1 c8697pU1) {
        C1730Ni0 c1730Ni0 = new C1730Ni0(c8697pU1);
        C4638dg0 f2 = c1730Ni0.f();
        this.a = f2;
        int i = f2.b;
        if (i < 0) {
            throw new C12221zl0(AbstractC9076qb1.a("Incorrect number of fields, expecting at least 0, but got: ", i));
        }
        int i2 = f2.a;
        if (i2 < 24) {
            throw new C12221zl0(AbstractC9076qb1.a("Incorrect message size, expecting at least 24, but got: ", i2));
        }
        if (i == 0 && i2 != 24) {
            throw new C12221zl0(AbstractC9076qb1.a("Incorrect message size for a message with 0 fields, expecting 24, but got: ", i2));
        }
        if (i == 1 && i2 != 32) {
            throw new C12221zl0(AbstractC9076qb1.a("Incorrect message size for a message with 1 fields, expecting 32, but got: ", i2));
        }
        if (c1730Ni0.o(8) != 0) {
            throw new C12221zl0("Non-zero interface ID, expecting zero since associated interfaces are not yet supported.");
        }
        this.b = c1730Ni0.o(12);
        int o = c1730Ni0.o(16);
        this.c = o;
        if (!((o & 3) != 0)) {
            this.d = 0L;
        } else {
            if (i2 < 32) {
                throw new C12221zl0(AbstractC9076qb1.a("Incorrect message size, expecting at least 32 for a message with a request identifier, but got: ", i2));
            }
            this.d = c1730Ni0.r(24);
        }
    }

    public final boolean a(int i) {
        return (this.c & i) == i;
    }

    public final boolean b(int i) {
        return (this.c & 7) == i;
    }

    public final boolean c(int i, int i2) {
        return this.b == i && b(i2);
    }

    public final int hashCode() {
        C4638dg0 c4638dg0 = this.a;
        int hashCode = ((((c4638dg0 == null ? 0 : c4638dg0.hashCode()) + 31) * 31) + this.c) * 31;
        long j = this.d;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj == null || C5953hV1.class != obj.getClass()) {
            return false;
        }
        C5953hV1 c5953hV1 = (C5953hV1) obj;
        C4638dg0 c4638dg0 = this.a;
        C4638dg0 c4638dg02 = c5953hV1.a;
        if (c4638dg0 == c4638dg02) {
            equals = true;
        } else {
            equals = c4638dg0 == null ? false : c4638dg0.equals(c4638dg02);
        }
        return equals && this.c == c5953hV1.c && this.d == c5953hV1.d && this.b == c5953hV1.b;
    }
}
