package defpackage;

import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500Lo {
    public final AbstractC1472Li1 a;
    public final C10020tK3 b;
    public final String c;
    public final Integer d;
    public final Status e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Boolean i;
    public final int j;

    public C1500Lo(AbstractC1472Li1 abstractC1472Li1, C10020tK3 c10020tK3, String str, Integer num, Status status, String str2, String str3, Integer num2, Boolean bool, int i) {
        this.a = abstractC1472Li1;
        this.b = c10020tK3;
        this.c = str;
        this.d = num;
        this.e = status;
        this.f = str2;
        this.g = str3;
        this.h = num2;
        this.i = bool;
        this.j = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.e);
        StringBuilder a = AbstractC10975w63.a("SpanInfo{templateUris=", valueOf, ", threadInfo=", valueOf2, ", nodeId=");
        a.append(this.c);
        a.append(", commandExtensionId=");
        a.append(this.d);
        a.append(", commandExecutionStatus=");
        a.append(valueOf3);
        a.append(", jsModuleIdentifier=");
        a.append(this.f);
        a.append(", jsFunctionName=");
        a.append(this.g);
        a.append(", jsBindingExtensionId=");
        a.append(this.h);
        a.append(", jsIsSynchronous=");
        a.append(this.i);
        a.append(", materializationCount=");
        return AbstractC8207o22.a(a, this.j, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1500Lo)) {
            return false;
        }
        C1500Lo c1500Lo = (C1500Lo) obj;
        if (this.a.equals(c1500Lo.a)) {
            C10020tK3 c10020tK3 = c1500Lo.b;
            C10020tK3 c10020tK32 = this.b;
            if (c10020tK32 != null ? c10020tK32.equals(c10020tK3) : c10020tK3 == null) {
                String str = c1500Lo.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    Integer num = c1500Lo.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        Status status = c1500Lo.e;
                        Status status2 = this.e;
                        if (status2 != null ? status2.equals(status) : status == null) {
                            String str3 = c1500Lo.f;
                            String str4 = this.f;
                            if (str4 != null ? str4.equals(str3) : str3 == null) {
                                String str5 = c1500Lo.g;
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(str5) : str5 == null) {
                                    Integer num3 = c1500Lo.h;
                                    Integer num4 = this.h;
                                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                                        Boolean bool = c1500Lo.i;
                                        Boolean bool2 = this.i;
                                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                                            if (this.j == c1500Lo.j) {
                                                return true;
                                            }
                                        }
                                    }
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
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C10020tK3 c10020tK3 = this.b;
        int hashCode2 = (hashCode ^ (c10020tK3 == null ? 0 : c10020tK3.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Status status = this.e;
        int hashCode5 = (hashCode4 ^ (status == null ? 0 : status.hashCode())) * 1000003;
        String str2 = this.f;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.g;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num2 = this.h;
        int hashCode8 = (hashCode7 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Boolean bool = this.i;
        return ((hashCode8 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.j;
    }
}
