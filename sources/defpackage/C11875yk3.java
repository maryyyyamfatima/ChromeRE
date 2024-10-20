package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yk3 */
/* loaded from: classes.dex */
public final class C11875yk3 extends AbstractC1429Kz3 {
    public final /* synthetic */ C0054Ak3 i;

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        C0054Ak3 c0054Ak3 = this.i;
        if (c0054Ak3.L) {
            int id = tab.getId();
            PropertyModel propertyModel = c0054Ak3.y;
            if (propertyModel.h(C1551Ly1.e) == id && propertyModel.j(C1551Ly1.A) && c0054Ak3.D) {
                c0054Ak3.K();
            }
        }
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        C0054Ak3 c0054Ak3 = this.i;
        if (c0054Ak3.y.h(C1551Ly1.e) != tab.getId()) {
            c0054Ak3.Q(tab);
        } else {
            c0054Ak3.R(tab);
        }
    }

    @Override // defpackage.BA0
    public final void h0(TabImpl tabImpl) {
        this.i.R(tabImpl);
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        this.i.R(tab);
    }

    @Override // defpackage.BA0
    public final void s0(int i, Tab tab) {
        this.i.R(tab);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11875yk3(C0054Ak3 c0054Ak3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = c0054Ak3;
    }
}
