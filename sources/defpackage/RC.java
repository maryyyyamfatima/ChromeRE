package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.BrowserStartupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class RC {
    public static BrowserStartupControllerImpl a() {
        Object obj = ThreadUtils.a;
        if (BrowserStartupControllerImpl.l == null) {
            BrowserStartupControllerImpl.l = new BrowserStartupControllerImpl();
        }
        return BrowserStartupControllerImpl.l;
    }
}
