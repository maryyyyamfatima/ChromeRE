package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1858Oh3 extends AbstractC11251wv {
    public final PointF i;
    public final PointF j;
    public final AbstractC11251wv k;
    public final AbstractC11251wv l;
    public TJ1 m;
    public TJ1 n;

    @Override // defpackage.AbstractC11251wv
    public final /* bridge */ /* synthetic */ Object g(C12282zv1 c12282zv1, float f) {
        return l(f);
    }

    public C1858Oh3(C4552dQ0 c4552dQ0, C4552dQ0 c4552dQ02) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = c4552dQ0;
        this.l = c4552dQ02;
        j(this.d);
    }

    @Override // defpackage.AbstractC11251wv
    public final void j(float f) {
        AbstractC11251wv abstractC11251wv = this.k;
        abstractC11251wv.j(f);
        AbstractC11251wv abstractC11251wv2 = this.l;
        abstractC11251wv2.j(f);
        this.i.set(((Float) abstractC11251wv.f()).floatValue(), ((Float) abstractC11251wv2.f()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC9536rv) arrayList.get(i)).a();
            i++;
        }
    }

    @Override // defpackage.AbstractC11251wv
    public final Object f() {
        return l(0.0f);
    }

    public final PointF l(float f) {
        Float f2;
        AbstractC11251wv abstractC11251wv;
        C12282zv1 b;
        AbstractC11251wv abstractC11251wv2;
        C12282zv1 b2;
        Float f3 = null;
        if (this.m == null || (b2 = (abstractC11251wv2 = this.k).b()) == null) {
            f2 = null;
        } else {
            abstractC11251wv2.d();
            Float f4 = b2.h;
            TJ1 tj1 = this.m;
            if (f4 != null) {
                f4.floatValue();
            }
            f2 = (Float) tj1.b((Float) b2.b, (Float) b2.c);
        }
        if (this.n != null && (b = (abstractC11251wv = this.l).b()) != null) {
            abstractC11251wv.d();
            Float f5 = b.h;
            TJ1 tj12 = this.n;
            if (f5 != null) {
                f5.floatValue();
            }
            f3 = (Float) tj12.b((Float) b.b, (Float) b.c);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f2 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return pointF2;
    }
}
