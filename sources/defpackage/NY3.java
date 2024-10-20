package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.chromium.components.browser_ui.widget.FadingShadowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NY3 extends DK2 {
    public final /* synthetic */ FadingShadowView a;

    public NY3(FadingShadowView fadingShadowView) {
        this.a = fadingShadowView;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        this.a.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
    }
}
