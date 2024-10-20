package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5372fo {
    public final String a;
    public final Integer b;
    public final HA0 c;
    public final long d;
    public final long e;
    public final Map f;

    public C5372fo(String str, Integer num, HA0 ha0, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = ha0;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final C5028eo c() {
        C5028eo c5028eo = new C5028eo();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c5028eo.a = str;
        c5028eo.b = this.b;
        c5028eo.c(this.c);
        c5028eo.d = this.d;
        byte b = (byte) (c5028eo.g | 1);
        c5028eo.e = this.e;
        c5028eo.g = (byte) (b | 2);
        c5028eo.f = new HashMap(this.f);
        return c5028eo;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + String.valueOf(this.c) + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + String.valueOf(this.f) + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5372fo)) {
            return false;
        }
        C5372fo c5372fo = (C5372fo) obj;
        if (this.a.equals(c5372fo.a)) {
            Integer num = c5372fo.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(c5372fo.c) && this.d == c5372fo.d && this.e == c5372fo.e && this.f.equals(c5372fo.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }
}
