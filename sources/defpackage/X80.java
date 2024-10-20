package defpackage;

import java.io.File;
import org.chromium.chrome.browser.cookies.CookiesFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X80 extends AbstractC1649Ms {
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        File file = new File(CookiesFetcher.a());
        if (!file.exists() || file.delete()) {
            return null;
        }
        AbstractC4851eH1.a("CookiesFetcher", "Failed to delete " + file.getName(), new Object[0]);
        return null;
    }
}
