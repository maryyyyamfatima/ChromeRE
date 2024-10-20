package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EI2 {
    public static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void b(String str, boolean z) {
        AbstractC10254u04.a.a(str, z);
    }

    public static void c(int i, String str) {
        AbstractC10254u04.a.c(i, 1, 1000, 50, str);
    }

    public static void d(int i, String str) {
        AbstractC10254u04.a.c(i, 1, 100, 50, str);
    }

    public static void e(int i, String str) {
        AbstractC10254u04.a.c(i, 1, 1000000, 50, str);
    }

    public static void f(int i, int i2, int i3, int i4, String str) {
        AbstractC10254u04.a.c(i, i2, i3, i4, str);
    }

    public static void g(String str, long j, long j2, long j3, int i) {
        AbstractC10254u04.a.c(a(j), a(j2), a(j3), i, str);
    }

    public static void h(int i, int i2, String str) {
        AbstractC10254u04.a.e(i, 1, i2, i2 + 1, str);
    }

    public static void i(int i, int i2, int i3, int i4, String str) {
        AbstractC10254u04.a.e(i, i2, i3, i4, str);
    }

    public static void m(int i, String str) {
        AbstractC10254u04.a.d(i, str);
    }

    public static void l(int i, String str) {
        h(i, 101, str);
    }

    public static void n(long j, String str) {
        g(str, j, 1L, 10000L, 50);
    }

    public static void k(long j, String str) {
        g(str, j, 10L, 180000L, 50);
    }

    public static void j(long j, String str) {
        g(str, j, 1L, 3600000L, 50);
    }
}
