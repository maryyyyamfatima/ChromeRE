package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.policy.PolicyService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5773gx2 implements InterfaceC0408Dd2 {
    public final C4496dF a;
    public final C0538Ed2 g;
    public final InterfaceC0408Dd2 h;
    public InterfaceC6459ix2 i;
    public Boolean j;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    public C5773gx2(C5578gP0 c5578gP0, C0538Ed2 c0538Ed2) {
        C4496dF c4496dF = new C4496dF();
        this.a = c4496dF;
        this.g = new C0538Ed2();
        this.h = c0538Ed2;
        C3809bF b = c4496dF.b(new Callback() { // from class: dx2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
                C5773gx2 c5773gx2 = C5773gx2.this;
                c5773gx2.j = valueOf;
                c5773gx2.b();
            }
        });
        c5578gP0.getClass();
        Object obj = ThreadUtils.a;
        if (c5578gP0.a) {
            b.onResult(Boolean.valueOf(c5578gP0.b));
        } else {
            c5578gP0.d.add(b);
        }
        c0538Ed2.j(c4496dF.b(new Callback() { // from class: ex2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                PolicyService policyService = (PolicyService) obj2;
                C5773gx2 c5773gx2 = C5773gx2.this;
                if (c5773gx2.g.get() != null) {
                    return;
                }
                if (N.MCCtS0px(policyService.a, policyService)) {
                    c5773gx2.b();
                    return;
                }
                C5429fx2 c5429fx2 = new C5429fx2(c5773gx2, policyService);
                c5773gx2.i = c5429fx2;
                C12157za2 c12157za2 = policyService.b;
                if (c12157za2.isEmpty()) {
                    N.M4YsjnbO(policyService.a, policyService);
                }
                c12157za2.a(c5429fx2);
            }
        }));
    }

    @Override // defpackage.InterfaceC0408Dd2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean j(Callback callback) {
        return (Boolean) this.g.j(this.a.b(callback));
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        return (Boolean) this.g.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:            if (J.N.MCCtS0px(r4.a, r4) != false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            Ed2 r0 = r7.g
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.Boolean r1 = r7.j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            Dd2 r4 = r7.h
            java.lang.Object r5 = r4.get()
            if (r5 == 0) goto L2f
            java.lang.Object r4 = r4.get()
            org.chromium.components.policy.PolicyService r4 = (org.chromium.components.policy.PolicyService) r4
            long r5 = r4.a
            boolean r4 = J.N.MCCtS0px(r5, r4)
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r1 == 0) goto L38
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r1)
            goto L3f
        L38:
            if (r2 == 0) goto L3f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.a(r1)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5773gx2.b():void");
    }
}
