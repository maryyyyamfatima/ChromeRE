package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U53 {
    public final C7200l63[] a = new C7200l63[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final C7200l63 g = new C7200l63();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public U53() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new C7200l63();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final void a(S53 s53, float f, RectF rectF, BM1 bm1, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C7200l63[] c7200l63Arr;
        C2445Sv0 c2445Sv0;
        Path path2;
        BM1 bm12;
        char c;
        InterfaceC11333x90 interfaceC11333x90;
        AbstractC11676y90 abstractC11676y90;
        U53 u53 = this;
        BM1 bm13 = bm1;
        Path path3 = path;
        path.rewind();
        Path path4 = u53.e;
        path4.rewind();
        Path path5 = u53.f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = u53.c;
            fArr = u53.h;
            matrixArr2 = u53.b;
            c7200l63Arr = u53.a;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                interfaceC11333x90 = s53.g;
            } else if (i2 == 2) {
                interfaceC11333x90 = s53.h;
            } else if (i2 == 3) {
                interfaceC11333x90 = s53.e;
            } else {
                interfaceC11333x90 = s53.f;
            }
            if (i2 == 1) {
                abstractC11676y90 = s53.c;
            } else if (i2 == 2) {
                abstractC11676y90 = s53.d;
            } else if (i2 == 3) {
                abstractC11676y90 = s53.a;
            } else {
                abstractC11676y90 = s53.b;
            }
            C7200l63 c7200l63 = c7200l63Arr[i2];
            abstractC11676y90.getClass();
            abstractC11676y90.a(f, interfaceC11333x90.a(rectF), c7200l63);
            int i3 = i2 + 1;
            float f2 = i3 * 90;
            matrixArr2[i2].reset();
            PointF pointF = u53.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 == 3) {
                pointF.set(rectF.left, rectF.top);
            } else {
                pointF.set(rectF.right, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            C7200l63 c7200l632 = c7200l63Arr[i2];
            fArr[0] = c7200l632.c;
            fArr[1] = c7200l632.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        char c2 = 1;
        char c3 = 0;
        int i4 = 0;
        while (i4 < i) {
            C7200l63 c7200l633 = c7200l63Arr[i4];
            fArr[c3] = c7200l633.a;
            fArr[c2] = c7200l633.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c3], fArr[c2]);
            } else {
                path3.lineTo(fArr[c3], fArr[c2]);
            }
            c7200l63Arr[i4].b(matrixArr2[i4], path3);
            if (bm13 != null) {
                C7200l63 c7200l634 = c7200l63Arr[i4];
                Matrix matrix = matrixArr2[i4];
                DM1 dm1 = bm13.a;
                BitSet bitSet = dm1.i;
                c7200l634.getClass();
                bitSet.set(i4, false);
                c7200l634.a(c7200l634.f);
                dm1.g[i4] = new C4794e63(new ArrayList(c7200l634.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C7200l63 c7200l635 = c7200l63Arr[i4];
            fArr[0] = c7200l635.c;
            fArr[1] = c7200l635.d;
            matrixArr2[i4].mapPoints(fArr);
            C7200l63 c7200l636 = c7200l63Arr[i6];
            float f3 = c7200l636.a;
            float[] fArr2 = u53.i;
            fArr2[0] = f3;
            fArr2[1] = c7200l636.b;
            matrixArr2[i6].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C7200l63 c7200l637 = c7200l63Arr[i4];
            fArr[0] = c7200l637.c;
            fArr[1] = c7200l637.d;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C7200l63 c7200l638 = u53.g;
            c7200l638.d(0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c2445Sv0 = s53.k;
            } else if (i4 == 2) {
                c2445Sv0 = s53.l;
            } else if (i4 == 3) {
                c2445Sv0 = s53.i;
            } else {
                c2445Sv0 = s53.j;
            }
            c2445Sv0.getClass();
            c7200l638.c(max, 0.0f);
            Path path6 = u53.j;
            path6.reset();
            c7200l638.b(matrixArr[i4], path6);
            if (u53.l && (u53.b(path6, i4) || u53.b(path6, i6))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = c7200l638.a;
                fArr[1] = c7200l638.b;
                matrixArr[i4].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                c7200l638.b(matrixArr[i4], path4);
                bm12 = bm1;
                path2 = path;
            } else {
                path2 = path;
                c7200l638.b(matrixArr[i4], path2);
                bm12 = bm1;
            }
            if (bm12 != null) {
                Matrix matrix2 = matrixArr[i4];
                DM1 dm12 = bm12.a;
                c = 0;
                dm12.i.set(i4 + 4, false);
                c7200l638.a(c7200l638.f);
                dm12.h[i4] = new C4794e63(new ArrayList(c7200l638.h), new Matrix(matrix2));
            } else {
                c = 0;
            }
            i4 = i5;
            c3 = c;
            path3 = path2;
            c2 = 1;
            i = 4;
            u53 = this;
            bm13 = bm12;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
