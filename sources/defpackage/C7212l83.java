package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l83, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7212l83 {
    public static boolean a(Tab tab) {
        if (tab == null) {
            return false;
        }
        GURL url = tab.getUrl();
        return ((url.h().equals("chrome") || url.h().equals("chrome-native")) || url.h().equals("data")) ? false : true;
    }
}
