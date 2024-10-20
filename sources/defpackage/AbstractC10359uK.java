package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10359uK implements Comparator {
    public static int b(C10016tK c10016tK, C10016tK c10016tK2) {
        boolean z = c10016tK.d;
        if (z && !c10016tK2.d) {
            return -1;
        }
        if (z || !c10016tK2.d) {
            return Long.signum(c10016tK.c - c10016tK2.c);
        }
        return 1;
    }

    public static int a(C10016tK c10016tK, C10016tK c10016tK2) {
        boolean z = c10016tK.b;
        boolean z2 = (z && c10016tK.c == 0) || c10016tK.e == 2;
        boolean z3 = c10016tK2.b;
        boolean z4 = (z3 && c10016tK2.c == 0) || c10016tK2.e == 2;
        if (z2 && z4) {
            return b(c10016tK, c10016tK2);
        }
        if (z2 && !z4) {
            return -1;
        }
        if (!z2 && z4) {
            return 1;
        }
        boolean z5 = (z && c10016tK.c > 0 && c10016tK.d) || c10016tK.e == 1;
        boolean z6 = (z3 && c10016tK2.c > 0 && c10016tK2.d) || c10016tK2.e == 1;
        if (z5 && z6) {
            return b(c10016tK, c10016tK2);
        }
        if (z5 && !z6) {
            return -1;
        }
        if (!z5 && z6) {
            return 1;
        }
        if (z && z3) {
            return b(c10016tK, c10016tK2);
        }
        if (!z || z3) {
            return (z || !z3) ? 0 : 1;
        }
        return -1;
    }
}
