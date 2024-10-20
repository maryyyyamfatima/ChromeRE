package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import j$.util.Collection$CC;
import j$.util.Optional;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yy0 */
/* loaded from: classes.dex */
public final class C11954yy0 extends AbstractC8305oK2 implements InterfaceC9671sJ2, InterfaceC11693yC1 {
    public final InterfaceC11350xC1 i;
    public final RecyclerView j;
    public final C4673dm k;
    public final C5311fd4 l;
    public final C5999hd4 m;
    public final KJ2 n;
    public final C8748pd4 o;
    public final C11611xy0 p;
    public final /* synthetic */ C0121Ay0 q;

    public final void M() {
        Collection$CC.$default$removeIf(this.k.g.values(), new Predicate() { // from class: Tl
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                final C4329cm c4329cm = (C4329cm) obj;
                if (!c4329cm.f) {
                    c4329cm.f = true;
                    c4329cm.i.a.execute(new RunnableC3044Xl(c4329cm));
                }
                HashMap hashMap = c4329cm.e;
                Collection$CC.$default$removeIf(hashMap.entrySet(), new Predicate() { // from class: Wl
                    @Override // j$.util.function.Predicate
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate.CC.$default$and(this, predicate);
                    }

                    @Override // j$.util.function.Predicate
                    public final /* synthetic */ Predicate negate() {
                        return Predicate.CC.$default$negate(this);
                    }

                    @Override // j$.util.function.Predicate
                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate.CC.$default$or(this, predicate);
                    }

                    @Override // j$.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return !C4329cm.this.i.f.a((View) ((Map.Entry) obj2).getKey()).a.c;
                    }
                });
                if (!hashMap.isEmpty()) {
                    return false;
                }
                c4329cm.j();
                return true;
            }
        });
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        InterfaceC11350xC1 interfaceC11350xC1 = this.i;
        if (((C7555m82) interfaceC11350xC1).f(i)) {
            interfaceC11350xC1.getClass();
        }
    }

    public C11954yy0(C0121Ay0 c0121Ay0, C7555m82 c7555m82, ViewGroup viewGroup) {
        this.q = c0121Ay0;
        C8748pd4 c8748pd4 = new C8748pd4();
        this.o = c8748pd4;
        this.i = c7555m82;
        C5999hd4 c5999hd4 = new C5999hd4(c8748pd4);
        this.m = c5999hd4;
        RecyclerView recyclerView = new RecyclerView(c0121Ay0.j, null);
        this.j = recyclerView;
        CJ2 cj2 = new CJ2();
        cj2.h = true;
        cj2.i = -1;
        cj2.v = this;
        KJ2 a = cj2.a(c0121Ay0.k);
        this.n = a;
        c5999hd4.j = recyclerView;
        ((TK0) c0121Ay0.m).i.a(c5999hd4);
        recyclerView.i(c5999hd4);
        recyclerView.i(c0121Ay0.i);
        (viewGroup == null ? recyclerView : viewGroup).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC5655gd4(c8748pd4));
        C5311fd4 c5311fd4 = new C5311fd4(c8748pd4);
        this.l = c5311fd4;
        recyclerView.p0(c5311fd4);
        C11611xy0 c11611xy0 = new C11611xy0(this);
        this.p = c11611xy0;
        Zb4 zb4 = (Zb4) c0121Ay0.h;
        zb4.getClass();
        Yb4 yb4 = new Yb4(zb4, c11611xy0);
        zb4.d.add(yb4);
        c8748pd4.a.add(yb4);
        a.f(recyclerView);
        C5016em c5016em = c0121Ay0.a;
        BT bt = (BT) c5016em.a.get();
        C5016em.a(1, bt);
        Executor executor = (Executor) c5016em.b.get();
        C5016em.a(2, executor);
        Executor executor2 = (Executor) c5016em.c.get();
        C5016em.a(3, executor2);
        this.k = new C4673dm(bt, executor, executor2, c11611xy0, c8748pd4);
        c7555m82.b.add(this);
        a(0, c7555m82.d());
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return ((C7555m82) this.i).d();
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        if (i != -1) {
            return new C12297zy0(((C7555m82) this.i).e(i, recyclerView));
        }
        return null;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        C7555m82 c7555m82 = (C7555m82) this.i;
        if (!c7555m82.f(i)) {
            return -1;
        }
        C7211l82 c7211l82 = (C7211l82) c7555m82.a.get(i);
        if (c7211l82.d == 0) {
            int i2 = c7555m82.d + 1;
            c7555m82.d = i2;
            c7211l82.d = i2;
        }
        return c7211l82.d;
    }

    @Override // defpackage.InterfaceC11693yC1
    public final void a(int i, int i2) {
        Optional a;
        InterfaceC7976nN2 ds;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            C7555m82 c7555m82 = (C7555m82) this.i;
            if (!c7555m82.f(i3)) {
                if (c7555m82.f(i3)) {
                    a = Optional.empty();
                } else {
                    a = AbstractC1291Jy0.a(((C6523j82) c7555m82.a.get(i3)).b);
                }
                if (!a.isPresent()) {
                    ds = A00.r();
                } else {
                    C0121Ay0 c0121Ay0 = this.q;
                    AbstractC1291Jy0.b(c0121Ay0.l, (C1161Iy0) a.get());
                    HashMap c = c7555m82.c(i3);
                    C3884bU c3884bU = C3884bU.l;
                    if (c3884bU == null) {
                        throw new NullPointerException("Null clientContext");
                    }
                    C4673dm c4673dm = this.k;
                    if (c4673dm == null) {
                        throw new NullPointerException("Null viewsVisibilityTracker");
                    }
                    C2539To c2539To = new C2539To(c4673dm, c3884bU);
                    CS a2 = CS.a(c);
                    C2931Wo1 c2931Wo1 = c0121Ay0.g;
                    c2931Wo1.getClass();
                    BT bt = (BT) c2931Wo1.a.get();
                    C2931Wo1.a(1, bt);
                    C5745gs4 c5745gs4 = new C5745gs4(c2539To, new C2801Vo1(bt, a2), c);
                    C0936Hf0 c0936Hf0 = c0121Ay0.l;
                    C3654ao a3 = c0936Hf0.a();
                    a3.f = c5745gs4;
                    a3.c = "ElementsHybridListRenderer";
                    C3998bo a4 = a3.a();
                    C3054Xn a5 = U80.a();
                    a5.u = a4;
                    C3184Yn a6 = a5.a();
                    H10 h10 = new H10();
                    InterfaceC8520ox0 interfaceC8520ox0 = (InterfaceC8520ox0) c0936Hf0.R.get();
                    C7849n00 c7849n00 = c0121Ay0.k;
                    C2479Tc c2479Tc = ((C1161Iy0) a.get()).l;
                    if (c2479Tc == null) {
                        c2479Tc = C2479Tc.k;
                    }
                    WZ d = ((C10049tQ2) interfaceC8520ox0).d(c7849n00, a6, c2479Tc.j.p(), h10);
                    C11622y00 c11622y00 = new C11622y00();
                    c11622y00.b = d;
                    ds = new DS(new A00(c11622y00), h10);
                }
            } else {
                ds = InterfaceC9671sJ2.d;
            }
            arrayList.add(ds);
        }
        KJ2 kj2 = this.n;
        kj2.U(i, arrayList);
        kj2.g0(true, null);
        M();
    }

    @Override // defpackage.InterfaceC11693yC1
    public final void n(int i, int i2) {
        KJ2 kj2 = this.n;
        kj2.j0(i, i2);
        kj2.g0(true, null);
        M();
    }

    @Override // defpackage.InterfaceC11693yC1
    public final void e(int i, int i2) {
        KJ2 kj2 = this.n;
        kj2.f0(i, i2);
        kj2.g0(true, null);
        M();
    }
}
