package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aj3 */
/* loaded from: classes2.dex */
public final class C0049Aj3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ ViewOnClickListenerC0699Fj3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C0049Aj3(ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3) {
        this.a = viewOnClickListenerC0699Fj3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        boolean isIncognito = tabModel.isIncognito();
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        if (isIncognito == viewOnClickListenerC0699Fj3.s) {
            return;
        }
        viewOnClickListenerC0699Fj3.s = isIncognito;
        LD2 ld2 = AbstractC6910kG3.b;
        PropertyModel propertyModel = viewOnClickListenerC0699Fj3.i;
        propertyModel.k(ld2, isIncognito);
        viewOnClickListenerC0699Fj3.x();
        if (propertyModel.j(AbstractC0829Gj3.e)) {
            viewOnClickListenerC0699Fj3.o();
        }
    }
}
