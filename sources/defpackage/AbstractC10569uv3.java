package defpackage;

import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10569uv3 {
    public abstract Tab a(IA3 ia3, C6844k43 c6844k43, int i, boolean z, int i2);

    public abstract Tab b(int i, Tab tab, LoadUrlParams loadUrlParams);

    public abstract boolean c(Tab tab, WebContents webContents, int i, GURL gurl);

    public abstract boolean d();

    public abstract Tab f(int i, String str);

    public final void e() {
        try {
            TraceEvent.b("TabCreator.launchNTP", null);
            f(2, "chrome-native://newtab/");
        } finally {
            TraceEvent.c("TabCreator.launchNTP");
        }
    }
}
