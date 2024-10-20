package org.chromium.chrome.browser.vr;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import defpackage.AbstractC2281Ro1;
import defpackage.C6715ji4;
import defpackage.EI2;
import defpackage.RunnableC11178wi4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrFirstRunActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EI2.b("VRFreNotComplete.Browser", true);
        VrShellDelegate.w(this, true);
        C6715ji4 l = VrShellDelegate.l();
        if (l.b()) {
            new Handler().postDelayed(new RunnableC11178wi4(this, l), 500L);
        } else {
            try {
                startActivity((Intent) AbstractC2281Ro1.s(getIntent(), "org.chromium.chrome.browser.vr.VR_FRE"), null);
            } catch (ActivityNotFoundException unused) {
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 7212) {
            return;
        }
        if (i2 != -1) {
            finish();
            VrShellDelegate.l().c();
        } else {
            try {
                startActivity((Intent) AbstractC2281Ro1.s(getIntent(), "org.chromium.chrome.browser.vr.VR_FRE"), null);
            } catch (ActivityNotFoundException unused) {
            }
            finish();
        }
    }
}
