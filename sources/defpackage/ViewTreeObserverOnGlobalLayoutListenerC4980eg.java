package defpackage;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4980eg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C5668gg a;

    public ViewTreeObserverOnGlobalLayoutListenerC4980eg(C5668gg c5668gg) {
        this.a = c5668gg;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C5668gg c5668gg = this.a;
        AppCompatSpinner appCompatSpinner = c5668gg.M;
        c5668gg.getClass();
        WeakHashMap weakHashMap = Ec4.a;
        if (!(appCompatSpinner.isAttachedToWindow() && appCompatSpinner.getGlobalVisibleRect(c5668gg.K))) {
            c5668gg.dismiss();
        } else {
            c5668gg.s();
            c5668gg.b();
        }
    }
}
