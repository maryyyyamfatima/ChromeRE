package defpackage;

import java.lang.ref.WeakReference;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Fl4 {
    public WeakReference a;

    public Fl4() {
    }

    public void c(C8880q01 c8880q01, GURL gurl, boolean z, boolean z2, int i) {
    }

    public void didChangeThemeColor() {
    }

    public void didChangeVisibleSecurityState() {
    }

    public void didFailLoad(boolean z, int i, GURL gurl, int i2) {
    }

    public void didFinishNavigation(NavigationHandle navigationHandle) {
    }

    public void didFirstVisuallyNonEmptyPaint() {
    }

    public void didRedirectNavigation(NavigationHandle navigationHandle) {
    }

    public void didStartLoading(GURL gurl) {
    }

    public void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
    }

    public void didStartNavigationNoop(NavigationHandle navigationHandle) {
    }

    public void didStopLoading(GURL gurl, boolean z) {
    }

    public void didToggleFullscreenModeForTab(boolean z, boolean z2) {
    }

    public void e(C8880q01 c8880q01, boolean z, int i) {
    }

    public void f(WindowAndroid windowAndroid) {
    }

    public void frameReceivedUserActivation() {
    }

    public void g(C8880q01 c8880q01) {
    }

    public void hasEffectivelyFullscreenVideoChange(boolean z) {
    }

    public void i(C8880q01 c8880q01) {
    }

    public void loadProgressChanged(float f) {
    }

    public void mediaStartedPlaying() {
    }

    public void mediaStoppedPlaying() {
    }

    public void navigationEntriesChanged() {
    }

    public void navigationEntriesDeleted() {
    }

    public void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
    }

    public void onWebContentsFocused() {
    }

    public void onWebContentsLostFocus() {
    }

    public void primaryMainDocumentElementAvailable() {
    }

    public void renderProcessGone() {
    }

    public void titleWasSet(String str) {
    }

    public void viewportFitChanged(int i) {
    }

    public void wasHidden() {
    }

    public void wasShown() {
    }

    public Fl4(WebContents webContents) {
        this.a = new WeakReference(webContents);
        webContents.h0(this);
    }

    public void destroy() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return;
        }
        WebContents webContents = (WebContents) weakReference.get();
        this.a = null;
        if (webContents == null) {
            return;
        }
        webContents.P(this);
    }
}
