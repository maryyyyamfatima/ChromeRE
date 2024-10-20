package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CZ1 {
    public Class a;
    public Class b;
    public Class c;

    public CZ1() {
    }

    public CZ1(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final String toString() {
        return KR0.a("MultiClassKey{first=", String.valueOf(this.a), ", second=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CZ1.class != obj.getClass()) {
            return false;
        }
        CZ1 cz1 = (CZ1) obj;
        return this.a.equals(cz1.a) && this.b.equals(cz1.b) && AbstractC10296u74.b(this.c, cz1.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }
}
