package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10645v84 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final C9616s84 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final C4317ck o;

    public C10645v84() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new C4317ck();
        this.g = new C9616s84();
        this.a = new Path();
        this.b = new Path();
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public C10645v84(C10645v84 c10645v84) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        C4317ck c4317ck = new C4317ck();
        this.o = c4317ck;
        this.g = new C9616s84(c10645v84.g, c4317ck);
        this.a = new Path(c10645v84.a);
        this.b = new Path(c10645v84.b);
        this.h = c10645v84.h;
        this.i = c10645v84.i;
        this.j = c10645v84.j;
        this.k = c10645v84.k;
        this.l = c10645v84.l;
        this.m = c10645v84.m;
        String str = c10645v84.m;
        if (str != null) {
            c4317ck.put(str, this);
        }
        this.n = c10645v84.n;
    }

    public final void a(C9616s84 c9616s84, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        boolean z;
        c9616s84.a.set(matrix);
        Matrix matrix2 = c9616s84.j;
        Matrix matrix3 = c9616s84.a;
        matrix3.preConcat(matrix2);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = c9616s84.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC9959t84 abstractC9959t84 = (AbstractC9959t84) arrayList.get(i4);
            if (abstractC9959t84 instanceof C9616s84) {
                a((C9616s84) abstractC9959t84, matrix3, canvas, i, i2);
            } else if (abstractC9959t84 instanceof AbstractC10302u84) {
                AbstractC10302u84 abstractC10302u84 = (AbstractC10302u84) abstractC9959t84;
                float f2 = i / this.j;
                float f3 = i2 / this.k;
                float min = Math.min(f2, f3);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                i3 = i4;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                if (abs != 0.0f) {
                    abstractC10302u84.getClass();
                    Path path = this.a;
                    path.reset();
                    C2667Un2[] c2667Un2Arr = abstractC10302u84.a;
                    if (c2667Un2Arr != null) {
                        C2667Un2.b(c2667Un2Arr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (abstractC10302u84 instanceof C8931q84) {
                        path2.setFillType(abstractC10302u84.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C9273r84 c9273r84 = (C9273r84) abstractC10302u84;
                        float f5 = c9273r84.j;
                        if (f5 != 0.0f || c9273r84.k != 1.0f) {
                            float f6 = c9273r84.l;
                            float f7 = (f5 + f6) % 1.0f;
                            float f8 = (c9273r84.k + f6) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, false);
                            float length = this.f.getLength();
                            float f9 = f7 * length;
                            float f10 = f8 * length;
                            path.reset();
                            if (f9 > f10) {
                                this.f.getSegment(f9, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f10, path, true);
                            } else {
                                f = 0.0f;
                                this.f.getSegment(f9, f10, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        RZ rz = c9273r84.g;
                        if ((rz.a != null) || rz.c != 0) {
                            if (this.e == null) {
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.e;
                            Shader shader = rz.a;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c9273r84.i * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i5 = rz.c;
                                float f11 = c9273r84.i;
                                PorterDuff.Mode mode = C11674y84.o;
                                paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c9273r84.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        RZ rz2 = c9273r84.e;
                        if ((rz2.a != null) || rz2.c != 0) {
                            if (this.d == null) {
                                z = true;
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            } else {
                                z = true;
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c9273r84.n;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c9273r84.m;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c9273r84.o);
                            Shader shader2 = rz2.a;
                            if (shader2 == null) {
                                z = false;
                            }
                            if (z) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c9273r84.h * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i6 = rz2.c;
                                float f12 = c9273r84.h;
                                PorterDuff.Mode mode2 = C11674y84.o;
                                paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c9273r84.f * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i4 = i3 + 1;
                c = 0;
            }
            i3 = i4;
            i4 = i3 + 1;
            c = 0;
        }
    }
}
