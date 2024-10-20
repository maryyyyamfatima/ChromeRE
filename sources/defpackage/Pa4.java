package defpackage;

import J.N;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class Pa4 implements Runnable {
    public final /* synthetic */ Ta4 a;

    public /* synthetic */ Pa4(Ta4 ta4) {
        this.a = ta4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LD2 ld2 = Ua4.b;
        Ta4 ta4 = this.a;
        ta4.c.k(ld2, false);
        int i = ta4.f.a;
        Ra4 ra4 = new Ra4(ta4);
        VideoTutorialServiceBridge videoTutorialServiceBridge = ta4.b;
        long j = videoTutorialServiceBridge.a;
        if (j == 0) {
            return;
        }
        N.MSP6HvY8(j, videoTutorialServiceBridge, i, ra4);
    }
}
