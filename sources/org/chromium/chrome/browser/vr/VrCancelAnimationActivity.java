package org.chromium.chrome.browser.vr;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrCancelAnimationActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        overridePendingTransition(0, 0);
    }
}
