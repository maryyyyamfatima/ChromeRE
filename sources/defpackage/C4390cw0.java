package defpackage;

import android.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cw0 */
/* loaded from: classes.dex */
public final class C4390cw0 implements TD2 {
    public final C9885sw a = new C9885sw(new C5378fp());

    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        C4047bw0 c4047bw0 = (C4047bw0) obj;
        FD2 fd2 = (FD2) obj2;
        this.a.d(propertyModel, c4047bw0.a, fd2);
        ND2 nd2 = AbstractC5038ep3.a;
        if (nd2 == fd2) {
            c4047bw0.g.setBackground(AbstractC5647gc2.e(propertyModel.h(nd2), R.attr.listDivider, c4047bw0.getContext()));
        }
    }
}
