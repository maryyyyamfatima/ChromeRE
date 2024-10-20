package defpackage;

import J.N;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u93 */
/* loaded from: classes.dex */
public class C10307u93 extends AbstractC4368cs2 {
    public static final int u;
    public static final long v;
    public static final int w;
    public static final C8421og2 x;
    public static final ArrayDeque y;
    public static boolean z;
    public long o;
    public C8936q93 p;
    public C6469iz2 q;
    public final HashMap r;
    public final C8385oa2 s;
    public C7562m93 t;

    @Override // defpackage.AbstractC4368cs2
    public final String i() {
        return "SPTD";
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        u = (int) timeUnit.toMillis(7L);
        v = TimeUnit.HOURS.toMillis(1L);
        w = (int) timeUnit.toSeconds(90L);
        x = new C8421og2();
        y = new ArrayDeque();
        AbstractC4368cs2.n.add(C10307u93.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(org.chromium.chrome.browser.tab.Tab r11, defpackage.C0778Fz2 r12, defpackage.C8250o93 r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10307u93.s(org.chromium.chrome.browser.tab.Tab, Fz2, o93):void");
    }

    public C10307u93(Tab tab) {
        super(tab, EnumC6773js2.a(C10307u93.class, tab.isIncognito()).b(), EnumC6773js2.a(C10307u93.class, tab.isIncognito()).a);
        this.o = -1L;
        this.p = new C8936q93();
        this.r = new HashMap();
        C8385oa2 c8385oa2 = new C8385oa2();
        this.s = c8385oa2;
        c8385oa2.p(Boolean.FALSE);
        this.j = c8385oa2;
        C2297Rr2 c2297Rr2 = new C2297Rr2(this);
        this.k = c2297Rr2;
        c8385oa2.m(c2297Rr2);
        C7562m93 c7562m93 = new C7562m93(this);
        this.t = c7562m93;
        tab.v(c7562m93);
        this.q = new C6469iz2(this);
    }

    public final void u() {
        a();
        this.p = new C8936q93();
    }

    public static void o(final Callback callback, Tab tab) {
        if (tab == null || tab.isDestroyed()) {
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: k93
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C10307u93.u;
                    Callback.this.onResult(null);
                }
            });
            return;
        }
        if (z) {
            p(callback, tab);
            return;
        }
        boolean z2 = false;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            if (N.M6bsIDpc("CommercePriceTracking", "return_empty_price_drops_until_init", false)) {
                z2 = true;
            }
        }
        if (z2) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: l93
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C10307u93.u;
                    Callback.this.onResult(null);
                }
            });
        } else {
            if (z2) {
                return;
            }
            y.add(new C9278r93(callback, tab));
        }
    }

    public static void p(final Callback callback, final Tab tab) {
        if (tab.isIncognito() || tab.isCustomTab()) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: f93
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C10307u93.u;
                    Callback.this.onResult(null);
                }
            });
        } else {
            AbstractC4368cs2.e(tab, new InterfaceC7117ks2() { // from class: g93
                @Override // defpackage.InterfaceC7117ks2
                public final void a(final ByteBuffer byteBuffer, InterfaceC7805ms2 interfaceC7805ms2, String str, final C3337Zr2 c3337Zr2) {
                    int i = C10307u93.u;
                    QF3 qf3 = AbstractC5103f04.a;
                    final Tab tab2 = Tab.this;
                    PostTask.c(qf3, new Runnable() { // from class: b93
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = C10307u93.u;
                            Tab tab3 = Tab.this;
                            final C10307u93 n = tab3.isDestroyed() ? null : C10307u93.n(tab3);
                            QF3 qf32 = QF3.l;
                            final ByteBuffer byteBuffer2 = byteBuffer;
                            final Callback callback2 = c3337Zr2;
                            PostTask.c(qf32, new Runnable() { // from class: c93
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i3 = C10307u93.u;
                                    final C10307u93 c10307u93 = C10307u93.this;
                                    if (c10307u93 != null) {
                                        c10307u93.c(byteBuffer2);
                                    }
                                    QF3 qf33 = AbstractC5103f04.a;
                                    final Callback callback3 = callback2;
                                    PostTask.c(qf33, new Runnable() { // from class: W83
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i4 = C10307u93.u;
                                            Callback.this.onResult(c10307u93);
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            }, new Callback() { // from class: h93
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                /* JADX WARN: Type inference failed for: r3v3, types: [X83] */
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    final Callback callback2 = (Callback) obj;
                    int i = C10307u93.u;
                    final Tab tab2 = Tab.this;
                    if (!tab2.isDestroyed()) {
                        long currentTimeMillis = System.currentTimeMillis() - C1695Nb0.m(tab2).s;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        boolean a = AbstractC8293oI0.a();
                        int i2 = C10307u93.w;
                        if (a) {
                            C7928nE c7928nE = UN.a;
                            i2 = N.M37SqSAy("CommercePriceTracking", "price_tracking_stale_tab_threshold_seconds", i2);
                        }
                        if (currentTimeMillis <= timeUnit.toMillis(i2)) {
                            final C8250o93 c8250o93 = AbstractC4368cs2.d(tab2, C10307u93.class) != null ? new C8250o93((C10307u93) AbstractC4368cs2.d(tab2, C10307u93.class)) : null;
                            GURL url = tab2.getUrl();
                            final X83 r3 = new Callback() { // from class: X83
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj2) {
                                    return new ZE(this, obj2);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj2) {
                                    int i3 = C10307u93.u;
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    final Callback callback3 = Callback.this;
                                    final Tab tab3 = tab2;
                                    if (booleanValue) {
                                        if (C10307u93.r()) {
                                            OptimizationGuideBridge a2 = AbstractC7906n93.a.a();
                                            GURL url2 = tab3.getUrl();
                                            R71 r71 = R71.w;
                                            final C8250o93 c8250o932 = c8250o93;
                                            a2.a(url2, r71, new OptimizationGuideBridge.OptimizationGuideCallback() { // from class: a93
                                                @Override // org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge.OptimizationGuideCallback
                                                public final void a(int i4, DY dy) {
                                                    C8250o93 c8250o933 = c8250o932;
                                                    int i5 = C10307u93.u;
                                                    Tab tab4 = tab3;
                                                    boolean isDestroyed = tab4.isDestroyed();
                                                    Callback callback4 = callback3;
                                                    if (isDestroyed) {
                                                        callback4.onResult(null);
                                                        return;
                                                    }
                                                    if (i4 != 1) {
                                                        C10307u93 n = C10307u93.n(tab4);
                                                        n.u();
                                                        C6469iz2 c6469iz2 = n.q;
                                                        if (c6469iz2 != null) {
                                                            c6469iz2.a(System.currentTimeMillis() - C1695Nb0.m(n.a).s, "NavigationComplete");
                                                        }
                                                        callback4.onResult(n);
                                                        return;
                                                    }
                                                    try {
                                                        AbstractC4147cE abstractC4147cE = dy.l;
                                                        C0778Fz2 c0778Fz2 = C0778Fz2.m;
                                                        XF0 c = XF0.c();
                                                        DV m = abstractC4147cE.m();
                                                        C0778Fz2 c0778Fz22 = new C0778Fz2();
                                                        try {
                                                            try {
                                                                try {
                                                                    C7931nE2 c7931nE2 = C7931nE2.c;
                                                                    c7931nE2.getClass();
                                                                    QW2 b = c7931nE2.b(c0778Fz22.getClass());
                                                                    EV ev = m.d;
                                                                    if (ev == null) {
                                                                        ev = new EV(m);
                                                                    }
                                                                    b.e(c0778Fz22, ev, c);
                                                                    b.b(c0778Fz22);
                                                                    try {
                                                                        m.a(0);
                                                                        QX0.i(c0778Fz22);
                                                                        QX0.i(c0778Fz22);
                                                                        C10307u93 n2 = C10307u93.n(tab4);
                                                                        n2.s(tab4, c0778Fz22, c8250o933);
                                                                        C6469iz2 c6469iz22 = n2.q;
                                                                        if (c6469iz22 != null) {
                                                                            c6469iz22.a(System.currentTimeMillis() - C1695Nb0.m(n2.a).s, "NavigationComplete");
                                                                        }
                                                                        callback4.onResult(n2);
                                                                    } catch (C1127Ir1 e) {
                                                                        throw e;
                                                                    }
                                                                } catch (IOException e2) {
                                                                    if (e2.getCause() instanceof C1127Ir1) {
                                                                        throw ((C1127Ir1) e2.getCause());
                                                                    }
                                                                    throw new C1127Ir1(e2);
                                                                } catch (RuntimeException e3) {
                                                                    if (e3.getCause() instanceof C1127Ir1) {
                                                                        throw ((C1127Ir1) e3.getCause());
                                                                    }
                                                                    throw e3;
                                                                }
                                                            } catch (C6827k14 e4) {
                                                                throw e4.a();
                                                            }
                                                        } catch (C1127Ir1 e5) {
                                                            if (e5.g) {
                                                                throw new C1127Ir1(e5);
                                                            }
                                                        }
                                                    } catch (C1127Ir1 e6) {
                                                        AbstractC4851eH1.d("SPTD", String.format(Locale.US, "There was a problem parsing PriceTrackingDataProto. Details %s.", e6), new Object[0]);
                                                        callback4.onResult(null);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        C10307u93.x.getClass();
                                        Profile d = Profile.d();
                                        HashMap hashMap = C8421og2.a;
                                        C7389lg2 c7389lg2 = (C7389lg2) hashMap.get(d);
                                        if (c7389lg2 == null) {
                                            c7389lg2 = new C7389lg2(new C8764pg2());
                                            hashMap.put(d, c7389lg2);
                                        }
                                        GURL url3 = tab3.getUrl();
                                        if (url3 == null || url3.k()) {
                                            LinkedList linkedList = new LinkedList();
                                            C10307u93.n(tab3);
                                            AbstractC7045kg2.a(AbstractC9981tD.class, linkedList);
                                            AbstractC7045kg2.a(AbstractC7233lC2.class, linkedList);
                                            EI2.h(0, 3, "Tabs.ShoppingPersistedTabData.FoundBuyableProductAnnotation");
                                            callback3.onResult(null);
                                            return;
                                        }
                                        c7389lg2.a.getClass();
                                        LinkedList linkedList2 = new LinkedList();
                                        C10307u93.n(tab3);
                                        AbstractC7045kg2.a(AbstractC9981tD.class, linkedList2);
                                        AbstractC7045kg2.a(AbstractC7233lC2.class, linkedList2);
                                        EI2.h(0, 3, "Tabs.ShoppingPersistedTabData.FoundBuyableProductAnnotation");
                                        callback3.onResult(null);
                                        return;
                                    }
                                    C10307u93 n = C10307u93.n(tab3);
                                    n.u();
                                    callback3.onResult(n);
                                }
                            };
                            AbstractC7906n93.a.a().a(url, R71.t, new OptimizationGuideBridge.OptimizationGuideCallback() { // from class: Z83
                                @Override // org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge.OptimizationGuideCallback
                                public final void a(int i3, DY dy) {
                                    int i4 = C10307u93.u;
                                    boolean z2 = true;
                                    if (i3 != 1 && i3 != 0) {
                                        z2 = false;
                                    }
                                    r3.onResult(Boolean.valueOf(z2));
                                }
                            });
                            return;
                        }
                    }
                    callback2.onResult(null);
                }
            }, C10307u93.class, callback);
        }
    }

    public static C10307u93 n(Tab tab) {
        C10307u93 c10307u93 = (C10307u93) AbstractC4368cs2.d(tab, C10307u93.class);
        return c10307u93 == null ? (C10307u93) tab.F().d(C10307u93.class, new C10307u93(tab)) : c10307u93;
    }

    @Override // defpackage.AbstractC4368cs2
    public final InterfaceC7876n43 g() {
        final C9621s93 c9621s93 = (C9621s93) C9964t93.r.j();
        long j = this.p.a;
        if (c9621s93.h) {
            c9621s93.l();
            c9621s93.h = false;
        }
        C9964t93 c9964t93 = (C9964t93) c9621s93.g;
        c9964t93.j |= 1;
        c9964t93.k = j;
        long j2 = this.p.b;
        if (c9621s93.h) {
            c9621s93.l();
            c9621s93.h = false;
        }
        C9964t93 c9964t932 = (C9964t93) c9621s93.g;
        c9964t932.j |= 2;
        c9964t932.l = j2;
        long j3 = this.i;
        if (c9621s93.h) {
            c9621s93.l();
            c9621s93.h = false;
        }
        C9964t93 c9964t933 = (C9964t93) c9621s93.g;
        c9964t933.j |= 8;
        c9964t933.n = j3;
        long j4 = this.o;
        if (c9621s93.h) {
            c9621s93.l();
            c9621s93.h = false;
        }
        C9964t93 c9964t934 = (C9964t93) c9621s93.g;
        c9964t934.j |= 16;
        c9964t934.o = j4;
        String str = this.p.d;
        if (str != null) {
            if (c9621s93.h) {
                c9621s93.l();
                c9621s93.h = false;
            }
            C9964t93 c9964t935 = (C9964t93) c9621s93.g;
            c9964t935.getClass();
            str.getClass();
            c9964t935.j |= 32;
            c9964t935.p = str;
        }
        String str2 = this.p.c;
        if (str2 != null) {
            if (c9621s93.h) {
                c9621s93.l();
                c9621s93.h = false;
            }
            C9964t93 c9964t936 = (C9964t93) c9621s93.g;
            c9964t936.getClass();
            str2.getClass();
            c9964t936.j |= 4;
            c9964t936.m = str2;
        }
        GURL gurl = this.p.e;
        if (gurl != null) {
            String m = gurl.m();
            if (c9621s93.h) {
                c9621s93.l();
                c9621s93.h = false;
            }
            C9964t93 c9964t937 = (C9964t93) c9621s93.g;
            c9964t937.getClass();
            m.getClass();
            c9964t937.j |= 64;
            c9964t937.q = m;
        }
        return new InterfaceC7876n43() { // from class: Y83
            @Override // defpackage.InterfaceC7876n43
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.InterfaceC7876n43
            public final ByteBuffer get() {
                int i = C10307u93.u;
                return ((C9964t93) C9621s93.this.j()).c().s();
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:            if (r2 > r4) goto L157;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C8593p93 q() {
        /*
            r10 = this;
            q93 r0 = r10.p
            long r1 = r0.a
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L18
            long r8 = r0.b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L18
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L18
            r0 = r6
            goto L19
        L18:
            r0 = r7
        L19:
            r1 = 0
            if (r0 == 0) goto L6f
            long r8 = r10.o
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L41
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r10.o
            long r2 = r2 - r4
            boolean r0 = defpackage.AbstractC8293oI0.a()
            int r4 = defpackage.C10307u93.u
            if (r0 == 0) goto L3b
            nE r0 = defpackage.UN.a
            java.lang.String r0 = "CommercePriceTracking"
            java.lang.String r5 = "price_tracking_display_time_ms"
            int r4 = J.N.M37SqSAy(r0, r5, r4)
        L3b:
            long r4 = (long) r4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L41
            goto L42
        L41:
            r6 = r7
        L42:
            if (r6 != 0) goto L6f
            org.chromium.chrome.browser.tab.Tab r0 = r10.a
            org.chromium.url.GURL r0 = r0.getUrl()
            q93 r2 = r10.p
            org.chromium.url.GURL r2 = r2.e
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L55
            goto L6f
        L55:
            q93 r0 = r10.p
            long r2 = r0.a
            long r4 = r0.b
            java.lang.String r0 = r10.m(r2)
            java.lang.String r2 = r10.m(r4)
            boolean r3 = r0.equals(r2)
            if (r3 == 0) goto L6a
            goto L6f
        L6a:
            p93 r1 = new p93
            r1.<init>(r0, r2)
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10307u93.q():p93");
    }

    public final String m(long j) {
        String str = this.p.c;
        if (str == null) {
            return "";
        }
        HashMap hashMap = this.r;
        if (hashMap.get(str) == null) {
            hashMap.put(str, new C8395oc0(this.p.c, Locale.getDefault()));
        }
        return AbstractC2207Qz2.a(j, (C8395oc0) hashMap.get(str));
    }

    @Override // defpackage.AbstractC4368cs2
    public final boolean b(ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            try {
                C9964t93 c9964t93 = C9964t93.r;
                XF0 c = XF0.c();
                DV h = DV.h(byteBuffer, false);
                C9964t93 c9964t932 = new C9964t93();
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(c9964t932.getClass());
                            EV ev = h.d;
                            if (ev == null) {
                                ev = new EV(h);
                            }
                            b.e(c9964t932, ev, c);
                            b.b(c9964t932);
                            QX0.i(c9964t932);
                            QX0.i(c9964t932);
                            C8936q93 c8936q93 = this.p;
                            c8936q93.a = c9964t932.k;
                            c8936q93.b = c9964t932.l;
                            this.i = c9964t932.n;
                            this.o = c9964t932.o;
                            c8936q93.d = c9964t932.p;
                            c8936q93.c = c9964t932.m;
                            c8936q93.e = GURL.a(c9964t932.q);
                            return true;
                        } catch (IOException e) {
                            if (e.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e.getCause());
                            }
                            throw new C1127Ir1(e);
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (C6827k14 e3) {
                        throw e3.a();
                    }
                } catch (C1127Ir1 e4) {
                    if (e4.g) {
                        throw new C1127Ir1(e4);
                    }
                    throw e4;
                }
            } catch (C1127Ir1 e5) {
                AbstractC4851eH1.a("SPTD", String.format(Locale.US, "There was a problem deserializing ShoppingPersistedTabData. Details: %s", e5.getMessage()), new Object[0]);
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC4368cs2
    public final long h() {
        boolean a = AbstractC8293oI0.a();
        long j = v;
        if (!a) {
            return (int) j;
        }
        int i = (int) j;
        C7928nE c7928nE = UN.a;
        return N.M37SqSAy("CommercePriceTracking", "price_tracking_time_to_live_ms", i);
    }

    @Override // defpackage.AbstractC4368cs2
    public final boolean j() {
        if (this.p.e == null || this.a.getUrl().equals(this.p.e)) {
            return super.j();
        }
        return true;
    }

    @Override // defpackage.AbstractC4368cs2, defpackage.J44
    public final void destroy() {
        this.a.w(this.t);
        HashMap hashMap = this.r;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C8395oc0) it.next()).a();
        }
        hashMap.clear();
        this.q.a = null;
        this.q = null;
        super.destroy();
    }

    public static boolean r() {
        if (!AbstractC8293oI0.a()) {
            return false;
        }
        C7928nE c7928nE = UN.a;
        return N.M6bsIDpc("CommercePriceTracking", "price_tracking_with_optimization_guide", false);
    }

    public static void t() {
        ArrayDeque arrayDeque = y;
        if (arrayDeque.isEmpty()) {
            z = true;
            return;
        }
        final C9278r93 c9278r93 = (C9278r93) arrayDeque.poll();
        if (c9278r93.a.isDestroyed()) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: d93
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C10307u93.u;
                    C9278r93.this.b.onResult(null);
                }
            });
            t();
        } else {
            p(new Callback() { // from class: e93
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i = C10307u93.u;
                    C9278r93.this.b.onResult((C10307u93) obj);
                    C10307u93.t();
                }
            }, c9278r93.a);
        }
    }
}
