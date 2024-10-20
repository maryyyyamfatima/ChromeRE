package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KP1 extends AbstractC9005qN1 {
    public final /* synthetic */ d d;

    public KP1(d dVar) {
        this.d = dVar;
    }

    @Override // defpackage.AbstractC9005qN1
    public final void c() {
        d dVar = this.d;
        C12091zN1 c12091zN1 = dVar.W;
        if (c12091zN1 != null) {
            c12091zN1.d(dVar.X);
            dVar.W = null;
        }
    }

    @Override // defpackage.AbstractC9005qN1
    public final void b(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.d;
        dVar.Y = playbackStateCompat;
        dVar.n(false);
    }

    @Override // defpackage.AbstractC9005qN1
    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat c = mediaMetadataCompat == null ? null : mediaMetadataCompat.c();
        d dVar = this.d;
        dVar.Z = c;
        dVar.o();
        dVar.n(false);
    }
}
