package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d6 */
/* loaded from: classes.dex */
public final class C4447d6 implements InterfaceC1292Jy1 {
    public final /* synthetic */ C6166i6 a;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void a(int i) {
        C6166i6 c6166i6 = this.a;
        InterfaceC10590uz3 interfaceC10590uz3 = c6166i6.k;
        if (interfaceC10590uz3 == null) {
            return;
        }
        c6166i6.p(((AbstractC11276wz3) interfaceC10590uz3).m(i));
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        if (8 == i) {
            return;
        }
        C6166i6 c6166i6 = this.a;
        Tab h = ((AbstractC11276wz3) c6166i6.k).h();
        if (i != 1) {
            h = null;
        }
        C6166i6.q(c6166i6, h);
    }

    public C4447d6(C6166i6 c6166i6) {
        this.a = c6166i6;
    }
}
