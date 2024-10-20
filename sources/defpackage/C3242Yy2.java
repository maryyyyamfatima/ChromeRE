package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yy2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3242Yy2 extends AbstractC9095qe2 {
    public final Object a;

    @Override // defpackage.AbstractC9095qe2
    public final boolean c() {
        return true;
    }

    public C3242Yy2(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.AbstractC9095qe2
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.AbstractC9095qe2
    public final Object d(Object obj) {
        return this.a;
    }

    @Override // defpackage.AbstractC9095qe2
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.AbstractC9095qe2
    public final boolean equals(Object obj) {
        if (obj instanceof C3242Yy2) {
            return this.a.equals(((C3242Yy2) obj).a);
        }
        return false;
    }

    @Override // defpackage.AbstractC9095qe2
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
