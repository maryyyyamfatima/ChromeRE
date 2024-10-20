package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xb3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2998Xb3 implements InterfaceC3906bY1 {
    public final ZX1 a;
    public Callback g;

    public C2998Xb3(ZX1 zx1, Callback callback) {
        this.a = zx1;
        this.g = callback;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        ZX1 zx1 = this.a;
        if (i == 0) {
            zx1.c(1, propertyModel);
        } else {
            zx1.c(2, propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        Callback callback = this.g;
        this.g = null;
        callback.onResult(Integer.valueOf(i));
    }
}
