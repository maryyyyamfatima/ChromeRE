package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A14 {
    public static void b(Object obj, Object obj2) {
        ((QX0) obj).g = (C11975z14) obj2;
    }

    public static boolean a(Object obj, FH2 fh2) {
        int tag = fh2.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            ((C11975z14) obj).c((i << 3) | 0, Long.valueOf(fh2.M()));
        } else if (i2 == 1) {
            ((C11975z14) obj).c((i << 3) | 1, Long.valueOf(fh2.d()));
        } else if (i2 == 2) {
            ((C11975z14) obj).c((i << 3) | 2, fh2.D());
        } else if (i2 == 3) {
            C11975z14 b = C11975z14.b();
            int i3 = i << 3;
            int i4 = i3 | 4;
            while (fh2.z() != Integer.MAX_VALUE && a(b, fh2)) {
            }
            if (i4 != fh2.getTag()) {
                throw C1127Ir1.a();
            }
            b.e = false;
            ((C11975z14) obj).c(i3 | 3, b);
        } else {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                int i5 = C1127Ir1.h;
                throw new C0997Hr1();
            }
            ((C11975z14) obj).c((i << 3) | 5, Integer.valueOf(fh2.h()));
        }
        return true;
    }
}
