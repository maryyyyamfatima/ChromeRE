package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9152qo extends HH1 {
    public final long a;
    public final long b;
    public final AbstractC7320lU c;
    public final Integer d;
    public final String e;
    public final List f;
    public final BF2 g;

    public C9152qo(long j, long j2, AbstractC7320lU abstractC7320lU, Integer num, String str, List list, BF2 bf2) {
        this.a = j;
        this.b = j2;
        this.c = abstractC7320lU;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = bf2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.a);
        sb.append(", requestUptimeMs=");
        sb.append(this.b);
        sb.append(", clientInfo=");
        sb.append(valueOf);
        sb.append(", logSource=");
        sb.append(this.d);
        sb.append(", logSourceName=");
        AbstractC9972tB0.a(sb, this.e, ", logEvents=", valueOf2, ", qosTier=");
        return Y5.a(sb, valueOf3, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HH1)) {
            return false;
        }
        C9152qo c9152qo = (C9152qo) ((HH1) obj);
        if (this.a == c9152qo.a) {
            if (this.b == c9152qo.b) {
                AbstractC7320lU abstractC7320lU = c9152qo.c;
                AbstractC7320lU abstractC7320lU2 = this.c;
                if (abstractC7320lU2 != null ? abstractC7320lU2.equals(abstractC7320lU) : abstractC7320lU == null) {
                    Integer num = c9152qo.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c9152qo.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = c9152qo.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                BF2 bf2 = c9152qo.g;
                                BF2 bf22 = this.g;
                                if (bf22 == null) {
                                    if (bf2 == null) {
                                        return true;
                                    }
                                } else if (bf22.equals(bf2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC7320lU abstractC7320lU = this.c;
        int hashCode = (i ^ (abstractC7320lU == null ? 0 : abstractC7320lU.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        BF2 bf2 = this.g;
        return hashCode4 ^ (bf2 != null ? bf2.hashCode() : 0);
    }
}
