package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EN0 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        DN0 dn0 = (DN0) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = BN0.a;
        if (fd2 == pd2) {
            View view = (View) propertyModel.i(pd2);
            ViewGroup viewGroup = dn0.c;
            viewGroup.removeAllViews();
            if (view != null) {
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -2));
                return;
            }
            return;
        }
        ND2 nd2 = BN0.b;
        if (fd2 == nd2) {
            int h = propertyModel.h(nd2);
            dn0.getClass();
            int i = h != 0 ? 1 : 0;
            TabLayout tabLayout = dn0.b;
            if (tabLayout.j() == i) {
                return;
            }
            tabLayout.k(i).b();
            return;
        }
        PD2 pd22 = BN0.c;
        if (fd2 != pd22) {
            LD2 ld2 = BN0.d;
            if (fd2 == ld2) {
                boolean j = propertyModel.j(ld2);
                dn0.getClass();
                dn0.b.setVisibility(j ? 0 : 8);
                return;
            }
            return;
        }
        dn0.d = (Callback) propertyModel.i(pd22);
    }
}
