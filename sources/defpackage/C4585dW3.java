package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dW3 */
/* loaded from: classes.dex */
public final class C4585dW3 extends AbstractC3898bW3 {
    public final /* synthetic */ C4317ck a;
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC4928eW3 g;

    public C4585dW3(ViewTreeObserverOnPreDrawListenerC4928eW3 viewTreeObserverOnPreDrawListenerC4928eW3, C4317ck c4317ck) {
        this.g = viewTreeObserverOnPreDrawListenerC4928eW3;
        this.a = c4317ck;
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        ((ArrayList) this.a.get(this.g.g)).remove(qv3);
        qv3.w(this);
    }
}
