package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xR3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC11427xR3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ KU3 a;
    public final /* synthetic */ View g;
    public final /* synthetic */ View h;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        KU3 ku3 = this.a;
        View view2 = this.g;
        View view3 = this.h;
        AbstractC12113zR3.a(ku3, view2, view3);
        view3.removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC11427xR3(KU3 ku3, View view, View view2) {
        this.a = ku3;
        this.g = view;
        this.h = view2;
    }
}
