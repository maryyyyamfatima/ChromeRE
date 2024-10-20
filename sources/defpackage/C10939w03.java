package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileContainerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w03, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10939w03 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchResumptionTileContainerView g;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public C10939w03(SearchResumptionTileContainerView searchResumptionTileContainerView, int i) {
        this.g = searchResumptionTileContainerView;
        this.a = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SearchResumptionTileContainerView searchResumptionTileContainerView = this.g;
        if (f == 1.0f) {
            searchResumptionTileContainerView.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = searchResumptionTileContainerView.getLayoutParams();
        int i = this.a;
        layoutParams.height = i - ((int) (i * f));
        searchResumptionTileContainerView.requestLayout();
    }
}
