package defpackage;

import J.N;
import java.io.IOException;
import java.util.Locale;
import org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m93 */
/* loaded from: classes.dex */
public final class C7562m93 extends BA0 {
    public final /* synthetic */ C10307u93 a;

    @Override // defpackage.BA0
    public final void t0(final TabImpl tabImpl, final NavigationHandle navigationHandle) {
        if (navigationHandle.a && !navigationHandle.c && navigationHandle.g) {
            boolean z = (navigationHandle.d & 33554432) != 0;
            boolean z2 = navigationHandle.k;
            final C10307u93 c10307u93 = this.a;
            if (z2 || z) {
                c10307u93.u();
            }
            if (C10307u93.r()) {
                c10307u93.getClass();
                if (navigationHandle.a) {
                    OptimizationGuideBridge a = AbstractC7906n93.a.a();
                    OptimizationGuideBridge.OptimizationGuideCallback optimizationGuideCallback = new OptimizationGuideBridge.OptimizationGuideCallback() { // from class: j93
                        public final /* synthetic */ Runnable c = null;

                        @Override // org.chromium.chrome.browser.optimization_guide.OptimizationGuideBridge.OptimizationGuideCallback
                        public final void a(int i, DY dy) {
                            int i2 = C10307u93.u;
                            C10307u93 c10307u932 = C10307u93.this;
                            c10307u932.getClass();
                            Tab tab = tabImpl;
                            boolean isInitialized = tab.isInitialized();
                            Runnable runnable = this.c;
                            if (!isInitialized) {
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            if (!tab.getUrl().equals(navigationHandle.e) || i != 1) {
                                if (runnable != null) {
                                    runnable.run();
                                }
                                c10307u932.q.a(System.currentTimeMillis() - C1695Nb0.m(tab).s, "NavigationComplete");
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
                                                c10307u932.s(tab, c0778Fz22, null);
                                                c10307u932.i = System.currentTimeMillis();
                                                c10307u932.q.a(System.currentTimeMillis() - C1695Nb0.m(tab).s, "NavigationComplete");
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
                                    throw e5;
                                }
                            } catch (C1127Ir1 e6) {
                                AbstractC4851eH1.d("SPTD", String.format(Locale.US, "There was a problem parsing PriceTrackingDataProto. Details %s.", e6), new Object[0]);
                            }
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    };
                    long j = a.a;
                    if (j == 0) {
                        optimizationGuideCallback.a(0, null);
                    } else {
                        N.MiCQ6k4j(j, navigationHandle.e, 18, optimizationGuideCallback);
                    }
                }
            }
        }
    }

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.c || tabImpl.getUrl().equals(navigationHandle.e)) {
            return;
        }
        this.a.u();
    }

    public C7562m93(C10307u93 c10307u93) {
        this.a = c10307u93;
    }
}
