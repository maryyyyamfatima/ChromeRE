package org.chromium.components.media_router;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaStatusBridge {
    public final MediaStatus a;

    public MediaStatusBridge(MediaStatus mediaStatus) {
        this.a = mediaStatus;
    }

    public boolean canPlayPause() {
        return this.a.s1(1L);
    }

    public boolean canMute() {
        return this.a.s1(8L);
    }

    public boolean canSetVolume() {
        return this.a.s1(4L);
    }

    public boolean canSeek() {
        return this.a.s1(2L);
    }

    public int playerState() {
        return this.a.j;
    }

    public int idleReason() {
        return this.a.k;
    }

    public long duration() {
        MediaInfo mediaInfo = this.a.a;
        if (mediaInfo == null) {
            return 0L;
        }
        return mediaInfo.j;
    }

    public String title() {
        MediaMetadata mediaMetadata;
        MediaInfo mediaInfo = this.a.a;
        return (mediaInfo == null || (mediaMetadata = mediaInfo.i) == null) ? "" : mediaMetadata.t1("com.google.android.gms.cast.metadata.TITLE");
    }

    public long currentTime() {
        return this.a.l;
    }

    public double volume() {
        return this.a.n;
    }

    public boolean isMuted() {
        return this.a.o;
    }
}
