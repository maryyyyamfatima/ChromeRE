package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4694dp3 {
    public final int[] a;
    public final C4008bp3 b;
    public C4008bp3 c;
    public int d;
    public int e;
    public int f;

    public C4694dp3(int[] iArr) {
        this.a = iArr;
        C4008bp3 c4008bp3 = new C4008bp3(-1, -1);
        this.b = c4008bp3;
        this.c = c4008bp3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        b(this.b, sb);
        sb.append("}");
        return sb.toString();
    }

    public final void b(C4008bp3 c4008bp3, StringBuilder sb) {
        for (C4008bp3 c4008bp32 : c4008bp3.d.values()) {
            sb.append("  ");
            sb.append(c4008bp3);
            sb.append(" -> ");
            sb.append(c4008bp32);
            sb.append(" [label=\"");
            int i = c4008bp32.a;
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, i, Math.min(iArr.length, c4008bp32.b + 1))));
            sb.append("\"]\n");
            b(c4008bp32, sb);
        }
    }

    public final void d() {
        if (this.e == 0) {
            return;
        }
        HashMap hashMap = this.c.d;
        int i = this.d;
        int[] iArr = this.a;
        C4008bp3 c4008bp3 = (C4008bp3) hashMap.get(Integer.valueOf(iArr[i]));
        while (true) {
            int i2 = (c4008bp3.b - c4008bp3.a) + 1;
            int i3 = this.e;
            if (i2 > i3) {
                return;
            }
            int i4 = this.d + i2;
            this.d = i4;
            this.c = c4008bp3;
            int i5 = i3 - i2;
            this.e = i5;
            if (i5 > 0) {
                c4008bp3 = (C4008bp3) c4008bp3.d.get(Integer.valueOf(iArr[i4]));
            }
        }
    }

    public final void a() {
        C4008bp3 c4008bp3 = this.c.c;
        if (c4008bp3 != null) {
            this.c = c4008bp3;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        d();
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = this.a;
        int min = Math.min(iArr.length, i2);
        if (min - i != Math.min(iArr.length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= min; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }
}
