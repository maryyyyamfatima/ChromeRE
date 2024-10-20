package org.chromium.media;

import J.N;
import android.media.AudioTrack;
import defpackage.AbstractC4851eH1;
import defpackage.C9482rm;
import defpackage.C9825sm;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AudioTrackOutputStream {
    public long a;
    public final C9482rm b;
    public AudioTrack c;
    public int d;
    public C9825sm e;
    public int f;
    public long g;
    public long h;
    public ByteBuffer i;
    public ByteBuffer j;
    public int k;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class AudioBufferInfo {
        public final int a;
        public final int b;

        public AudioBufferInfo(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static AudioTrackOutputStream create() {
        return new AudioTrackOutputStream();
    }

    public AudioTrackOutputStream() {
        this.b = null;
        this.b = new C9482rm(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean open(int r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "AudioTrackOutput"
            r1 = 1
            r2 = 4
            if (r11 == r1) goto L1f
            r3 = 2
            if (r11 == r3) goto L1d
            if (r11 == r2) goto L1a
            r2 = 6
            if (r11 == r2) goto L17
            r2 = 8
            if (r11 == r2) goto L14
            r6 = r1
            goto L20
        L14:
            r2 = 6396(0x18fc, float:8.963E-42)
            goto L1f
        L17:
            r2 = 252(0xfc, float:3.53E-43)
            goto L1f
        L1a:
            r2 = 204(0xcc, float:2.86E-43)
            goto L1f
        L1d:
            r2 = 12
        L1f:
            r6 = r2
        L20:
            rm r11 = r10.b
            r11.getClass()
            int r2 = android.media.AudioTrack.getMinBufferSize(r12, r6, r13)
            int r2 = r2 * 3
            r10.d = r2
            r2 = 0
            r4 = 3
            int r8 = r10.d     // Catch: java.lang.IllegalArgumentException -> L57
            r9 = 1
            r11.getClass()     // Catch: java.lang.IllegalArgumentException -> L57
            android.media.AudioTrack r11 = new android.media.AudioTrack     // Catch: java.lang.IllegalArgumentException -> L57
            r3 = r11
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L57
            r10.c = r11     // Catch: java.lang.IllegalArgumentException -> L57
            int r11 = r11.getState()
            if (r11 != 0) goto L50
            java.lang.String r11 = "Cannot create AudioTrack"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            defpackage.AbstractC4851eH1.a(r0, r11, r12)
            r11 = 0
            r10.c = r11
            return r2
        L50:
            r10.f = r2
            r11 = 0
            r10.g = r11
            return r1
        L57:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r11
            java.lang.String r11 = "Exception creating AudioTrack for playback: "
            defpackage.AbstractC4851eH1.a(r0, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.AudioTrackOutputStream.open(int, int, int):boolean");
    }

    public void start(long j) {
        if (this.e != null) {
            return;
        }
        this.a = j;
        this.h = 0L;
        int i = this.d;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i + 15);
        AudioTrackOutputStream audioTrackOutputStream = this.b.a;
        int MMQ1O_vA = (16 - ((int) (N.MMQ1O_vA(audioTrackOutputStream.a, audioTrackOutputStream, allocateDirect) & 15))) & 15;
        allocateDirect.position(MMQ1O_vA);
        allocateDirect.limit(MMQ1O_vA + i);
        this.i = allocateDirect.slice();
        this.c.play();
        C9825sm c9825sm = new C9825sm(this);
        this.e = c9825sm;
        c9825sm.start();
    }

    public void stop() {
        C9825sm c9825sm = this.e;
        if (c9825sm != null) {
            c9825sm.a = true;
            try {
                this.e.interrupt();
                this.e.join();
            } catch (InterruptedException e) {
                AbstractC4851eH1.a("AudioTrackOutput", "Exception while waiting for AudioTrack worker thread finished: ", e);
            } catch (SecurityException e2) {
                AbstractC4851eH1.a("AudioTrackOutput", "Exception while waiting for AudioTrack worker thread finished: ", e2);
            }
            this.e = null;
        }
        this.c.pause();
        this.c.flush();
        this.f = 0;
        this.g = 0L;
        this.a = 0L;
    }

    public void setVolume(double d) {
        float maxVolume = (float) (d * AudioTrack.getMaxVolume());
        this.c.setStereoVolume(maxVolume, maxVolume);
    }

    public void close() {
        AudioTrack audioTrack = this.c;
        if (audioTrack != null) {
            audioTrack.release();
            this.c = null;
        }
    }

    public AudioBufferInfo createAudioBufferInfo(int i, int i2) {
        return new AudioBufferInfo(i, i2);
    }
}
