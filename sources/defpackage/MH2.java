package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MH2 extends Fl4 {
    public boolean g;
    public int h;
    public final /* synthetic */ NH2 i;

    @Override // defpackage.Fl4
    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        NH2 nh2 = this.i;
        if (nh2.p) {
            return;
        }
        nh2.j = false;
        nh2.s = false;
        Tab tab = nh2.q;
        if (tab != null && !tab.isNativePage() && !tab.t()) {
            EI2.b("DomDistiller.ReaderShownForPageLoad", false);
        }
        nh2.l = false;
        if (tab == null || AbstractC2290Rq0.c(tab.getUrl()) || !nh2.m) {
            return;
        }
        nh2.m = false;
        EI2.j(SystemClock.elapsedRealtime() - nh2.n, "DomDistiller.Time.ViewingReaderModePage");
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationNoop(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        if (navigationHandle.c) {
            return;
        }
        NavigationController i = ((WebContents) this.a.get()).i();
        int k = i.k();
        NavigationEntry e = i.e(k);
        if (e != null && AbstractC2290Rq0.c(e.b)) {
            this.g = true;
            this.h = k;
        }
        NH2 nh2 = this.i;
        if (nh2.p) {
            return;
        }
        GURL gurl = navigationHandle.e;
        nh2.k = gurl;
        if (AbstractC2290Rq0.c(gurl)) {
            nh2.i = 2;
            nh2.a = navigationHandle.e;
        }
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            if (this.g) {
                this.g = false;
                NavigationController i = ((WebContents) this.a.get()).i();
                if (i.e(this.h) != null) {
                    i.r(this.h);
                }
            }
            NH2 nh2 = this.i;
            if (nh2.p) {
                return;
            }
            nh2.i = 0;
            GURL gurl = nh2.a;
            if (gurl == null || !navigationHandle.e.equals(AbstractC2290Rq0.a(gurl))) {
                nh2.i = 1;
                nh2.g = false;
            }
            nh2.a = null;
            if (nh2.i == 0) {
                nh2.Y0();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MH2(NH2 nh2, WebContents webContents) {
        super(webContents);
        this.i = nh2;
    }
}
