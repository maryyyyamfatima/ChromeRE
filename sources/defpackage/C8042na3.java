package defpackage;

import J.N;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: na3 */
/* loaded from: classes2.dex */
public final class C8042na3 implements InterfaceC3906bY1 {
    public final /* synthetic */ C8729pa3 a;

    public C8042na3(C8729pa3 c8729pa3) {
        this.a = c8729pa3;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C8729pa3 c8729pa3 = this.a;
        if (i == 0) {
            c8729pa3.c.m(c8729pa3.a.getVisibility() == 0 && c8729pa3.a.isChecked());
            c8729pa3.e.c(1, c8729pa3.d);
        } else if (i == 1) {
            c8729pa3.e.c(2, c8729pa3.d);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        C8729pa3 c8729pa3 = this.a;
        if (i == 1) {
            N.MX17n_KK(6, c8729pa3.b);
        } else {
            N.MX17n_KK(7, c8729pa3.b);
        }
    }
}
