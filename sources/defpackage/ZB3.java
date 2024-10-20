package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import org.chromium.chrome.browser.toolbar.TabSwitcherButtonView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZB3 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        TabSwitcherButtonView tabSwitcherButtonView = (TabSwitcherButtonView) obj;
        FD2 fd2 = (FD2) obj2;
        ND2 nd2 = YB3.a;
        if (nd2 == fd2) {
            tabSwitcherButtonView.s.e(propertyModel.h(nd2), false);
            return;
        }
        PD2 pd2 = YB3.b;
        if (pd2 == fd2) {
            tabSwitcherButtonView.setOnClickListener((View.OnClickListener) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = YB3.c;
        if (pd22 == fd2) {
            tabSwitcherButtonView.setOnLongClickListener((View.OnLongClickListener) propertyModel.i(pd22));
            return;
        }
        PD2 pd23 = YB3.d;
        if (pd23 == fd2) {
            tabSwitcherButtonView.s.c((ColorStateList) propertyModel.i(pd23));
        } else {
            LD2 ld2 = YB3.e;
            if (ld2 == fd2) {
                tabSwitcherButtonView.setEnabled(propertyModel.j(ld2));
            }
        }
    }
}
