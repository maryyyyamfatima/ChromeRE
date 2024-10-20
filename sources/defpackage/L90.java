package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class L90 extends AbstractC9562s implements InterfaceC10298u80 {
    public static final K90 g = new K90();

    public boolean C() {
        return !(this instanceof C04);
    }

    public abstract void y(E90 e90, Runnable runnable);

    public L90() {
        super(C9955t80.a);
    }

    @Override // defpackage.AbstractC9562s, defpackage.B90, defpackage.E90
    public final B90 b(C90 c90) {
        AbstractC0087Ar1.e(c90, "key");
        if (c90 instanceof AbstractC9905t) {
            AbstractC9905t abstractC9905t = (AbstractC9905t) c90;
            C90 c902 = this.a;
            AbstractC0087Ar1.e(c902, "key");
            if (c902 == abstractC9905t || abstractC9905t.g == c902) {
                B90 b90 = (B90) abstractC9905t.a.b(this);
                if (b90 instanceof B90) {
                    return b90;
                }
            }
        } else if (C9955t80.a == c90) {
            return this;
        }
        return null;
    }

    @Override // defpackage.AbstractC9562s, defpackage.E90
    public final E90 k(C90 c90) {
        AbstractC0087Ar1.e(c90, "key");
        boolean z = c90 instanceof AbstractC9905t;
        C7221lA0 c7221lA0 = C7221lA0.a;
        if (z) {
            AbstractC9905t abstractC9905t = (AbstractC9905t) c90;
            C90 c902 = this.a;
            AbstractC0087Ar1.e(c902, "key");
            if ((c902 == abstractC9905t || abstractC9905t.g == c902) && ((B90) abstractC9905t.a.b(this)) != null) {
                return c7221lA0;
            }
        } else if (C9955t80.a == c90) {
            return c7221lA0;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC6711ji0.a(this);
    }
}
