package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8600pB implements SC0 {
    public final float[] a = new float[4];
    public final int[] g = new int[4];
    public final int[] h = new int[4];

    @Override // defpackage.SC0
    public final boolean a(Object obj) {
        C8600pB c8600pB = (C8600pB) obj;
        if (this == c8600pB) {
            return true;
        }
        return c8600pB != null && Arrays.equals(this.a, c8600pB.a) && Arrays.equals(this.g, c8600pB.g) && Arrays.equals(this.h, c8600pB.h);
    }

    public static int c(int[] iArr, EnumC10209ts4 enumC10209ts4) {
        if (iArr.length != 4) {
            throw new IllegalArgumentException("Given wrongly sized array");
        }
        return iArr[b(enumC10209ts4)];
    }

    public static void d(int[] iArr, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = i;
        }
    }

    public static int b(EnumC10209ts4 enumC10209ts4) {
        int ordinal = enumC10209ts4.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                if (ordinal == 4) {
                    return 0;
                }
                if (ordinal != 5) {
                    throw new IllegalArgumentException(AbstractC4809e90.a("Given unsupported edge ", enumC10209ts4.name()));
                }
            }
        }
        return i;
    }
}
