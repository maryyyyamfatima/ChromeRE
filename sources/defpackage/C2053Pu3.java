package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pu3 */
/* loaded from: classes.dex */
public final class C2053Pu3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C2183Qu3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        C2183Qu3.d().edit().clear().apply();
        C2183Qu3 c2183Qu3 = this.a;
        AbstractC7158kz3 e = ((AbstractC11276wz3) c2183Qu3.a).c.e(false);
        for (int i = 0; i < e.getCount(); i++) {
            Tab tabAt = e.getTabAt(i);
            C2183Qu3.d().edit().putString(C2183Qu3.g(tabAt.getId()), tabAt.getUrl().m()).apply();
            int id = tabAt.getId();
            C2183Qu3.d().edit().putString(C2183Qu3.f(id), tabAt.getTitle()).apply();
            int id2 = tabAt.getId();
            C2183Qu3.d().edit().putInt(C2183Qu3.c(id2), C1695Nb0.m(tabAt).r).apply();
            int id3 = tabAt.getId();
            C2183Qu3.d().edit().putLong(C2183Qu3.e(id3), C1695Nb0.m(tabAt).s).apply();
        }
        Tab h = ((AbstractC11276wz3) c2183Qu3.a).h();
        if (h != null) {
            C2183Qu3.a(h);
        }
        e.g.a(c2183Qu3.b);
    }

    public C2053Pu3(C2183Qu3 c2183Qu3) {
        this.a = c2183Qu3;
    }
}
