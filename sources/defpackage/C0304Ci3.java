package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ci3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304Ci3 {
    public static float d;
    public static float e;
    public int a;
    public final C0174Bi3 b;
    public final C0174Bi3 c;

    public C0304Ci3(Context context) {
        this.b = new C0174Bi3(context);
        this.c = new C0174Bi3(context);
        d = 8.0f;
        e = 1.0f;
        e = 1.0f / c(1.0f);
    }

    public static float c(float f) {
        float a;
        float f2 = f * d;
        if (f2 < 1.0f) {
            a = f2 - (1.0f - ((float) Math.exp(-f2)));
        } else {
            a = AbstractC2277Rn2.a(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
        }
        return a * e;
    }

    public final void b(int i, int i2, int i3, long j) {
        this.a = 0;
        C0174Bi3 c0174Bi3 = this.b;
        c0174Bi3.k = false;
        c0174Bi3.a = i;
        c0174Bi3.c = i + i2;
        c0174Bi3.g = j;
        c0174Bi3.h = i3;
        c0174Bi3.f = 0.0f;
        c0174Bi3.d = 0;
        C0174Bi3 c0174Bi32 = this.c;
        c0174Bi32.k = false;
        c0174Bi32.a = 0;
        c0174Bi32.c = 0;
        c0174Bi32.g = j;
        c0174Bi32.h = i3;
        c0174Bi32.f = 0.0f;
        c0174Bi32.d = 0;
    }

    public final boolean a() {
        return this.b.k && this.c.k;
    }
}
