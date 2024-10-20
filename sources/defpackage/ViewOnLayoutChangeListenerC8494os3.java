package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: os3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC8494os3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ AbstractC9180qs3 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC9180qs3 abstractC9180qs3 = this.a;
        abstractC9180qs3.removeOnLayoutChangeListener(abstractC9180qs3.g);
        abstractC9180qs3.setTranslationY(abstractC9180qs3.m);
        abstractC9180qs3.n = true;
        abstractC9180qs3.d(true);
    }

    public ViewOnLayoutChangeListenerC8494os3(AbstractC9180qs3 abstractC9180qs3) {
        this.a = abstractC9180qs3;
    }
}
