package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5617gX implements E90, Serializable {
    public final E90 a;
    public final B90 g;

    public C5617gX(B90 b90, E90 e90) {
        AbstractC0087Ar1.e(e90, "left");
        AbstractC0087Ar1.e(b90, "element");
        this.a = e90;
        this.g = b90;
    }

    @Override // defpackage.E90
    public final E90 r(E90 e90) {
        return AbstractC12019z90.a(this, e90);
    }

    @Override // defpackage.E90
    public final B90 b(C90 c90) {
        AbstractC0087Ar1.e(c90, "key");
        C5617gX c5617gX = this;
        while (true) {
            B90 b = c5617gX.g.b(c90);
            if (b != null) {
                return b;
            }
            E90 e90 = c5617gX.a;
            if (e90 instanceof C5617gX) {
                c5617gX = (C5617gX) e90;
            } else {
                return e90.b(c90);
            }
        }
    }

    @Override // defpackage.E90
    public final Object j(Object obj, AV0 av0) {
        return av0.c(this.a.j(obj, av0), this.g);
    }

    @Override // defpackage.E90
    public final E90 k(C90 c90) {
        AbstractC0087Ar1.e(c90, "key");
        B90 b90 = this.g;
        B90 b = b90.b(c90);
        E90 e90 = this.a;
        if (b != null) {
            return e90;
        }
        E90 k = e90.k(c90);
        return k == e90 ? this : k == C7221lA0.a ? b90 : new C5617gX(b90, k);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C5617gX)) {
                return false;
            }
            C5617gX c5617gX = (C5617gX) obj;
            c5617gX.getClass();
            int i = 2;
            C5617gX c5617gX2 = c5617gX;
            int i2 = 2;
            while (true) {
                E90 e90 = c5617gX2.a;
                c5617gX2 = e90 instanceof C5617gX ? (C5617gX) e90 : null;
                if (c5617gX2 == null) {
                    break;
                }
                i2++;
            }
            C5617gX c5617gX3 = this;
            while (true) {
                E90 e902 = c5617gX3.a;
                c5617gX3 = e902 instanceof C5617gX ? (C5617gX) e902 : null;
                if (c5617gX3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C5617gX c5617gX4 = this;
            while (true) {
                B90 b90 = c5617gX4.g;
                if (!AbstractC0087Ar1.a(c5617gX.b(b90.getKey()), b90)) {
                    z = false;
                    break;
                }
                E90 e903 = c5617gX4.a;
                if (e903 instanceof C5617gX) {
                    c5617gX4 = (C5617gX) e903;
                } else {
                    AbstractC0087Ar1.c(e903, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    B90 b902 = (B90) e903;
                    z = AbstractC0087Ar1.a(c5617gX.b(b902.getKey()), b902);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) j("", C5273fX.g)) + ']';
    }
}
