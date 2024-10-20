package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aV1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC3547aV1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Runnable a;

    public ViewOnLayoutChangeListenerC3547aV1(RunnableC8398oc3 runnableC8398oc3) {
        this.a = runnableC8398oc3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getHeight() == 0) {
            return;
        }
        this.a.run();
        view.removeOnLayoutChangeListener(this);
    }
}
