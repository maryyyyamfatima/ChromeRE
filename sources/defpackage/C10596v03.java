package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileContainerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v03, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10596v03 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchResumptionTileContainerView g;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public C10596v03(SearchResumptionTileContainerView searchResumptionTileContainerView, int i) {
        this.g = searchResumptionTileContainerView;
        this.a = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = f == 1.0f ? -2 : (int) (this.a * f);
        SearchResumptionTileContainerView searchResumptionTileContainerView = this.g;
        searchResumptionTileContainerView.getLayoutParams().height = i;
        searchResumptionTileContainerView.requestLayout();
    }
}
