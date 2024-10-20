package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BT0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ C6977kU0 g;
    public final /* synthetic */ LT0 h;

    public BT0(LT0 lt0, FrameLayout frameLayout, C6977kU0 c6977kU0) {
        this.h = lt0;
        this.a = frameLayout;
        this.g = c6977kU0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout frameLayout = this.a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.h.R(this.g);
        }
    }
}
