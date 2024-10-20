package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nf3 */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC1718Nf3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C1978Pf3 a;

    public ViewOnLayoutChangeListenerC1718Nf3(C1978Pf3 c1978Pf3) {
        this.a = c1978Pf3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1978Pf3 c1978Pf3 = this.a;
        c1978Pf3.b.removeOnLayoutChangeListener(this);
        float d = c1978Pf3.d();
        ViewGroup viewGroup = c1978Pf3.b;
        viewGroup.setTranslationY(d);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
        ofFloat.setInterpolator(AbstractC8142nr1.a);
        ofFloat.setDuration(c1978Pf3.g);
        WindowAndroid windowAndroid = c1978Pf3.a;
        if (windowAndroid != null) {
            windowAndroid.C(ofFloat);
        } else {
            ofFloat.start();
        }
    }
}
