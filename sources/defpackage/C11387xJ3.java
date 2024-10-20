package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xJ3 */
/* loaded from: classes5.dex */
public final class C11387xJ3 {
    public final PropertyModel a;
    public final C2786Vl1 b;
    public final Runnable c;

    public C11387xJ3(PropertyModel propertyModel, C2786Vl1 c2786Vl1, Runnable runnable) {
        this.a = propertyModel;
        this.b = c2786Vl1;
        this.c = runnable;
        propertyModel.o(AbstractC11730yJ3.b, new Callback() { // from class: wJ3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11387xJ3 c11387xJ3 = C11387xJ3.this;
                c11387xJ3.getClass();
                int intValue = ((Integer) obj).intValue();
                Runnable runnable2 = c11387xJ3.c;
                C2786Vl1 c2786Vl12 = c11387xJ3.b;
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
