package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bv1 */
/* loaded from: classes.dex */
public abstract class AbstractC0237Bv1 {
    public static C1593Mg3 b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final C2826Vt1 c = C2826Vt1.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final C2826Vt1 d = C2826Vt1.a("x", "y");

    /* JADX WARN: Failed to find 'out' block for switch in B:139:0x025b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C12282zv1 b(defpackage.AbstractC3086Xt1 r23, defpackage.C8985qJ1 r24, float r25, defpackage.N74 r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0237Bv1.b(Xt1, qJ1, float, N74, boolean, boolean):zv1");
    }

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        pointF.x = CX1.b(pointF.x, -1.0f, 1.0f);
        pointF.y = CX1.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = CX1.b(pointF2.x, -1.0f, 1.0f);
        float b2 = CX1.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        C11325x74 c11325x74 = C74.a;
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (b2 != 0.0f) {
            i = (int) (i * 31 * b2);
        }
        synchronized (AbstractC0237Bv1.class) {
            if (b == null) {
                b = new C1593Mg3();
            }
            weakReference = (WeakReference) b.d(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                interpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (AbstractC0237Bv1.class) {
                    b.g(i, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }
}
