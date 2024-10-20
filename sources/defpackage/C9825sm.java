package defpackage;

import J.N;
import java.nio.ByteBuffer;
import org.chromium.media.AudioTrackOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9825sm extends Thread {
    public volatile boolean a;
    public final /* synthetic */ AudioTrackOutputStream g;

    public C9825sm(AudioTrackOutputStream audioTrackOutputStream) {
        this.g = audioTrackOutputStream;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        while (!this.a) {
            AudioTrackOutputStream audioTrackOutputStream = this.g;
            int i2 = audioTrackOutputStream.k;
            int i3 = 0;
            if (i2 != 0) {
                int write = audioTrackOutputStream.c.write(audioTrackOutputStream.j, i2, 0);
                if (write < 0) {
                    AbstractC4851eH1.a("AudioTrackOutput", AbstractC9076qb1.a("AudioTrack.write() failed. Error:", write), new Object[0]);
                    AudioTrackOutputStream audioTrackOutputStream2 = audioTrackOutputStream.b.a;
                    N.Mr6$Ko2f(audioTrackOutputStream2.a, audioTrackOutputStream2);
                    i3 = write;
                } else {
                    i3 = audioTrackOutputStream.k - write;
                    audioTrackOutputStream.k = i3;
                }
            }
            if (i3 < 0) {
                return;
            }
            if (i3 <= 0) {
                AudioTrackOutputStream audioTrackOutputStream3 = this.g;
                int playbackHeadPosition = audioTrackOutputStream3.c.getPlaybackHeadPosition();
                long j = audioTrackOutputStream3.g + (playbackHeadPosition - audioTrackOutputStream3.f);
                audioTrackOutputStream3.g = j;
                audioTrackOutputStream3.f = playbackHeadPosition;
                long j2 = audioTrackOutputStream3.h - j;
                long j3 = j2 < 0 ? 0L : j2;
                ByteBuffer duplicate = audioTrackOutputStream3.i.duplicate();
                AudioTrackOutputStream audioTrackOutputStream4 = audioTrackOutputStream3.b.a;
                AudioTrackOutputStream.AudioBufferInfo audioBufferInfo = (AudioTrackOutputStream.AudioBufferInfo) N.MEPH2V3G(audioTrackOutputStream4.a, audioTrackOutputStream4, duplicate, j3);
                if (audioBufferInfo != null && (i = audioBufferInfo.b) > 0) {
                    audioTrackOutputStream3.h += audioBufferInfo.a;
                    audioTrackOutputStream3.j = audioTrackOutputStream3.i.asReadOnlyBuffer();
                    audioTrackOutputStream3.k = i;
                }
            }
        }
    }
}
