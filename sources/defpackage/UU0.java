package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UU0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ XU0 g;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        XU0 xu0 = this.g;
        xu0.g.sendEmptyMessage(1);
        if (i4 - i2 <= i8 - i6) {
            return;
        }
        if (xu0.q == null) {
            xu0.p = true;
            xu0.c();
        }
        this.a.removeOnLayoutChangeListener(this);
    }

    public UU0(XU0 xu0, Q50 q50) {
        this.g = xu0;
        this.a = q50;
    }
}
