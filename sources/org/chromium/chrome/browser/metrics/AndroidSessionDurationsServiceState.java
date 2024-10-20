package org.chromium.chrome.browser.metrics;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AndroidSessionDurationsServiceState {
    public final long a;
    public final long b;

    public AndroidSessionDurationsServiceState(long j, long j2) {
        this.b = j2;
        this.a = j;
    }

    public final long getLastReportedDuration() {
        return this.b;
    }

    public final long getSessionStartTime() {
        return this.a;
    }
}
