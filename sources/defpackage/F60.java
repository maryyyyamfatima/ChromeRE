package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F60 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ I60 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        I60 i60 = this.a;
        if (view == i60.e) {
            i60.c.run();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public F60(I60 i60) {
        this.a = i60;
    }
}
