package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nD3 */
/* loaded from: classes.dex */
public final class C7927nD3 extends BA0 {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ C8957qD3 g;

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.g.b();
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        this.g.b();
    }

    public C7927nD3(C8957qD3 c8957qD3, C7583mD3 c7583mD3) {
        this.g = c8957qD3;
        this.a = c7583mD3;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        Callback callback = this.a;
        C8957qD3 c8957qD3 = this.g;
        if (windowAndroid != null) {
            C0565Ej c0565Ej = tab.m().n;
            c8957qD3.j = c0565Ej;
            c0565Ej.m(callback);
        } else {
            ((C8385oa2) c8957qD3.j).n(callback);
            c8957qD3.j = null;
            c8957qD3.b();
        }
    }
}
