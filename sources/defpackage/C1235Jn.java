package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235Jn extends Y8 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public C1235Jn(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return Y5.a(sb, this.l, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y8 = (Y8) obj;
        Integer num = this.a;
        if (num != null ? num.equals(((C1235Jn) y8).a) : ((C1235Jn) y8).a == null) {
            String str = this.b;
            if (str != null ? str.equals(((C1235Jn) y8).b) : ((C1235Jn) y8).b == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(((C1235Jn) y8).c) : ((C1235Jn) y8).c == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(((C1235Jn) y8).d) : ((C1235Jn) y8).d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((C1235Jn) y8).e) : ((C1235Jn) y8).e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((C1235Jn) y8).f) : ((C1235Jn) y8).f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((C1235Jn) y8).g) : ((C1235Jn) y8).g == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(((C1235Jn) y8).h) : ((C1235Jn) y8).h == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(((C1235Jn) y8).i) : ((C1235Jn) y8).i == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(((C1235Jn) y8).j) : ((C1235Jn) y8).j == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(((C1235Jn) y8).k) : ((C1235Jn) y8).k == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (((C1235Jn) y8).l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((C1235Jn) y8).l)) {
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
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }
}
