package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection$CC;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ay0 */
/* loaded from: classes.dex */
public final class C0121Ay0 implements InterfaceC6322ia1 {
    public static final C6492j31 p = C6492j31.k("com/google/chrome/elements/ElementsHybridListRenderer");
    public final C5016em a;
    public final C2931Wo1 g;
    public final Wb4 h;
    public final C6922kJ0 i;
    public final Context j;
    public final C7849n00 k;
    public final C0936Hf0 l;
    public final InterfaceC2938Wp3 m;
    public boolean n;
    public Optional o = Optional.empty();

    public C0121Ay0(Context context, C0936Hf0 c0936Hf0, C5016em c5016em, C2931Wo1 c2931Wo1, Wb4 wb4, InterfaceC2938Wp3 interfaceC2938Wp3, C6922kJ0 c6922kJ0) {
        this.j = context;
        this.l = c0936Hf0;
        this.a = c5016em;
        this.g = c2931Wo1;
        this.h = wb4;
        this.i = c6922kJ0;
        this.m = interfaceC2938Wp3;
        this.k = new C7849n00(context, (String) null, (C5524gE1) null, (C5277fX3) null);
    }

    @Override // defpackage.InterfaceC6322ia1
    public final RecyclerView i(C7555m82 c7555m82, ViewGroup viewGroup) {
        c();
        C11954yy0 c11954yy0 = new C11954yy0(this, c7555m82, viewGroup);
        this.o = Optional.of(c11954yy0);
        return c11954yy0.j;
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void j() {
        this.n = true;
        if (this.o.isPresent()) {
            ((C11954yy0) this.o.get()).o.c();
        } else {
            ((InterfaceC5462g31) p.f().g("com/google/chrome/elements/ElementsHybridListRenderer", 111, "onSurfaceOpened", "ElementsHybridListRenderer.java")).h("unexpected call to onSurfaceOpened() without a bound state");
        }
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void o() {
        this.n = false;
        this.o.ifPresent(new Consumer() { // from class: wy0
            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((C11954yy0) obj).o.f();
            }
        });
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void c() {
        if (this.o.isPresent()) {
            C11954yy0 c11954yy0 = (C11954yy0) this.o.get();
            HashMap hashMap = c11954yy0.k.g;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((C4329cm) it.next()).j();
            }
            hashMap.clear();
            C0121Ay0 c0121Ay0 = c11954yy0.q;
            ArrayList arrayList = ((Zb4) c0121Ay0.h).d;
            final C11611xy0 c11611xy0 = c11954yy0.p;
            final C8748pd4 c8748pd4 = c11954yy0.o;
            Collection$CC.$default$removeIf(arrayList, new Predicate() { // from class: Xb4
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
                    Yb4 yb4 = (Yb4) obj;
                    if (!Objects.equals(yb4.b, C11611xy0.this)) {
                        return false;
                    }
                    c8748pd4.a.remove(yb4);
                    return true;
                }
            });
            ((TK0) c0121Ay0.m).i.d(c11954yy0.m);
            RecyclerView recyclerView = c11954yy0.j;
            recyclerView.h0(c0121Ay0.i);
            C7555m82 c7555m82 = (C7555m82) c11954yy0.i;
            c7555m82.b.remove(c11954yy0);
            c11954yy0.n(0, c7555m82.d());
            c11954yy0.n.v(recyclerView);
            this.o = Optional.empty();
        }
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void l(byte[] bArr) {
        Optional a = AbstractC1291Jy0.a(bArr);
        if (!a.isPresent()) {
            return;
        }
        AbstractC1291Jy0.b(this.l, (C1161Iy0) a.get());
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void b() {
        this.o.ifPresent(new Consumer() { // from class: vy0
            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((C11954yy0) obj).o.b();
            }
        });
    }
}
