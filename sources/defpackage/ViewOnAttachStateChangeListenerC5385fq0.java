package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC5385fq0 implements InterfaceC5041eq0, View.OnAttachStateChangeListener {
    public final InterfaceC5041eq0 a;
    public PZ3 g;
    public boolean h;
    public final QZ3 i;

    public ViewOnAttachStateChangeListenerC5385fq0(View view, QZ3 qz3, InterfaceC5041eq0 interfaceC5041eq0) {
        this.i = qz3;
        this.a = interfaceC5041eq0;
        this.h = view.getParent() != null;
        view.addOnAttachStateChangeListener(this);
    }

    @Override // defpackage.InterfaceC5041eq0
    public final void a(PZ3 pz3) {
        this.g = pz3;
        if (this.h) {
            this.a.a(pz3);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.h = true;
        a(this.g);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
    }
}
