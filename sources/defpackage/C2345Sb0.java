package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sb0 */
/* loaded from: classes5.dex */
public final class C2345Sb0 {
    public final PropertyModel a;
    public final C2786Vl1 b;
    public final Runnable c;

    public C2345Sb0(PropertyModel propertyModel, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = propertyModel;
        this.b = c2786Vl1;
        this.c = runnable;
        propertyModel.o(AbstractC2475Tb0.b, new Callback() { // from class: Rb0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2345Sb0 c2345Sb0 = C2345Sb0.this;
                c2345Sb0.getClass();
                int intValue = ((Integer) obj).intValue();
                Runnable runnable2 = c2345Sb0.c;
                C2786Vl1 c2786Vl12 = c2345Sb0.b;
                if (2 == intValue) {
                    c2786Vl12.a();
                    runnable2.run();
                } else if (1 == intValue) {
                    c2786Vl12.b();
                    runnable2.run();
                }
            }
        });
    }
}
