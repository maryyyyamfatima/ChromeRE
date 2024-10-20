package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yN2 */
/* loaded from: classes.dex */
public final class C11749yN2 implements InterfaceC3345Zt0, InterfaceC2147Qn2, InterfaceC11990z41, InterfaceC9536rv, InterfaceC9532ru1 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final JJ1 c;
    public final AbstractC11937yv d;
    public final String e;
    public final boolean f;
    public final C4552dQ0 g;
    public final C4552dQ0 h;
    public final C8704pV3 i;
    public C5817h50 j;

    public C11749yN2(JJ1 jj1, AbstractC11937yv abstractC11937yv, C11406xN2 c11406xN2) {
        this.c = jj1;
        this.d = abstractC11937yv;
        this.e = c11406xN2.a;
        this.f = c11406xN2.e;
        AbstractC11251wv a = c11406xN2.b.a();
        this.g = (C4552dQ0) a;
        abstractC11937yv.e(a);
        a.a(this);
        AbstractC11251wv a2 = c11406xN2.c.a();
        this.h = (C4552dQ0) a2;
        abstractC11937yv.e(a2);
        a2.a(this);
        C9759sb c9759sb = c11406xN2.d;
        c9759sb.getClass();
        C8704pV3 c8704pV3 = new C8704pV3(c9759sb);
        this.i = c8704pV3;
        c8704pV3.a(abstractC11937yv);
        c8704pV3.b(this);
    }

    @Override // defpackage.InterfaceC11990z41
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((Z40) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new C5817h50(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        Path h = this.j.h();
        Path path = this.b;
        path.reset();
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.a;
            matrix.set(this.i.e(i + floatValue2));
            path.addPath(h, matrix);
        }
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void g(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        C8704pV3 c8704pV3 = this.i;
        float floatValue3 = ((Float) c8704pV3.m.f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) c8704pV3.n.f()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c8704pV3.e(f + floatValue2));
            PointF pointF = CX1.a;
            this.j.g(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * i));
        }
    }

    @Override // defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        if (this.i.c(tj1, obj)) {
            return;
        }
        if (obj == NJ1.s) {
            this.g.k(tj1);
        } else if (obj == NJ1.t) {
            this.h.k(tj1);
        }
    }
}
