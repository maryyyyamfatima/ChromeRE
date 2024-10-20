package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zo1 */
/* loaded from: classes.dex */
public final class C3321Zo1 implements InterfaceC3061Xo1 {
    public final TabImpl a;
    public final C3191Yo1 b = new C3191Yo1(this);
    public C4349cp1 c;

    public C3321Zo1(TabImpl tabImpl) {
        this.a = tabImpl;
    }

    public final VK2 a() {
        TabImpl tabImpl = this.a;
        K44 F = tabImpl.F();
        WK2 wk2 = (WK2) F.b(WK2.class);
        if (wk2 == null) {
            wk2 = new WK2(tabImpl);
            F.d(WK2.class, wk2);
            tabImpl.v(wk2);
        }
        return wk2.g;
    }
}
