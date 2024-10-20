package org.chromium.chrome.browser.tab;

import J.N;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.KeyEvent;
import defpackage.AbstractC10328uD3;
import defpackage.AbstractC3362Zw2;
import defpackage.AbstractC7239lD3;
import defpackage.B44;
import defpackage.BA0;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C7928nE;
import defpackage.C9557rz;
import defpackage.RunnableC10671vD3;
import defpackage.SM1;
import defpackage.UN;
import defpackage.V60;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.BuildInfo;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroidImpl;
import org.chromium.components.find_in_page.FindMatchRectsDetails;
import org.chromium.components.find_in_page.FindNotificationDetails;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TabWebContentsDelegateAndroidImpl extends AbstractC10328uD3 {
    public final TabImpl a;
    public final AbstractC10328uD3 b;
    public final Handler c = new Handler();
    public final RunnableC10671vD3 d = new Runnable() { // from class: vD3
        @Override // java.lang.Runnable
        public final void run() {
            TabImpl tabImpl = TabWebContentsDelegateAndroidImpl.this.a;
            C11814ya2 P = tabImpl.P();
            while (P.hasNext()) {
                ((BA0) P.next()).j0(tabImpl);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [vD3] */
    public TabWebContentsDelegateAndroidImpl(TabImpl tabImpl, AbstractC10328uD3 abstractC10328uD3) {
        this.a = tabImpl;
        this.b = abstractC10328uD3;
    }

    public final void onFindResultAvailable(FindNotificationDetails findNotificationDetails) {
        C11814ya2 P = this.a.P();
        while (P.hasNext()) {
            ((BA0) P.next()).z0(findNotificationDetails);
        }
    }

    public final void onFindMatchRectsAvailable(FindMatchRectsDetails findMatchRectsDetails) {
        C11814ya2 P = this.a.P();
        while (P.hasNext()) {
            ((BA0) P.next()).y0(findMatchRectsDetails);
        }
    }

    public static Rect createRect(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3, i4);
    }

    public static RectF createRectF(float f, float f2, float f3, float f4) {
        return new RectF(f, f2, f3, f4);
    }

    public static FindNotificationDetails createFindNotificationDetails(int i, Rect rect, int i2, boolean z) {
        return new FindNotificationDetails(i, rect, i2, z);
    }

    public static FindMatchRectsDetails createFindMatchRectsDetails(int i, int i2, RectF rectF) {
        return new FindMatchRectsDetails(i, i2, rectF);
    }

    public static void setMatchRectByIndex(FindMatchRectsDetails findMatchRectsDetails, int i, RectF rectF) {
        findMatchRectsDetails.b[i] = rectF;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean shouldResumeRequestsForCreatedWindow() {
        return this.b.shouldResumeRequestsForCreatedWindow();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean addNewContents(WebContents webContents, WebContents webContents2, int i, Rect rect, boolean z) {
        return this.b.addNewContents(webContents, webContents2, i, rect, z);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void openNewTab(GURL gurl, String str, ResourceRequestBody resourceRequestBody, int i, boolean z) {
        this.b.openNewTab(gurl, str, resourceRequestBody, i, z);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void activateContents() {
        this.b.activateContents();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean addMessageToConsole(int i, String str, int i2, String str2) {
        return !BuildInfo.a();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void onUpdateUrl(GURL gurl) {
        C11814ya2 P = this.a.P();
        while (P.hasNext()) {
            ((BA0) P.next()).R0(gurl);
        }
        this.b.onUpdateUrl(gurl);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean takeFocus(boolean z) {
        return this.b.takeFocus(z);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void handleKeyboardEvent(KeyEvent keyEvent) {
        this.b.handleKeyboardEvent(keyEvent);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void enterFullscreenModeForTab(boolean z, boolean z2) {
        this.b.enterFullscreenModeForTab(z, z2);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void fullscreenStateChangedForTab(boolean z, boolean z2) {
        this.b.fullscreenStateChangedForTab(z, z2);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void exitFullscreenModeForTab() {
        this.b.exitFullscreenModeForTab();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean isFullscreenForTabOrPending() {
        return this.b.isFullscreenForTabOrPending();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void navigationStateChanged(int i) {
        int i2 = i & 2;
        TabImpl tabImpl = this.a;
        if (i2 != 0) {
            SM1.i(V60.a, tabImpl.getId(), tabImpl.l, tabImpl.getUrl());
            C9557rz.b(V60.a, tabImpl.getId(), tabImpl.l, tabImpl.getUrl(), tabImpl.isIncognito());
            B44.c(V60.a, tabImpl.getId(), tabImpl.l, tabImpl.getUrl(), tabImpl.isIncognito());
        }
        if ((i & 8) != 0) {
            tabImpl.c0();
        }
        if ((i & 1) != 0) {
            C11814ya2 P = tabImpl.P();
            while (P.hasNext()) {
                ((BA0) P.next()).S0(tabImpl);
            }
        }
        this.b.navigationStateChanged(i);
    }

    public final boolean isTabLargeEnoughForDesktopSite() {
        TabImpl tabImpl = this.a;
        if (!DeviceFormFactor.a(tabImpl.getContext())) {
            return false;
        }
        Activity b = AbstractC7239lD3.b(tabImpl);
        if (b == null && (b = ApplicationStatus.c) == null) {
            return false;
        }
        int width = b.getWindow().getDecorView().getWidth();
        C7928nE c7928nE = UN.a;
        return N.M37SqSAy("RequestDesktopSiteForTablets", "screen_width_dp", 4096) <= width;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void visibleSSLStateChanged() {
        AbstractC3362Zw2 y = AppHooks.get().y();
        TabImpl tabImpl = this.a;
        y.b(V60.a, N.MX4bLIGx(tabImpl.l));
        C11814ya2 P = tabImpl.P();
        while (P.hasNext()) {
            ((BA0) P.next()).O0(tabImpl);
        }
        this.b.visibleSSLStateChanged();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldCreateWebContents(GURL gurl) {
        return this.b.shouldCreateWebContents(gurl);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void webContentsCreated(WebContents webContents, long j, long j2, String str, GURL gurl, WebContents webContents2) {
        this.b.webContentsCreated(webContents, j, j2, str, gurl, webContents2);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void showRepostFormWarningDialog() {
        this.b.showRepostFormWarningDialog();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldBlockMediaRequest(GURL gurl) {
        return this.b.shouldBlockMediaRequest(gurl);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void closeContents() {
        Handler handler = this.c;
        RunnableC10671vD3 runnableC10671vD3 = this.d;
        handler.removeCallbacks(runnableC10671vD3);
        handler.post(runnableC10671vD3);
        this.b.closeContents();
    }

    @Override // defpackage.AbstractC10328uD3
    public void setOverlayMode(boolean z) {
        this.b.setOverlayMode(z);
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean shouldEnableEmbeddedMediaExperience() {
        return this.b.shouldEnableEmbeddedMediaExperience();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean isPictureInPictureEnabled() {
        return this.b.isPictureInPictureEnabled();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void loadingStateChanged(boolean z) {
        TabImpl tabImpl = this.a;
        WebContents webContents = tabImpl.l;
        boolean z2 = webContents != null && webContents.e();
        C12157za2 c12157za2 = tabImpl.p;
        if (z2) {
            if (z) {
                tabImpl.w = true;
            }
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((BA0) c11814ya2.next()).E0(tabImpl, z);
                }
            }
        } else {
            boolean z3 = tabImpl.w;
            tabImpl.w = false;
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    break;
                } else {
                    ((BA0) c11814ya22.next()).F0(tabImpl, z3);
                }
            }
        }
        this.b.loadingStateChanged(z);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void rendererResponsive() {
        TabImpl tabImpl = this.a;
        WebContents webContents = tabImpl.l;
        if (webContents != null) {
            N.M8ARKEz4(webContents);
        }
        tabImpl.Q(true);
        this.b.rendererResponsive();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void rendererUnresponsive() {
        TabImpl tabImpl = this.a;
        WebContents webContents = tabImpl.l;
        if (webContents != null) {
            N.MsGvyS6g(webContents);
        }
        tabImpl.Q(false);
        this.b.rendererUnresponsive();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean isNightModeEnabled() {
        return this.b.isNightModeEnabled();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean isForceDarkWebContentEnabled() {
        return this.b.isForceDarkWebContentEnabled();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean canShowAppBanners() {
        return this.b.canShowAppBanners();
    }

    @Override // defpackage.AbstractC10328uD3
    public String getManifestScope() {
        return this.b.getManifestScope();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean isCustomTab() {
        return this.b.isCustomTab();
    }

    @Override // defpackage.AbstractC10328uD3
    public boolean isInstalledWebappDelegateGeolocation() {
        return this.b.isInstalledWebappDelegateGeolocation();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsHeight() {
        return this.b.getTopControlsHeight();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsMinHeight() {
        return this.b.getTopControlsMinHeight();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsHeight() {
        return this.b.getBottomControlsHeight();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsMinHeight() {
        return this.b.getBottomControlsMinHeight();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldAnimateBrowserControlsHeightChanges() {
        return this.b.shouldAnimateBrowserControlsHeightChanges();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean controlsResizeView() {
        return this.b.controlsResizeView();
    }
}
