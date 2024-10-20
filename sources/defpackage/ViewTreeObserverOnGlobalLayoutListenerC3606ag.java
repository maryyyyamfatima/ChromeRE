package defpackage;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3606ag implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AppCompatSpinner a;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AppCompatSpinner appCompatSpinner = this.a;
        if (!appCompatSpinner.k.a()) {
            appCompatSpinner.k.o(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        }
        ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC3606ag(AppCompatSpinner appCompatSpinner) {
        this.a = appCompatSpinner;
    }
}
