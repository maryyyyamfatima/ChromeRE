package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UY1 {
    public final String a;
    public final TY1 b;
    public TY1 c;

    public UY1(String str) {
        TY1 ty1 = new TY1();
        this.b = ty1;
        this.c = ty1;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        TY1 ty1 = this.b.c;
        String str = "";
        while (ty1 != null) {
            Object obj = ty1.b;
            sb.append(str);
            String str2 = ty1.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            ty1 = ty1.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final void a(Object obj, String str) {
        TY1 ty1 = new TY1();
        this.c.c = ty1;
        this.c = ty1;
        ty1.b = obj;
        ty1.a = str;
    }
}
