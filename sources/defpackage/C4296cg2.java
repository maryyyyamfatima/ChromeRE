package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cg2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4296cg2 implements JS {
    public final Class a;

    public C4296cg2(Class cls) {
        AbstractC0087Ar1.e(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.JS
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4296cg2) {
            if (AbstractC0087Ar1.a(this.a, ((C4296cg2) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
