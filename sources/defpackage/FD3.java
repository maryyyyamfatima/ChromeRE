package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FD3 extends AbstractC0247Bx1 {
    public final Activity l;

    public FD3(Activity activity) {
        super(activity);
        this.l = activity;
    }

    @Override // defpackage.AbstractC0247Bx1
    public final int a() {
        Intent intent = this.l.getIntent();
        if (intent == null) {
            return 0;
        }
        if (AbstractC2281Ro1.g(intent)) {
            return 6;
        }
        if (AbstractC2281Ro1.j(intent, "com.android.chrome.invoked_from_shortcut", false) && AbstractC2281Ro1.h(intent)) {
            return 7;
        }
        if (3 == AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.webapp_source")) {
            return 8;
        }
        if (8 == AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.webapp_source")) {
            return 16;
        }
        if (AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.searchwidget.FROM_SEARCH_ACTIVITY", false)) {
            return AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.searchwidget.FROM_SEARCH_WIDGET", false) ? 8 : 10;
        }
        if ("android.speech.action.VOICE_SEARCH_RESULTS".equals(intent.getAction())) {
            return 10;
        }
        boolean z = true;
        if (!intent.hasExtra("org.chromium.chrome.browser.ServiceTabLauncher.LAUNCH_REQUEST_ID")) {
            int p = C1761No1.e(intent) == -1 ? -1 : AbstractC2281Ro1.p(-1, intent, "BRING_TAB_TO_FRONT_SOURCE");
            if (1 != p && p != 0) {
                z = false;
            }
        }
        if (z) {
            return 11;
        }
        if (2 == (C1761No1.e(intent) != -1 ? AbstractC2281Ro1.p(-1, intent, "BRING_TAB_TO_FRONT_SOURCE") : -1)) {
            return 8;
        }
        if (AbstractC2281Ro1.j(intent, "com.android.chrome.from_open_in_browser", false)) {
            return 9;
        }
        int c = C1761No1.c(intent);
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || c == 5) {
            return c == 5 ? 13 : 0;
        }
        return 12;
    }

    @Override // defpackage.AbstractC0247Bx1
    public final int b() {
        Intent intent = this.l.getIntent();
        if (this.a.a && intent != null) {
            if (AbstractC2281Ro1.j(intent, "com.android.chrome.from_open_in_browser", false)) {
                return 9;
            }
            boolean z = true;
            if (!intent.hasExtra("org.chromium.chrome.browser.ServiceTabLauncher.LAUNCH_REQUEST_ID")) {
                int p = C1761No1.e(intent) != -1 ? AbstractC2281Ro1.p(-1, intent, "BRING_TAB_TO_FRONT_SOURCE") : -1;
                if (1 != p && p != 0) {
                    z = false;
                }
            }
            if (z) {
                return 11;
            }
        }
        return 0;
    }
}
