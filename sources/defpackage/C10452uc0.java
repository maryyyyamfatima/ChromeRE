package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uc0 */
/* loaded from: classes.dex */
public final class C10452uc0 {
    public final InterfaceC7697ma2 a;
    public final BA0 b;
    public final C3809bF c;
    public C4496dF d;
    public Tab e;

    public C10452uc0(InterfaceC7697ma2 interfaceC7697ma2, BA0 ba0, final Callback callback) {
        this.a = interfaceC7697ma2;
        this.b = ba0;
        C4496dF c4496dF = new C4496dF();
        this.d = c4496dF;
        C3809bF b = c4496dF.b(new Callback() { // from class: tc0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tab tab = (Tab) obj;
                C10452uc0 c10452uc0 = C10452uc0.this;
                Tab tab2 = c10452uc0.e;
                if (tab2 == tab) {
                    return;
                }
                BA0 ba02 = c10452uc0.b;
                if (tab2 != null) {
                    tab2.w(ba02);
                }
                c10452uc0.e = tab;
                if (tab != null) {
                    tab.v(ba02);
                }
                Callback callback2 = callback;
                if (callback2 != null) {
                    callback2.onResult(tab);
                }
            }
        });
        this.c = b;
        ((C8385oa2) interfaceC7697ma2).m(b);
    }

    public final void a() {
        Tab tab = this.e;
        if (tab != null) {
            tab.w(this.b);
        }
        ((C8385oa2) this.a).n(this.c);
        this.d.a();
        this.d = null;
    }
}
