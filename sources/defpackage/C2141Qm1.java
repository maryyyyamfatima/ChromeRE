package defpackage;

import android.graphics.Insets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2141Qm1 {
    public static final C2141Qm1 e = new C2141Qm1(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C2141Qm1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static C2141Qm1 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new C2141Qm1(i, i2, i3, i4);
    }

    public static C2141Qm1 a(C2141Qm1 c2141Qm1, C2141Qm1 c2141Qm12) {
        return b(Math.max(c2141Qm1.a, c2141Qm12.a), Math.max(c2141Qm1.b, c2141Qm12.b), Math.max(c2141Qm1.c, c2141Qm12.c), Math.max(c2141Qm1.d, c2141Qm12.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2141Qm1.class != obj.getClass()) {
            return false;
        }
        C2141Qm1 c2141Qm1 = (C2141Qm1) obj;
        return this.d == c2141Qm1.d && this.a == c2141Qm1.a && this.c == c2141Qm1.c && this.b == c2141Qm1.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }

    public static C2141Qm1 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        Insets of;
        of = Insets.of(this.a, this.b, this.c, this.d);
        return of;
    }
}
