package defpackage;

import org.chromium.chrome.browser.findinpage.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PN0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ a g;

    public PN0(a aVar, String str) {
        this.g = aVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.g.announceForAccessibility(this.a);
    }
}
