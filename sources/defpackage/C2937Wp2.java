package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wp2 */
/* loaded from: classes.dex */
public final class C2937Wp2 implements Callback {
    public final /* synthetic */ ViewOnClickListenerC5731gq2 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C2937Wp2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2) {
        this.a = viewOnClickListenerC5731gq2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C4693dp2 c4693dp2 = (C4693dp2) obj;
        U83 u83 = c4693dp2.a;
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.a;
        viewOnClickListenerC5731gq2.m(u83);
        InterfaceC3669aq2 interfaceC3669aq2 = viewOnClickListenerC5731gq2.h;
        if (((C1642Mq2) interfaceC3669aq2).u()) {
            viewOnClickListenerC5731gq2.o(1, c4693dp2.b);
            viewOnClickListenerC5731gq2.o(2, c4693dp2.c);
        }
        if (((C1642Mq2) interfaceC3669aq2).t()) {
            viewOnClickListenerC5731gq2.o(3, c4693dp2.d);
        }
        C1508Lp2 c1508Lp2 = viewOnClickListenerC5731gq2.E;
        C8545p13 c8545p13 = c4693dp2.e;
        c1508Lp2.G = c8545p13.d;
        viewOnClickListenerC5731gq2.o(4, c8545p13);
        viewOnClickListenerC5731gq2.n();
        viewOnClickListenerC5731gq2.a(false);
        viewOnClickListenerC5731gq2.o.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC5387fq2(viewOnClickListenerC5731gq2, false));
    }
}
