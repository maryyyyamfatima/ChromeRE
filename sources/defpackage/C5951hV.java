package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hV */
/* loaded from: classes.dex */
public final class C5951hV implements InterfaceC3906bY1 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ ZX1 g;
    public final /* synthetic */ boolean h;

    public C5951hV(Runnable runnable, ZX1 zx1, boolean z) {
        this.a = runnable;
        this.g = zx1;
        this.h = z;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ZX1 zx1 = this.g;
        if (i == 0) {
            this.a.run();
            FI2.a("MobileCloseAllTabsDialog.ClosedAllTabs");
            zx1.c(1, propertyModel);
        } else if (i == 1) {
            FI2.a("MobileCloseAllTabsDialog.Cancelled");
            zx1.c(2, propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 5) {
            FI2.a("MobileCloseAllTabsDialog.CancelledWithTouchOutside");
        }
        EI2.b(this.h ? "Tab.CloseAllTabsDialog.ClosedAllTabs.Incognito" : "Tab.CloseAllTabsDialog.ClosedAllTabs.NonIncognito", i == 1);
    }
}
