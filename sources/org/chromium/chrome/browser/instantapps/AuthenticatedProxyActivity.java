package org.chromium.chrome.browser.instantapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AuthenticatedProxyActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("org.chromium.chrome.browser.instantapps.AUTH_INTENT");
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-268435457));
            intent.setFlags(intent.getFlags() & (-524289));
            startActivityForResult(intent, 0);
        }
        finish();
    }
}
