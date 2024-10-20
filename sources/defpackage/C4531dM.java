package defpackage;

import android.app.Activity;
import java.util.HashMap;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dM */
/* loaded from: classes.dex */
public final class C4531dM extends AbstractC1429Kz3 {
    public final /* synthetic */ ChromeActivity i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4531dM(ChromeActivity chromeActivity, AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
        this.i = chromeActivity;
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        this.i.K1();
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        this.i.K1();
        C1438Lb2 c1438Lb2 = AbstractC2217Rb2.a;
        WindowAndroid m = tab.m();
        if (C0268Cb2.m == null) {
            C0268Cb2.m = new HashMap();
            ApplicationStatus.f(new C11820yb2());
        }
        Activity activity = (Activity) m.k().get();
        C0268Cb2 c0268Cb2 = (C0268Cb2) C0268Cb2.m.get(activity);
        if (c0268Cb2 == null) {
            InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) ((C8385oa2) C0649Ez3.u(m)).g;
            C0268Cb2 c0268Cb22 = new C0268Cb2(interfaceC10590uz3, AbstractC1329Kf3.a(m), new C0008Ab2(interfaceC10590uz3));
            C0268Cb2.m.put(activity, c0268Cb22);
            c0268Cb2 = c0268Cb22;
        }
        if (AbstractC2217Rb2.e(tab)) {
            c0268Cb2.l = tab;
            if (!c0268Cb2.V0(tab)) {
                c0268Cb2.j.put(Integer.valueOf(tab.getId()), new C0138Bb2());
                tab.v(c0268Cb2);
            }
            if (!c0268Cb2.k) {
                NetworkChangeNotifier.a(c0268Cb2);
                c0268Cb2.k = true;
            }
        }
        c0268Cb2.W0(tab, false);
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        this.i.K1();
    }
}
