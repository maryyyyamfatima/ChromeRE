package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cj3 */
/* loaded from: classes2.dex */
public final class C0309Cj3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ ViewOnClickListenerC0699Fj3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        ((AbstractC11276wz3) viewOnClickListenerC0699Fj3.h).s(this);
        TabModel j = ((AbstractC11276wz3) viewOnClickListenerC0699Fj3.h).j(false);
        viewOnClickListenerC0699Fj3.z = j;
        if (viewOnClickListenerC0699Fj3.H) {
            viewOnClickListenerC0699Fj3.H = false;
            j.g(viewOnClickListenerC0699Fj3.A);
        }
    }

    public C0309Cj3(ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3) {
        this.a = viewOnClickListenerC0699Fj3;
    }
}
