package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class GF0 {
    public static void a(ViewGroup viewGroup, PropertyModel propertyModel, boolean z) {
        PD2 pd2 = AbstractC0829Gj3.f;
        if (propertyModel.i(pd2) == null) {
            return;
        }
        C11046wK0 c11046wK0 = ((BF0) propertyModel.i(pd2)).b.o;
        if (z) {
            viewGroup.addView(c11046wK0);
            if (propertyModel.j(AbstractC0829Gj3.b)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c11046wK0.getLayoutParams();
                layoutParams.bottomMargin = propertyModel.h(AbstractC0829Gj3.a);
                layoutParams.topMargin = propertyModel.h(AbstractC0829Gj3.g);
                return;
            }
            return;
        }
        AbstractC8540p04.i(c11046wK0);
    }
}
