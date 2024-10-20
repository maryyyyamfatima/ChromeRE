package org.chromium.chrome.browser.tab.tab_restore;

import J.N;
import defpackage.C1695Nb0;
import defpackage.Gl4;
import defpackage.W71;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoricalTabSaverImpl implements W71 {
    public static final ArrayList b = new ArrayList(Arrays.asList("chrome", "chrome-native", "about"));
    public final TabModel a;

    public HistoricalTabSaverImpl(TabModel tabModel) {
        this.a = tabModel;
    }

    public static boolean a(Tab tab) {
        GURL url;
        if (tab.isIncognito()) {
            return false;
        }
        if (tab.b() != null) {
            url = tab.b().f();
        } else {
            url = tab.getUrl();
        }
        return (url == null || !url.b || url.k() || b.contains(url.h())) ? false : true;
    }

    public static WebContents createTemporaryWebContents(Tab tab) {
        Gl4 gl4 = C1695Nb0.m(tab).t;
        if (gl4 == null) {
            return null;
        }
        return (WebContents) N.MXGOiJkn(gl4.a, gl4.b, true, true);
    }

    public static void destroyTemporaryWebContents(WebContents webContents) {
        if (webContents == null) {
            return;
        }
        webContents.destroy();
    }
}
