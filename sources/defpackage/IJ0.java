package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import org.chromium.chrome.browser.feed.sort_ui.FeedOptionsView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IJ0 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedOptionsView g;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public IJ0(FeedOptionsView feedOptionsView, int i) {
        this.g = feedOptionsView;
        this.a = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        FeedOptionsView feedOptionsView = this.g;
        if (f == 1.0f) {
            feedOptionsView.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = feedOptionsView.getLayoutParams();
        int i = this.a;
        layoutParams.height = i - ((int) (i * f));
        feedOptionsView.requestLayout();
    }
}
