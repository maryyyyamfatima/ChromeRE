package defpackage;

import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EA0 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        DA0 da0 = (DA0) obj;
        FD2 fd2 = (FD2) obj2;
        ND2 nd2 = InterfaceC9624sA0.a;
        if (fd2 == nd2) {
            int h = propertyModel.h(nd2);
            da0.getClass();
            da0.b.setVisibility(h == 1 ? 0 : 4);
            LoadingView loadingView = da0.d;
            if (h == 0) {
                loadingView.e();
                return;
            } else {
                loadingView.c();
                return;
            }
        }
        ND2 nd22 = InterfaceC9624sA0.b;
        if (fd2 == nd22) {
            da0.c.setText(propertyModel.h(nd22));
        }
    }
}
