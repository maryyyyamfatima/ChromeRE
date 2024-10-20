package defpackage;

import android.os.Handler;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vf2 */
/* loaded from: classes.dex */
public final class C10815vf2 extends WebContentsDelegateAndroid {
    public boolean a;
    public final /* synthetic */ OverlayPanelContent b;

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsHeight() {
        return 0;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldCreateWebContents(GURL gurl) {
        return false;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsHeight() {
        return (int) (r0.v / this.b.b.i.d);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void loadingStateChanged(boolean z) {
        OverlayPanelContent overlayPanelContent = this.b;
        WebContents webContents = overlayPanelContent.e;
        if (!(webContents != null && webContents.e())) {
            C8758pf2 c8758pf2 = overlayPanelContent.p;
            c8758pf2.getClass();
            new Handler().postDelayed(new RunnableC8415of2(c8758pf2), 64L);
        } else {
            AbstractC9101qf2 abstractC9101qf2 = overlayPanelContent.p.a;
            abstractC9101qf2.N = 0.0f;
            abstractC9101qf2.L = true;
            abstractC9101qf2.E0();
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void visibleSSLStateChanged() {
        this.b.o.getClass();
    }

    public C10815vf2(OverlayPanelContent overlayPanelContent) {
        this.b = overlayPanelContent;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void enterFullscreenModeForTab(boolean z, boolean z2) {
        this.a = true;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void exitFullscreenModeForTab() {
        this.a = false;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean isFullscreenForTabOrPending() {
        return this.a;
    }
}
