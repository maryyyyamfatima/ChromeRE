package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UM2 implements InterfaceC3906bY1 {
    public final /* synthetic */ VM2 a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.a.e.onResult(Integer.valueOf(i));
    }

    public UM2(VM2 vm2) {
        this.a = vm2;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        VM2 vm2 = this.a;
        if (i == 0) {
            vm2.d.onResult(Boolean.TRUE);
        } else {
            if (i != 1) {
                return;
            }
            vm2.d.onResult(Boolean.FALSE);
        }
    }
}
