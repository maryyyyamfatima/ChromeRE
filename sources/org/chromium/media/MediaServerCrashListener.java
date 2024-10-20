package org.chromium.media;

import J.N;
import android.media.MediaPlayer;
import android.os.SystemClock;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaServerCrashListener implements MediaPlayer.OnErrorListener {
    public MediaPlayer a;
    public long b = -1;
    public final long c;

    public static MediaServerCrashListener create(long j) {
        return new MediaServerCrashListener(j);
    }

    public MediaServerCrashListener(long j) {
        this.c = j;
    }

    public void releaseWatchdog() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        this.a = null;
    }

    public boolean startListening() {
        if (this.a != null) {
            return true;
        }
        try {
            this.a = MediaPlayer.create(V60.a, R.raw.f62810_resource_name_obfuscated_res_0x7f130004);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("crMediaCrashListener", "Exception while creating the watchdog player.", e);
        } catch (RuntimeException e2) {
            AbstractC4851eH1.a("crMediaCrashListener", "Exception while creating the watchdog player.", e2);
        }
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(this);
            this.b = -1L;
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        if (j == -1 || elapsedRealtime - j > 5000) {
            AbstractC4851eH1.a("crMediaCrashListener", "Unable to create watchdog player, treating it as server crash.", new Object[0]);
            N.Mm$QSrAo(this.c, this, false);
            this.b = elapsedRealtime;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 100) {
            N.Mm$QSrAo(this.c, this, true);
            releaseWatchdog();
        }
        return true;
    }
}
