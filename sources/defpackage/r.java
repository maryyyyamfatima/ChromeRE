package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class r extends C0617Et1 implements InterfaceC8927q80, P90 {
    public final E90 g;

    @Override // defpackage.InterfaceC8927q80
    public final void d(Object obj) {
        Object K;
        Throwable a = PP2.a(obj);
        if (a != null) {
            obj = new OZ(false, a);
        }
        do {
            K = K(y(), obj);
            if (K == AbstractC0747Ft1.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                OZ oz = obj instanceof OZ ? (OZ) obj : null;
                throw new IllegalStateException(str, oz != null ? oz.a : null);
            }
        } while (K == AbstractC0747Ft1.c);
    }

    @Override // defpackage.C0617Et1
    public final String m() {
        return AbstractC0087Ar1.g(" was cancelled", getClass().getSimpleName());
    }

    public r(E90 e90, boolean z) {
        super(z);
        B((InterfaceC10555ut1) e90.b(C10212tt1.a));
        this.g = e90.r(this);
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        return this.g;
    }

    @Override // defpackage.P90
    public final E90 a() {
        return this.g;
    }

    @Override // defpackage.C0617Et1, defpackage.InterfaceC10555ut1
    public final boolean c() {
        return super.c();
    }

    @Override // defpackage.C0617Et1
    public final void G(Object obj) {
        if (obj instanceof OZ) {
            Throwable th = ((OZ) obj).a;
        }
    }

    @Override // defpackage.C0617Et1
    public final void A(QZ qz) {
        O90.a(this.g, qz);
    }

    public final void M(int i, r rVar, AV0 av0) {
        if (i != 0) {
            int i2 = i - 1;
            C8546p14 c8546p14 = C8546p14.a;
            if (i2 == 0) {
                try {
                    AbstractC0856Gp0.a(AbstractC0477Dr1.b(AbstractC0477Dr1.a(rVar, this, av0)), null);
                    return;
                } finally {
                    d(SP2.a(th));
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC0477Dr1.b(AbstractC0477Dr1.a(rVar, this, av0)).d(c8546p14);
                    return;
                }
                if (i2 == 3) {
                    try {
                        E90 e90 = this.g;
                        Object b = AbstractC9334rK3.b(e90, null);
                        try {
                            AbstractC7693mZ3.a(av0);
                            Object c = av0.c(rVar, this);
                            if (c != Q90.COROUTINE_SUSPENDED) {
                                d(c);
                                return;
                            }
                            return;
                        } finally {
                            AbstractC9334rK3.a(e90, b);
                        }
                    } catch (Throwable th) {
                        return;
                    }
                }
                throw new B52();
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.C0617Et1
    public final String D() {
        return super.D();
    }
}
