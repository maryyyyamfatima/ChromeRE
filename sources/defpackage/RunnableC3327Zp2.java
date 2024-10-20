package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zp2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3327Zp2 implements Runnable {
    public final /* synthetic */ ViewOnClickListenerC5731gq2 a;

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = this.a;
        viewOnClickListenerC5731gq2.T = null;
        C4356cq2 c4356cq2 = viewOnClickListenerC5731gq2.a;
        if (c4356cq2.c) {
            return;
        }
        c4356cq2.c = true;
        c4356cq2.a.post(c4356cq2.b);
    }

    public RunnableC3327Zp2(ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2) {
        this.a = viewOnClickListenerC5731gq2;
    }
}
