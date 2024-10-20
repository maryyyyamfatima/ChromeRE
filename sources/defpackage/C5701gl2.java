package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gl2 */
/* loaded from: classes.dex */
public final class C5701gl2 extends BA0 {
    public C5701gl2(TabImpl tabImpl) {
        tabImpl.v(this);
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        Activity activity;
        if (tab.b() == null) {
            return;
        }
        WindowAndroid Q0 = tab.b().Q0();
        Intent intent = (Q0 == null || (activity = (Activity) Q0.k().get()) == null) ? null : activity.getIntent();
        if (intent == null || intent.getExtras() == null || !intent.hasExtra("org.chromium.chrome.browser.password_check.PASSWORD_CHANGE_TYPE")) {
            return;
        }
        N.MCnWTXic(tab.b(), "PasswordManager.PasswordChangeTriggered", "PasswordChangeType", intent.getExtras().getInt("org.chromium.chrome.browser.password_check.PASSWORD_CHANGE_TYPE"));
        intent.removeExtra("org.chromium.chrome.browser.password_check.PASSWORD_CHANGE_TYPE");
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }
}
