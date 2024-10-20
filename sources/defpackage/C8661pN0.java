package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pN0 */
/* loaded from: classes.dex */
public final class C8661pN0 implements InterfaceC3345Zt0, InterfaceC9536rv, InterfaceC9532ru1 {
    public final Path a;
    public final C3356Zv1 b;
    public final AbstractC11937yv c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final DW g;
    public final C1242Jo1 h;
    public J74 i;
    public final JJ1 j;

    public C8661pN0(JJ1 jj1, AbstractC11937yv abstractC11937yv, Y53 y53) {
        C6326ib c6326ib;
        Path path = new Path();
        this.a = path;
        this.b = new C3356Zv1(1);
        this.f = new ArrayList();
        this.c = abstractC11937yv;
        this.d = y53.c;
        this.e = y53.f;
        this.j = jj1;
        C5294fb c5294fb = y53.d;
        if (c5294fb == null || (c6326ib = y53.e) == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(y53.b);
        AbstractC11251wv a = c5294fb.a();
        this.g = (DW) a;
        a.a(this);
        abstractC11937yv.e(a);
        AbstractC11251wv a2 = c6326ib.a();
        this.h = (C1242Jo1) a2;
        a2.a(this);
        abstractC11937yv.e(a2);
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Z40 z40 = (Z40) list2.get(i);
            if (z40 instanceof InterfaceC2147Qn2) {
                this.f.add((InterfaceC2147Qn2) z40);
            }
        }
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.d;
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void g(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        DW dw = this.g;
        int l = dw.l(dw.b(), dw.d());
        C3356Zv1 c3356Zv1 = this.b;
        c3356Zv1.setColor(l);
        PointF pointF = CX1.a;
        int i2 = 0;
        c3356Zv1.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((Integer) this.h.f()).intValue()) / 100.0f) * 255.0f))));
        J74 j74 = this.i;
        if (j74 != null) {
            c3356Zv1.setColorFilter((ColorFilter) j74.f());
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 < arrayList.size()) {
                path.addPath(((InterfaceC2147Qn2) arrayList.get(i2)).h(), matrix);
                i2++;
            } else {
                canvas.drawPath(path, c3356Zv1);
                AbstractC2576Tv1.a();
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
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

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        if (obj == NJ1.a) {
            this.g.k(tj1);
            return;
        }
        if (obj == NJ1.d) {
            this.h.k(tj1);
            return;
        }
        if (obj == NJ1.E) {
            J74 j74 = this.i;
            AbstractC11937yv abstractC11937yv = this.c;
            if (j74 != null) {
                abstractC11937yv.n(j74);
            }
            if (tj1 != null) {
                J74 j742 = new J74(tj1, null);
                this.i = j742;
                j742.a(this);
                abstractC11937yv.e(this.i);
                return;
            }
            this.i = null;
        }
    }
}
