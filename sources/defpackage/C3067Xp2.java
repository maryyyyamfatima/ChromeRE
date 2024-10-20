package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xp2 */
/* loaded from: classes.dex */
public final class C3067Xp2 implements Callback {
    public final /* synthetic */ ViewOnClickListenerC5731gq2 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C3067Xp2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2) {
        this.a = viewOnClickListenerC5731gq2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.a;
        viewOnClickListenerC5731gq2.m((U83) obj);
        viewOnClickListenerC5731gq2.q();
    }
}
