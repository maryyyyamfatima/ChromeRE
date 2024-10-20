package org.chromium.chrome.browser.tabmodel;

import J.N;
import defpackage.AbstractC10569uv3;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC7158kz3;
import defpackage.C0649Ez3;
import defpackage.C1024Hw3;
import defpackage.C8190nz3;
import defpackage.C8385oa2;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC7697ma2;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TabModelJniBridge implements TabModel {
    public final boolean a;
    public final int g;
    public long h;

    public abstract boolean closeTabAt(int i);

    public abstract boolean createTabWithWebContents(Tab tab, Profile profile, WebContents webContents);

    @Override // defpackage.InterfaceC1548Lx3
    public abstract int getCount();

    @Override // defpackage.InterfaceC1548Lx3
    public abstract Tab getTabAt(int i);

    @Override // defpackage.InterfaceC1548Lx3
    public abstract int index();

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public abstract boolean isActiveModel();

    public abstract boolean isSessionRestoreInProgress();

    public abstract AbstractC10569uv3 o(boolean z);

    public abstract void openNewTab(Tab tab, GURL gurl, Origin origin, String str, ResourceRequestBody resourceRequestBody, int i, boolean z, boolean z2);

    public TabModelJniBridge(int i, Profile profile) {
        this.a = profile.i();
        this.g = i;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public void destroy() {
        long j = this.h;
        if (j != 0) {
            N.Mg3Aho0E(j, this);
            this.h = 0L;
        }
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final boolean isIncognito() {
        return this.a;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final Profile b() {
        return (Profile) N.McKCR2Q3(this.h, this);
    }

    public Tab createNewTabForDevTools(GURL gurl) {
        return o(false).b(2, null, new LoadUrlParams(gurl.i(), 0));
    }

    public static boolean hasOtherRelatedTabs(Tab tab) {
        InterfaceC7697ma2 u;
        InterfaceC10590uz3 interfaceC10590uz3;
        WindowAndroid m = tab.m();
        if (m == null || (u = C0649Ez3.u(m)) == null || (interfaceC10590uz3 = (InterfaceC10590uz3) ((C8385oa2) u).g) == null) {
            return false;
        }
        AbstractC7158kz3 e = ((AbstractC11276wz3) interfaceC10590uz3).c.e(tab.isIncognito());
        if (e instanceof C1024Hw3) {
            return ((C1024Hw3) e).K(tab);
        }
        return false;
    }

    public final void setIndex(int i) {
        ((C8190nz3) this).q(i, 3, false);
    }
}
