package defpackage;

import J.N;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZX0 {
    public final C1624Mn a;
    public final C6060ho b;
    public final Set c;
    public final InterfaceC6704jh d;
    public final C6442iu3 e;
    public final InterfaceC3241Yy1 f;
    public final C10523uo g;
    public final X33 h;

    public final String toString() {
        return AbstractC4809e90.a("Generic AppFlows Logger: ", this.g.b);
    }

    public final synchronized RD1 a(final C1754Nn c1754Nn) {
        if (c1754Nn.d) {
            return C9803si1.g;
        }
        C14 it = this.g.d.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
        Iterator it2 = this.c.iterator();
        if (!it2.hasNext()) {
            final C5011el0 c5011el0 = (C5011el0) this.f.get();
            c5011el0.a.getClass();
            EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
            RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(new Callable() { // from class: dl0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v17, types: [QX0] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C5011el0 c5011el02 = C5011el0.this;
                    c5011el02.getClass();
                    C5330fh c5330fh = c1754Nn.a;
                    C1889Oo c1889Oo = c5011el02.a;
                    C5330fh c5330fh2 = c5330fh;
                    if (c1889Oo.b.c()) {
                        C6966kS c6966kS = (C6966kS) c1889Oo.b.b();
                        c6966kS.getClass();
                        SN sn = (SN) TN.p.j();
                        C6602jO c6602jO = (C6602jO) C6946kO.n.j();
                        ((NJ0) c6966kS.a).getClass();
                        long M3iQL3Dd = N.M3iQL3Dd();
                        if (c6602jO.h) {
                            c6602jO.l();
                            c6602jO.h = false;
                        }
                        C6946kO c6946kO = (C6946kO) c6602jO.g;
                        c6946kO.j |= 1;
                        c6946kO.k = M3iQL3Dd;
                        if (c6602jO.h) {
                            c6602jO.l();
                            c6602jO.h = false;
                        }
                        C6946kO c6946kO2 = (C6946kO) c6602jO.g;
                        c6946kO2.getClass();
                        c5330fh.getClass();
                        c6946kO2.l = c5330fh;
                        c6946kO2.j |= 2;
                        if (sn.h) {
                            sn.l();
                            sn.h = false;
                        }
                        TN tn = (TN) sn.g;
                        C6946kO c6946kO3 = (C6946kO) c6602jO.j();
                        tn.getClass();
                        c6946kO3.getClass();
                        tn.n = c6946kO3;
                        tn.j |= 8;
                        C7290lO c7290lO = (C7290lO) C8665pO.n.j();
                        if (c7290lO.h) {
                            c7290lO.l();
                            c7290lO.h = false;
                        }
                        C8665pO c8665pO = (C8665pO) c7290lO.g;
                        c8665pO.getClass();
                        c8665pO.j |= 1;
                        c8665pO.k = "105.0.5195.136";
                        int a = AbstractC7978nO.a(4);
                        if (c7290lO.h) {
                            c7290lO.l();
                            c7290lO.h = false;
                        }
                        C8665pO c8665pO2 = (C8665pO) c7290lO.g;
                        c8665pO2.getClass();
                        c8665pO2.l = AbstractC2373Sg3.b(a);
                        c8665pO2.j |= 2;
                        if (c7290lO.h) {
                            c7290lO.l();
                            c7290lO.h = false;
                        }
                        C8665pO c8665pO3 = (C8665pO) c7290lO.g;
                        c8665pO3.getClass();
                        c8665pO3.m = 5;
                        c8665pO3.j |= 4;
                        if (sn.h) {
                            sn.l();
                            sn.h = false;
                        }
                        TN tn2 = (TN) sn.g;
                        C8665pO c8665pO4 = (C8665pO) c7290lO.j();
                        tn2.getClass();
                        c8665pO4.getClass();
                        tn2.m = c8665pO4;
                        tn2.j |= 4;
                        c5330fh2 = sn.j();
                    }
                    FT c = ((IT) c5011el02.c.get()).c(c5330fh2);
                    AbstractC9095qe2 abstractC9095qe2 = c1889Oo.c;
                    if (abstractC9095qe2.c()) {
                        int intValue = ((Integer) abstractC9095qe2.b()).intValue();
                        WT wt = c.c;
                        if (wt.h) {
                            wt.l();
                            wt.h = false;
                        }
                        YT yt = (YT) wt.g;
                        yt.k |= 16;
                        yt.o = intValue;
                    }
                    c.c();
                    Iterator it3 = c5011el02.b.iterator();
                    if (!it3.hasNext()) {
                        return null;
                    }
                    X5.a(it3.next());
                    throw null;
                }
            });
            enumC6747jo0.execute(runnableFutureC9399rX3);
            return runnableFutureC9399rX3;
        }
        X5.a(it2.next());
        throw null;
    }

    public ZX0(C6442iu3 c6442iu3, AbstractC9095qe2 abstractC9095qe2, AbstractC9095qe2 abstractC9095qe22, Set set, InterfaceC6704jh interfaceC6704jh, AbstractC9095qe2 abstractC9095qe23, InterfaceC3241Yy1 interfaceC3241Yy1, C10523uo c10523uo) {
        this.e = c6442iu3;
        C1624Mn c1624Mn = (C1624Mn) abstractC9095qe2.d(C1624Mn.a());
        this.a = c1624Mn;
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            this.b = (C6060ho) abstractC9095qe22.d(new C6060ho(false, false));
            this.c = set;
            this.d = interfaceC6704jh;
            this.f = interfaceC3241Yy1;
            this.g = c10523uo;
            this.h = new X33(c1624Mn.b);
            if (c10523uo.a && abstractC9095qe23.c()) {
                X5.a(abstractC9095qe23.b());
                throw null;
            }
            C3905bY0 c3905bY0 = (C3905bY0) interfaceC6704jh;
            synchronized (c3905bY0.c) {
                c3905bY0.g = new C3242Yy2(this);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" tiktokIntegrationEnabled");
        }
        if ((b & 2) == 0) {
            sb.append(" throwExceptionForEventsLoggedInFuture");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
