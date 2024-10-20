package defpackage;

import J.N;
import org.chromium.chrome.browser.vr.VrInputConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ai4 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bi4 g;

    public Ai4(Bi4 bi4, String str) {
        this.g = bi4;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VrInputConnection vrInputConnection = this.g.g;
        N.MQhox5h_(vrInputConnection.a, vrInputConnection, this.a);
    }
}
