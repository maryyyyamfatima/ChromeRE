package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class GB1 {
    public final PropertyModel a;
    public final C2786Vl1 b;
    public final Runnable c;

    public GB1(PropertyModel propertyModel, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = propertyModel;
        this.b = c2786Vl1;
        this.c = runnable;
        propertyModel.o(HB1.e, new Callback() { // from class: EB1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                GB1 gb1 = GB1.this;
                gb1.getClass();
                int intValue = ((Integer) obj).intValue();
                C2786Vl1 c2786Vl12 = gb1.b;
                if (1 == intValue) {
                    c2786Vl12.j();
                    return;
                }
                if (2 == intValue) {
                    c2786Vl12.g();
                    return;
                }
                Runnable runnable2 = gb1.c;
                if (4 == intValue) {
                    c2786Vl12.a();
                    runnable2.run();
                } else if (3 == intValue) {
                    c2786Vl12.b();
                    runnable2.run();
                }
            }
        });
        propertyModel.l(HB1.d, 0.4f);
        propertyModel.o(HB1.f, new FB1(this));
    }
}
