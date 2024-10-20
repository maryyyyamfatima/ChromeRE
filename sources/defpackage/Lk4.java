package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Lk4 implements G22 {
    public final /* synthetic */ Tab a;
    public final /* synthetic */ Mk4 g;

    public Lk4(Mk4 mk4, TabImpl tabImpl) {
        this.g = mk4;
        this.a = tabImpl;
    }

    @Override // defpackage.G22
    public final void b(int i) {
        if (NetworkChangeNotifier.b()) {
            NetworkChangeNotifier.g(this);
            this.a.D();
            this.g.j = true;
        }
    }
}
