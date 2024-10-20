package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889Oo {
    public final String a;
    public final AbstractC9095qe2 b;
    public final AbstractC9095qe2 c;
    public final boolean d;

    public C1889Oo(String str, AbstractC9095qe2 abstractC9095qe2, AbstractC9095qe2 abstractC9095qe22, boolean z) {
        this.a = str;
        this.b = abstractC9095qe2;
        this.c = abstractC9095qe22;
        this.d = z;
    }

    public final String toString() {
        C5785h c5785h = C5785h.a;
        String valueOf = String.valueOf(c5785h);
        String valueOf2 = String.valueOf(c5785h);
        String valueOf3 = String.valueOf(c5785h);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        String valueOf6 = String.valueOf(c5785h);
        StringBuilder sb = new StringBuilder("TransportConfiguration{logSource=");
        AbstractC9972tB0.a(sb, this.a, ", accountNameFutureSupplier=", valueOf, ", zwiebackOverrideFutureSupplier=");
        AbstractC9972tB0.a(sb, valueOf2, ", transportExecutorService=", valueOf3, ", appFlowProtoWrapper=");
        AbstractC9972tB0.a(sb, valueOf4, ", eventCode=", valueOf5, ", logVerifier=");
        sb.append(valueOf6);
        sb.append(", sendAsSemanticEvent=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1889Oo)) {
            return false;
        }
        C1889Oo c1889Oo = (C1889Oo) obj;
        return this.a.equals(c1889Oo.a) && this.b.equals(c1889Oo.b) && this.c.equals(c1889Oo.c) && this.d == c1889Oo.d;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ (this.d ? 1231 : 1237);
    }
}
