package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YV3 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public YV3(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = ((str2 == null ? 0 : str2.hashCode()) * 31) + (str.hashCode() * 31 * 31) + i;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj == null || YV3.class != obj.getClass()) {
            return false;
        }
        YV3 yv3 = (YV3) obj;
        if (this.a == yv3.a && ((str = this.b) == (str2 = yv3.b) || (str != null && str.equals(str2)))) {
            String str3 = this.c;
            String str4 = yv3.c;
            if (str3 == str4) {
                return true;
            }
            if (str3 != null && str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionId{\"");
        sb.append(this.b);
        sb.append("\", ");
        int i = this.a;
        if (i == 1) {
            sb.append("GLOBAL");
        } else if (i == 2) {
            sb.append("SCOPED(");
            sb.append(this.c);
            sb.append(")");
        } else if (i == 3) {
            sb.append("AUTOGENERATED");
        }
        sb.append("}");
        return sb.toString();
    }
}
