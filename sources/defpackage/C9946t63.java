package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t63 */
/* loaded from: classes5.dex */
public final class C9946t63 {
    public final PropertyModel a;
    public final C2786Vl1 b;
    public final Runnable c;

    public C9946t63(PropertyModel propertyModel, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = propertyModel;
        this.b = c2786Vl1;
        this.c = runnable;
        propertyModel.o(AbstractC10289u63.c, new Callback() { // from class: s63
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9946t63 c9946t63 = C9946t63.this;
                c9946t63.getClass();
                int intValue = ((Integer) obj).intValue();
                Runnable runnable2 = c9946t63.c;
                C2786Vl1 c2786Vl12 = c9946t63.b;
                if (2 == intValue) {
                    c2786Vl12.a();
                    runnable2.run();
                    return;
                }
                if (1 == intValue) {
                    c2786Vl12.b();
                    runnable2.run();
                    return;
                }
                ND2 nd2 = AbstractC10289u63.b;
                PropertyModel propertyModel2 = c9946t63.a;
                if (3 == intValue) {
                    c2786Vl12.h(3);
                    propertyModel2.m(nd2, 2);
                } else if (4 == intValue) {
                    c2786Vl12.h(2);
                    propertyModel2.m(nd2, 1);
                } else if (5 == intValue) {
                    c2786Vl12.h(4);
                    propertyModel2.m(nd2, 3);
                }
            }
        });
    }
}
