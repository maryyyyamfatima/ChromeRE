package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3086Xt1 implements Closeable {
    public static final String[] j = new String[128];
    public int a;
    public int[] g = new int[32];
    public String[] h = new String[32];
    public int[] i = new int[32];

    public abstract int C(C2826Vt1 c2826Vt1);

    public abstract void F();

    public abstract void I();

    public abstract void b();

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean i();

    public abstract boolean j();

    public abstract double k();

    public abstract int r();

    public abstract String s();

    public abstract int u();

    static {
        for (int i = 0; i <= 31; i++) {
            j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final void y(int i) {
        int i2 = this.a;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C2566Tt1(AbstractC4809e90.a("Nesting too deep at ", h()));
            }
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.i;
            this.i = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.g;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public final void M(String str) {
        throw new C2696Ut1(AbstractC8192o0.a(str, " at path ", h()));
    }

    public final String h() {
        int i = this.a;
        int[] iArr = this.g;
        String[] strArr = this.h;
        int[] iArr2 = this.i;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
