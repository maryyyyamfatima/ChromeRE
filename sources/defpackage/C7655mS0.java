package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7655mS0 {
    public static final long d;
    public static final C7655mS0 e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        d = j;
        e = new C7655mS0(0, -1, -1);
    }

    public static int c(int i, int i2, String str) {
        if (i == i2) {
            throw C7063kj2.a(i - 1, "missing precision", str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= '\n') {
                throw C7063kj2.a(i4, "invalid precision character", str);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw C7063kj2.c(i, "precision too large", i2, str);
            }
        }
        if (i3 != 0 || i2 == i + 1) {
            return i3;
        }
        throw C7063kj2.c(i, "invalid precision", i2, str);
    }

    public C7655mS0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean b() {
        return this == e;
    }

    public final boolean d(int i, boolean z) {
        int i2;
        if (b()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if (z || this.c == -1) {
            return ((i4 & 9) == 9 || (i2 = i4 & 96) == 96 || (i2 != 0 && !(this.b != -1))) ? false : true;
        }
        return false;
    }

    public final void a(StringBuilder sb) {
        if (b()) {
            return;
        }
        int i = this.a & (-129);
        int i2 = 0;
        while (true) {
            int i3 = 1 << i2;
            if (i3 > i) {
                break;
            }
            if ((i3 & i) != 0) {
                sb.append(" #(+,-0".charAt(i2));
            }
            i2++;
        }
        int i4 = this.b;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.c;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7655mS0)) {
            return false;
        }
        C7655mS0 c7655mS0 = (C7655mS0) obj;
        return c7655mS0.a == this.a && c7655mS0.b == this.b && c7655mS0.c == this.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
