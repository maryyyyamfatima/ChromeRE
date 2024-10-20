package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nn */
/* loaded from: classes.dex */
public final class C1754Nn {
    public final C5330fh a;
    public final AbstractC1472Li1 b;
    public final InterfaceC4248cY0 c;
    public final boolean d;

    public C1754Nn(C5330fh c5330fh, AbstractC1472Li1 abstractC1472Li1, InterfaceC4248cY0 interfaceC4248cY0, boolean z) {
        this.a = c5330fh;
        this.b = abstractC1472Li1;
        this.c = interfaceC4248cY0;
        this.d = z;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        StringBuilder a = AbstractC10975w63.a("AppFlowLoggingData{appFlow=", valueOf, ", testCodes=", valueOf2, ", appFlowType=");
        a.append(valueOf3);
        a.append(", sampledOut=");
        a.append(this.d);
        a.append("}");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1754Nn)) {
            return false;
        }
        C1754Nn c1754Nn = (C1754Nn) obj;
        return this.a.equals(c1754Nn.a) && this.b.equals(c1754Nn.b) && this.c.equals(c1754Nn.c) && this.d == c1754Nn.d;
    }

    public final int hashCode() {
        C5330fh c5330fh = this.a;
        int i = c5330fh.a;
        if (i == 0) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            i = c7931nE2.b(C5330fh.class).j(c5330fh);
            c5330fh.a = i;
        }
        return (this.d ? 1231 : 1237) ^ ((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }
}
