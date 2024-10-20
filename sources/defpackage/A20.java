package defpackage;

import android.view.View;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A20 implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ CompositorViewHolder a;

    public A20(CompositorViewHolder compositorViewHolder) {
        this.a = compositorViewHolder;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = CompositorViewHolder.W;
        this.a.n();
    }
}
