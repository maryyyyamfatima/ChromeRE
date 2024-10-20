package defpackage;

import org.chromium.chrome.browser.ui.tablet.emptybackground.incognitotoggle.IncognitoToggleButtonTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kk1 */
/* loaded from: classes2.dex */
public final class RunnableC1352Kk1 implements Runnable {
    public final /* synthetic */ IncognitoToggleButtonTablet a;

    public RunnableC1352Kk1(IncognitoToggleButtonTablet incognitoToggleButtonTablet) {
        this.a = incognitoToggleButtonTablet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IncognitoToggleButtonTablet incognitoToggleButtonTablet = this.a;
        incognitoToggleButtonTablet.setVisibility(((AbstractC11276wz3) incognitoToggleButtonTablet.i).j(true).getCount() > 0 ? 0 : 8);
    }
}
