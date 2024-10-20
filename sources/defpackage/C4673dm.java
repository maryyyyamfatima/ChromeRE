package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection$CC;
import j$.util.Map;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dm */
/* loaded from: classes.dex */
public final class C4673dm implements InterfaceC5323ff4 {
    public final Executor a;
    public final Executor b;
    public final RecyclerView c;
    public final BT d;
    public final C8748pd4 e;
    public final C11611xy0 f;
    public final HashMap g = new HashMap();

    public C4673dm(BT bt, Executor executor, Executor executor2, C11611xy0 c11611xy0, C8748pd4 c8748pd4) {
        this.d = bt;
        this.a = executor2;
        this.b = executor;
        this.c = c11611xy0.a.j;
        this.e = c8748pd4;
        this.f = c11611xy0;
    }

    @Override // defpackage.InterfaceC5323ff4
    public final void a(final View view) {
        Collection$CC.$default$removeIf(this.g.entrySet(), new Predicate() { // from class: Ul
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
                Map.Entry entry = (Map.Entry) obj;
                HashMap hashMap = ((C4329cm) entry.getValue()).e;
                hashMap.remove(view);
                if (!hashMap.isEmpty()) {
                    return false;
                }
                ((C4329cm) entry.getValue()).j();
                return true;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Yl] */
    @Override // defpackage.InterfaceC5323ff4
    public final void b(View view, final C10409uU c10409uU) {
        VT vt = c10409uU.l;
        if (vt == null) {
            vt = VT.v;
        }
        if ((vt.j & 2048) != 0) {
            CS a = this.f.a(view);
            C2404Sn c2404Sn = a.a;
            if (c2404Sn.c && c2404Sn.e.isPresent()) {
                HashMap hashMap = ((C4329cm) Map.EL.computeIfAbsent(this.g, a, new Function() { // from class: Vl
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        C4673dm c4673dm = C4673dm.this;
                        return new C4329cm(c4673dm, (CS) obj, c4673dm.f.a.q.n);
                    }
                })).e;
                VT vt2 = c10409uU.l;
                if (vt2 == null) {
                    vt2 = VT.v;
                }
                hashMap.put(view, new C2014Pn(vt2, new InterfaceC3299Zk() { // from class: Yl
                    @Override // defpackage.InterfaceC3299Zk
                    public final RD1 apply(Object obj) {
                        Object a2;
                        C1485Ll c1485Ll = (C1485Ll) obj;
                        OX0 ox0 = C9271r82.l;
                        KU ku = C10409uU.this.t;
                        if (ku == null) {
                            ku = KU.l;
                        }
                        OX0 ox02 = C2930Wo0.o;
                        ku.getClass();
                        ox02.getClass();
                        ku.v(ox02);
                        C5563gM0 c5563gM0 = ku.j;
                        NX0 nx0 = ox02.d;
                        Object c = c5563gM0.c(nx0);
                        if (c == null) {
                            a2 = ox02.b;
                        } else {
                            nx0.getClass();
                            a2 = ox02.a(c);
                        }
                        C5493g82 c5493g82 = ((C2930Wo0) a2).k;
                        if (c5493g82 == null) {
                            c5493g82 = C5493g82.n;
                        }
                        JX0 jx0 = (JX0) c5493g82.l(PX0.NEW_BUILDER);
                        jx0.m(c5493g82);
                        C5149f82 c5149f82 = (C5149f82) jx0;
                        if (c5149f82.h) {
                            c5149f82.l();
                            c5149f82.h = false;
                        }
                        C5493g82 c5493g822 = (C5493g82) c5149f82.g;
                        c5493g822.getClass();
                        c5493g822.l = 7;
                        c5493g822.k |= 4;
                        c1485Ll.p(ox0, (C5493g82) c5149f82.j());
                        return AbstractC5957hW0.c(c1485Ll);
                    }
                }));
            }
        }
    }
}
