package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sd3 */
/* loaded from: classes2.dex */
public final class C9775sd3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C10461ud3 a;

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
        C10461ud3 c10461ud3 = this.a;
        TabModel j = ((AbstractC11276wz3) c10461ud3.g).j(false);
        if (c10461ud3.p) {
            c10461ud3.p = false;
            ((AbstractC11276wz3) c10461ud3.g).c.b(c10461ud3.j);
        }
        int index = j.index();
        if (index != -1) {
            Tab tabAt = j.getTabAt(index);
            c10461ud3.h.o(AbstractC10804vd3.d, tabAt.getTitle());
            if (c10461ud3.q == null) {
                c10461ud3.q = Long.valueOf(SystemClock.elapsedRealtime());
            }
            C5091ey3 c5091ey3 = c10461ud3.i;
            if (c5091ey3.i) {
                c10461ud3.r = true;
                GURL url = tabAt.getUrl();
                C8404od3 c8404od3 = new C8404od3(c10461ud3);
                c5091ey3.getClass();
                c5091ey3.c(url, false, new C4404cy3(c8404od3));
            }
        }
    }

    public C9775sd3(C10461ud3 c10461ud3) {
        this.a = c10461ud3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        boolean isIncognito = tabModel.isIncognito();
        C10461ud3 c10461ud3 = this.a;
        if (!isIncognito) {
            c10461ud3.n = true;
        }
        c10461ud3.l.p(Boolean.valueOf(c10461ud3.b()));
    }
}
