package defpackage;

import J.N;
import org.chromium.components.policy.PolicyService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5429fx2 implements InterfaceC6459ix2 {
    public final /* synthetic */ PolicyService a;
    public final /* synthetic */ C5773gx2 b;

    @Override // defpackage.InterfaceC6459ix2
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC6459ix2
    public final void b() {
        C5773gx2 c5773gx2 = this.b;
        InterfaceC6459ix2 interfaceC6459ix2 = c5773gx2.i;
        PolicyService policyService = this.a;
        C12157za2 c12157za2 = policyService.b;
        c12157za2.d(interfaceC6459ix2);
        if (c12157za2.isEmpty()) {
            N.MU0pXsSP(policyService.a, policyService);
        }
        c5773gx2.i = null;
        c5773gx2.b();
    }

    public C5429fx2(C5773gx2 c5773gx2, PolicyService policyService) {
        this.b = c5773gx2;
        this.a = policyService;
    }
}
