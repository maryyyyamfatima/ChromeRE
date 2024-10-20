package defpackage;

import org.chromium.chrome.browser.omnibox.UrlBarApi26;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X24 implements Runnable {
    public final /* synthetic */ UrlBarApi26 a;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3403a34 interfaceC3403a34 = this.a.v;
        if (interfaceC3403a34 != null) {
            interfaceC3403a34.y();
        }
    }

    public X24(UrlBarApi26 urlBarApi26) {
        this.a = urlBarApi26;
    }
}
