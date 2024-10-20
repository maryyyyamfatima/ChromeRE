package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JE1 {
    public final PropertyModel a;
    public final C10452uc0 b;
    public final ME1 c;
    public final boolean d;
    public boolean e;

    public JE1(InterfaceC7697ma2 interfaceC7697ma2, PropertyModel propertyModel, boolean z) {
        this.a = propertyModel;
        this.c = new ME1(propertyModel);
        this.d = z;
        this.b = new C10452uc0(interfaceC7697ma2, new IE1(this), new Callback() { // from class: HE1
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                JE1.this.b((Tab) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
        b((Tab) ((C8385oa2) interfaceC7697ma2).g);
    }

    public final void a(boolean z) {
        ND2 nd2 = KE1.a;
        ME1 me1 = this.c;
        me1.a.m(nd2, 2);
        me1.b.removeMessages(1);
        this.a.m(nd2, z ? 1 : 2);
    }

    public final void b(Tab tab) {
        if (tab == null) {
            if (this.d) {
                a(false);
            }
        } else {
            if (tab.e()) {
                if (AbstractC5107f12.a(tab.getUrl(), tab.isIncognito())) {
                    a(false);
                    return;
                }
                if (!this.e) {
                    this.a.m(KE1.a, 0);
                }
                c(tab.s());
                return;
            }
            a(false);
        }
    }

    public final void c(float f) {
        if (this.e) {
            return;
        }
        float max = Math.max(f, 0.05f);
        this.a.l(KE1.b, max);
        if (JM1.a(max, 1.0f)) {
            a(true);
        }
    }
}
