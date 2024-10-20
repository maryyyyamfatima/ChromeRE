package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vl2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2787Vl2 implements InterfaceC3906bY1 {
    public final Callback a;

    public C2787Vl2(C2527Tl2 c2527Tl2) {
        this.a = c2527Tl2;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        Callback callback = this.a;
        if (i == 0) {
            callback.onResult(Boolean.TRUE);
        } else {
            if (i != 1) {
                return;
            }
            callback.onResult(Boolean.FALSE);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.a.onResult(Boolean.FALSE);
    }
}
