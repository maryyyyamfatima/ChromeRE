package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bv3 */
/* loaded from: classes.dex */
public final class C0239Bv3 extends CD3 {
    public final Tab g;
    public C0109Av3 h;

    @Override // defpackage.CD3
    public final void a(WebContents webContents) {
        GestureListenerManagerImpl d;
        if (webContents != null && (d = GestureListenerManagerImpl.d(webContents)) != null) {
            d.f(this.h);
        }
        this.h = null;
    }

    @Override // defpackage.CD3
    public final void c(WebContents webContents) {
        GestureListenerManagerImpl d = GestureListenerManagerImpl.d(webContents);
        C0109Av3 c0109Av3 = new C0109Av3(this, d);
        this.h = c0109Av3;
        d.b(c0109Av3);
    }

    public C0239Bv3(Tab tab) {
        super(tab);
        this.g = tab;
    }
}
