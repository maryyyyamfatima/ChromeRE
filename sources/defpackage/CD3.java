package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CD3 implements J44 {
    public WebContents a;

    public abstract void a(WebContents webContents);

    public void b() {
    }

    public abstract void c(WebContents webContents);

    public CD3(Tab tab) {
        tab.v(new BD3(this));
    }

    @Override // defpackage.J44
    public final void destroy() {
        a(this.a);
        b();
    }
}
