package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import org.chromium.chrome.browser.feed.sort_ui.FeedOptionsView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HJ0 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedOptionsView g;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public HJ0(FeedOptionsView feedOptionsView, int i) {
        this.g = feedOptionsView;
        this.a = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = f == 1.0f ? -2 : (int) (this.a * f);
        FeedOptionsView feedOptionsView = this.g;
        feedOptionsView.getLayoutParams().height = i;
        feedOptionsView.requestLayout();
    }
}
