package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P60 {
    public final InterfaceC0079Ap3 a;
    public final IW0 b;
    public final C4874eM c;
    public N60 d;
    public O60 e;
    public boolean f;
    public GURL g;
    public String h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    public static void a(int i) {
        EI2.h(i, 21, "Search.IcingContextReportingStatus");
    }

    public P60(C6166i6 c6166i6, C0649Ez3 c0649Ez3, C4874eM c4874eM, C9106qg1 c9106qg1) {
        this.a = c6166i6;
        this.c = c4874eM;
        this.b = c9106qg1;
    }

    public final void b() {
        if (this.i.compareAndSet(true, false)) {
            C9106qg1 c9106qg1 = (C9106qg1) this.b;
            c9106qg1.g.execute(new C8076ng1(c9106qg1, c9106qg1.c));
        }
    }

    public final void c(Tab tab, boolean z, FW0 fw0) {
        Tab tab2 = (Tab) this.a.get();
        if (tab2 == null || tab2.isIncognito()) {
            if (tab2 == null) {
                a(7);
            } else {
                a(8);
            }
            b();
            return;
        }
        GURL url = tab2.getUrl();
        if (!url.k()) {
            Pattern pattern = T34.a;
            if (T34.l(url.h())) {
                if (tab2.getId() != tab.getId()) {
                    a(10);
                    return;
                }
                if (z && this.f) {
                    a(11);
                    return;
                }
                if (tab2.getUrl().equals(this.g) && TextUtils.equals(tab2.getTitle(), this.h) && fw0 == null) {
                    a(20);
                    return;
                }
                b();
                String i = tab2.getUrl().i();
                String title = tab2.getTitle();
                C9106qg1 c9106qg1 = (C9106qg1) this.b;
                c9106qg1.g.execute(new C7732mg1(c9106qg1, c9106qg1.c, i, title, fw0));
                this.f = z;
                this.g = tab2.getUrl();
                this.h = tab2.getTitle();
                this.i.set(true);
                return;
            }
        }
        a(9);
        b();
    }
}
