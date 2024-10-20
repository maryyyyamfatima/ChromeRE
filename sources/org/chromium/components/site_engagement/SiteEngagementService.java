package org.chromium.components.site_engagement;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SiteEngagementService {
    public long a;

    public static SiteEngagementService create(long j) {
        return new SiteEngagementService(j);
    }

    public SiteEngagementService(long j) {
        this.a = j;
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
    }
}
