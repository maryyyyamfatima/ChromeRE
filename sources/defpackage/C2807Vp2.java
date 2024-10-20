package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vp2 */
/* loaded from: classes.dex */
public final class C2807Vp2 implements Callback {
    public final /* synthetic */ ViewOnClickListenerC5731gq2 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C2807Vp2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2) {
        this.a = viewOnClickListenerC5731gq2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C4693dp2 c4693dp2 = (C4693dp2) obj;
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.a;
        viewOnClickListenerC5731gq2.K = false;
        viewOnClickListenerC5731gq2.m(c4693dp2.a);
        InterfaceC3669aq2 interfaceC3669aq2 = viewOnClickListenerC5731gq2.h;
        if (((C1642Mq2) interfaceC3669aq2).u()) {
            viewOnClickListenerC5731gq2.o(1, c4693dp2.b);
            viewOnClickListenerC5731gq2.o(2, c4693dp2.c);
        }
        if (((C1642Mq2) interfaceC3669aq2).t()) {
            viewOnClickListenerC5731gq2.o(3, c4693dp2.d);
        }
        viewOnClickListenerC5731gq2.o(4, c4693dp2.e);
        C8545p13 c8545p13 = viewOnClickListenerC5731gq2.P;
        if (c8545p13 == null || c8545p13.c() != null) {
            viewOnClickListenerC5731gq2.d(null);
        } else {
            viewOnClickListenerC5731gq2.d(viewOnClickListenerC5731gq2.B);
        }
        viewOnClickListenerC5731gq2.n();
    }
}
