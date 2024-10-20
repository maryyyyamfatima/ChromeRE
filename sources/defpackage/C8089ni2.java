package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ni2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8089ni2 implements Serializable {
    public final Object a;
    public final Object g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8089ni2)) {
            return false;
        }
        C8089ni2 c8089ni2 = (C8089ni2) obj;
        return AbstractC0087Ar1.a(this.a, c8089ni2.a) && AbstractC0087Ar1.a(this.g, c8089ni2.g);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public C8089ni2(Object obj, Object obj2) {
        this.a = obj;
        this.g = obj2;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.g + ')';
    }
}
