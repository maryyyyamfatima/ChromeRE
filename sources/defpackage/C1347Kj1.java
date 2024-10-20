package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kj1 */
/* loaded from: classes.dex */
public final class C1347Kj1 implements InterfaceC6377ij3, WU2 {
    public final C0697Fj1 a = new C0697Fj1(this);
    public final InterfaceC10590uz3 g;
    public final C2516Tj1 h;
    public final boolean i;
    public final C1217Jj1 j;
    public final Runnable k;
    public AbstractC2126Qj1 l;
    public InterfaceC1422Ky1 m;
    public Profile n;
    public boolean o;

    public C1347Kj1(InterfaceC10590uz3 interfaceC10590uz3, I5 i5, InterfaceC0408Dd2 interfaceC0408Dd2, InterfaceC7697ma2 interfaceC7697ma2, C2516Tj1 c2516Tj1) {
        Runnable runnableC12082zL2;
        C0827Gj1 c0827Gj1 = new C0827Gj1(this);
        C0957Hj1 c0957Hj1 = new C0957Hj1(this);
        C1087Ij1 c1087Ij1 = new C1087Ij1(this);
        C4496dF c4496dF = new C4496dF();
        this.j = new C1217Jj1(this);
        this.g = interfaceC10590uz3;
        ((C8385oa2) interfaceC7697ma2).m(c1087Ij1);
        this.h = c2516Tj1;
        boolean z = c2516Tj1.f;
        this.i = z;
        if (!z) {
            runnableC12082zL2 = new RunnableC12082zL2();
        } else if (z) {
            runnableC12082zL2 = new RunnableC2386Sj1(c2516Tj1);
        } else {
            runnableC12082zL2 = new RunnableC12082zL2();
        }
        this.k = runnableC12082zL2;
        interfaceC0408Dd2.j(c4496dF.b(new Callback() { // from class: Ej1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C1347Kj1 c1347Kj1 = C1347Kj1.this;
                c1347Kj1.m = (InterfaceC1422Ky1) obj;
                c1347Kj1.d();
            }
        }));
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.h = this;
        abstractC11276wz3.g.a(c0827Gj1);
        abstractC11276wz3.c(c0957Hj1);
        i5.b(this);
        if (abstractC11276wz3.i) {
            b();
        }
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        d();
    }

    @Override // defpackage.WU2
    public final void G(Bundle bundle) {
        boolean z = ((AbstractC11276wz3) this.g).j(true).getCount() > 0;
        this.o = z;
        if (z) {
            bundle.putBoolean("incognitoReauthPending", z);
        }
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        this.o = ((AbstractC11276wz3) this.g).j(true).getCount() > 0;
    }

    public final void d() {
        Profile profile;
        AbstractC2126Qj1 c8952qC3;
        Runnable runnableC12082zL2;
        Runnable runnableC12082zL22;
        if (this.l != null) {
            return;
        }
        InterfaceC1422Ky1 interfaceC1422Ky1 = this.m;
        boolean z = this.i;
        if (!(interfaceC1422Ky1 == null && z) && this.o && ((AbstractC11276wz3) this.g).o() && (profile = this.n) != null && C3166Yj1.a(profile)) {
            boolean z2 = (z && ((C9897sy1) this.m).G(2)) ? false : true;
            C0697Fj1 c0697Fj1 = this.a;
            C2516Tj1 c2516Tj1 = this.h;
            if (z2) {
                Context context = c2516Tj1.a;
                C3166Yj1 c3166Yj1 = c2516Tj1.d;
                if (c2516Tj1.f) {
                    runnableC12082zL22 = new RunnableC2386Sj1(c2516Tj1);
                } else {
                    runnableC12082zL22 = new RunnableC12082zL2();
                }
                c8952qC3 = new KU0(context, c3166Yj1, c0697Fj1, runnableC12082zL22, c2516Tj1.c, new C3976bk1(context, new RunnableC12210zj1(), c2516Tj1.e));
            } else {
                Context context2 = c2516Tj1.a;
                C3166Yj1 c3166Yj12 = c2516Tj1.d;
                if (c2516Tj1.f) {
                    runnableC12082zL2 = new RunnableC2386Sj1(c2516Tj1);
                } else {
                    runnableC12082zL2 = new RunnableC12082zL2();
                }
                c8952qC3 = new C8952qC3(context2, c3166Yj12, c0697Fj1, runnableC12082zL2, c2516Tj1.h, c2516Tj1.g);
            }
            this.l = c8952qC3;
            c8952qC3.b();
            this.j.a = z2;
        }
    }

    public final void a(int i) {
        AbstractC2126Qj1 abstractC2126Qj1 = this.l;
        if (abstractC2126Qj1 != null) {
            this.j.a = false;
            abstractC2126Qj1.hide(i);
            this.l = null;
        }
    }

    public final void b() {
        boolean z = true;
        TabModel j = ((AbstractC11276wz3) this.g).j(true);
        int i = 0;
        while (true) {
            if (i >= j.getCount()) {
                z = false;
                break;
            } else if (C1695Nb0.m(j.getTabAt(i)).x.intValue() == 3) {
                break;
            } else {
                i++;
            }
        }
        this.o = z;
        d();
    }
}
