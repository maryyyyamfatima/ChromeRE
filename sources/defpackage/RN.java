package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RN implements J44 {
    public Tab a;

    public RN(TabImpl tabImpl) {
        this.a = tabImpl;
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a = null;
    }
}
