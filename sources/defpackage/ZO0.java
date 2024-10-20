package defpackage;

import org.chromium.chrome.browser.firstrun.FirstRunActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZO0 implements Runnable {
    public final /* synthetic */ FirstRunActivity a;

    public ZO0(FirstRunActivity firstRunActivity) {
        this.a = firstRunActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirstRunActivity firstRunActivity = this.a;
        if (firstRunActivity.m()) {
            return;
        }
        firstRunActivity.c0.a(Boolean.TRUE);
        firstRunActivity.Y0();
    }
}
