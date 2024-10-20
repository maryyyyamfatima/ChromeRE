package defpackage;

import org.chromium.chrome.browser.tasks.tab_management.TabGridIphDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mw3 */
/* loaded from: classes.dex */
public final class C7830mw3 implements InterfaceC3906bY1 {
    public final /* synthetic */ ZX1 a;
    public final /* synthetic */ C8174nw3 g;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        TabGridIphDialogView tabGridIphDialogView = this.g.b;
        C6674jc.d(tabGridIphDialogView.m, tabGridIphDialogView.o);
        tabGridIphDialogView.n.stop();
    }

    public C7830mw3(C8174nw3 c8174nw3, ZX1 zx1) {
        this.g = c8174nw3;
        this.a = zx1;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            this.a.c(1, propertyModel);
        }
    }
}
