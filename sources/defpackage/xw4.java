package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class xw4 {
    public final File a;
    public final String b;

    public xw4(File file, String str) {
        this.a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xw4) {
            xw4 xw4Var = (xw4) obj;
            if (this.a.equals(xw4Var.a) && this.b.equals(xw4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int length = valueOf.length();
        String str = this.b;
        StringBuilder sb = new StringBuilder(length + 35 + str.length());
        AbstractC9972tB0.a(sb, "SplitFileInfo{splitFile=", valueOf, ", splitId=", str);
        sb.append("}");
        return sb.toString();
    }
}
