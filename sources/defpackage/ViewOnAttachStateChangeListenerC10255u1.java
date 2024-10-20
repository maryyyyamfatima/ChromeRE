package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC10255u1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C10941w1 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC10255u1(C10941w1 c10941w1) {
        this.a = c10941w1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C10941w1 c10941w1 = this.a;
        if (view != c10941w1.l) {
            return;
        }
        view.requestFocus();
        c10941w1.k = -1;
        c10941w1.l = null;
    }
}
