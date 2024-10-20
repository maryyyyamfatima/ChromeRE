package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TU0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ XU0 g;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 <= i8 - i6) {
            C3093Xu3.c(1, this.g.x, true);
            this.a.removeOnLayoutChangeListener(this);
        }
    }

    public TU0(XU0 xu0, View view) {
        this.g = xu0;
        this.a = view;
    }
}
