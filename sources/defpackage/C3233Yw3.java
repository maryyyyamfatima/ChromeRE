package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yw3 */
/* loaded from: classes.dex */
public final class C3233Yw3 extends AbstractC1429Kz3 {
    public final /* synthetic */ C4742dx3 i;

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        C4742dx3 c4742dx3 = this.i;
        if (((AbstractC11276wz3) c4742dx3.j).m(tab.getId()) == null) {
            return;
        }
        int size = c4742dx3.d(tab.getId()).size();
        if (!c4742dx3.B || size == 1) {
            size = 0;
        }
        EI2.e(size, "TabStrip.TabCountOnPageLoad");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3233Yw3(C4742dx3 c4742dx3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = c4742dx3;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            destroy();
            this.i.z = null;
        }
    }
}
