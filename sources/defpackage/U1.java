package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U1 implements InterfaceC0186Bl0 {
    public final T1 a;
    public TabImpl g;

    public U1(I5 i5, C6166i6 c6166i6, C1948Oz3 c1948Oz3) {
        this.a = new T1(this, c6166i6, c1948Oz3);
        i5.b(this);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.a.destroy();
        this.g = null;
    }
}
