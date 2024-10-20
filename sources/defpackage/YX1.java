package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class YX1 {
    public Callback a;
    public PropertyModel g;

    public abstract void c(PropertyModel propertyModel);

    public abstract void f();

    public static void a(YX1 yx1, PropertyModel propertyModel, UX1 ux1) {
        if (propertyModel == null) {
            PropertyModel propertyModel2 = yx1.g;
            yx1.f();
            yx1.g = null;
            yx1.a = null;
            return;
        }
        yx1.g = propertyModel;
        yx1.a = ux1;
        yx1.c(propertyModel);
    }

    public final void d(int i) {
        Callback callback = this.a;
        if (callback == null) {
            return;
        }
        this.a = null;
        callback.onResult(Integer.valueOf(i));
    }
}
