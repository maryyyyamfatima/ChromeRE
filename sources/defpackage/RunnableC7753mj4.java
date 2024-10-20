package defpackage;

import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mj4 */
/* loaded from: classes4.dex */
public final class RunnableC7753mj4 implements Runnable {
    public final /* synthetic */ VrShellDelegate a;

    @Override // java.lang.Runnable
    public final void run() {
        if (VrShellDelegate.K) {
            return;
        }
        VrShellDelegate.t(this.a.o());
    }

    public RunnableC7753mj4(VrShellDelegate vrShellDelegate) {
        this.a = vrShellDelegate;
    }
}
