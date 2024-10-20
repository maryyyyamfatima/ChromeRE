package org.chromium.chrome.browser.app.reengagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.C1761No1;
import defpackage.C7432ln3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ReengagementActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("launch_ntp".equals(getIntent().getAction())) {
            Intent b = C1761No1.b(this, false);
            C7432ln3 e = C7432ln3.e();
            try {
                startActivity(b);
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        finish();
    }
}
