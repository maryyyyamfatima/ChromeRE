package org.chromium.services.media_session;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class MediaPosition {
    public final Long a;
    public final Long b;
    public final Float c;
    public final Long d;

    public MediaPosition(long j, long j2, float f, long j3) {
        this.a = Long.valueOf(j);
        this.b = Long.valueOf(j2);
        this.c = Float.valueOf(f);
        this.d = Long.valueOf(j3);
    }

    public final long a() {
        return this.a.longValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaPosition)) {
            return false;
        }
        MediaPosition mediaPosition = (MediaPosition) obj;
        return this.a.longValue() == mediaPosition.a() && this.b.longValue() == mediaPosition.b.longValue() && this.c.floatValue() == mediaPosition.c.floatValue() && this.d.longValue() == mediaPosition.d.longValue();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "duration=" + this.a + ", position=" + this.b + ", rate=" + this.c + ", updated=" + this.d;
    }

    public static MediaPosition create(long j, long j2, float f, long j3) {
        return new MediaPosition(j, j2, f, j3 - (System.currentTimeMillis() - SystemClock.elapsedRealtime()));
    }
}
