package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.k;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dT0 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4567dT0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ k a;
    public final /* synthetic */ LayoutInflaterFactory2C4910eT0 g;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        k kVar = this.a;
        c cVar = kVar.c;
        kVar.k();
        AbstractC2633Ug3.f((ViewGroup) cVar.L.getParent(), this.g.a.F()).e();
    }

    public ViewOnAttachStateChangeListenerC4567dT0(LayoutInflaterFactory2C4910eT0 layoutInflaterFactory2C4910eT0, k kVar) {
        this.g = layoutInflaterFactory2C4910eT0;
        this.a = kVar;
    }
}
