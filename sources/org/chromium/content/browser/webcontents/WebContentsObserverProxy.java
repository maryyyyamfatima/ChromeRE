package org.chromium.content.browser.webcontents;

import J.N;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C8880q01;
import defpackage.Fl4;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebContentsObserverProxy extends Fl4 {
    public long g;
    public final C12157za2 h;
    public final C11814ya2 i;
    public int j;

    public WebContentsObserverProxy(WebContentsImpl webContentsImpl) {
        Object obj = ThreadUtils.a;
        this.g = N.MTpUzW91(this, webContentsImpl);
        C12157za2 c12157za2 = new C12157za2();
        this.h = c12157za2;
        this.i = c12157za2.f();
        this.j = 0;
    }

    public final void l() {
        this.j++;
    }

    public final void k() {
        this.j--;
    }

    public void renderFrameCreated(int i, int i2) {
        g(new C8880q01(i, i2));
    }

    @Override // defpackage.Fl4
    public final void g(C8880q01 c8880q01) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).g(c8880q01);
        }
        k();
    }

    public void renderFrameDeleted(int i, int i2) {
        i(new C8880q01(i, i2));
    }

    @Override // defpackage.Fl4
    public final void i(C8880q01 c8880q01) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).i(c8880q01);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void renderProcessGone() {
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).renderProcessGone();
        }
    }

    @Override // defpackage.Fl4
    public void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didStartNavigationInPrimaryMainFrame(navigationHandle);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didStartNavigationNoop(NavigationHandle navigationHandle) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didStartNavigationNoop(navigationHandle);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didRedirectNavigation(NavigationHandle navigationHandle) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didRedirectNavigation(navigationHandle);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didFinishNavigation(NavigationHandle navigationHandle) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didFinishNavigation(navigationHandle);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didStartLoading(GURL gurl) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didStartLoading(gurl);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didStopLoading(GURL gurl, boolean z) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didStopLoading(gurl, z);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void loadProgressChanged(float f) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).loadProgressChanged(f);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didChangeVisibleSecurityState() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didChangeVisibleSecurityState();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didFailLoad(boolean z, int i, GURL gurl, int i2) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didFailLoad(z, i, gurl, i2);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didFirstVisuallyNonEmptyPaint() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didFirstVisuallyNonEmptyPaint();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void wasShown() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).wasShown();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void wasHidden() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).wasHidden();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void titleWasSet(String str) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).titleWasSet(str);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void primaryMainDocumentElementAvailable() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).primaryMainDocumentElementAvailable();
        }
        k();
    }

    public final void didFinishLoad(int i, int i2, GURL gurl, boolean z, boolean z2, int i3) {
        c(new C8880q01(i, i2), gurl, z, z2, i3);
    }

    @Override // defpackage.Fl4
    public final void c(C8880q01 c8880q01, GURL gurl, boolean z, boolean z2, int i) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).c(c8880q01, gurl, z, z2, i);
        }
        k();
    }

    public final void documentLoadedInFrame(int i, int i2, boolean z, int i3) {
        e(new C8880q01(i, i2), z, i3);
    }

    @Override // defpackage.Fl4
    public final void e(C8880q01 c8880q01, boolean z, int i) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).e(c8880q01, z, i);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).navigationEntryCommitted(loadCommittedDetails);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void navigationEntriesDeleted() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).navigationEntriesDeleted();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void navigationEntriesChanged() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).navigationEntriesChanged();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void frameReceivedUserActivation() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).frameReceivedUserActivation();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didChangeThemeColor() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didChangeThemeColor();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void mediaStartedPlaying() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).mediaStartedPlaying();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void mediaStoppedPlaying() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).mediaStoppedPlaying();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void hasEffectivelyFullscreenVideoChange(boolean z) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).hasEffectivelyFullscreenVideoChange(z);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void didToggleFullscreenModeForTab(boolean z, boolean z2) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).didToggleFullscreenModeForTab(z, z2);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void viewportFitChanged(int i) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).viewportFitChanged(i);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void onWebContentsFocused() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).onWebContentsFocused();
        }
        k();
    }

    @Override // defpackage.Fl4
    public void onWebContentsLostFocus() {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).onWebContentsLostFocus();
        }
        k();
    }

    @Override // defpackage.Fl4
    public final void f(WindowAndroid windowAndroid) {
        l();
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).f(windowAndroid);
        }
        k();
    }

    @Override // defpackage.Fl4
    public void destroy() {
        Object obj = ThreadUtils.a;
        C11814ya2 c11814ya2 = this.i;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((Fl4) c11814ya2.next()).destroy();
        }
        this.h.clear();
        long j = this.g;
        if (j != 0) {
            N.M7giG0Ri(j, this);
            this.g = 0L;
        }
    }
}
