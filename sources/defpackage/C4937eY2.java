package defpackage;

import android.view.View;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eY2 */
/* loaded from: classes.dex */
public final class C4937eY2 extends BA0 implements Callback {
    public final InterfaceC7697ma2 a;
    public final C5969hY2 g;
    public Tab h;
    public View i;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Tab tab = (Tab) obj;
        Tab tab2 = this.h;
        if (tab2 != null) {
            tab2.w(this);
        }
        this.h = tab;
        this.g.a.a.b = tab;
        if (tab != null) {
            tab.v(this);
            l0(tab);
        }
    }

    public C4937eY2(C6166i6 c6166i6) {
        C5969hY2 c5969hY2 = new C5969hY2();
        this.a = c6166i6;
        this.g = c5969hY2;
        c6166i6.m(this);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        View view = this.i;
        C5969hY2 c5969hY2 = this.g;
        if (view != null) {
            c5969hY2.getClass();
            view.setScrollCaptureHint(0);
            view.setScrollCaptureCallback(null);
            this.i = null;
        }
        if (tab.isNativePage() || tab.u() || tab.n()) {
            return;
        }
        View a = tab.a();
        this.i = a;
        if (a != null) {
            ScrollCaptureCallbackC4594dY2 scrollCaptureCallbackC4594dY2 = c5969hY2.a;
            a.setScrollCaptureHint(scrollCaptureCallbackC4594dY2 != null ? 2 : 0);
            a.setScrollCaptureCallback(scrollCaptureCallbackC4594dY2);
        }
    }
}
