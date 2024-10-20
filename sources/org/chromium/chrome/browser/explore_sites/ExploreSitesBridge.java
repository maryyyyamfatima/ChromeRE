package org.chromium.chrome.browser.explore_sites;

import defpackage.AbstractC1895Op0;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesBridge {
    public static float getScaleFactorFromDevice() {
        return AbstractC1895Op0.b(V60.a).d;
    }

    public static void scheduleDailyTask() {
        ExploreSitesBackgroundTask.j(false);
    }
}
