package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yN3 */
/* loaded from: classes.dex */
public abstract class AbstractC11750yN3 {
    public static void a(C11064wN3 c11064wN3) {
        long j = c11064wN3.j;
        int i = c11064wN3.k;
        if (!(j >= -62135596800L && j <= 253402300799L && i >= 0 && i < 1000000000)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    static {
        C11064wN3 c11064wN3 = C11064wN3.l;
        C10378uN3 c10378uN3 = (C10378uN3) c11064wN3.j();
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).j = -62135596800L;
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).k = 0;
        C10378uN3 c10378uN32 = (C10378uN3) c11064wN3.j();
        if (c10378uN32.h) {
            c10378uN32.l();
            c10378uN32.h = false;
        }
        ((C11064wN3) c10378uN32.g).j = 253402300799L;
        if (c10378uN32.h) {
            c10378uN32.l();
            c10378uN32.h = false;
        }
        ((C11064wN3) c10378uN32.g).k = 999999999;
        C10378uN3 c10378uN33 = (C10378uN3) c11064wN3.j();
        if (c10378uN33.h) {
            c10378uN33.l();
            c10378uN33.h = false;
        }
        ((C11064wN3) c10378uN33.g).j = 0L;
        if (c10378uN33.h) {
            c10378uN33.l();
            c10378uN33.h = false;
        }
        ((C11064wN3) c10378uN33.g).k = 0;
        new C11407xN3();
    }

    public static C11064wN3 b(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = FI1.a(j2, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j2 = FI1.c(j2, 1L);
        }
        C10378uN3 c10378uN3 = (C10378uN3) C11064wN3.l.j();
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).j = j2;
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).k = i;
        C11064wN3 c11064wN3 = (C11064wN3) c10378uN3.j();
        a(c11064wN3);
        return c11064wN3;
    }
}
