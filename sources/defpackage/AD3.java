package defpackage;

import android.os.Handler;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AD3 extends CD3 {
    public final TabImpl g;
    public final C12157za2 h;
    public C12043zD3 i;
    public GURL j;

    public static AD3 e(Tab tab) {
        AD3 ad3 = (AD3) tab.F().b(AD3.class);
        if (ad3 != null) {
            return ad3;
        }
        AD3 ad32 = new AD3(tab);
        tab.F().d(AD3.class, ad32);
        return ad32;
    }

    public AD3(Tab tab) {
        super(tab);
        this.h = new C12157za2();
        new Handler();
        this.g = (TabImpl) tab;
    }

    @Override // defpackage.CD3
    public final void b() {
        this.h.clear();
    }

    @Override // defpackage.CD3
    public final void c(WebContents webContents) {
        this.i = new C12043zD3(this, webContents);
        WebContentsAccessibilityImpl.k(webContents).D = true;
        WebContentsAccessibilityImpl.k(webContents).E = true ^ this.g.isCustomTab();
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((Callback) c11814ya2.next()).onResult(webContents);
            }
        }
    }

    @Override // defpackage.CD3
    public final void a(WebContents webContents) {
        C12043zD3 c12043zD3 = this.i;
        if (c12043zD3 != null) {
            c12043zD3.destroy();
            this.i = null;
        }
    }
}
