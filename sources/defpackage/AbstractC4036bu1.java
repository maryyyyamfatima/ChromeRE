package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4036bu1 {
    public static final C2826Vt1 a = C2826Vt1.a("x", "y");

    public static int a(AbstractC3086Xt1 abstractC3086Xt1) {
        abstractC3086Xt1.b();
        int k = (int) (abstractC3086Xt1.k() * 255.0d);
        int k2 = (int) (abstractC3086Xt1.k() * 255.0d);
        int k3 = (int) (abstractC3086Xt1.k() * 255.0d);
        while (abstractC3086Xt1.i()) {
            abstractC3086Xt1.I();
        }
        abstractC3086Xt1.e();
        return Color.argb(255, k, k2, k3);
    }

    public static ArrayList c(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC3086Xt1.b();
        while (abstractC3086Xt1.u() == 1) {
            abstractC3086Xt1.b();
            arrayList.add(b(abstractC3086Xt1, f));
            abstractC3086Xt1.e();
        }
        abstractC3086Xt1.e();
        return arrayList;
    }

    public static PointF b(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        int b = AbstractC2373Sg3.b(abstractC3086Xt1.u());
        if (b == 0) {
            abstractC3086Xt1.b();
            float k = (float) abstractC3086Xt1.k();
            float k2 = (float) abstractC3086Xt1.k();
            while (abstractC3086Xt1.u() != 2) {
                abstractC3086Xt1.I();
            }
            abstractC3086Xt1.e();
            return new PointF(k * f, k2 * f);
        }
        if (b != 2) {
            if (b != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC2956Wt1.a(abstractC3086Xt1.u())));
            }
            float k3 = (float) abstractC3086Xt1.k();
            float k4 = (float) abstractC3086Xt1.k();
            while (abstractC3086Xt1.i()) {
                abstractC3086Xt1.I();
            }
            return new PointF(k3 * f, k4 * f);
        }
        abstractC3086Xt1.c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (abstractC3086Xt1.i()) {
            int C = abstractC3086Xt1.C(a);
            if (C == 0) {
                f2 = d(abstractC3086Xt1);
            } else if (C == 1) {
                f3 = d(abstractC3086Xt1);
            } else {
                abstractC3086Xt1.F();
                abstractC3086Xt1.I();
            }
        }
        abstractC3086Xt1.f();
        return new PointF(f2 * f, f3 * f);
    }

    public static float d(AbstractC3086Xt1 abstractC3086Xt1) {
        int u = abstractC3086Xt1.u();
        int b = AbstractC2373Sg3.b(u);
        if (b != 0) {
            if (b == 6) {
                return (float) abstractC3086Xt1.k();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC2956Wt1.a(u)));
        }
        abstractC3086Xt1.b();
        float k = (float) abstractC3086Xt1.k();
        while (abstractC3086Xt1.i()) {
            abstractC3086Xt1.I();
        }
        abstractC3086Xt1.e();
        return k;
    }
}
