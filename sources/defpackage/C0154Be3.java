package defpackage;

import J.N;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.enterprise.util.EnterpriseInfo;
import org.chromium.components.policy.PolicyService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Be3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154Be3 implements InterfaceC0408Dd2 {
    public final C4496dF a;
    public final C0538Ed2 g;
    public final long h;
    public final InterfaceC0024Ae3 i;
    public C5773gx2 j;
    public Boolean k;
    public Boolean l;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    public C0154Be3(C5578gP0 c5578gP0, C0538Ed2 c0538Ed2, EnterpriseInfo enterpriseInfo) {
        this.a = new C4496dF();
        this.g = new C0538Ed2();
        this.h = SystemClock.elapsedRealtime();
        this.i = null;
        C5773gx2 c5773gx2 = new C5773gx2(c5578gP0, c0538Ed2);
        this.j = c5773gx2;
        c(enterpriseInfo, c5773gx2);
    }

    public C0154Be3(C5773gx2 c5773gx2, EnterpriseInfo enterpriseInfo, InterfaceC0024Ae3 interfaceC0024Ae3) {
        this.a = new C4496dF();
        this.g = new C0538Ed2();
        this.h = SystemClock.elapsedRealtime();
        this.i = interfaceC0024Ae3;
        c(enterpriseInfo, c5773gx2);
    }

    public final void c(EnterpriseInfo enterpriseInfo, C5773gx2 c5773gx2) {
        Callback callback = new Callback() { // from class: ye3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C0154Be3.this.e(((Boolean) obj).booleanValue());
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        };
        C4496dF c4496dF = this.a;
        Boolean j = c5773gx2.j(c4496dF.b(callback));
        if (j != null) {
            e(j.booleanValue());
        }
        if (this.g.get() == null) {
            enterpriseInfo.a(c4496dF.b(new Callback() { // from class: ze3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    FB0 fb0 = (FB0) obj;
                    C0154Be3 c0154Be3 = C0154Be3.this;
                    if (c0154Be3.l != null) {
                        return;
                    }
                    c0154Be3.l = Boolean.valueOf(fb0 != null && fb0.a);
                    InterfaceC0024Ae3 interfaceC0024Ae3 = c0154Be3.i;
                    if (interfaceC0024Ae3 != null) {
                        EI2.n(SystemClock.elapsedRealtime() - c0154Be3.h, interfaceC0024Ae3.b());
                    }
                    c0154Be3.f();
                }
            }));
        }
    }

    public final void a() {
        this.a.a();
        C5773gx2 c5773gx2 = this.j;
        if (c5773gx2 != null) {
            c5773gx2.a.a();
            if (c5773gx2.i != null) {
                PolicyService policyService = (PolicyService) c5773gx2.h.get();
                InterfaceC6459ix2 interfaceC6459ix2 = c5773gx2.i;
                C12157za2 c12157za2 = policyService.b;
                c12157za2.d(interfaceC6459ix2);
                if (c12157za2.isEmpty()) {
                    N.MU0pXsSP(policyService.a, policyService);
                }
                c5773gx2.i = null;
            }
            this.j = null;
        }
    }

    @Override // defpackage.InterfaceC0408Dd2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Boolean j(Callback callback) {
        return (Boolean) this.g.j(this.a.b(callback));
    }

    @Override // defpackage.InterfaceC0079Ap3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean get() {
        return (Boolean) this.g.get();
    }

    public final void e(boolean z) {
        if (this.k != null) {
            return;
        }
        if (!z) {
            this.k = Boolean.TRUE;
        } else {
            this.k = Boolean.valueOf(N.MJs$aI$X());
            InterfaceC0024Ae3 interfaceC0024Ae3 = this.i;
            if (interfaceC0024Ae3 != null) {
                EI2.n(SystemClock.elapsedRealtime() - this.h, interfaceC0024Ae3.a());
            }
        }
        f();
    }

    public final void f() {
        C0538Ed2 c0538Ed2 = this.g;
        if (c0538Ed2.get() != null) {
            return;
        }
        Boolean bool = this.l;
        boolean z = (bool == null || bool.booleanValue()) ? false : true;
        Boolean bool2 = this.k;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (!(this.l == null || this.k == null)) {
            AbstractC4851eH1.d("SkipTosPolicy", "Supplier available, <TosDialogEnabled>=" + this.k + " <IsDeviceOwned>=" + this.l, new Object[0]);
            c0538Ed2.a(Boolean.valueOf(!this.k.booleanValue() && this.l.booleanValue()));
            return;
        }
        if (z2 || z) {
            AbstractC4851eH1.d("SkipTosPolicy", "Supplier early out, <confirmedTosDialogEnabled>=" + z2 + " <confirmedDeviceNotOwned>=" + z, new Object[0]);
            c0538Ed2.a(Boolean.FALSE);
        }
    }
}
