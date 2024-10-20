package defpackage;

import com.google.vr.ndk.base.GvrUiLayout;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oj4 */
/* loaded from: classes4.dex */
public final class RunnableC8441oj4 implements Runnable {
    public final /* synthetic */ VrShellDelegate a;

    public RunnableC8441oj4(VrShellDelegate vrShellDelegate) {
        this.a = vrShellDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        VrShellDelegate vrShellDelegate2 = this.a;
        vrShellDelegate2.z(true, false);
        GvrUiLayout.launchOrInstallGvrApp(vrShellDelegate2.a);
    }
}
