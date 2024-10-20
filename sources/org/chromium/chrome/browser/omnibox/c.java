package org.chromium.chrome.browser.omnibox;

import defpackage.YF1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c implements YF1 {
    public LocationBarTablet a;

    public c(LocationBarTablet locationBarTablet) {
        this.a = locationBarTablet;
    }

    @Override // defpackage.YF1
    public final void destroy() {
        this.a = null;
    }
}
