package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L62 extends M62 {
    public int[] d = null;
    public MediaSessionCompat$Token e;

    @Override // defpackage.M62
    public final void d() {
    }

    @Override // defpackage.M62
    public final void e() {
    }

    @Override // defpackage.M62
    public final void b(S62 s62) {
        Notification.Builder builder = s62.b;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        int[] iArr = this.d;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (mediaSessionCompat$Token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) mediaSessionCompat$Token.g);
        }
        builder.setStyle(mediaStyle);
    }
}
