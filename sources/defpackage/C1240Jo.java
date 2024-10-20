package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240Jo {
    public final String a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final C1500Lo f;

    public C1240Jo(String str, Long l, Long l2, Long l3, Integer num, C1500Lo c1500Lo) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = num;
        this.f = c1500Lo;
    }

    public final String toString() {
        return "TimeSpan{name=" + this.a + ", startTimeUs=" + this.b + ", endTimeUs=" + this.c + ", spanLengthTimeUs=" + this.d + ", parentId=" + this.e + ", spanInfo=" + String.valueOf(this.f) + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1240Jo)) {
            return false;
        }
        C1240Jo c1240Jo = (C1240Jo) obj;
        if (this.a.equals(c1240Jo.a)) {
            Long l = c1240Jo.b;
            Long l2 = this.b;
            if (l2 != null ? l2.equals(l) : l == null) {
                Long l3 = c1240Jo.c;
                Long l4 = this.c;
                if (l4 != null ? l4.equals(l3) : l3 == null) {
                    Long l5 = c1240Jo.d;
                    Long l6 = this.d;
                    if (l6 != null ? l6.equals(l5) : l5 == null) {
                        Integer num = c1240Jo.e;
                        Integer num2 = this.e;
                        if (num2 != null ? num2.equals(num) : num == null) {
                            C1500Lo c1500Lo = c1240Jo.f;
                            C1500Lo c1500Lo2 = this.f;
                            if (c1500Lo2 == null) {
                                if (c1500Lo == null) {
                                    return true;
                                }
                            } else if (c1500Lo2.equals(c1500Lo)) {
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
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Long l = this.b;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.d;
        int hashCode4 = (hashCode3 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Integer num = this.e;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C1500Lo c1500Lo = this.f;
        return hashCode5 ^ (c1500Lo != null ? c1500Lo.hashCode() : 0);
    }
}
