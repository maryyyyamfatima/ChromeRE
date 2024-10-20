package defpackage;

import org.chromium.content.browser.BrowserStartupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XC implements Runnable {
    public final /* synthetic */ SC a;
    public final /* synthetic */ BrowserStartupControllerImpl g;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.g.g;
        SC sc = this.a;
        if (z) {
            sc.b();
        } else {
            sc.a();
        }
    }

    public XC(BrowserStartupControllerImpl browserStartupControllerImpl, SC sc) {
        this.g = browserStartupControllerImpl;
        this.a = sc;
    }
}
