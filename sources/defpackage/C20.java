package defpackage;

import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C20 implements InterfaceC0259Bz3 {
    public final /* synthetic */ CompositorViewHolder a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    public C20(CompositorViewHolder compositorViewHolder) {
        this.a = compositorViewHolder;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
        int i2 = CompositorViewHolder.W;
        this.a.s(tab);
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
        CompositorViewHolder compositorViewHolder = this.a;
        InterfaceC10590uz3 interfaceC10590uz3 = compositorViewHolder.s;
        if (interfaceC10590uz3 == null) {
            return;
        }
        compositorViewHolder.x(((AbstractC11276wz3) interfaceC10590uz3).h());
    }
}
