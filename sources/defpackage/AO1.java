package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AO1 {
    public final MediaQueueItem a;

    public final MediaQueueItem a() {
        MediaQueueItem mediaQueueItem = this.a;
        if (mediaQueueItem.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(mediaQueueItem.i) && mediaQueueItem.i < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(mediaQueueItem.j)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(mediaQueueItem.k) || mediaQueueItem.k < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return mediaQueueItem;
    }

    public AO1(MediaInfo mediaInfo) {
        MediaQueueItem mediaQueueItem = new MediaQueueItem(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.a = mediaQueueItem;
    }

    public AO1(JSONObject jSONObject) {
        this.a = new MediaQueueItem(jSONObject);
    }
}
