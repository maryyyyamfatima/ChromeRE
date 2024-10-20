package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fz3 */
/* loaded from: classes.dex */
public final class C0779Fz3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ AbstractC0909Gz3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
        AbstractC0909Gz3 abstractC0909Gz3 = this.a;
        ((AbstractC11276wz3) abstractC0909Gz3.a).s(this);
        abstractC0909Gz3.g = null;
        abstractC0909Gz3.c();
    }

    public C0779Fz3(AbstractC0909Gz3 abstractC0909Gz3) {
        this.a = abstractC0909Gz3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
        throw new IllegalStateException("onChange should have happened and unregistered this listener.");
    }
}
