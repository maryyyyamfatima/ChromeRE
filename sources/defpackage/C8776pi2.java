package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8776pi2 {
    public final Object a;
    public final Object b;

    public C8776pi2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8776pi2)) {
            return false;
        }
        C8776pi2 c8776pi2 = (C8776pi2) obj;
        return Objects.equals(c8776pi2.a, this.a) && Objects.equals(c8776pi2.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
