package defpackage;

import android.graphics.Path;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wn2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2927Wn2 {
    public static float[] b(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 0;
        int min = Math.min(i2, length - 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static Path d(String str) {
        Path path = new Path();
        C2667Un2[] c = c(str);
        if (c == null) {
            return null;
        }
        try {
            C2667Un2.b(c, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(AbstractC4809e90.a("Error in parsing ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:            if (r13 == 0) goto L42;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:40:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:40:0x0097, B:44:0x009c, B:49:0x00ac, B:61:0x00b1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C2667Un2[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2927Wn2.c(java.lang.String):Un2[]");
    }

    public static C2667Un2[] e(C2667Un2[] c2667Un2Arr) {
        if (c2667Un2Arr == null) {
            return null;
        }
        C2667Un2[] c2667Un2Arr2 = new C2667Un2[c2667Un2Arr.length];
        for (int i = 0; i < c2667Un2Arr.length; i++) {
            c2667Un2Arr2[i] = new C2667Un2(c2667Un2Arr[i]);
        }
        return c2667Un2Arr2;
    }

    public static boolean a(C2667Un2[] c2667Un2Arr, C2667Un2[] c2667Un2Arr2) {
        if (c2667Un2Arr == null || c2667Un2Arr2 == null || c2667Un2Arr.length != c2667Un2Arr2.length) {
            return false;
        }
        for (int i = 0; i < c2667Un2Arr.length; i++) {
            C2667Un2 c2667Un2 = c2667Un2Arr[i];
            char c = c2667Un2.a;
            C2667Un2 c2667Un22 = c2667Un2Arr2[i];
            if (c != c2667Un22.a || c2667Un2.b.length != c2667Un22.b.length) {
                return false;
            }
        }
        return true;
    }
}
