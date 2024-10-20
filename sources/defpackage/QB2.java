package defpackage;

import J.N;
import org.chromium.chrome.browser.DevToolsServer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QB2 implements Runnable {
    public final /* synthetic */ RB2 a;

    public QB2(RB2 rb2) {
        this.a = rb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DevToolsServer devToolsServer = new DevToolsServer();
        this.a.getClass();
        N.M0ZKpN7w(devToolsServer, devToolsServer.a, true, true);
    }
}
