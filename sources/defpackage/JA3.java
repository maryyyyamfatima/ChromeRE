package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JA3 implements J44 {
    public boolean a = true;
    public final Tab g;

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public static JA3 a(Tab tab) {
        K44 F = tab.F();
        JA3 ja3 = (JA3) F.b(JA3.class);
        return ja3 != null ? ja3 : (JA3) F.d(JA3.class, new JA3(tab));
    }

    public JA3(Tab tab) {
        this.g = tab;
    }

    public final void b(boolean z) {
        this.a = z;
        if (z) {
            Tab tab = this.g;
            if (tab.isDestroyed()) {
                return;
            }
            C1695Nb0.m(tab).A = true;
        }
    }
}
