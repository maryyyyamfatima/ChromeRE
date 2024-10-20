package defpackage;

import org.chromium.chrome.browser.findinpage.FindToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4542dO0 extends HF {
    public final /* synthetic */ FindToolbarTablet g;

    public C4542dO0(FindToolbarTablet findToolbarTablet) {
        this.g = findToolbarTablet;
    }

    @Override // defpackage.HF
    public final void c() {
        FindToolbarTablet findToolbarTablet = this.g;
        findToolbarTablet.setVisibility(0);
        findToolbarTablet.postInvalidateOnAnimation();
    }

    @Override // defpackage.HF
    public final void b() {
        FindToolbarTablet findToolbarTablet = this.g;
        findToolbarTablet.setVisibility(8);
        findToolbarTablet.E = null;
    }
}
