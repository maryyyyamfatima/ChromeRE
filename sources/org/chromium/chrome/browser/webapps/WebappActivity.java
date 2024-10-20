package org.chromium.chrome.browser.webapps;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractActivityC1529Lu;
import defpackage.AbstractC0247Bx1;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC7071kk4;
import defpackage.C10179tn4;
import defpackage.FI2;
import defpackage.Nn4;
import defpackage.PC;
import defpackage.Pn4;
import defpackage.XU0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebappActivity extends AbstractActivityC1529Lu {
    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final Drawable j1() {
        return null;
    }

    @Override // defpackage.AbstractActivityC1529Lu, defpackage.AbstractActivityC7416ll
    public final boolean N0(Intent intent) {
        String w = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapk_package_name");
        return (w == null || w.startsWith("org.chromium.webapk")) ? false : true;
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity, defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final void g() {
        super.g();
        ((XU0) q1()).f();
    }

    @Override // defpackage.AbstractActivityC1529Lu, org.chromium.chrome.browser.app.ChromeActivity, defpackage.InterfaceC9377rT1
    public final boolean Y(int i, boolean z) {
        if (i == R.id.bookmark_this_page_id) {
            return true;
        }
        if (i == R.id.open_in_browser_id) {
            this.W0.d();
            if (z) {
                FI2.a("WebappMenuOpenInChrome");
            } else {
                FI2.a("Webapp.NotificationOpenInChrome");
            }
            return true;
        }
        return super.Y(i, z);
    }

    @Override // defpackage.AbstractActivityC1529Lu
    public final PC Q1(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (TextUtils.isEmpty(AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.webapk_package_name"))) {
            return Nn4.a(intent);
        }
        return AbstractC7071kk4.a(intent);
    }

    @Override // org.chromium.chrome.browser.app.ChromeActivity
    public final AbstractC0247Bx1 X0() {
        C10179tn4 c10179tn4 = this.d1;
        return new Pn4(this, c10179tn4 == null ? null : c10179tn4.g);
    }
}
