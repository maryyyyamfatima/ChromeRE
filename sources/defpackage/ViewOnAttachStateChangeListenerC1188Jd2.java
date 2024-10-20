package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jd2 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1188Jd2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ InterfaceC6525j84 a;
    public final /* synthetic */ C10409uU g;

    public ViewOnAttachStateChangeListenerC1188Jd2(InterfaceC6525j84 interfaceC6525j84, C10409uU c10409uU) {
        this.a = interfaceC6525j84;
        this.g = c10409uU;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((C2801Vo1) this.a).b(2, this.g);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((C2801Vo1) this.a).b(3, this.g);
    }
}
