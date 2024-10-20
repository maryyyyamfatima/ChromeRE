package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dz3 */
/* loaded from: classes.dex */
public final class C0519Dz3 extends C8385oa2 implements InterfaceC0259Bz3 {
    public InterfaceC10590uz3 i;

    @Override // defpackage.InterfaceC0259Bz3
    public final void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
    }

    public C0519Dz3(C0649Ez3 c0649Ez3) {
        c0649Ez3.m(new Callback() { // from class: Cz3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) obj;
                C0519Dz3 c0519Dz3 = C0519Dz3.this;
                c0519Dz3.i = interfaceC10590uz3;
                ((AbstractC11276wz3) interfaceC10590uz3).c(c0519Dz3);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        Profile b = tabModel.b();
        if (b == null) {
            return;
        }
        p(b);
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        p(((AbstractC11276wz3) this.i).g().b());
    }
}
