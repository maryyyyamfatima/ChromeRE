package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xw3 */
/* loaded from: classes.dex */
public final class C3103Xw3 implements InterfaceC1292Jy1 {
    public final /* synthetic */ C4742dx3 a;

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final /* synthetic */ void i(int i, boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void c(int i) {
        C4742dx3 c4742dx3 = this.a;
        c4742dx3.C = false;
        Tab h = ((AbstractC11276wz3) c4742dx3.j).h();
        if (h == null) {
            return;
        }
        c4742dx3.e(h.getId());
    }

    public C3103Xw3(C4742dx3 c4742dx3) {
        this.a = c4742dx3;
    }

    @Override // defpackage.InterfaceC1292Jy1
    public final void d(int i, boolean z) {
        C4742dx3 c4742dx3 = this.a;
        C4742dx3.c(c4742dx3, 0);
        c4742dx3.C = true;
        c4742dx3.e(-1);
    }
}
