package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hp */
/* loaded from: classes.dex */
public final class C0985Hp implements InterfaceC3906bY1 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ ZX1 g;
    public final /* synthetic */ C1245Jp h;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.h.u = null;
    }

    public C0985Hp(C1245Jp c1245Jp, Runnable runnable, ZX1 zx1) {
        this.h = c1245Jp;
        this.a = runnable;
        this.g = zx1;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ZX1 zx1 = this.g;
        if (i == 0) {
            FI2.a("MobileOmniboxDeleteRequested");
            this.a.run();
            zx1.c(1, propertyModel);
        } else if (i == 1) {
            zx1.c(2, propertyModel);
        }
    }
}
