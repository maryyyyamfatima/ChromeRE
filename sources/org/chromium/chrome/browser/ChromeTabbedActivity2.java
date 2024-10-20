package org.chromium.chrome.browser;

import android.content.Intent;
import android.os.Bundle;
import defpackage.C7851n02;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeTabbedActivity2 extends ChromeTabbedActivity {
    @Override // org.chromium.chrome.browser.ChromeTabbedActivity, defpackage.AbstractActivityC7416ll
    public final int D0(Intent intent, Bundle bundle) {
        if (C7851n02.r()) {
            startActivity(C7851n02.c(bundle != null ? bundle.getInt("window_index", -1) : -1, this, false, false), bundle);
            return 2;
        }
        return super.D0(intent, bundle);
    }
}
