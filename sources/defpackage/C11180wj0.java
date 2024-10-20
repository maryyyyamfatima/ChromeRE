package defpackage;

import J.N;
import android.content.Intent;
import android.text.TextUtils;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11180wj0 implements InterfaceC1835Od0 {
    public final C4620dd0 a;
    public final C2090Qc0 b;
    public final C2095Qd0 c;
    public final InterfaceC3241Yy1 d;

    public C11180wj0(C4620dd0 c4620dd0, C2090Qc0 c2090Qc0, C2095Qd0 c2095Qd0, InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = c4620dd0;
        this.b = c2090Qc0;
        this.c = c2095Qd0;
        this.d = interfaceC3241Yy1;
    }

    @Override // defpackage.InterfaceC1835Od0
    public final void a(PC pc) {
        C4620dd0 c4620dd0 = this.a;
        int i = c4620dd0.c;
        C2090Qc0 c2090Qc0 = this.b;
        if (i != 4) {
            LoadUrlParams loadUrlParams = new LoadUrlParams(pc.D(), 0);
            String w = AbstractC2281Ro1.w(pc.p(), "org.chromium.chrome.browser.password_change.username");
            if (w != null) {
                Intent p = pc.p();
                try {
                    p.removeExtra("org.chromium.chrome.browser.password_change.username");
                } catch (Throwable unused) {
                    AbstractC4851eH1.a("IntentUtils", "removeExtra failed on intent " + p, new Object[0]);
                }
                N.MkPYGQUS(new GURL(loadUrlParams.a), w);
            }
            c2090Qc0.b(C1761No1.k(pc.p()), loadUrlParams);
            return;
        }
        Tab tab = c4620dd0.b;
        if (tab == null) {
            throw new IllegalStateException("handleInitialIntent called before Tab created");
        }
        String D = pc.D();
        GURL gurl = new GURL(D);
        boolean e = tab.e();
        C2095Qd0 c2095Qd0 = this.c;
        InterfaceC3241Yy1 interfaceC3241Yy1 = this.d;
        if (!e && !tab.n()) {
            ((C2875Wd0) interfaceC3241Yy1.get()).K0(tab, gurl);
            ((C2875Wd0) interfaceC3241Yy1.get()).J0(tab, gurl);
            c2095Qd0.K0(tab, gurl);
            c2095Qd0.J0(tab, gurl);
        }
        String str = c4620dd0.d;
        if (!TextUtils.equals(str, D)) {
            LoadUrlParams loadUrlParams2 = new LoadUrlParams(D, 0);
            if (str != null) {
                Pattern pattern = T34.a;
                if (TextUtils.equals(str, D) ? false : N.MMsz$c1t(str, D)) {
                    loadUrlParams2.o = true;
                }
            }
            c2090Qc0.b(C1761No1.k(pc.p()), loadUrlParams2);
            return;
        }
        if (tab.e()) {
            ((C2875Wd0) interfaceC3241Yy1.get()).K0(tab, gurl);
            c2095Qd0.K0(tab, gurl);
        }
    }

    @Override // defpackage.InterfaceC1835Od0
    public final void b(PC pc) {
        String D = pc.D();
        if (TextUtils.isEmpty(D)) {
            return;
        }
        LoadUrlParams loadUrlParams = new LoadUrlParams(D, 0);
        if (pc.K()) {
            loadUrlParams.s = true;
        }
        this.b.b(C1761No1.k(pc.p()), loadUrlParams);
    }
}
