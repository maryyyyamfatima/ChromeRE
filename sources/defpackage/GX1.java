package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GX1 implements InterfaceC3906bY1 {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ ZX1 g;

    public GX1(HX1 hx1, ZX1 zx1) {
        this.a = hx1;
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
        EI2.h(z ? 1 : 2, 4, "Download.MixedContentDialog.Events");
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
        EI2.h(3, 4, "Download.MixedContentDialog.Events");
    }
}
