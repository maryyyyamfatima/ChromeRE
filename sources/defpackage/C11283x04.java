package defpackage;

import J.N;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.metrics.UmaSessionStats;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x04 */
/* loaded from: classes.dex */
public final class C11283x04 extends AbstractC1429Kz3 {
    public final /* synthetic */ UmaSessionStats i;

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        UmaSessionStats umaSessionStats = this.i;
        umaSessionStats.getClass();
        WebContents b = tab.b();
        N.MZTfl9lI(b != null && b.i().m());
        if (umaSessionStats.e) {
            N.MeATiwBk();
        }
        final GURL url = tab.getUrl();
        if (T34.h(url)) {
            PostTask.c(QF3.h, new Runnable() { // from class: v04
                @Override // java.lang.Runnable
                public final void run() {
                    EI2.b("Android.InstantApps.EligiblePageLoaded", C9496ro1.a().b(GURL.this.i()) != null);
                }
            });
        }
        InterfaceC10590uz3 interfaceC10590uz3 = umaSessionStats.a;
        if (interfaceC10590uz3 == null) {
            return;
        }
        TabModel j = ((AbstractC11276wz3) interfaceC10590uz3).j(false);
        N.MP6JTEGK(j != null ? j.getCount() : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11283x04(UmaSessionStats umaSessionStats, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = umaSessionStats;
    }
}
