package defpackage;

import android.view.ViewGroup;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B20 implements Runnable {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ CompositorViewHolder g;

    @Override // java.lang.Runnable
    public final void run() {
        this.g.l.setBackgroundResource(0);
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(0);
        }
    }

    public B20(CompositorViewHolder compositorViewHolder, ViewGroup viewGroup) {
        this.g = compositorViewHolder;
        this.a = viewGroup;
    }
}
