package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8809po extends AbstractC7945nH1 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final X22 g;

    public C8809po(long j, Integer num, long j2, byte[] bArr, String str, long j3, X22 x22) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = x22;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + String.valueOf(this.g) + "}";
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7945nH1)) {
            return false;
        }
        AbstractC7945nH1 abstractC7945nH1 = (AbstractC7945nH1) obj;
        C8809po c8809po = (C8809po) abstractC7945nH1;
        if (this.a == c8809po.a && ((num = this.b) != null ? num.equals(c8809po.b) : c8809po.b == null)) {
            if (this.c == c8809po.c) {
                if (Arrays.equals(this.d, abstractC7945nH1 instanceof C8809po ? ((C8809po) abstractC7945nH1).d : c8809po.d)) {
                    String str = c8809po.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == c8809po.f) {
                            X22 x22 = c8809po.g;
                            X22 x222 = this.g;
                            if (x222 == null) {
                                if (x22 == null) {
                                    return true;
                                }
                            } else if (x222.equals(x22)) {
                                return true;
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        X22 x22 = this.g;
        return i2 ^ (x22 != null ? x22.hashCode() : 0);
    }
}
