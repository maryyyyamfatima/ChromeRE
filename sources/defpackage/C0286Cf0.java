package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286Cf0 implements InterfaceC9989tE2 {
    public final C0156Bf0 a;
    public final C0676Ff0 b;
    public final C0416Df0 c;
    public final int d;

    public C0286Cf0(C0156Bf0 c0156Bf0, C0676Ff0 c0676Ff0, C0416Df0 c0416Df0, int i) {
        this.a = c0156Bf0;
        this.b = c0676Ff0;
        this.c = c0416Df0;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [tS] */
    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        C0156Bf0 c0156Bf0 = this.a;
        C0416Df0 c0416Df0 = this.c;
        C0676Ff0 c0676Ff0 = this.b;
        int i = this.d;
        switch (i) {
            case 0:
                InterfaceC9790sg0 interfaceC9790sg0 = (InterfaceC9790sg0) c0676Ff0.e.get();
                c0416Df0.getClass();
                C12261zr4 a = AbstractC11575xr4.a(new C0928Hd2(), "OpenAutoplaySettingsCommandHandler");
                C12261zr4 a2 = AbstractC11575xr4.a(new C2877Wd2(), "OpenUrlCommandHandler");
                C12261zr4 a3 = AbstractC11575xr4.a(new C10609v24(), "UpdateUserProfileCommandHandler");
                C12261zr4 a4 = AbstractC11575xr4.a(new C4284ce2((C8387oa4) c0416Df0.h.get()), "OpenVideoCommandHandler");
                C12261zr4 a5 = AbstractC11575xr4.a(new C4181cK3(), "ThereAndBackAgainCommandHandler");
                C12261zr4 a6 = AbstractC11575xr4.a(new C1318Kd2(c0416Df0.c(), (Context) c0416Df0.j.get()), "OpenCardMenuCommandHandler");
                C11918yr4 c = c0416Df0.c();
                C0156Bf0 c0156Bf02 = c0416Df0.b;
                AbstractC1472Li1 t = AbstractC1472Li1.t(a, a2, a3, a4, a5, a6, AbstractC11575xr4.a(new C7325lV(), "CloseMenuCommandHandler"), AbstractC11575xr4.a(new A33(), "SendFeedbackCommandHandler"), AbstractC11575xr4.a(new CN2(c), "ReportContentCommandHandler"), AbstractC11575xr4.a(new C11902yp0(), "DismissDialogCommandHandler"), AbstractC11575xr4.a(new C10873vp0(c0416Df0.c()), "DismissCommandHandler"), AbstractC11575xr4.a(new C10086tY(), "CommitDismissCommandHandler"), AbstractC11575xr4.a(new K04(), "UndoDismissCommandHandler"), AbstractC11575xr4.a(new P93(c0416Df0.c()), "ShowSnackbarCommandHandler"), AbstractC11575xr4.a(new C8632pH1(), "LogGraftCommandHandler"), AbstractC11575xr4.a(new H93((InterfaceScheduledExecutorServiceC4493dE1) c0156Bf02.q.get()), "ShowShareSheetCommandHandler"), AbstractC11575xr4.a(new IU3(), "TrackNoticeCommandHandler"), AbstractC11575xr4.a(new C10395uR0(c0416Df0.c()), "FollowWebFeedCommandHandler"), AbstractC11575xr4.a(new Z04(c0416Df0.c()), "UnfollowWebFeedCommandHandler"), AbstractC11575xr4.a(new CU3(), "TrackInfoCardCommandHandler"), AbstractC11575xr4.a(new C10689vH1(), "LogInteractionCommandHandler"), AbstractC11575xr4.a(new C1516Lr1(), "InvalidateCacheCommandHandler"));
                InterfaceC2376Sh1 interfaceC2376Sh1 = (InterfaceC2376Sh1) c0416Df0.n.get();
                XJ3 xj3 = (XJ3) c0416Df0.o.get();
                InterfaceC0315Cl interfaceC0315Cl = (InterfaceC0315Cl) c0416Df0.p.get();
                C10066tU c10066tU = new C10066tU((C9596s52) c0156Bf02.s.get(), (Tr4) c0416Df0.c.c.get());
                int i2 = Xr4.a;
                return new C0936Hf0(c0156Bf0, c0676Ff0, c0416Df0, new C10886vr1(), interfaceC0315Cl, interfaceC9790sg0, xj3, EnumC6432is4.o, interfaceC2376Sh1, t, AbstractC1472Li1.o(AbstractC1472Li1.r(new Yr4(c10066tU), new Yr4(new C7606mI1(c10066tU)))), (Mr4) c0156Bf0.u.get());
            case 1:
                return new C8387oa4((Q94) c0416Df0.d.get(), (UV3) c0416Df0.e.get(), c0416Df0.a, C0416Df0.a(c0416Df0), new QA1(), new Ia4(c0416Df0.g));
            case 2:
                return new R94((WB2) c0156Bf0.b.a, c0416Df0.a);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new UV3();
            case 4:
                return new Ss4((C6442iu3) c0156Bf0.g.get(), (WB2) c0156Bf0.b.a, c0416Df0.a);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return new C10101ta4(c0156Bf0.g);
            case 6:
                return new C1940Oy0((Context) c0416Df0.j.get(), (C0936Hf0) c0416Df0.i.get(), (C2931Wo1) c0416Df0.l.get());
            case 7:
                return ((TK0) c0416Df0.a).g;
            case 8:
                final BT bt = (BT) c0416Df0.k.get();
                return new C2931Wo1(new InterfaceC9989tE2() { // from class: tS
                    @Override // defpackage.InterfaceC9989tE2
                    public final Object get() {
                        return BT.this;
                    }
                });
            case 9:
                return new BT((Context) c0416Df0.j.get(), (WB2) c0156Bf0.b.a, (InterfaceScheduledExecutorServiceC4493dE1) c0156Bf0.c.get());
            case 10:
                return new C12114zS();
            case 11:
                final InterfaceC2938Wp3 interfaceC2938Wp3 = c0416Df0.a;
                return new C2650Uk0(((TK0) interfaceC2938Wp3).g, (InterfaceC9790sg0) c0676Ff0.e.get(), new C3242Yy2(new InterfaceC6808jy2() { // from class: xS
                    @Override // defpackage.InterfaceC6808jy2
                    public final boolean apply(Object obj) {
                        return ((TK0) InterfaceC2938Wp3.this).h;
                    }
                }));
            case 12:
                final Context context = (Context) c0416Df0.j.get();
                final InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1 = (InterfaceScheduledExecutorServiceC4493dE1) c0156Bf0.c.get();
                final ES es = new ES();
                return new InterfaceC0315Cl() { // from class: uS
                    @Override // defpackage.InterfaceC0315Cl
                    public final RD1 a(String str) {
                        return ((D) interfaceScheduledExecutorServiceC4493dE1).submit(new Callable(context, str) { // from class: sS
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ES.this.getClass();
                                return null;
                            }
                        });
                    }
                };
            case 13:
                return new Zb4((C3587ac4) c0416Df0.q.get(), new Fe4(), (C6442iu3) c0156Bf0.g.get());
            case 14:
                return new C3587ac4((WB2) c0156Bf0.b.a);
            case 15:
                return new C6922kJ0((C6622jS) c0156Bf0.w.get(), (C12114zS) c0416Df0.n.get());
            case 16:
                return new C4708ds(new C4022bs(c0416Df0.b.b, c0416Df0.d, c0416Df0.t));
            case 17:
                return new Xe4(c0416Df0.a);
            case 18:
                return new C3112Xy2();
            default:
                throw new AssertionError(i);
        }
    }
}
