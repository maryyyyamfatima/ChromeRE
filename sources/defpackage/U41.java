package defpackage;

import androidx.gridlayout.widget.GridLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U41 {
    public static final U41 e = GridLayout.l(Integer.MIN_VALUE, 1, GridLayout.u, 0.0f);
    public final boolean a;
    public final Q41 b;
    public final J41 c;
    public final float d;

    public U41(boolean z, Q41 q41, J41 j41, float f) {
        this.a = z;
        this.b = q41;
        this.c = j41;
        this.d = f;
    }

    public final J41 a(boolean z) {
        B41 b41 = GridLayout.u;
        J41 j41 = this.c;
        if (j41 != b41) {
            return j41;
        }
        if (this.d == 0.0f) {
            return z ? GridLayout.x : GridLayout.C;
        }
        return GridLayout.D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U41)) {
            return false;
        }
        U41 u41 = (U41) obj;
        return this.c.equals(u41.c) && this.b.equals(u41.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
