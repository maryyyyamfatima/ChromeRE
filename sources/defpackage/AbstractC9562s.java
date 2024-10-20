package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9562s implements B90 {
    public final C90 a;

    public AbstractC9562s(C90 c90) {
        this.a = c90;
    }

    @Override // defpackage.B90, defpackage.E90
    public B90 b(C90 c90) {
        return A90.a(this, c90);
    }

    @Override // defpackage.E90
    public E90 k(C90 c90) {
        return A90.b(this, c90);
    }

    @Override // defpackage.B90
    public final C90 getKey() {
        return this.a;
    }

    @Override // defpackage.E90
    public final E90 r(E90 e90) {
        AbstractC0087Ar1.e(e90, "context");
        return AbstractC12019z90.a(this, e90);
    }

    @Override // defpackage.E90
    public final Object j(Object obj, AV0 av0) {
        return av0.c(obj, this);
    }
}
