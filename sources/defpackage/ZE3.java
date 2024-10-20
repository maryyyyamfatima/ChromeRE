package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZE3 implements InterfaceC3906bY1 {
    public final /* synthetic */ C3469aF3 a;

    public ZE3(C3469aF3 c3469aF3) {
        this.a = c3469aF3;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        C3469aF3.j = null;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C3469aF3 c3469aF3 = this.a;
        if (i == 0) {
            c3469aF3.f.c(1, c3469aF3.g);
            c3469aF3.b.onResult(c3469aF3.h);
        } else {
            if (i != 1) {
                return;
            }
            c3469aF3.f.c(2, c3469aF3.g);
        }
    }
}
