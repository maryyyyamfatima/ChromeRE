package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pW3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8709pW3 extends QV3 {
    public int E;
    public ArrayList C = new ArrayList();
    public boolean D = true;
    public boolean F = false;
    public int G = 0;

    public final void I(QV3 qv3) {
        this.C.add(qv3);
        qv3.n = this;
        long j = this.h;
        if (j >= 0) {
            qv3.A(j);
        }
        if ((this.G & 1) != 0) {
            qv3.C(this.i);
        }
        if ((this.G & 2) != 0) {
            qv3.E();
        }
        if ((this.G & 4) != 0) {
            qv3.D(this.y);
        }
        if ((this.G & 8) != 0) {
            qv3.B(this.x);
        }
    }

    @Override // defpackage.QV3
    public final void C(TimeInterpolator timeInterpolator) {
        this.G |= 1;
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((QV3) this.C.get(i)).C(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // defpackage.QV3
    public final void b(View view) {
        for (int i = 0; i < this.C.size(); i++) {
            ((QV3) this.C.get(i)).b(view);
        }
        this.k.add(view);
    }

    @Override // defpackage.QV3
    public final void a(KV3 kv3) {
        super.a(kv3);
    }

    @Override // defpackage.QV3
    public final void x(View view) {
        for (int i = 0; i < this.C.size(); i++) {
            ((QV3) this.C.get(i)).x(view);
        }
        this.k.remove(view);
    }

    @Override // defpackage.QV3
    public final void A(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.C) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).A(j);
        }
    }

    @Override // defpackage.QV3
    public final void F(long j) {
        this.g = j;
    }

    @Override // defpackage.QV3
    public final void m(ViewGroup viewGroup, C11109wW3 c11109wW3, C11109wW3 c11109wW32, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            QV3 qv3 = (QV3) this.C.get(i);
            if (j > 0 && (this.D || i == 0)) {
                long j2 = qv3.g;
                if (j2 > 0) {
                    qv3.F(j2 + j);
                } else {
                    qv3.F(j);
                }
            }
            qv3.m(viewGroup, c11109wW3, c11109wW32, arrayList, arrayList2);
        }
    }

    @Override // defpackage.QV3
    public final void w(KV3 kv3) {
        super.w(kv3);
    }

    @Override // defpackage.QV3
    public final void D(C11104wV3 c11104wV3) {
        super.D(c11104wV3);
        this.G |= 4;
        if (this.C != null) {
            for (int i = 0; i < this.C.size(); i++) {
                ((QV3) this.C.get(i)).D(c11104wV3);
            }
        }
    }

    @Override // defpackage.QV3
    public final void z() {
        if (!this.C.isEmpty()) {
            C8366oW3 c8366oW3 = new C8366oW3(this);
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((QV3) it.next()).a(c8366oW3);
            }
            this.E = this.C.size();
            if (!this.D) {
                for (int i = 1; i < this.C.size(); i++) {
                    ((QV3) this.C.get(i - 1)).a(new C8022nW3((QV3) this.C.get(i)));
                }
                QV3 qv3 = (QV3) this.C.get(0);
                if (qv3 != null) {
                    qv3.z();
                    return;
                }
                return;
            }
            Iterator it2 = this.C.iterator();
            while (it2.hasNext()) {
                ((QV3) it2.next()).z();
            }
            return;
        }
        G();
        n();
    }

    @Override // defpackage.QV3
    public final void h(C10766vW3 c10766vW3) {
        View view = c10766vW3.b;
        if (t(view)) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                QV3 qv3 = (QV3) it.next();
                if (qv3.t(view)) {
                    qv3.h(c10766vW3);
                    c10766vW3.c.add(qv3);
                }
            }
        }
    }

    @Override // defpackage.QV3
    public final void e(C10766vW3 c10766vW3) {
        View view = c10766vW3.b;
        if (t(view)) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                QV3 qv3 = (QV3) it.next();
                if (qv3.t(view)) {
                    qv3.e(c10766vW3);
                    c10766vW3.c.add(qv3);
                }
            }
        }
    }

    @Override // defpackage.QV3
    public final void g(C10766vW3 c10766vW3) {
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).g(c10766vW3);
        }
    }

    @Override // defpackage.QV3
    public final void v(View view) {
        super.v(view);
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).v(view);
        }
    }

    @Override // defpackage.QV3
    public final void y(ViewGroup viewGroup) {
        super.y(viewGroup);
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).y(viewGroup);
        }
    }

    @Override // defpackage.QV3
    public final void d() {
        super.d();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).d();
        }
    }

    @Override // defpackage.QV3
    public final void E() {
        this.G |= 2;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).E();
        }
    }

    @Override // defpackage.QV3
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.C.size(); i++) {
            StringBuilder a = M41.a(H, "\n");
            a.append(((QV3) this.C.get(i)).H(str + "  "));
            H = a.toString();
        }
        return H;
    }

    @Override // defpackage.QV3
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final QV3 clone() {
        C8709pW3 c8709pW3 = (C8709pW3) super.clone();
        c8709pW3.C = new ArrayList();
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            QV3 clone = ((QV3) this.C.get(i)).clone();
            c8709pW3.C.add(clone);
            clone.n = c8709pW3;
        }
        return c8709pW3;
    }

    @Override // defpackage.QV3
    public final void B(DV3 dv3) {
        this.x = dv3;
        this.G |= 8;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((QV3) this.C.get(i)).B(dv3);
        }
    }
}
