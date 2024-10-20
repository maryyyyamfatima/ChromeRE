package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SR1 {
    public Tab a;
    public ER1 b;

    public SR1(TabImpl tabImpl) {
        RR1 rr1 = new RR1(this);
        this.a = tabImpl;
        tabImpl.v(rr1);
        a();
    }

    public final void a() {
        ER1 er1 = this.b;
        if (er1 != null) {
            er1.h(this.a.b());
        } else if (this.a.b() != null) {
            this.b = new ER1(this.a.b(), this);
        }
    }
}
