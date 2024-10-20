package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: To */
/* loaded from: classes.dex */
public final class C2539To {
    public final InterfaceC5323ff4 a;
    public final C3884bU b;

    public C2539To(InterfaceC5323ff4 interfaceC5323ff4, C3884bU c3884bU) {
        this.a = interfaceC5323ff4;
        this.b = c3884bU;
    }

    public final String toString() {
        return KR0.a("XUiKitContext{viewsVisibilityTracker=", String.valueOf(this.a), ", clientContext=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2539To)) {
            return false;
        }
        C2539To c2539To = (C2539To) obj;
        return this.a.equals(c2539To.a) && this.b.equals(c2539To.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C3884bU c3884bU = this.b;
        int i = c3884bU.a;
        if (i == 0) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            i = c7931nE2.b(C3884bU.class).j(c3884bU);
            c3884bU.a = i;
        }
        return hashCode ^ i;
    }
}
