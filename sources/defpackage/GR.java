package defpackage;

import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GR implements InterfaceC1292Jy1 {
    public final /* synthetic */ Tab a;
    public final /* synthetic */ ChromeTabbedActivity g;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void d(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void f(int i) {
        ChromeTabbedActivity chromeTabbedActivity = this.g;
        AbstractC11276wz3 abstractC11276wz3 = chromeTabbedActivity.Z0;
        Tab tab = this.a;
        abstractC11276wz3.j(tab.isIncognito()).f(tab);
        chromeTabbedActivity.W1().L(this);
    }

    public GR(ChromeTabbedActivity chromeTabbedActivity, Tab tab) {
        this.g = chromeTabbedActivity;
        this.a = tab;
    }
}
