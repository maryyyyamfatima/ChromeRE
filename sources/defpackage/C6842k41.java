package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k41 */
/* loaded from: classes.dex */
public final class C6842k41 implements InterfaceC3345Zt0, InterfaceC9536rv, InterfaceC9532ru1 {
    public final String a;
    public final boolean b;
    public final AbstractC11937yv c;
    public final C3487aJ1 d = new C3487aJ1();
    public final C3487aJ1 e = new C3487aJ1();
    public final Path f;
    public final C3356Zv1 g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final C5812h41 k;
    public final C1242Jo1 l;
    public final C2712Uw2 m;
    public final C2712Uw2 n;
    public J74 o;
    public J74 p;
    public final JJ1 q;
    public final int r;

    public C6842k41(JJ1 jj1, AbstractC11937yv abstractC11937yv, C6498j41 c6498j41) {
        Path path = new Path();
        this.f = path;
        this.g = new C3356Zv1(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = abstractC11937yv;
        this.a = c6498j41.g;
        this.b = c6498j41.h;
        this.q = jj1;
        this.j = c6498j41.a;
        path.setFillType(c6498j41.b);
        C8985qJ1 c8985qJ1 = jj1.g;
        this.r = (int) ((((c8985qJ1.k - c8985qJ1.j) / c8985qJ1.l) * 1000.0f) / 32.0f);
        AbstractC11251wv a = c6498j41.c.a();
        this.k = (C5812h41) a;
        a.a(this);
        abstractC11937yv.e(a);
        AbstractC11251wv a2 = c6498j41.d.a();
        this.l = (C1242Jo1) a2;
        a2.a(this);
        abstractC11937yv.e(a2);
        AbstractC11251wv a3 = c6498j41.e.a();
        this.m = (C2712Uw2) a3;
        a3.a(this);
        abstractC11937yv.e(a3);
        AbstractC11251wv a4 = c6498j41.f.a();
        this.n = (C2712Uw2) a4;
        a4.a(this);
        abstractC11937yv.e(a4);
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Z40 z40 = (Z40) list2.get(i);
            if (z40 instanceof InterfaceC2147Qn2) {
                this.i.add((InterfaceC2147Qn2) z40);
            }
        }
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC2147Qn2) arrayList.get(i2)).h(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        C5812h41 c5812h41 = this.k;
        C2712Uw2 c2712Uw2 = this.n;
        C2712Uw2 c2712Uw22 = this.m;
        if (i3 == 1) {
            long i4 = i();
            C3487aJ1 c3487aJ1 = this.d;
            shader = (LinearGradient) c3487aJ1.d(i4);
            if (shader == null) {
                PointF pointF = (PointF) c2712Uw22.f();
                PointF pointF2 = (PointF) c2712Uw2.f();
                C5124f41 c5124f41 = (C5124f41) c5812h41.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(c5124f41.b), c5124f41.a, Shader.TileMode.CLAMP);
                c3487aJ1.i(i4, shader);
            }
        } else {
            long i5 = i();
            C3487aJ1 c3487aJ12 = this.e;
            shader = (RadialGradient) c3487aJ12.d(i5);
            if (shader == null) {
                PointF pointF3 = (PointF) c2712Uw22.f();
                PointF pointF4 = (PointF) c2712Uw2.f();
                C5124f41 c5124f412 = (C5124f41) c5812h41.f();
                int[] e = e(c5124f412.b);
                float[] fArr = c5124f412.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                shader = new RadialGradient(f, f2, hypot, e, fArr, Shader.TileMode.CLAMP);
                c3487aJ12.i(i5, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        C3356Zv1 c3356Zv1 = this.g;
        c3356Zv1.setShader(shader);
        J74 j74 = this.o;
        if (j74 != null) {
            c3356Zv1.setColorFilter((ColorFilter) j74.f());
        }
        PointF pointF5 = CX1.a;
        c3356Zv1.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((Integer) this.l.f()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, c3356Zv1);
        AbstractC2576Tv1.a();
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                path.addPath(((InterfaceC2147Qn2) arrayList.get(i)).h(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.a;
    }

    public final int i() {
        float f = this.m.d;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.d * f2);
        int round3 = Math.round(this.k.d * f2);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    public final int[] e(int[] iArr) {
        J74 j74 = this.p;
        if (j74 != null) {
            Integer[] numArr = (Integer[]) j74.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        if (obj == NJ1.d) {
            this.l.k(tj1);
            return;
        }
        ColorFilter colorFilter = NJ1.E;
        AbstractC11937yv abstractC11937yv = this.c;
        if (obj == colorFilter) {
            J74 j74 = this.o;
            if (j74 != null) {
                abstractC11937yv.n(j74);
            }
            if (tj1 != null) {
                J74 j742 = new J74(tj1, null);
                this.o = j742;
                j742.a(this);
                abstractC11937yv.e(this.o);
                return;
            }
            this.o = null;
            return;
        }
        if (obj == NJ1.F) {
            J74 j743 = this.p;
            if (j743 != null) {
                abstractC11937yv.n(j743);
            }
            if (tj1 == null) {
                this.p = null;
                return;
            }
            this.d.b();
            this.e.b();
            J74 j744 = new J74(tj1, null);
            this.p = j744;
            j744.a(this);
            abstractC11937yv.e(this.p);
        }
    }
}
