package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fZ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5287fZ3 {
    public static C5287fZ3 d;
    public long a;
    public long b;
    public int c;

    public final void a(long j, double d2, double d3) {
        double d4 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.c = 0;
                this.a = -1L;
                this.b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round;
            if (round < j && this.a > j) {
                this.c = 0;
            } else {
                this.c = 1;
            }
        }
    }
}
