package defpackage;

import android.view.View;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.search_resumption.SearchResumptionModuleView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t03 */
/* loaded from: classes.dex */
public final class C9910t03 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        FD2 fd2 = (FD2) obj2;
        final SearchResumptionModuleView searchResumptionModuleView = (SearchResumptionModuleView) ((View) obj);
        LD2 ld2 = InterfaceC8882q03.a;
        if (ld2 == fd2) {
            searchResumptionModuleView.setVisibility(propertyModel.j(ld2) ? 0 : 8);
            return;
        }
        PD2 pd2 = InterfaceC8882q03.b;
        if (pd2 == fd2) {
            final Callback callback = (Callback) propertyModel.i(pd2);
            searchResumptionModuleView.a.setOnClickListener(new View.OnClickListener() { // from class: s03
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchResumptionModuleView searchResumptionModuleView2 = SearchResumptionModuleView.this;
                    boolean z = !searchResumptionModuleView2.h.a;
                    searchResumptionModuleView2.a(z, false);
                    callback.onResult(Boolean.valueOf(z));
                }
            });
        }
    }
}
