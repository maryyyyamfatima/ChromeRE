package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r32 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC9241r32 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C10613v32 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C10613v32 c10613v32 = this.a;
        c10613v32.z();
        c10613v32.a().removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC9241r32(C10613v32 c10613v32) {
        this.a = c10613v32;
    }
}
