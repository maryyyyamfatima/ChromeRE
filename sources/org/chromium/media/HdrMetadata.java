package org.chromium.media;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class HdrMetadata {
    public long a;
    public final Object b = new Object();

    public static HdrMetadata create(long j) {
        return new HdrMetadata(j);
    }

    public HdrMetadata(long j) {
        this.a = j;
    }

    public final void close() {
        synchronized (this.b) {
            this.a = 0L;
        }
    }
}
