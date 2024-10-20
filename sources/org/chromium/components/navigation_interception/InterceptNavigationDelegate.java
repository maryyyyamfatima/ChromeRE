package org.chromium.components.navigation_interception;

import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class InterceptNavigationDelegate {
    public void onResourceRequestWithGesture() {
    }

    public abstract boolean shouldIgnoreNavigation(NavigationHandle navigationHandle, GURL gurl);

    public final void handleExternalProtocolDialog(GURL gurl, int i, boolean z, Origin origin) {
        shouldIgnoreNavigation(new NavigationHandle(0L, gurl, GURL.emptyGURL(), GURL.emptyGURL(), false, false, true, origin, i, false, z, false, true, 0L, false, false), gurl);
    }
}
