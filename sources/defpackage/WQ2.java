package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WQ2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewGroup a;

    public WQ2(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup = this.a;
        viewGroup.setVisibility(8);
        viewGroup.removeOnLayoutChangeListener(this);
    }
}
