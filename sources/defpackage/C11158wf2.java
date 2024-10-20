package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wf2 */
/* loaded from: classes.dex */
public final class C11158wf2 extends Fl4 {
    public final /* synthetic */ OverlayPanelContent g;

    @Override // defpackage.Fl4
    public final void didFirstVisuallyNonEmptyPaint() {
        ContextualSearchManager contextualSearchManager = ((G70) this.g.o).a;
        R70 n = contextualSearchManager.v.n();
        boolean z = contextualSearchManager.L.a;
        n.p = true;
        n.o = z;
    }

    @Override // defpackage.Fl4
    public final void didStartLoading(GURL gurl) {
        ((G70) this.g.o).a.G = false;
    }

    @Override // defpackage.Fl4
    public final void loadProgressChanged(float f) {
        AbstractC9101qf2 abstractC9101qf2 = this.g.p.a;
        abstractC9101qf2.N = f;
        abstractC9101qf2.E0();
    }

    @Override // defpackage.Fl4
    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        this.g.o.getClass();
    }

    @Override // defpackage.Fl4
    public final void titleWasSet(String str) {
        this.g.o.getClass();
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
        String i = navigationHandle.e.i();
        OverlayPanelContent overlayPanelContent = this.g;
        AbstractC4290cf2 abstractC4290cf2 = overlayPanelContent.o;
        boolean z = !TextUtils.equals(i, overlayPanelContent.j);
        ContextualSearchManager contextualSearchManager = ((G70) abstractC4290cf2).a;
        contextualSearchManager.v.L();
        if (z) {
            contextualSearchManager.m(i);
        }
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a) {
            OverlayPanelContent overlayPanelContent = this.g;
            boolean z = false;
            overlayPanelContent.m = false;
            String i = navigationHandle.e.i();
            boolean z2 = !TextUtils.equals(navigationHandle.e.i(), overlayPanelContent.j);
            int i2 = navigationHandle.m;
            boolean z3 = i2 <= 0 || i2 >= 400;
            ContextualSearchManager contextualSearchManager = ((G70) overlayPanelContent.o).a;
            if (z2) {
                contextualSearchManager.t.getClass();
                Uri parse = Uri.parse(i);
                if (parse != null && parse.getHost() != null && parse.getPath() != null && parse.getHost().contains("google") && parse.getPath().startsWith("/amp/")) {
                    z = true;
                }
                if (z && contextualSearchManager.v.i()) {
                    contextualSearchManager.m(i);
                    return;
                }
                return;
            }
            C4803e80 c4803e80 = contextualSearchManager.L;
            if (c4803e80 != null && z3 && c4803e80.d) {
                if (contextualSearchManager.g() != null) {
                    ContextualSearchManager contextualSearchManager2 = contextualSearchManager.s;
                    if (contextualSearchManager2.g() != null) {
                        contextualSearchManager2.g().stop();
                    }
                }
                contextualSearchManager.L.getClass();
                contextualSearchManager.L.d = false;
                Q70 q70 = contextualSearchManager.v;
                if (q70 == null || !q70.a0()) {
                    contextualSearchManager.B = false;
                } else {
                    contextualSearchManager.v.f();
                    contextualSearchManager.l();
                }
            }
            C4803e80 c4803e802 = contextualSearchManager.L;
            if (c4803e802 == null || !c4803e802.a) {
                return;
            }
            contextualSearchManager.t.getClass();
            S70.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11158wf2(OverlayPanelContent overlayPanelContent, WebContents webContents) {
        super(webContents);
        this.g = overlayPanelContent;
    }
}
