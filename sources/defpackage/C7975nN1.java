package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nN1 */
/* loaded from: classes.dex */
public final class C7975nN1 extends MediaController.Callback {
    public final WeakReference a;

    public C7975nN1(AbstractC9005qN1 abstractC9005qN1) {
        this.a = new WeakReference(abstractC9005qN1);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        AbstractC9005qN1 abstractC9005qN1 = (AbstractC9005qN1) this.a.get();
        if (abstractC9005qN1 != null) {
            abstractC9005qN1.c();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        C11768yR1.a(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        AbstractC9005qN1 abstractC9005qN1 = (AbstractC9005qN1) this.a.get();
        if (abstractC9005qN1 == null || abstractC9005qN1.c != null) {
            return;
        }
        abstractC9005qN1.b(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        AbstractC9005qN1 abstractC9005qN1 = (AbstractC9005qN1) this.a.get();
        if (abstractC9005qN1 != null) {
            abstractC9005qN1.a(MediaMetadataCompat.a(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((AbstractC9005qN1) this.a.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId());
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        C11768yR1.a(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((AbstractC9005qN1) this.a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }
}
