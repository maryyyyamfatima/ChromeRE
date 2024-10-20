package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T10 extends AbstractC11937yv {
    public AbstractC11251wv w;
    public final ArrayList x;
    public final RectF y;
    public final RectF z;

    public T10(JJ1 jj1, C2456Sx1 c2456Sx1, List list, C8985qJ1 c8985qJ1) {
        super(jj1, c2456Sx1);
        int i;
        AbstractC11937yv abstractC11937yv;
        AbstractC11937yv t10;
        this.x = new ArrayList();
        this.y = new RectF();
        this.z = new RectF();
        new Paint();
        C5638gb c5638gb = c2456Sx1.s;
        if (c5638gb != null) {
            AbstractC11251wv a = c5638gb.a();
            this.w = a;
            e(a);
            this.w.a(this);
        } else {
            this.w = null;
        }
        C3487aJ1 c3487aJ1 = new C3487aJ1(c8985qJ1.h.size());
        int size = list.size() - 1;
        AbstractC11937yv abstractC11937yv2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C2456Sx1 c2456Sx12 = (C2456Sx1) list.get(size);
            int b = AbstractC2373Sg3.b(c2456Sx12.e);
            if (b == 0) {
                t10 = new T10(jj1, c2456Sx12, (List) c8985qJ1.c.get(c2456Sx12.g), c8985qJ1);
            } else if (b == 1) {
                t10 = new C7046kg3(jj1, c2456Sx12);
            } else if (b == 2) {
                t10 = new C1467Lh1(jj1, c2456Sx12);
            } else if (b == 3) {
                t10 = new C8243o82(jj1, c2456Sx12);
            } else if (b == 4) {
                t10 = new C4451d63(jj1, c2456Sx12);
            } else if (b == 5) {
                t10 = new SI3(jj1, c2456Sx12);
            } else {
                AbstractC5888hI1.a("Unknown layer type ".concat(AbstractC2326Rx1.a(c2456Sx12.e)));
                t10 = null;
            }
            if (t10 != null) {
                c3487aJ1.i(t10.n.d, t10);
                if (abstractC11937yv2 == null) {
                    this.x.add(0, t10);
                    int b2 = AbstractC2373Sg3.b(c2456Sx12.u);
                    if (b2 == 1 || b2 == 2) {
                        abstractC11937yv2 = t10;
                    }
                } else {
                    abstractC11937yv2.q = t10;
                    abstractC11937yv2 = null;
                }
            }
            size--;
        }
        for (i = 0; i < c3487aJ1.k(); i++) {
            AbstractC11937yv abstractC11937yv3 = (AbstractC11937yv) c3487aJ1.d(c3487aJ1.h(i));
            if (abstractC11937yv3 != null && (abstractC11937yv = (AbstractC11937yv) c3487aJ1.d(abstractC11937yv3.n.f)) != null) {
                abstractC11937yv3.r = abstractC11937yv;
            }
        }
    }

    @Override // defpackage.AbstractC11937yv
    public final void k(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.z;
        C2456Sx1 c2456Sx1 = this.n;
        rectF.set(0.0f, 0.0f, c2456Sx1.o, c2456Sx1.p);
        matrix.mapRect(rectF);
        this.m.getClass();
        canvas.save();
        ArrayList arrayList = this.x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty() ? canvas.clipRect(rectF) : true) {
                ((AbstractC11937yv) arrayList.get(size)).g(canvas, matrix, i);
            }
        }
        canvas.restore();
        AbstractC2576Tv1.a();
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ArrayList arrayList = this.x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.y;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC11937yv) arrayList.get(size)).d(rectF2, this.l, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.AbstractC11937yv
    public final void p(float f) {
        super.p(f);
        AbstractC11251wv abstractC11251wv = this.w;
        C2456Sx1 c2456Sx1 = this.n;
        if (abstractC11251wv != null) {
            C8985qJ1 c8985qJ1 = this.m.g;
            f = ((((Float) abstractC11251wv.f()).floatValue() * c2456Sx1.b.l) - c2456Sx1.b.j) / ((c8985qJ1.k - c8985qJ1.j) + 0.01f);
        }
        if (this.w == null) {
            C8985qJ1 c8985qJ12 = c2456Sx1.b;
            f -= c2456Sx1.n / (c8985qJ12.k - c8985qJ12.j);
        }
        if (c2456Sx1.m != 0.0f && !"__container".equals(c2456Sx1.c)) {
            f /= c2456Sx1.m;
        }
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC11937yv) arrayList.get(size)).p(f);
            }
        }
    }

    @Override // defpackage.AbstractC11937yv
    public final void o(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.x;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((AbstractC11937yv) arrayList2.get(i2)).c(c8847pu1, i, arrayList, c8847pu12);
            i2++;
        }
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        super.f(tj1, obj);
        if (obj == NJ1.C) {
            if (tj1 != null) {
                J74 j74 = new J74(tj1, null);
                this.w = j74;
                j74.a(this);
                e(this.w);
                return;
            }
            AbstractC11251wv abstractC11251wv = this.w;
            if (abstractC11251wv != null) {
                abstractC11251wv.k(null);
            }
        }
    }
}
