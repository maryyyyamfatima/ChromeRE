package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H02 {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8776pi2)) {
            return false;
        }
        C8776pi2 c8776pi2 = (C8776pi2) obj;
        Object obj2 = c8776pi2.a;
        Object obj3 = this.a;
        if (!(obj2 == obj3 || (obj2 != null && obj2.equals(obj3)))) {
            return false;
        }
        Object obj4 = this.b;
        Object obj5 = c8776pi2.b;
        return obj5 == obj4 || (obj5 != null && obj5.equals(obj4));
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return KR0.a("Pair{", String.valueOf(this.a), " ", String.valueOf(this.b), "}");
    }
}
