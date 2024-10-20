package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yv */
/* loaded from: classes.dex */
public abstract class AbstractC11937yv implements InterfaceC3345Zt0, InterfaceC9536rv, InterfaceC9190qu1 {
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final C3356Zv1 c = new C3356Zv1(1);
    public final C3356Zv1 d = new C3356Zv1(PorterDuff.Mode.DST_IN, 0);
    public final C3356Zv1 e = new C3356Zv1(PorterDuff.Mode.DST_OUT, 0);
    public final C3356Zv1 f;
    public final C3356Zv1 g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final Matrix l;
    public final JJ1 m;
    public final C2456Sx1 n;
    public final C5564gM1 o;
    public C4552dQ0 p;
    public AbstractC11937yv q;
    public AbstractC11937yv r;
    public List s;
    public final ArrayList t;
    public final C8704pV3 u;
    public boolean v;

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i);

    public void o(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
    }

    public AbstractC11937yv(JJ1 jj1, C2456Sx1 c2456Sx1) {
        C3356Zv1 c3356Zv1 = new C3356Zv1(1);
        this.f = c3356Zv1;
        this.g = new C3356Zv1(PorterDuff.Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Matrix();
        this.t = new ArrayList();
        this.v = true;
        this.m = jj1;
        this.n = c2456Sx1;
        Y5.a(new StringBuilder(), c2456Sx1.c, "#draw");
        if (c2456Sx1.u == 3) {
            c3356Zv1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c3356Zv1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C9759sb c9759sb = c2456Sx1.i;
        c9759sb.getClass();
        C8704pV3 c8704pV3 = new C8704pV3(c9759sb);
        this.u = c8704pV3;
        c8704pV3.b(this);
        List list = c2456Sx1.h;
        if (list != null && !list.isEmpty()) {
            C5564gM1 c5564gM1 = new C5564gM1(list);
            this.o = c5564gM1;
            Iterator it = c5564gM1.a.iterator();
            while (it.hasNext()) {
                ((AbstractC11251wv) it.next()).a(this);
            }
            Iterator it2 = this.o.b.iterator();
            while (it2.hasNext()) {
                AbstractC11251wv abstractC11251wv = (AbstractC11251wv) it2.next();
                e(abstractC11251wv);
                abstractC11251wv.a(this);
            }
        }
        C2456Sx1 c2456Sx12 = this.n;
        if (!c2456Sx12.t.isEmpty()) {
            C4552dQ0 c4552dQ0 = new C4552dQ0(c2456Sx12.t);
            this.p = c4552dQ0;
            c4552dQ0.b = true;
            c4552dQ0.a(new C11594xv(this));
            boolean z = ((Float) this.p.f()).floatValue() == 1.0f;
            if (z != this.v) {
                this.v = z;
                this.m.invalidateSelf();
            }
            e(this.p);
            return;
        }
        if (true != this.v) {
            this.v = true;
            this.m.invalidateSelf();
        }
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.n.c;
    }

    public void p(float f) {
        C8704pV3 c8704pV3 = this.u;
        AbstractC11251wv abstractC11251wv = c8704pV3.j;
        if (abstractC11251wv != null) {
            abstractC11251wv.j(f);
        }
        AbstractC11251wv abstractC11251wv2 = c8704pV3.m;
        if (abstractC11251wv2 != null) {
            abstractC11251wv2.j(f);
        }
        AbstractC11251wv abstractC11251wv3 = c8704pV3.n;
        if (abstractC11251wv3 != null) {
            abstractC11251wv3.j(f);
        }
        AbstractC11251wv abstractC11251wv4 = c8704pV3.f;
        if (abstractC11251wv4 != null) {
            abstractC11251wv4.j(f);
        }
        AbstractC11251wv abstractC11251wv5 = c8704pV3.g;
        if (abstractC11251wv5 != null) {
            abstractC11251wv5.j(f);
        }
        AbstractC11251wv abstractC11251wv6 = c8704pV3.h;
        if (abstractC11251wv6 != null) {
            abstractC11251wv6.j(f);
        }
        AbstractC11251wv abstractC11251wv7 = c8704pV3.i;
        if (abstractC11251wv7 != null) {
            abstractC11251wv7.j(f);
        }
        C4552dQ0 c4552dQ0 = c8704pV3.k;
        if (c4552dQ0 != null) {
            c4552dQ0.j(f);
        }
        C4552dQ0 c4552dQ02 = c8704pV3.l;
        if (c4552dQ02 != null) {
            c4552dQ02.j(f);
        }
        int i = 0;
        C5564gM1 c5564gM1 = this.o;
        if (c5564gM1 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = c5564gM1.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((AbstractC11251wv) arrayList.get(i2)).j(f);
                i2++;
            }
        }
        C4552dQ0 c4552dQ03 = this.p;
        if (c4552dQ03 != null) {
            c4552dQ03.j(f);
        }
        AbstractC11937yv abstractC11937yv = this.q;
        if (abstractC11937yv != null) {
            abstractC11937yv.p(f);
        }
        while (true) {
            ArrayList arrayList2 = this.t;
            if (i >= arrayList2.size()) {
                return;
            }
            ((AbstractC11251wv) arrayList2.get(i)).j(f);
            i++;
        }
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.m.invalidateSelf();
    }

    public final void e(AbstractC11251wv abstractC11251wv) {
        if (abstractC11251wv == null) {
            return;
        }
        this.t.add(abstractC11251wv);
    }

    public final void n(AbstractC11251wv abstractC11251wv) {
        this.t.remove(abstractC11251wv);
    }

    @Override // defpackage.InterfaceC3345Zt0
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.l;
        matrix2.set(matrix);
        if (z) {
            List list = this.s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((AbstractC11937yv) this.s.get(size)).u.d());
                    }
                }
            } else {
                AbstractC11937yv abstractC11937yv = this.r;
                if (abstractC11937yv != null) {
                    matrix2.preConcat(abstractC11937yv.u.d());
                }
            }
        }
        matrix2.preConcat(this.u.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    @Override // defpackage.InterfaceC3345Zt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11937yv.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        AbstractC2576Tv1.a();
    }

    public final boolean l() {
        C5564gM1 c5564gM1 = this.o;
        return (c5564gM1 == null || c5564gM1.a.isEmpty()) ? false : true;
    }

    public final void i() {
        if (this.s != null) {
            return;
        }
        if (this.r == null) {
            this.s = Collections.emptyList();
            return;
        }
        this.s = new ArrayList();
        for (AbstractC11937yv abstractC11937yv = this.r; abstractC11937yv != null; abstractC11937yv = abstractC11937yv.r) {
            this.s.add(abstractC11937yv);
        }
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        AbstractC11937yv abstractC11937yv = this.q;
        C2456Sx1 c2456Sx1 = this.n;
        if (abstractC11937yv != null) {
            String str = abstractC11937yv.n.c;
            c8847pu12.getClass();
            C8847pu1 c8847pu13 = new C8847pu1(c8847pu12);
            c8847pu13.a.add(str);
            if (c8847pu1.a(i, this.q.n.c)) {
                AbstractC11937yv abstractC11937yv2 = this.q;
                C8847pu1 c8847pu14 = new C8847pu1(c8847pu13);
                c8847pu14.b = abstractC11937yv2;
                arrayList.add(c8847pu14);
            }
            if (c8847pu1.d(i, c2456Sx1.c)) {
                this.q.o(c8847pu1, c8847pu1.b(i, this.q.n.c) + i, arrayList, c8847pu13);
            }
        }
        if (c8847pu1.c(i, c2456Sx1.c)) {
            String str2 = c2456Sx1.c;
            if (!"__container".equals(str2)) {
                c8847pu12.getClass();
                C8847pu1 c8847pu15 = new C8847pu1(c8847pu12);
                c8847pu15.a.add(str2);
                if (c8847pu1.a(i, str2)) {
                    C8847pu1 c8847pu16 = new C8847pu1(c8847pu15);
                    c8847pu16.b = this;
                    arrayList.add(c8847pu16);
                }
                c8847pu12 = c8847pu15;
            }
            if (c8847pu1.d(i, str2)) {
                o(c8847pu1, c8847pu1.b(i, str2) + i, arrayList, c8847pu12);
            }
        }
    }

    public void f(TJ1 tj1, Object obj) {
        this.u.c(tj1, obj);
    }

    public final void m() {
        C10887vr2 c10887vr2 = this.m.g.a;
        String str = this.n.c;
        if (c10887vr2.a) {
            HashMap hashMap = c10887vr2.c;
            NM1 nm1 = (NM1) hashMap.get(str);
            if (nm1 == null) {
                nm1 = new NM1();
                hashMap.put(str, nm1);
            }
            int i = nm1.a + 1;
            nm1.a = i;
            if (i == Integer.MAX_VALUE) {
                nm1.a = i / 2;
            }
            if (str.equals("__container")) {
                C5348fk c5348fk = c10887vr2.b;
                c5348fk.getClass();
                C5004ek c5004ek = new C5004ek(c5348fk);
                if (c5004ek.hasNext()) {
                    X5.a(c5004ek.next());
                    throw null;
                }
            }
        }
    }
}
