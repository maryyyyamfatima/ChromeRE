package defpackage;

import java.util.concurrent.Callable;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K12 implements Runnable {
    public final Callable a;
    public final Tab g;
    public final /* synthetic */ L12 h;

    public K12(L12 l12, Tab tab, Callable callable) {
        this.h = l12;
        this.a = callable;
        this.g = tab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) this.a.call()).booleanValue()) {
                L12 l12 = this.h;
                l12.a.onResult(this.g);
                l12.f = true;
                l12.b();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
