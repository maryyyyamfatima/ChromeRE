package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jS */
/* loaded from: classes.dex */
public final class C6622jS {
    public static final C6492j31 b = C6492j31.k("com/google/chrome/elements/appflows/ClankAppFlowLogger");
    public final ZX0 a;

    public C6622jS(ZX0 zx0) {
        this.a = zx0;
    }

    public static void a(C1495Ln c1495Ln, C1495Ln c1495Ln2, TL2 tl2) {
        C3743b30 c3743b30 = c1495Ln2.c;
        C6492j31 c6492j31 = b;
        if (c1495Ln == null) {
            if (c3743b30.d) {
                return;
            }
            ((InterfaceC5462g31) c6492j31.f().g("com/google/chrome/elements/appflows/ClankAppFlowLogger", 45, "checkEventOrder", "ClankAppFlowLogger.java")).o(c3743b30.b, "Expected a start event but got %s");
            return;
        }
        C3743b30 c3743b302 = c1495Ln.c;
        boolean z = c3743b302.c;
        String str = c3743b302.b;
        if (z) {
            ((InterfaceC5462g31) c6492j31.f().g("com/google/chrome/elements/appflows/ClankAppFlowLogger", 51, "checkEventOrder", "ClankAppFlowLogger.java")).e(c3743b30.b, str);
            return;
        }
        Set set = (Set) tl2.get(Integer.valueOf(c3743b302.a.a));
        if (set == null) {
            ((InterfaceC5462g31) c6492j31.f().g("com/google/chrome/elements/appflows/ClankAppFlowLogger", 59, "checkEventOrder", "ClankAppFlowLogger.java")).o(str, "%s not found in the expected next events map");
        } else {
            if (set.contains(Integer.valueOf(c3743b30.a.a))) {
                return;
            }
            ((InterfaceC5462g31) c6492j31.f().g("com/google/chrome/elements/appflows/ClankAppFlowLogger", 65, "checkEventOrder", "ClankAppFlowLogger.java")).e(c3743b30.b, str);
        }
    }

    public final void b(InterfaceC2239Rg interfaceC2239Rg, C2800Vo0 c2800Vo0) {
        OX0 ox0 = C2800Vo0.o;
        final C2369Sg c2369Sg = (C2369Sg) interfaceC2239Rg;
        C1070Ig c1070Ig = c2369Sg.c;
        C1460Lg c1460Lg = ((C1200Jg) c1070Ig.g).m;
        if (c1460Lg == null) {
            c1460Lg = C1460Lg.l;
        }
        JX0 jx0 = (JX0) c1460Lg.l(PX0.NEW_BUILDER);
        jx0.m(c1460Lg);
        C1330Kg c1330Kg = (C1330Kg) jx0;
        c1330Kg.p(ox0, c2800Vo0);
        if (c1070Ig.h) {
            c1070Ig.l();
            c1070Ig.h = false;
        }
        C1200Jg c1200Jg = (C1200Jg) c1070Ig.g;
        C1460Lg c1460Lg2 = (C1460Lg) c1330Kg.j();
        c1200Jg.getClass();
        c1460Lg2.getClass();
        c1200Jg.m = c1460Lg2;
        c1200Jg.j |= 4;
        final ZX0 zx0 = this.a;
        synchronized (zx0) {
            synchronized (zx0) {
                zx0.e.getClass();
                final long a = C6442iu3.a();
                zx0.h.execute(new RunnableFutureC9399rX3(AbstractC4575dU3.a(new InterfaceC2909Wk() { // from class: XX0
                    @Override // defpackage.InterfaceC2909Wk
                    public final RD1 call() {
                        AbstractC11861yi1 c4629de3;
                        BE3 be3;
                        AbstractC9095qe2 abstractC9095qe2;
                        ZX0 zx02 = ZX0.this;
                        InterfaceC2499Tg interfaceC2499Tg = c2369Sg;
                        long j = a;
                        zx02.getClass();
                        C2369Sg a2 = interfaceC2499Tg.a();
                        if (zx02.b.a && zx02.g.c) {
                            C10136tg3 f = AbstractC6294iU3.f(AbstractC8092nj.a);
                            f.getClass();
                            int i = f.a;
                            if (!(i == 1)) {
                                be3 = BE3.b;
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
                                }
                                be3 = (BE3) f.b;
                            }
                            C14 it = AbstractC1472Li1.o(be3.a).iterator();
                            if (it.hasNext()) {
                                X5.a(it.next());
                                throw null;
                            }
                            C10136tg3 f2 = AbstractC6294iU3.f(AbstractC6018hh.a);
                            f2.getClass();
                            int i2 = f2.a;
                            if (!(i2 == 1)) {
                                abstractC9095qe2 = C5785h.a;
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
                                }
                                abstractC9095qe2 = new C3242Yy2((C5674gh) f2.b);
                            }
                            if (abstractC9095qe2.c()) {
                                if (!(a2.g.c() || a2.h.c())) {
                                    int i3 = ((C5674gh) abstractC9095qe2.b()).j;
                                    int b2 = AbstractC2373Sg3.b(i3 != 0 ? i3 != 1 ? i3 != 2 ? 0 : 2 : 1 : 3);
                                    if (b2 == 0) {
                                        C5674gh c5674gh = (C5674gh) abstractC9095qe2.b();
                                        a2.h = new C3242Yy2(c5674gh.j == 1 ? (String) c5674gh.k : "");
                                        a2.g = C5785h.a;
                                    } else if (b2 == 1) {
                                        C5674gh c5674gh2 = (C5674gh) abstractC9095qe2.b();
                                        a2.g = new C3242Yy2(Long.valueOf(c5674gh2.j == 2 ? ((Long) c5674gh2.k).longValue() : 0L));
                                        a2.h = C5785h.a;
                                    }
                                }
                            }
                        }
                        if (a2.i && a2.j > j) {
                            if (zx02.b.b) {
                                throw new IllegalArgumentException("Timestamp of the event being logged is in te future. If this is happening in test, advance the test clock so that the event timestamp would be in the past.");
                            }
                            a2.j = j;
                            a2.i = true;
                        }
                        C1495Ln b3 = a2.b();
                        if (!b3.b.c()) {
                            C1070Ig c1070Ig2 = b3.d;
                            C9639sD0 c9639sD0 = (C9639sD0) C10668vD0.m.j();
                            C11064wN3 b4 = AbstractC11750yN3.b(j);
                            if (c9639sD0.h) {
                                c9639sD0.l();
                                c9639sD0.h = false;
                            }
                            C10668vD0 c10668vD0 = (C10668vD0) c9639sD0.g;
                            c10668vD0.getClass();
                            c10668vD0.k = b4;
                            c10668vD0.j |= 1;
                            c1070Ig2.o((C10668vD0) c9639sD0.j());
                        }
                        C14 it2 = zx02.g.d.iterator();
                        if (it2.hasNext()) {
                            X5.a(it2.next());
                            throw null;
                        }
                        Iterator it3 = zx02.c.iterator();
                        if (it3.hasNext()) {
                            X5.a(it3.next());
                            throw null;
                        }
                        C3905bY0 c3905bY0 = (C3905bY0) zx02.d;
                        synchronized (c3905bY0) {
                            AbstractC9095qe2 a3 = c3905bY0.b.a(b3);
                            if (a3.c()) {
                                C1754Nn a4 = c3905bY0.a((C6746jo) a3.b());
                                c3905bY0.c(a4);
                                c4629de3 = new C4629de3(a4);
                            } else {
                                int i4 = AbstractC1472Li1.h;
                                c4629de3 = UL2.o;
                            }
                        }
                        HashSet hashSet = new HashSet();
                        C14 it4 = c4629de3.iterator();
                        while (it4.hasNext()) {
                            hashSet.add(zx02.a((C1754Nn) it4.next()));
                        }
                        AbstractC0562Ei1 n = AbstractC0562Ei1.n(hashSet);
                        YX0 yx0 = new YX0();
                        ExecutorService executorService = zx02.a.b;
                        int i5 = AbstractC4575dU3.a;
                        return new C7335lX(n, true, (Executor) executorService, (Callable) new ZT3(AbstractC6294iU3.g(), yx0));
                    }
                })));
            }
            ((InterfaceC5462g31) b.c().g("com/google/chrome/elements/appflows/ClankAppFlowLogger", 81, "log", "ClankAppFlowLogger.java")).o(c2369Sg.b(), "Logged AppFlowEvent: %s");
        }
        ((InterfaceC5462g31) b.c().g("com/google/chrome/elements/appflows/ClankAppFlowLogger", 81, "log", "ClankAppFlowLogger.java")).o(c2369Sg.b(), "Logged AppFlowEvent: %s");
    }
}
