package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2759Vg {
    public final int a;
    public final C5946hU b;

    public C2759Vg(int i, int i2, EnumC6203iC2 enumC6203iC2) {
        this.a = i;
        this.b = new C5946hU(i2, enumC6203iC2);
    }

    public C2759Vg(int i, C5946hU c5946hU) {
        this.a = i;
        this.b = c5946hU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2759Vg)) {
            return false;
        }
        C2759Vg c2759Vg = (C2759Vg) obj;
        return this.a == c2759Vg.a && this.b.equals(c2759Vg.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()));
    }

    public final String toString() {
        return "AppFlowEventIdentifier{eventId=" + this.a + ", clientID=" + String.valueOf(this.b) + "}";
    }
}
