package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h6 */
/* loaded from: classes.dex */
public abstract class AbstractC5822h6 extends BA0 {
    public final C6166i6 a;
    public final C5478g6 g;
    public Tab h;

    public void V0(Tab tab) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [org.chromium.base.Callback, g6] */
    public AbstractC5822h6(C6166i6 c6166i6) {
        this.a = c6166i6;
        ?? r0 = new Callback() { // from class: g6
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tab tab = (Tab) obj;
                AbstractC5822h6 abstractC5822h6 = AbstractC5822h6.this;
                Tab tab2 = abstractC5822h6.h;
                if (tab2 != null) {
                    tab2.w(abstractC5822h6);
                }
                abstractC5822h6.h = tab;
                if (tab != null) {
                    tab.v(abstractC5822h6);
                }
                abstractC5822h6.V0(tab);
            }
        };
        this.g = r0;
        c6166i6.m(r0);
        Tab tab = (Tab) c6166i6.g;
        Tab tab2 = this.h;
        if (tab2 != null) {
            tab2.w(this);
        }
        this.h = tab;
        if (tab != null) {
            tab.v(this);
        }
    }

    public void destroy() {
        Tab tab = this.h;
        if (tab != null) {
            tab.w(this);
            this.h = null;
        }
        this.a.n(this.g);
    }
}
