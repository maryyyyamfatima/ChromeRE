package defpackage;

import android.animation.ObjectAnimator;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class RD2 {
    public static ObjectAnimator a(PropertyModel propertyModel, MD2 md2, float f) {
        return ObjectAnimator.ofFloat(propertyModel, new QD2(md2), f);
    }
}
