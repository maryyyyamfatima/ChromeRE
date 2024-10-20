package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC4990eh3 implements ViewTreeObserver.OnDrawListener {
    public final View a;
    public final Runnable g;
    public boolean h;

    public ViewTreeObserverOnDrawListenerC4990eh3(ViewGroup viewGroup, Runnable runnable) {
        this.a = viewGroup;
        this.g = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.g.run();
        this.a.post(new Runnable() { // from class: dh3
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnDrawListenerC4990eh3 viewTreeObserverOnDrawListenerC4990eh3 = ViewTreeObserverOnDrawListenerC4990eh3.this;
                viewTreeObserverOnDrawListenerC4990eh3.a.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC4990eh3);
            }
        });
    }
}
