package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pn */
/* loaded from: classes.dex */
public final class C2014Pn {
    public final VT a;
    public final InterfaceC3299Zk b;

    public C2014Pn(VT vt, C3174Yl c3174Yl) {
        this.a = vt;
        this.b = c3174Yl;
    }

    public final String toString() {
        return KR0.a("AttentionInfo{identifier=", String.valueOf(this.a), ", eventMutator=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2014Pn)) {
            return false;
        }
        C2014Pn c2014Pn = (C2014Pn) obj;
        return this.a.equals(c2014Pn.a) && this.b.equals(c2014Pn.b);
    }

    public final int hashCode() {
        VT vt = this.a;
        int i = vt.a;
        if (i == 0) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            i = c7931nE2.b(VT.class).j(vt);
            vt.a = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }
}
