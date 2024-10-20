package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oQ0 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC8333oQ0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AbstractC10390uQ0 a;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AbstractC10390uQ0 abstractC10390uQ0 = this.a;
        float rotation = abstractC10390uQ0.r.getRotation();
        if (abstractC10390uQ0.n == rotation) {
            return true;
        }
        abstractC10390uQ0.n = rotation;
        abstractC10390uQ0.m();
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC8333oQ0(AbstractC10390uQ0 abstractC10390uQ0) {
        this.a = abstractC10390uQ0;
    }
}
