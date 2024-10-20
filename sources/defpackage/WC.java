package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.content.browser.BrowserStartupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WC implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BrowserStartupControllerImpl g;

    public WC(BrowserStartupControllerImpl browserStartupControllerImpl, boolean z) {
        this.g = browserStartupControllerImpl;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = ThreadUtils.a;
        BrowserStartupControllerImpl browserStartupControllerImpl = this.g;
        if (browserStartupControllerImpl.e) {
            return;
        }
        browserStartupControllerImpl.h = this.a ? 1 : 0;
        if (browserStartupControllerImpl.b() > 0) {
            PostTask.c(AbstractC5103f04.e, new TC(browserStartupControllerImpl));
        }
    }
}
