package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7745mi2 implements Serializable {
    public final Object a;
    public final Object g;

    public C7745mi2(Object obj, Object obj2) {
        this.a = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7745mi2)) {
            return false;
        }
        C7745mi2 c7745mi2 = (C7745mi2) obj;
        return V82.a(this.a, c7745mi2.a) && V82.a(this.g, c7745mi2.g);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.g + ")";
    }
}
