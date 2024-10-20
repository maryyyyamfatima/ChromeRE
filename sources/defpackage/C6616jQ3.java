package defpackage;

import J.N;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jQ3 */
/* loaded from: classes2.dex */
public final class C6616jQ3 extends AbstractC5822h6 {
    public final /* synthetic */ C9707sQ3 i;

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        if (z) {
            this.i.o(true);
        }
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        C9707sQ3 c9707sQ3 = this.i;
        C10613v32 f = c9707sQ3.f();
        if (f == null || T34.j(loadUrlParams.a) || i == 0) {
            return;
        }
        NewTabPageLayout newTabPageLayout = f.v;
        if (true != newTabPageLayout.C) {
            newTabPageLayout.C = true;
        }
        c9707sQ3.i();
    }

    @Override // defpackage.BA0
    public final void H0(Tab tab) {
        C9707sQ3 c9707sQ3 = this.i;
        if (tab == c9707sQ3.z.a()) {
            c9707sQ3.m();
        }
    }

    @Override // defpackage.BA0
    public final void O0(TabImpl tabImpl) {
        C9707sQ3 c9707sQ3 = this.i;
        if (c9707sQ3.z.a() == null) {
            return;
        }
        LocationBarModel locationBarModel = c9707sQ3.z;
        locationBarModel.w();
        locationBarModel.y();
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        this.i.z.x();
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        C9707sQ3 c9707sQ3 = this.i;
        c9707sQ3.o(true);
        c9707sQ3.l.i.i = true;
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        if (z) {
            C9707sQ3 c9707sQ3 = this.i;
            c9707sQ3.z.y();
            c9707sQ3.z.w();
        }
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        C9707sQ3 c9707sQ3 = this.i;
        c9707sQ3.a();
        c9707sQ3.k.a.A();
        c9707sQ3.h();
        c9707sQ3.z.w();
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        C9707sQ3 c9707sQ3 = this.i;
        c9707sQ3.o(false);
        c9707sQ3.m();
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        C10613v32 f;
        NavigationController i;
        NavigationEntry w;
        boolean z = navigationHandle.g;
        C9707sQ3 c9707sQ3 = this.i;
        boolean z2 = navigationHandle.a;
        if (z && z2 && !navigationHandle.c) {
            c9707sQ3.k.a.w();
        }
        if (navigationHandle.l == 0 || !z2) {
            return;
        }
        WebContents webContents = tabImpl.l;
        if (((webContents == null || (i = webContents.i()) == null || (w = i.w()) == null) ? false : !T34.k(w.b)) || (f = c9707sQ3.f()) == null) {
            return;
        }
        NewTabPageLayout newTabPageLayout = f.v;
        if (newTabPageLayout.C) {
            newTabPageLayout.C = false;
            newTabPageLayout.k();
        }
        c9707sQ3.i();
    }

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        WebContents webContents = tabImpl.l;
        if (webContents == null || webContents.i() == null || !tabImpl.l.i().p()) {
            return;
        }
        this.i.z.y();
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        TraceEvent i = TraceEvent.i("ToolbarManager::onPageLoadFinished", null);
        try {
            W0(gurl);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6616jQ3(C9707sQ3 c9707sQ3, C6166i6 c6166i6) {
        super(c6166i6);
        this.i = c9707sQ3;
    }

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        C9707sQ3 c9707sQ3 = this.i;
        if (tab != null) {
            c9707sQ3.j(tab);
            c9707sQ3.i();
            W0(tab.getUrl());
            return;
        }
        c9707sQ3.z.y();
    }

    public final void W0(GURL gurl) {
        if (gurl == null || !T34.k(gurl)) {
            return;
        }
        Iterator it = this.i.z.s.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((ZF1) c11814ya2.next()).c();
            }
        }
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        if (tab.getUrl().k()) {
            return;
        }
        this.i.l.i.i = true;
    }

    @Override // defpackage.BA0
    public final void E0(TabImpl tabImpl, boolean z) {
        if (z) {
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("DelayToolbarUpdateOnLoadStarted")) {
                this.i.o(true);
            } else {
                PostTask.c(AbstractC5103f04.d, new Runnable() { // from class: iQ3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6616jQ3.this.i.o(true);
                    }
                });
            }
        }
    }
}
