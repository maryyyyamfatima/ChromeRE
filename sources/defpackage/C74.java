package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class C74 {
    public static final C11325x74 a = new C11325x74();
    public static final C11668y74 b = new C11668y74();
    public static final C12011z74 c = new C12011z74();
    public static final A74 d = new A74();
    public static final float e = (float) (Math.sqrt(2.0d) / 2.0d);
    public static float f = -1.0f;

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void a(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = (PathMeasure) a.get();
        Path path2 = (Path) b.get();
        Path path3 = (Path) c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            AbstractC2576Tv1.a();
            return;
        }
        if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            AbstractC2576Tv1.a();
            return;
        }
        float f5 = f2 * length;
        float f6 = f3 * length;
        float f7 = f4 * length;
        float min = Math.min(f5, f6) + f7;
        float max = Math.max(f5, f6) + f7;
        if (min >= length && max >= length) {
            min = CX1.c(min, length);
            max = CX1.c(max, length);
        }
        if (min < 0.0f) {
            min = CX1.c(min, length);
        }
        if (max < 0.0f) {
            max = CX1.c(max, length);
        }
        if (min == max) {
            path.reset();
            AbstractC2576Tv1.a();
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        AbstractC2576Tv1.a();
    }

    public static float c() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }
}
