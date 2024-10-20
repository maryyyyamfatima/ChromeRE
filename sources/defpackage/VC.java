package defpackage;

import org.chromium.content.browser.BrowserStartupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VC implements Runnable {
    public final /* synthetic */ BrowserStartupControllerImpl a;

    public VC(BrowserStartupControllerImpl browserStartupControllerImpl) {
        this.a = browserStartupControllerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(new UC(this));
    }
}
