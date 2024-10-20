package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nS3 */
/* loaded from: classes5.dex */
public final class C8002nS3 {
    public final PropertyModel a;
    public final C2786Vl1 b;
    public final Runnable c;
    public final Runnable d;

    public C8002nS3(PropertyModel propertyModel, C2786Vl1 c2786Vl1, Runnable runnable, Runnable runnable2) {
        this.a = propertyModel;
        this.b = c2786Vl1;
        this.c = runnable;
        this.d = runnable2;
        propertyModel.o(AbstractC8346oS3.e, new Callback() { // from class: mS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8002nS3 c8002nS3 = C8002nS3.this;
                c8002nS3.getClass();
                int intValue = ((Integer) obj).intValue();
                C2786Vl1 c2786Vl12 = c8002nS3.b;
                if (1 == intValue) {
                    c2786Vl12.j();
                    return;
                }
                if (2 == intValue) {
                    c2786Vl12.g();
                } else if (4 == intValue) {
                    c8002nS3.c.run();
                } else if (3 == intValue) {
                    c8002nS3.d.run();
                }
            }
        });
    }
}
