package defpackage;

import android.view.View;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D12 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ F12 a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public D12(F12 f12) {
        this.a = f12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        F12 f12 = this.a;
        int i = f12.h;
        ND2 nd2 = AbstractC10087tY0.a;
        PropertyModel propertyModel = f12.i;
        if (i == 2) {
            propertyModel.m(nd2, 5);
        } else if (i == 3) {
            propertyModel.m(nd2, 6);
        }
        f12.h = 0;
        f12.j = 0.0f;
    }
}
