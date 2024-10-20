package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kf0 */
/* loaded from: classes.dex */
public final class C1326Kf0 implements InterfaceC3906bY1 {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ ZX1 g;

    public C1326Kf0(C1456Lf0 c1456Lf0, ZX1 zx1) {
        this.a = c1456Lf0;
        this.g = zx1;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        boolean z = i == 0;
        Callback callback = this.a;
        if (callback != null) {
            callback.onResult(Boolean.valueOf(z));
        }
        this.g.c(z ? 1 : 2, propertyModel);
        EI2.h(z ? 1 : 2, 4, "Download.DangerousDialog.Events");
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 1 || i == 2) {
            return;
        }
        Callback callback = this.a;
        if (callback != null) {
            callback.onResult(Boolean.FALSE);
        }
        EI2.h(3, 4, "Download.DangerousDialog.Events");
    }
}
