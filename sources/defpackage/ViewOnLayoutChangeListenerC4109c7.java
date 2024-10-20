package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC4109c7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewOnClickListenerC4796e7 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewOnClickListenerC4796e7 viewOnClickListenerC4796e7 = this.a;
        if (viewOnClickListenerC4796e7.p.getMeasuredHeight() != viewOnClickListenerC4796e7.j.getMeasuredHeight() || viewOnClickListenerC4796e7.j.getBackground() == null) {
            return;
        }
        viewOnClickListenerC4796e7.j.getLayoutParams().height = viewOnClickListenerC4796e7.j.getPaddingBottom() + viewOnClickListenerC4796e7.p.getMeasuredHeight();
        view.requestLayout();
        view.removeOnLayoutChangeListener(this);
    }

    public ViewOnLayoutChangeListenerC4109c7(ViewOnClickListenerC4796e7 viewOnClickListenerC4796e7) {
        this.a = viewOnClickListenerC4796e7;
    }
}
