package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: we4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnDrawListenerC11154we4 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AbstractC11497xe4 a;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C10811ve4 c10811ve4;
        AbstractC11497xe4 abstractC11497xe4 = this.a;
        if (!abstractC11497xe4.n || abstractC11497xe4.l == null || (c10811ve4 = abstractC11497xe4.k) == null) {
            return;
        }
        abstractC11497xe4.n = false;
        c10811ve4.f(null);
    }

    public ViewTreeObserverOnDrawListenerC11154we4(AbstractC11497xe4 abstractC11497xe4) {
        this.a = abstractC11497xe4;
    }
}
