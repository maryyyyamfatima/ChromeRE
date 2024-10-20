package defpackage;

import android.view.View;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.components.omnibox.action.OmniboxPedal;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uq2 */
/* loaded from: classes.dex */
public final class C2682Uq2 implements TD2 {
    public final C9885sw a;

    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        C2552Tq2 c2552Tq2 = (C2552Tq2) obj;
        FD2 fd2 = (FD2) obj2;
        this.a.d(propertyModel, c2552Tq2.a, fd2);
        PD2 pd2 = AbstractC2942Wq2.a;
        ND2 nd2 = AbstractC5038ep3.a;
        C3072Xq2 c3072Xq2 = c2552Tq2.g;
        if (pd2 == fd2) {
            String str = ((OmniboxPedal) propertyModel.i(pd2)).b;
            String string = c2552Tq2.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140150, str);
            c3072Xq2.a.g.setText(str);
            c3072Xq2.a.g.setContentDescription(string);
            c3072Xq2.a.g.setTextColor(AbstractC5647gc2.b(c2552Tq2.getContext(), propertyModel.h(nd2)));
            return;
        }
        PD2 pd22 = AbstractC2942Wq2.b;
        if (pd22 == fd2) {
            C2812Vq2 c2812Vq2 = (C2812Vq2) propertyModel.i(pd22);
            c3072Xq2.a.b(c2812Vq2.a, c2812Vq2.b);
            c3072Xq2.a.setBackgroundColor(0);
            return;
        }
        PD2 pd23 = AbstractC2942Wq2.c;
        if (pd23 == fd2) {
            c3072Xq2.a.setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
            return;
        }
        if (nd2 == fd2) {
            c3072Xq2.setBackground(C9885sw.b(c2552Tq2, propertyModel));
            return;
        }
        ND2 nd22 = AbstractC5038ep3.b;
        if (nd22 == fd2) {
            int h = propertyModel.h(nd22);
            WeakHashMap weakHashMap = Ec4.a;
            c3072Xq2.setLayoutDirection(h);
        }
    }

    public C2682Uq2(C5378fp c5378fp) {
        this.a = new C9885sw(c5378fp);
    }
}
