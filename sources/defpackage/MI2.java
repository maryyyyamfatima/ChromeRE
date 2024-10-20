package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MI2 implements InterfaceC9536rv, InterfaceC9532ru1, InterfaceC2147Qn2 {
    public final String c;
    public final boolean d;
    public final JJ1 e;
    public final AbstractC11251wv f;
    public final AbstractC11251wv g;
    public final C4552dQ0 h;
    public boolean j;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final H20 i = new H20();

    public MI2(JJ1 jj1, AbstractC11937yv abstractC11937yv, NI2 ni2) {
        this.c = ni2.a;
        this.d = ni2.e;
        this.e = jj1;
        AbstractC11251wv a = ni2.b.a();
        this.f = a;
        AbstractC11251wv a2 = ni2.c.a();
        this.g = a2;
        AbstractC11251wv a3 = ni2.d.a();
        this.h = (C4552dQ0) a3;
        abstractC11937yv.e(a);
        abstractC11937yv.e(a2);
        abstractC11937yv.e(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            Z40 z40 = (Z40) arrayList.get(i);
            if (z40 instanceof C6651jX3) {
                C6651jX3 c6651jX3 = (C6651jX3) z40;
                if (c6651jX3.c == 1) {
                    this.i.a.add(c6651jX3);
                    c6651jX3.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        boolean z = this.j;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.j = true;
            return path;
        }
        PointF pointF = (PointF) this.g.f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        C4552dQ0 c4552dQ0 = this.h;
        float l = c4552dQ0 == null ? 0.0f : c4552dQ0.l();
        float min = Math.min(f, f2);
        if (l > min) {
            l = min;
        }
        PointF pointF2 = (PointF) this.f.f();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + l);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - l);
        RectF rectF = this.b;
        if (l > 0.0f) {
            float f3 = pointF2.x + f;
            float f4 = l * 2.0f;
            float f5 = pointF2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + l, pointF2.y + f2);
        if (l > 0.0f) {
            float f6 = pointF2.x - f;
            float f7 = pointF2.y + f2;
            float f8 = l * 2.0f;
            rectF.set(f6, f7 - f8, f8 + f6, f7);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + l);
        if (l > 0.0f) {
            float f9 = pointF2.x - f;
            float f10 = pointF2.y - f2;
            float f11 = l * 2.0f;
            rectF.set(f9, f10, f9 + f11, f11 + f10);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - l, pointF2.y - f2);
        if (l > 0.0f) {
            float f12 = pointF2.x + f;
            float f13 = l * 2.0f;
            float f14 = pointF2.y - f2;
            rectF.set(f12 - f13, f14, f12, f13 + f14);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.j = true;
        return path;
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        if (obj == NJ1.j) {
            this.g.k(tj1);
        } else if (obj == NJ1.l) {
            this.f.k(tj1);
        } else if (obj == NJ1.k) {
            this.h.k(tj1);
        }
    }
}
