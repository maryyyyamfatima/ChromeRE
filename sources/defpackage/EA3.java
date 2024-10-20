package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EA3 extends AbstractC0909Gz3 {
    public final /* synthetic */ GA3 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        GA3 ga3 = this.h;
        if (((AbstractC11276wz3) ga3.g).i) {
            if (i == 3 || i == 6) {
                ga3.b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EA3(GA3 ga3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = ga3;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        LD2 ld2 = HA3.a;
        GA3 ga3 = this.h;
        if (ga3.i.j(ld2)) {
            ga3.b();
        }
    }
}
