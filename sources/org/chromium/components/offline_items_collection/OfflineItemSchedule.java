package org.chromium.components.offline_items_collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OfflineItemSchedule {
    public final boolean a;
    public final long b;

    public OfflineItemSchedule(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final Object clone() {
        return new OfflineItemSchedule(this.b, this.a);
    }
}
