package org.chromium.chrome.browser.browsing_data;

import J.N;
import android.view.View;
import defpackage.InterfaceC4829eD;
import defpackage.WS;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BrowsingDataCounterBridge {
    public long a;
    public final InterfaceC4829eD b;

    public BrowsingDataCounterBridge(InterfaceC4829eD interfaceC4829eD, int i, int i2) {
        this.b = interfaceC4829eD;
        this.a = N.MfPmZbvq(this, i, i2);
    }

    public final void onBrowsingDataCounterFinished(String str) {
        View view;
        WS ws = (WS) this.b;
        ClearBrowsingDataCheckBoxPreference clearBrowsingDataCheckBoxPreference = ws.h;
        clearBrowsingDataCheckBoxPreference.P(str);
        if (!ws.j || (view = clearBrowsingDataCheckBoxPreference.Z) == null) {
            return;
        }
        view.announceForAccessibility(str);
    }
}
