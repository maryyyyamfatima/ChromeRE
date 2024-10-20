package defpackage;

import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BP1 implements Runnable {
    public final /* synthetic */ d a;

    public BP1(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.a;
        dVar.h(true);
        dVar.I.requestLayout();
        dVar.I.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC12101zP1(dVar));
    }
}
