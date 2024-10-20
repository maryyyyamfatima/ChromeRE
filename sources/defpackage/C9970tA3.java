package defpackage;

import java.util.ArrayList;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tA3 */
/* loaded from: classes.dex */
public final class C9970tA3 {
    public final C10377uN2 a;
    public final C10505ul b;

    public C9970tA3(C10377uN2 c10377uN2, C10505ul c10505ul) {
        this.a = c10377uN2;
        this.b = c10505ul;
    }

    public final void a() {
        C10377uN2 c10377uN2 = this.a;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c10377uN2.a;
        abstractC11276wz3.j(false).l();
        abstractC11276wz3.j(true).l();
        ArrayList arrayList = new ArrayList(abstractC11276wz3.n());
        InterfaceC1548Lx3 h = abstractC11276wz3.j(false).h();
        for (int i = 0; i < h.getCount(); i++) {
            arrayList.add(h.getTabAt(i));
        }
        InterfaceC1548Lx3 h2 = abstractC11276wz3.j(true).h();
        for (int i2 = 0; i2 < h2.getCount(); i2++) {
            arrayList.add(h2.getTabAt(i2));
        }
        ((AbstractC11276wz3) c10377uN2.a).k = true;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Tab tab = (Tab) arrayList.get(i5);
            if (tab.e()) {
                tab.B();
                tab.b().i().b();
                i4++;
            }
            int id = tab.getId();
            C10505ul c10505ul = this.b;
            if (!(c10505ul.a.get(id) != null)) {
                if (!T34.k(tab.getUrl())) {
                    c10505ul.a(tab.getId(), new C10313uA3(tab, null));
                    Tab tab2 = C10720vN2.a(tab).a;
                    WebContents b = tab2.b();
                    if (b != null) {
                        b.i1(null);
                    }
                    tab2.G(null, null);
                }
            }
            i3++;
        }
        AbstractC4851eH1.d("org.chromium.chrome.browser.app.tab_activity_glue.TabReparentingController", AbstractC0800Ge.a("#prepareTabsForReparenting, num tabs awaiting reparenting: ", i3, ", num tabs still loading: ", i4), new Object[0]);
    }
}
