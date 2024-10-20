package defpackage;

import org.chromium.chrome.browser.media.PictureInPictureActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mu2 */
/* loaded from: classes.dex */
public final class C1662Mu2 extends BA0 {
    public final /* synthetic */ PictureInPictureActivity a;

    public C1662Mu2(PictureInPictureActivity pictureInPictureActivity) {
        this.a = pictureInPictureActivity;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        if (tab.p()) {
            this.a.finish();
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        this.a.finish();
    }
}
