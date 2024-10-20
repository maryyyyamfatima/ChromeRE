package defpackage;

import J.N;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader.CountingResourceLoaderDelegate;
import com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader.FailingControllerModuleLoader;
import com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader.FailingPublicKeyVerifierProvider;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Af0 */
/* loaded from: classes.dex */
public final class C0026Af0 implements InterfaceC9989tE2 {
    public final C0156Bf0 a;
    public final int b;

    public C0026Af0(C0156Bf0 c0156Bf0, int i) {
        this.a = c0156Bf0;
        this.b = i;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        final InterfaceExecutorServiceC4149cE1 sy1;
        int i = this.b;
        C5785h c5785h = C5785h.a;
        C10212tt1 c10212tt1 = C10212tt1.a;
        switch (i) {
            case 0:
                Context a = this.a.a();
                InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1 = (InterfaceScheduledExecutorServiceC4493dE1) this.a.c.get();
                WB2 wb2 = (WB2) this.a.b.a;
                Qr4 qr4 = new Qr4(a, interfaceScheduledExecutorServiceC4493dE1);
                final KH kh = ((NJ0) wb2).d;
                if (kh != null) {
                    AbstractC3733b12.e = new InterfaceC8940qA1() { // from class: pS
                        @Override // defpackage.InterfaceC8940qA1
                        public final void a(String str) {
                            KH.this.getClass();
                            System.load(BundleUtils.getNativeLibraryPath(str, "feedv2"));
                        }
                    };
                }
                return qr4;
            case 1:
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
                return newScheduledThreadPool instanceof InterfaceScheduledExecutorServiceC4493dE1 ? (InterfaceScheduledExecutorServiceC4493dE1) newScheduledThreadPool : new SY1(newScheduledThreadPool);
            case 2:
                return ((NJ0) ((WB2) this.a.b.a)).b;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new AZ0((WB2) this.a.b.a);
            case 4:
                C0156Bf0 c0156Bf0 = this.a;
                InterfaceC9989tE2 interfaceC9989tE2 = c0156Bf0.g;
                C0327Cn1 c0327Cn1 = c0156Bf0.h;
                C0327Cn1 c0327Cn12 = c0156Bf0.i;
                C0327Cn1 c0327Cn13 = Y43.a;
                InterfaceC9989tE2 interfaceC9989tE22 = c0156Bf0.k;
                C0327Cn1 c0327Cn14 = c0156Bf0.l;
                AbstractC3561aY0.a(1, interfaceC9989tE2);
                AbstractC3561aY0.a(2, c0327Cn1);
                AbstractC3561aY0.a(3, c0327Cn12);
                AbstractC3561aY0.a(4, c0327Cn13);
                AbstractC3561aY0.a(5, interfaceC9989tE22);
                AbstractC3561aY0.a(6, c0327Cn14);
                InterfaceC3241Yy1 a2 = C2680Uq0.a(this.a.n);
                C10180to a3 = C10523uo.a();
                a3.b = "SingletonLogger";
                C10523uo a4 = a3.a();
                C6442iu3 c6442iu3 = (C6442iu3) interfaceC9989tE2.get();
                AbstractC3561aY0.a(1, c6442iu3);
                AbstractC9095qe2 abstractC9095qe2 = (AbstractC9095qe2) c0327Cn1.a;
                AbstractC3561aY0.a(2, abstractC9095qe2);
                AbstractC9095qe2 abstractC9095qe22 = (AbstractC9095qe2) c0327Cn12.a;
                AbstractC3561aY0.a(3, abstractC9095qe22);
                Set set = (Set) c0327Cn13.a;
                AbstractC3561aY0.a(4, set);
                InterfaceC6704jh interfaceC6704jh = (InterfaceC6704jh) interfaceC9989tE22.get();
                AbstractC3561aY0.a(5, interfaceC6704jh);
                AbstractC9095qe2 abstractC9095qe23 = (AbstractC9095qe2) c0327Cn14.a;
                AbstractC3561aY0.a(6, abstractC9095qe23);
                AbstractC3561aY0.a(7, a2);
                return new ZX0(c6442iu3, abstractC9095qe2, abstractC9095qe22, set, interfaceC6704jh, abstractC9095qe23, a2, a4);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return new C6442iu3();
            case 6:
                WX0 wx0 = (WX0) this.a.j.get();
                ((WB2) this.a.b.a).getClass();
                return new C3905bY0(wx0, new C3242Yy2(1398), (C6442iu3) this.a.g.get(), new RU2((C6442iu3) this.a.g.get()));
            case 7:
                return new WX0((C6442iu3) this.a.g.get(), (AbstractC9095qe2) this.a.h.a);
            case 8:
                byte b = (byte) 1;
                C3242Yy2 c3242Yy2 = new C3242Yy2(new C6966kS((WB2) this.a.b.a));
                C3242Yy2 c3242Yy22 = new C3242Yy2(4);
                if (b == 1) {
                    return new C5011el0(new C1889Oo("CHROME_DISCOVER_ANDROID", c3242Yy2, c3242Yy22, false), C2680Uq0.a(this.a.m), (Set) Y43.a.a);
                }
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" sendAsSemanticEvent");
                }
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
            case 9:
                Context a5 = this.a.a();
                WB2 wb22 = (WB2) this.a.b.a;
                C3588ad c3588ad = IT.m;
                InterfaceC0209Bp3 interfaceC0209Bp3 = new InterfaceC0209Bp3() { // from class: ET
                    @Override // defpackage.InterfaceC0209Bp3
                    public final Object get() {
                        return Boolean.FALSE;
                    }
                };
                EnumSet enumSet = EnumC1717Nf2.k;
                IT.b(enumSet);
                enumSet.contains(EnumC1717Nf2.h);
                IT.b(enumSet);
                IT it = new IT(a5, "CHROME_DISCOVER_ANDROID", null, enumSet, new OT(a5, interfaceC0209Bp3), new JH1(a5));
                it.h.add(0, new C6966kS(wb22));
                return it;
            case 10:
                C0156Bf0 c0156Bf02 = this.a;
                c0156Bf02.getClass();
                C0327Cn1 c0327Cn15 = NL1.a;
                C0026Af0 c0026Af0 = c0156Bf02.p;
                C0327Cn1 c0327Cn16 = Y43.a;
                AQ0.a(1, c0327Cn15);
                AQ0.a(2, c0026Af0);
                AQ0.a(3, c0327Cn16);
                return new QG3();
            case 11:
                return AbstractC0952Hi1.e(3, new C3279Zg());
            case 12:
                InterfaceC9989tE2 interfaceC9989tE23 = this.a.q;
                AbstractC0087Ar1.e(interfaceC9989tE23, "executorProvider");
                Object obj = interfaceC9989tE23.get();
                AbstractC0087Ar1.d(obj, "executorProvider.get()");
                E90 a6 = AbstractC12019z90.a(new C9301rE0((ExecutorService) obj), new C11905yp3(null));
                if (a6.b(c10212tt1) == null) {
                    a6 = a6.r(new C11584xt1(null));
                }
                return new Q60(a6);
            case 13:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                final InterfaceScheduledExecutorServiceC4493dE1 sy12 = newSingleThreadScheduledExecutor instanceof InterfaceScheduledExecutorServiceC4493dE1 ? (InterfaceScheduledExecutorServiceC4493dE1) newSingleThreadScheduledExecutor : new SY1(newSingleThreadScheduledExecutor);
                MR2.a = new DV0() { // from class: qS
                    @Override // defpackage.DV0
                    public final Object apply(Object obj2) {
                        AbstractC10422uW2 abstractC10422uW2 = NW2.a;
                        return new AE0(InterfaceScheduledExecutorServiceC4493dE1.this);
                    }
                };
                MR2.b = new DV0() { // from class: rS
                    @Override // defpackage.DV0
                    public final Object apply(Object obj2) {
                        AbstractC10422uW2 abstractC10422uW2 = NW2.a;
                        return new AE0(InterfaceScheduledExecutorServiceC4493dE1.this);
                    }
                };
                return sy12;
            case 14:
                return new C9596s52();
            case 15:
                InterfaceC9989tE2 interfaceC9989tE24 = this.a.c;
                AbstractC0087Ar1.e(interfaceC9989tE24, "executorProvider");
                Object obj2 = interfaceC9989tE24.get();
                AbstractC0087Ar1.d(obj2, "executorProvider.get()");
                E90 a7 = AbstractC12019z90.a(new C9301rE0((ExecutorService) obj2), new C11905yp3(null));
                if (a7.b(c10212tt1) == null) {
                    a7 = a7.r(new C11584xt1(null));
                }
                return new Q60(a7);
            case 16:
                final WB2 wb23 = (WB2) this.a.b.a;
                Objects.requireNonNull(wb23);
                return new Mr4() { // from class: mS
                    @Override // defpackage.Mr4
                    public final boolean a() {
                        NJ0 nj0 = (NJ0) WB2.this;
                        nj0.getClass();
                        C7928nE c7928nE = UN.a;
                        if (N.M09VlOh_("XsurfaceMetricsReporting")) {
                            nj0.e.getClass();
                            if (N.Mvhrh1Yn()) {
                                return true;
                            }
                        }
                        return false;
                    }
                };
            case 17:
                final WB2 wb24 = (WB2) this.a.b.a;
                return new Executor() { // from class: lS
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        ((NJ0) WB2.this).a(runnable, 0L);
                    }
                };
            case 18:
                return new C6622jS((ZX0) this.a.o.get());
            case 19:
                return new RT();
            case 20:
                return new C4713ds4();
            case 21:
                C0156Bf0 c0156Bf03 = this.a;
                return new C7298lP2(c0156Bf03.B, (InterfaceExecutorServiceC4149cE1) c0156Bf03.C.get());
            case 22:
                FailingControllerModuleLoader failingControllerModuleLoader = new FailingControllerModuleLoader();
                FailingPublicKeyVerifierProvider failingPublicKeyVerifierProvider = new FailingPublicKeyVerifierProvider();
                C0156Bf0 c0156Bf04 = this.a;
                c0156Bf04.getClass();
                CountingResourceLoaderDelegate countingResourceLoaderDelegate = new CountingResourceLoaderDelegate(new Hr4(c0156Bf04.A, (Mr4) c0156Bf04.u.get(), c0156Bf04.a(), null, c5785h));
                AbstractC0901Gy0.a();
                return ResourceLoader.createWithDefaultConfig(failingControllerModuleLoader, failingPublicKeyVerifierProvider, countingResourceLoaderDelegate);
            case 23:
                IT it2 = (IT) this.a.z.get();
                InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE12 = (InterfaceScheduledExecutorServiceC4493dE1) this.a.q.get();
                C6663ja0 c6663ja0 = new C6663ja0(it2, "XUIKIT_COUNTERS", 1024, C9808sj0.a);
                int millis = (int) TimeUnit.MINUTES.toMillis(5L);
                c6663ja0.d.writeLock().lock();
                try {
                    c6663ja0.g = interfaceScheduledExecutorServiceC4493dE12;
                    if (interfaceScheduledExecutorServiceC4493dE12 != null) {
                        c6663ja0.f = millis;
                        c6663ja0.b();
                    } else {
                        c6663ja0.f = 0;
                    }
                    return c6663ja0;
                } finally {
                    c6663ja0.d.writeLock().unlock();
                }
            case 24:
                RT rt = (RT) this.a.x.get();
                Context a8 = this.a.a();
                rt.getClass();
                return new IT(a8, "XUIKIT", null);
            case 25:
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                if (newCachedThreadPool instanceof InterfaceExecutorServiceC4149cE1) {
                    sy1 = (InterfaceExecutorServiceC4149cE1) newCachedThreadPool;
                } else {
                    sy1 = newCachedThreadPool instanceof ScheduledExecutorService ? new SY1((ScheduledExecutorService) newCachedThreadPool) : new QY1(newCachedThreadPool);
                }
                MR2.c = new DV0() { // from class: nS
                    @Override // defpackage.DV0
                    public final Object apply(Object obj3) {
                        AbstractC10422uW2 abstractC10422uW2 = NW2.a;
                        return new AE0(InterfaceExecutorServiceC4149cE1.this);
                    }
                };
                MR2.d = new DV0() { // from class: oS
                    @Override // defpackage.DV0
                    public final Object apply(Object obj3) {
                        AbstractC10422uW2 abstractC10422uW2 = NW2.a;
                        return new AE0(InterfaceExecutorServiceC4149cE1.this);
                    }
                };
                return sy1;
            default:
                throw new AssertionError(this.b);
        }
    }
}
