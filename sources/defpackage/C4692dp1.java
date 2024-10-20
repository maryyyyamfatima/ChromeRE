package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dp1 */
/* loaded from: classes.dex */
public final class C4692dp1 implements J44 {
    public final C4349cp1 a;
    public final C3321Zo1 g;

    public C4692dp1(TabImpl tabImpl) {
        C3321Zo1 c3321Zo1 = new C3321Zo1(tabImpl);
        this.g = c3321Zo1;
        C4349cp1 c4349cp1 = new C4349cp1(c3321Zo1);
        this.a = c4349cp1;
        c3321Zo1.c = c4349cp1;
        tabImpl.v(c3321Zo1.b);
    }

    @Override // defpackage.J44
    public final void destroy() {
        C3321Zo1 c3321Zo1 = this.g;
        c3321Zo1.a.w(c3321Zo1.b);
        c3321Zo1.c = null;
    }
}
