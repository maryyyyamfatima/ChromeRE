package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PG implements View.OnAttachStateChangeListener {
    public final /* synthetic */ TG a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public PG(TG tg) {
        this.a = tg;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TG tg = this.a;
        ViewTreeObserver viewTreeObserver = tg.D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                tg.D = view.getViewTreeObserver();
            }
            tg.D.removeGlobalOnLayoutListener(tg.o);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
