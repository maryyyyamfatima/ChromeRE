package defpackage;

import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hn3 */
/* loaded from: classes.dex */
public final class C0979Hn3 implements InterfaceC5455g20 {
    public final /* synthetic */ C1758Nn3 a;

    public C0979Hn3(C1758Nn3 c1758Nn3) {
        this.a = c1758Nn3;
    }

    @Override // defpackage.InterfaceC5455g20
    public final void a(long j) {
        C1758Nn3 c1758Nn3 = this.a;
        TabModel tabModel = c1758Nn3.c;
        if (tabModel == null) {
            return;
        }
        if (!tabModel.isIncognito()) {
            c1758Nn3.c.l();
        }
        c1758Nn3.e.e();
    }
}
