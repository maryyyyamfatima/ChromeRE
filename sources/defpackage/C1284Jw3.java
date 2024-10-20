package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jw3 */
/* loaded from: classes.dex */
public final class C1284Jw3 extends AbstractC11339xA0 {
    public final /* synthetic */ C10242ty3 a;

    @Override // defpackage.AbstractC11339xA0
    public final void g(int i, Tab tab) {
        C1024Hw3 c1024Hw3 = (C1024Hw3) ((AbstractC11276wz3) this.a.a).c.d();
        String a = AbstractC1414Kw3.a(C1695Nb0.m(tab).r);
        if (a == null) {
            return;
        }
        if (c1024Hw3.G(tab.getId()).size() == 2) {
            C10242ty3.a(C1695Nb0.m(tab).r);
        } else if (C1695Nb0.m(tab).r != i) {
            C10242ty3.a(C1695Nb0.m(tab).r);
            AbstractC1414Kw3.b(i, a);
        }
    }

    public C1284Jw3(C10242ty3 c10242ty3) {
        this.a = c10242ty3;
    }

    @Override // defpackage.AbstractC11339xA0
    public final void f(int i, Tab tab) {
        int i2 = C1695Nb0.m(tab).r;
        this.a.getClass();
        String a = AbstractC1414Kw3.a(i2);
        String a2 = AbstractC1414Kw3.a(i);
        if (a == null) {
            return;
        }
        C10242ty3.a(C1695Nb0.m(tab).r);
        if (a2 == null) {
            AbstractC1414Kw3.b(i, a);
        }
    }
}
