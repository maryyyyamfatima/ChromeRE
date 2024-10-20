package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10995wA implements InterfaceC1528Lt3, InterfaceC5298fb3, InterfaceC9979tC2, F4 {
    public final Context a;
    public final SigninManager g;
    public final AccountManagerFacade h;
    public final Runnable i;
    public final C10322uC2 j;
    public final C0009Ab3 k;
    public int l = 0;
    public final AbstractC1658Mt3 m;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    public C10995wA(Context context, RunnableC3374Zz runnableC3374Zz) {
        this.a = context;
        this.i = runnableC3374Zz;
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        this.m = b;
        if (b != null) {
            b.a(this);
        }
        SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        this.g = a;
        a.b(this);
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        this.h = accountManagerFacadeProvider;
        if (C0009Ab3.a(9)) {
            C10322uC2 b2 = C10322uC2.b(context);
            this.j = b2;
            b2.a(this);
            this.k = new C0009Ab3(9, C3083Xs3.a());
            accountManagerFacadeProvider.b(this);
        } else {
            this.j = null;
            this.k = null;
        }
        d();
    }

    public final void c() {
        ViewTreeObserverOnPreDrawListenerC2771Vi1 viewTreeObserverOnPreDrawListenerC2771Vi1;
        C0009Ab3 c0009Ab3 = this.k;
        if (c0009Ab3 != null && (viewTreeObserverOnPreDrawListenerC2771Vi1 = c0009Ab3.b) != null) {
            viewTreeObserverOnPreDrawListenerC2771Vi1.a(null);
            c0009Ab3.b = null;
        }
        this.i.run();
    }

    public final int a() {
        AbstractC1658Mt3 abstractC1658Mt3 = this.m;
        if (abstractC1658Mt3 == null) {
            return 0;
        }
        SigninManager signinManager = this.g;
        if (signinManager.p().c(1)) {
            return ((!abstractC1658Mt3.j() || abstractC1658Mt3.e().isEmpty()) && (O83.a.f(0, "enhanced_bookmark_signin_promo_show_count") < 10)) ? 3 : 0;
        }
        if (signinManager.n() && C0009Ab3.a(9)) {
            return signinManager.p().c(0) ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0012, code lost:            if (r0 != 2) goto L13;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.a()
            int r1 = r4.l
            if (r0 != r1) goto L9
            return
        L9:
            r2 = 3
            if (r1 == 0) goto Le
            if (r1 != r2) goto L15
        Le:
            r1 = 1
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 != r3) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            Ab3 r3 = r4.k
            if (r3 == 0) goto L1f
            if (r1 == 0) goto L1f
            r3.d()
        L1f:
            if (r0 != r2) goto L28
            Q83 r1 = defpackage.O83.a
            java.lang.String r2 = "enhanced_bookmark_signin_promo_show_count"
            r1.d(r2)
        L28:
            r4.l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10995wA.d():void");
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        d();
        c();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        d();
        c();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        d();
        c();
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        c();
    }

    @Override // defpackage.F4
    public final void E() {
        c();
    }
}
