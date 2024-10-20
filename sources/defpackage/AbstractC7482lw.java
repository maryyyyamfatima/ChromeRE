package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lw */
/* loaded from: classes.dex */
public abstract class AbstractC7482lw implements InterfaceC9536rv, InterfaceC9532ru1, InterfaceC3345Zt0 {
    public final JJ1 e;
    public final AbstractC11937yv f;
    public final float[] h;
    public final C3356Zv1 i;
    public final C4552dQ0 j;
    public final C1242Jo1 k;
    public final ArrayList l;
    public final C4552dQ0 m;
    public J74 n;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public AbstractC7482lw(JJ1 jj1, AbstractC11937yv abstractC11937yv, Paint.Cap cap, Paint.Join join, float f, C6326ib c6326ib, C5638gb c5638gb, List list, C5638gb c5638gb2) {
        C3356Zv1 c3356Zv1 = new C3356Zv1(1);
        this.i = c3356Zv1;
        this.e = jj1;
        this.f = abstractC11937yv;
        c3356Zv1.setStyle(Paint.Style.STROKE);
        c3356Zv1.setStrokeCap(cap);
        c3356Zv1.setStrokeJoin(join);
        c3356Zv1.setStrokeMiter(f);
        this.k = (C1242Jo1) c6326ib.a();
        this.j = (C4552dQ0) c5638gb.a();
        if (c5638gb2 == null) {
            this.m = null;
        } else {
            this.m = (C4552dQ0) c5638gb2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((C5638gb) list.get(i)).a());
        }
        abstractC11937yv.e(this.k);
        abstractC11937yv.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            abstractC11937yv.e((AbstractC11251wv) this.l.get(i2));
        }
        C4552dQ0 c4552dQ0 = this.m;
        if (c4552dQ0 != null) {
            abstractC11937yv.e(c4552dQ0);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC11251wv) this.l.get(i3)).a(this);
        }
        C4552dQ0 c4552dQ02 = this.m;
        if (c4552dQ02 != null) {
            c4552dQ02.a(this);
        }
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C7138kw c7138kw = null;
        C6651jX3 c6651jX3 = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            Z40 z40 = (Z40) arrayList2.get(size);
            if (z40 instanceof C6651jX3) {
                C6651jX3 c6651jX32 = (C6651jX3) z40;
                if (c6651jX32.c == 2) {
                    c6651jX3 = c6651jX32;
                }
            }
        }
        if (c6651jX3 != null) {
            c6651jX3.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            Z40 z402 = (Z40) list2.get(size2);
            if (z402 instanceof C6651jX3) {
                C6651jX3 c6651jX33 = (C6651jX3) z402;
                if (c6651jX33.c == 2) {
                    if (c7138kw != null) {
                        arrayList.add(c7138kw);
                    }
                    C7138kw c7138kw2 = new C7138kw(c6651jX33);
                    c6651jX33.c(this);
                    c7138kw = c7138kw2;
                }
            }
            if (z402 instanceof InterfaceC2147Qn2) {
                if (c7138kw == null) {
                    c7138kw = new C7138kw(c6651jX3);
                }
                c7138kw.a.add((InterfaceC2147Qn2) z402);
            }
        }
        if (c7138kw != null) {
            arrayList.add(c7138kw);
        }
    }

    public void g(Canvas canvas, Matrix matrix, int i) {
        float[] fArr;
        boolean z;
        AbstractC7482lw abstractC7482lw = this;
        float[] fArr2 = (float[]) C74.d.get();
        boolean z2 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (!(fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3])) {
            C1242Jo1 c1242Jo1 = abstractC7482lw.k;
            float l = (i / 255.0f) * c1242Jo1.l(c1242Jo1.b(), c1242Jo1.d());
            float f = 100.0f;
            PointF pointF = CX1.a;
            int max = Math.max(0, Math.min(255, (int) ((l / 100.0f) * 255.0f)));
            C3356Zv1 c3356Zv1 = abstractC7482lw.i;
            c3356Zv1.setAlpha(max);
            c3356Zv1.setStrokeWidth(C74.d(matrix) * abstractC7482lw.j.l());
            if (c3356Zv1.getStrokeWidth() <= 0.0f) {
                AbstractC2576Tv1.a();
                return;
            }
            ArrayList arrayList = abstractC7482lw.l;
            if (arrayList.isEmpty()) {
                AbstractC2576Tv1.a();
            } else {
                float d = C74.d(matrix);
                int i2 = 0;
                while (true) {
                    int size = arrayList.size();
                    fArr = abstractC7482lw.h;
                    if (i2 >= size) {
                        break;
                    }
                    float floatValue = ((Float) ((AbstractC11251wv) arrayList.get(i2)).f()).floatValue();
                    fArr[i2] = floatValue;
                    if (i2 % 2 == 0) {
                        if (floatValue < 1.0f) {
                            fArr[i2] = 1.0f;
                        }
                    } else if (floatValue < 0.1f) {
                        fArr[i2] = 0.1f;
                    }
                    fArr[i2] = fArr[i2] * d;
                    i2++;
                }
                C4552dQ0 c4552dQ0 = abstractC7482lw.m;
                c3356Zv1.setPathEffect(new DashPathEffect(fArr, c4552dQ0 == null ? 0.0f : ((Float) c4552dQ0.f()).floatValue() * d));
                AbstractC2576Tv1.a();
            }
            J74 j74 = abstractC7482lw.n;
            if (j74 != null) {
                c3356Zv1.setColorFilter((ColorFilter) j74.f());
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = abstractC7482lw.g;
                if (i3 < arrayList2.size()) {
                    C7138kw c7138kw = (C7138kw) arrayList2.get(i3);
                    C6651jX3 c6651jX3 = c7138kw.b;
                    Path path = abstractC7482lw.b;
                    ArrayList arrayList3 = c7138kw.a;
                    if (c6651jX3 == null) {
                        path.reset();
                        z = true;
                        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                            path.addPath(((InterfaceC2147Qn2) arrayList3.get(size2)).h(), matrix);
                        }
                        AbstractC2576Tv1.a();
                        canvas.drawPath(path, c3356Zv1);
                        AbstractC2576Tv1.a();
                    } else {
                        path.reset();
                        int size3 = arrayList3.size();
                        while (true) {
                            size3--;
                            if (size3 < 0) {
                                break;
                            } else {
                                path.addPath(((InterfaceC2147Qn2) arrayList3.get(size3)).h(), matrix);
                            }
                        }
                        PathMeasure pathMeasure = abstractC7482lw.a;
                        pathMeasure.setPath(path, z2);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length += pathMeasure.getLength();
                        }
                        C6651jX3 c6651jX32 = c7138kw.b;
                        float floatValue2 = (((Float) c6651jX32.f.f()).floatValue() * length) / 360.0f;
                        float floatValue3 = ((((Float) c6651jX32.d.f()).floatValue() * length) / f) + floatValue2;
                        float floatValue4 = ((((Float) c6651jX32.e.f()).floatValue() * length) / f) + floatValue2;
                        int size4 = arrayList3.size() - 1;
                        float f2 = 0.0f;
                        while (size4 >= 0) {
                            Path path2 = abstractC7482lw.c;
                            path2.set(((InterfaceC2147Qn2) arrayList3.get(size4)).h());
                            path2.transform(matrix);
                            pathMeasure.setPath(path2, z2);
                            float length2 = pathMeasure.getLength();
                            if (floatValue4 > length) {
                                float f3 = floatValue4 - length;
                                if (f3 < f2 + length2 && f2 < f3) {
                                    C74.a(path2, floatValue3 > length ? (floatValue3 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(path2, c3356Zv1);
                                    f2 += length2;
                                    size4--;
                                    abstractC7482lw = this;
                                    z2 = false;
                                }
                            }
                            float f4 = f2 + length2;
                            if (f4 >= floatValue3 && f2 <= floatValue4) {
                                if (f4 <= floatValue4 && floatValue3 < f2) {
                                    canvas.drawPath(path2, c3356Zv1);
                                } else {
                                    C74.a(path2, floatValue3 < f2 ? 0.0f : (floatValue3 - f2) / length2, floatValue4 > f4 ? 1.0f : (floatValue4 - f2) / length2, 0.0f);
                                    canvas.drawPath(path2, c3356Zv1);
                                }
                            }
                            f2 += length2;
                            size4--;
                            abstractC7482lw = this;
                            z2 = false;
                        }
                        AbstractC2576Tv1.a();
                        z = true;
                    }
                    i3++;
                    abstractC7482lw = this;
                    z2 = false;
                    f = 100.0f;
                } else {
                    AbstractC2576Tv1.a();
                    return;
                }
            }
        } else {
            AbstractC2576Tv1.a();
        }
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i < arrayList.size()) {
                C7138kw c7138kw = (C7138kw) arrayList.get(i);
                for (int i2 = 0; i2 < c7138kw.a.size(); i2++) {
                    path.addPath(((InterfaceC2147Qn2) c7138kw.a.get(i2)).h(), matrix);
                }
                i++;
            } else {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float l = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - l, rectF2.top - l, rectF2.right + l, rectF2.bottom + l);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                AbstractC2576Tv1.a();
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    public void f(TJ1 tj1, Object obj) {
        if (obj == NJ1.d) {
            this.k.k(tj1);
            return;
        }
        if (obj == NJ1.q) {
            this.j.k(tj1);
            return;
        }
        if (obj == NJ1.E) {
            J74 j74 = this.n;
            AbstractC11937yv abstractC11937yv = this.f;
            if (j74 != null) {
                abstractC11937yv.n(j74);
            }
            if (tj1 != null) {
                J74 j742 = new J74(tj1, null);
                this.n = j742;
                j742.a(this);
                abstractC11937yv.e(this.n);
                return;
            }
            this.n = null;
        }
    }
}
