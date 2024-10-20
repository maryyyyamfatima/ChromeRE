package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vy0 */
/* loaded from: classes.dex */
public final class C2850Vy0 implements InterfaceC2147Qn2, InterfaceC9536rv, InterfaceC9532ru1 {
    public final String b;
    public final JJ1 c;
    public final C2712Uw2 d;
    public final AbstractC11251wv e;
    public final C4561dS f;
    public boolean h;
    public final Path a = new Path();
    public final H20 g = new H20();

    public C2850Vy0(JJ1 jj1, AbstractC11937yv abstractC11937yv, C4561dS c4561dS) {
        this.b = c4561dS.a;
        this.c = jj1;
        AbstractC11251wv a = c4561dS.c.a();
        this.d = (C2712Uw2) a;
        AbstractC11251wv a2 = c4561dS.b.a();
        this.e = a2;
        this.f = c4561dS;
        abstractC11937yv.e(a);
        abstractC11937yv.e(a2);
        a.a(this);
        a2.a(this);
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a.add(c6651jX3);
                    c6651jX3.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        C4561dS c4561dS = this.f;
        if (c4561dS.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (c4561dS.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        if (obj == NJ1.i) {
            this.d.k(tj1);
        } else if (obj == NJ1.l) {
            this.e.k(tj1);
        }
    }
}
