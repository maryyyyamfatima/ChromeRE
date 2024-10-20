package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uj2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC10496uj2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C11182wj2 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C11182wj2 c11182wj2 = this.a;
        c11182wj2.s.removeOnLayoutChangeListener(this);
        c11182wj2.r();
    }

    public ViewOnLayoutChangeListenerC10496uj2(C11182wj2 c11182wj2) {
        this.a = c11182wj2;
    }
}
