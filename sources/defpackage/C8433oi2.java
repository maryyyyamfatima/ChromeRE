package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oi2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8433oi2 {
    public final Object a;
    public final Object b;

    public C8433oi2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (!(obj instanceof C8433oi2)) {
            return false;
        }
        C8433oi2 c8433oi2 = (C8433oi2) obj;
        Object obj2 = c8433oi2.a;
        Object obj3 = this.a;
        if (obj3 == null) {
            equals = obj2 == null;
        } else {
            equals = obj3.equals(obj2);
        }
        if (!equals) {
            return false;
        }
        Object obj4 = this.b;
        Object obj5 = c8433oi2.b;
        if (obj4 == null) {
            equals2 = obj5 == null;
        } else {
            equals2 = obj4.equals(obj5);
        }
        return equals2;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }
}
