package defpackage;

import org.chromium.chrome.browser.findinpage.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ON0 implements Runnable {
    public final /* synthetic */ a a;

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        aVar.v();
        aVar.g.sendAccessibilityEvent(128);
        aVar.g.sendAccessibilityEvent(32768);
    }

    public ON0(a aVar) {
        this.a = aVar;
    }
}
