package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e6 */
/* loaded from: classes.dex */
public final class C4790e6 extends AbstractC0909Gz3 {
    public final /* synthetic */ C6166i6 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        C6166i6 c6166i6 = this.h;
        if (((AbstractC11276wz3) c6166i6.k).g().getCount() <= 1) {
            C6166i6.q(c6166i6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4790e6(C6166i6 c6166i6, AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
        this.h = c6166i6;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        C6166i6.q(this.h, tab);
    }
}
