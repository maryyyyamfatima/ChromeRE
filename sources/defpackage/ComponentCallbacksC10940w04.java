package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import org.chromium.chrome.browser.metrics.UmaSessionStats;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w04, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacksC10940w04 implements ComponentCallbacks {
    public final /* synthetic */ UmaSessionStats a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public ComponentCallbacksC10940w04(UmaSessionStats umaSessionStats) {
        this.a = umaSessionStats;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.e = configuration.keyboard != 1;
    }
}
