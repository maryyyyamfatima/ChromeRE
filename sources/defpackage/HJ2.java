package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HJ2 extends AbstractC8305oK2 {
    public final /* synthetic */ KJ2 i;

    public HJ2(KJ2 kj2) {
        this.i = kj2;
        K(kj2.m);
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        KJ2 kj2 = this.i;
        C8320oN2 c8320oN2 = kj2.m0;
        int i2 = c8320oN2.d;
        C7849n00 c7849n00 = kj2.f;
        if (i == i2) {
            return new BJ2(new C11703yE1(c7849n00));
        }
        InterfaceC9671sJ2 interfaceC9671sJ2 = kj2.c;
        if (interfaceC9671sJ2 == null) {
            X5.a(c8320oN2.a.get(i));
            Context context = c7849n00.a;
            throw null;
        }
        return ((C11954yy0) interfaceC9671sJ2).E(i, recyclerView);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        int i2;
        int i3;
        KJ2 kj2 = this.i;
        kj2.getClass();
        int i4 = AbstractC10331uE1.a;
        boolean z = kj2.N;
        ArrayList arrayList = kj2.a;
        O00 o00 = (O00) arrayList.get(z ? i % arrayList.size() : i);
        InterfaceC7976nN2 f = o00.f();
        if (f.b()) {
            C11703yE1 c11703yE1 = (C11703yE1) dVar.a;
            c11703yE1.I(kj2.r);
            int O = kj2.O(o00);
            int N = kj2.N(o00);
            int i5 = -1;
            if (!o00.h(O, N)) {
                int i6 = kj2.V;
                if (i6 != -1 && (i3 = kj2.W) != -1) {
                    int i7 = i3 - i6;
                    if (i > i3) {
                        kj2.I(i, i7 + i, InterfaceC4867eK2.a);
                    } else if (i < i6) {
                        kj2.I(i - i7, i, InterfaceC4867eK2.b);
                    }
                }
                o00.c(kj2.f, O, N, new C8753pe3());
            }
            boolean z2 = kj2.d.p() == 1;
            if (View.MeasureSpec.getMode(O) == 1073741824) {
                i2 = View.MeasureSpec.getSize(O);
            } else {
                i2 = z2 ? -1 : -2;
            }
            if (View.MeasureSpec.getMode(N) == 1073741824) {
                i5 = View.MeasureSpec.getSize(N);
            } else if (z2) {
                i5 = -2;
            }
            f.q();
            c11703yE1.setLayoutParams(new IJ2(i2, i5, O, N));
            c11703yE1.H(o00.e());
            c11703yE1.post(new FJ2(c11703yE1));
            if (o00.f().a() != null && o00.g.get() == 0) {
                c11703yE1.N = new GJ2(this, c11703yE1);
            }
            c11703yE1.getClass();
        } else {
            InterfaceC9671sJ2 interfaceC9671sJ2 = kj2.c;
            if (interfaceC9671sJ2 != null) {
                ((C11954yy0) interfaceC9671sJ2).C(dVar, i);
            } else {
                f.i();
                int i8 = BJ2.A;
                throw null;
            }
        }
        boolean z3 = B10.a;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        KJ2 kj2 = this.i;
        int size = kj2.a.size();
        if (!kj2.N || size <= 0) {
            return size;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.AbstractC8305oK2
    public final void I(d dVar) {
        boolean z = dVar instanceof BJ2;
        KJ2 kj2 = this.i;
        if (z) {
            if (((BJ2) dVar).z) {
                C11703yE1 c11703yE1 = (C11703yE1) dVar.a;
                c11703yE1.K();
                c11703yE1.H(null);
                c11703yE1.I(null);
                c11703yE1.getClass();
            }
        } else {
            kj2.c.getClass();
        }
        kj2.getClass();
    }

    @Override // defpackage.AbstractC8305oK2
    public final long r(int i) {
        return ((O00) this.i.a.get(i)).h;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        KJ2 kj2 = this.i;
        ArrayList arrayList = kj2.a;
        InterfaceC7976nN2 f = ((O00) arrayList.get(kj2.N ? i % arrayList.size() : i)).f();
        if (f.b()) {
            return kj2.m0.d;
        }
        InterfaceC9671sJ2 interfaceC9671sJ2 = kj2.c;
        if (interfaceC9671sJ2 != null) {
            return ((C11954yy0) interfaceC9671sJ2).s(i);
        }
        return f.f();
    }
}
