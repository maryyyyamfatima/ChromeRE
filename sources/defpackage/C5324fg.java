package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5324fg implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    public final /* synthetic */ C5668gg g;

    public C5324fg(C5668gg c5668gg, ViewTreeObserverOnGlobalLayoutListenerC4980eg viewTreeObserverOnGlobalLayoutListenerC4980eg) {
        this.g = c5668gg;
        this.a = viewTreeObserverOnGlobalLayoutListenerC4980eg;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.g.M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
