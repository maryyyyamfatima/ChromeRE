package defpackage;

import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nj4 */
/* loaded from: classes4.dex */
public final class RunnableC8097nj4 implements Runnable {
    public final /* synthetic */ VrShellDelegate a;

    public RunnableC8097nj4(VrShellDelegate vrShellDelegate) {
        this.a = vrShellDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        this.a.z(true, true);
    }
}
