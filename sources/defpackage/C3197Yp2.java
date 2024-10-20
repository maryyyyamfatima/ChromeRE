package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yp2 */
/* loaded from: classes.dex */
public final class C3197Yp2 implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewOnClickListenerC5731gq2 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C3197Yp2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2, int i) {
        this.g = viewOnClickListenerC5731gq2;
        this.a = i;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.g;
        viewOnClickListenerC5731gq2.o(this.a, (C8545p13) obj);
        viewOnClickListenerC5731gq2.q();
    }
}
