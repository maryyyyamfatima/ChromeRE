package defpackage;

import org.chromium.chrome.browser.findinpage.FindToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4198cO0 extends HF {
    public final /* synthetic */ FindToolbarTablet g;

    @Override // defpackage.HF
    public final void b() {
        this.g.E = null;
    }

    public C4198cO0(FindToolbarTablet findToolbarTablet) {
        this.g = findToolbarTablet;
    }

    @Override // defpackage.HF
    public final void c() {
        FindToolbarTablet findToolbarTablet = this.g;
        findToolbarTablet.setVisibility(0);
        findToolbarTablet.postInvalidateOnAnimation();
        super/*org.chromium.chrome.browser.findinpage.a*/.g();
    }
}
