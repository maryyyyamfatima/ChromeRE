package defpackage;

import android.graphics.Color;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4242cX {
    public static final ThreadLocal a = new ThreadLocal();

    public static int f(int i, int i2) {
        int i3;
        int i4;
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i5 = 255 - alpha2;
        int i6 = 255 - (((255 - alpha) * i5) / 255);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        int i7 = 0;
        if (i6 == 0) {
            i3 = 0;
        } else {
            i3 = (((red2 * alpha) * i5) + ((red * 255) * alpha2)) / (i6 * 255);
        }
        int green = Color.green(i);
        int green2 = Color.green(i2);
        if (i6 == 0) {
            i4 = 0;
        } else {
            i4 = (((green2 * alpha) * i5) + ((green * 255) * alpha2)) / (i6 * 255);
        }
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i6 != 0) {
            i7 = (((blue2 * alpha) * i5) + ((blue * 255) * alpha2)) / (i6 * 255);
        }
        return Color.argb(i6, i3, i4, i7);
    }

    public static double c(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = f(i, i2);
        }
        double d = d(i) + 0.05d;
        double d2 = d(i2) + 0.05d;
        return Math.max(d, d2) / Math.min(d, d2);
    }

    public static int e(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        double d = f;
        if (c(g(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (c(g(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < 0.0f ? 0.0f : Math.min(f7, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f6 >= 0.0f ? Math.min(f6, 1.0f) : 0.0f;
    }

    public static int g(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static int b(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double pow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static double d(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d4 / 100.0d;
    }
}
