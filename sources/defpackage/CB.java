package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class CB {
    public final PropertyModel a;

    public CB(final Callback callback, PropertyModel propertyModel) {
        this.a = propertyModel;
        propertyModel.o(DB.c, new Callback() { // from class: BB
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Callback.this.onResult((VR3) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }
}
