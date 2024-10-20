package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11430xS1 {
    public final int a;
    public final int b;
    public final int c;

    public C11430xS1(C10744vS1 c10744vS1) {
        Context context = c10744vS1.a;
        ActivityManager activityManager = c10744vS1.b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.c = i;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = c10744vS1.c.a;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = c10744vS1.d;
        int round2 = Math.round(f * f2);
        int round3 = Math.round(f * 2.0f);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.b = round3;
            this.a = round2;
        } else {
            float f3 = i2 / (f2 + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.b);
            Formatter.formatFileSize(context, this.a);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
