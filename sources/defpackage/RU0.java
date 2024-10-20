package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RU0 extends AbstractC5822h6 {
    public final /* synthetic */ XU0 i;

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        XU0 xu0 = this.i;
        xu0.x = tab;
        xu0.l(tab != null ? tab.y() : null);
        if (tab != null) {
            xu0.n(!xu0.g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RU0(XU0 xu0, C6166i6 c6166i6) {
        super(c6166i6);
        this.i = xu0;
    }
}
