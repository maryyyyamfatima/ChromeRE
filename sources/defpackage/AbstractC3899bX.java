package defpackage;

import android.content.Context;
import android.graphics.Color;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3899bX {
    public static boolean e(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static float c(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return ((Math.min(red, Math.min(green, blue)) + Math.max(red, Math.max(green, blue))) / 2) / 255.0f;
    }

    public static boolean g(int i) {
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        return Math.abs(1.05f / (((((blue > 0.03928f ? 1 : (blue == 0.03928f ? 0 : -1)) < 0 ? blue / 12.92f : (float) Math.pow((double) ((blue + 0.055f) / 1.055f), 2.4000000953674316d)) * 0.0722f) + ((((green > 0.03928f ? 1 : (green == 0.03928f ? 0 : -1)) < 0 ? green / 12.92f : (float) Math.pow((double) ((green + 0.055f) / 1.055f), 2.4000000953674316d)) * 0.7152f) + ((red < 0.03928f ? red / 12.92f : (float) Math.pow((red + 0.055f) / 1.055f, 2.4000000953674316d)) * 0.2126f))) + 0.05f)) >= 3.0f;
    }

    public static int b(int i) {
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.6f};
        return Color.HSVToColor(fArr);
    }

    public static boolean h(int i) {
        return c(i) > 0.82f;
    }

    public static int d(int i) {
        return Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public static boolean f(int i) {
        return c(i) > 0.94f;
    }

    public static int a(int i, int i2, float f, boolean z) {
        float red = Color.red(i);
        int a = (int) AbstractC2277Rn2.a(Color.red(i2), red, f, red);
        float green = Color.green(i);
        int a2 = (int) AbstractC2277Rn2.a(Color.green(i2), green, f, green);
        float blue = Color.blue(i);
        int a3 = (int) AbstractC2277Rn2.a(Color.blue(i2), blue, f, blue);
        if (z) {
            float alpha = Color.alpha(i);
            return Color.argb((int) AbstractC2277Rn2.a(Color.alpha(i2), alpha, f, alpha), a, a2, a3);
        }
        return Color.rgb(a, a2, a3);
    }
}
