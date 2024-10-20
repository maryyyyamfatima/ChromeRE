package org.chromium.media;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4851eH1;
import defpackage.C9010qO1;
import defpackage.V60;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaPlayerBridge {
    public C9010qO1 a;
    public MediaPlayer b;
    public long c;

    public static MediaPlayerBridge create(long j) {
        return new MediaPlayerBridge(j);
    }

    public MediaPlayerBridge(long j) {
        this.c = j;
    }

    public final MediaPlayer a() {
        if (this.b == null) {
            this.b = new MediaPlayer();
        }
        return this.b;
    }

    public void setSurface(Surface surface) {
        a().setSurface(surface);
    }

    public void setPlaybackRate(double d) {
        try {
            MediaPlayer a = a();
            a.setPlaybackParams(a.getPlaybackParams().setSpeed((float) d));
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("media", "Unable to set playback rate", e);
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("media", "Unable to set playback rate", e2);
        }
    }

    public boolean prepareAsync() {
        try {
            a().prepareAsync();
            return true;
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("media", "Unable to prepare MediaPlayer.", e);
            return false;
        } catch (Exception e2) {
            AbstractC4851eH1.a("media", "Unable to prepare MediaPlayer.", e2);
            return false;
        }
    }

    public boolean isPlaying() {
        return a().isPlaying();
    }

    public int getCurrentPosition() {
        return a().getCurrentPosition();
    }

    public int getDuration() {
        return a().getDuration();
    }

    public void setVolume(double d) {
        float f = (float) d;
        a().setVolume(f, f);
    }

    public void start() {
        a().start();
    }

    public void pause() {
        a().pause();
    }

    public void seekTo(int i) {
        a().seekTo(i);
    }

    public boolean setDataSource(String str, String str2, String str3, boolean z) {
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("x-hide-urls-from-log", "true");
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("Cookie", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("User-Agent", str3);
        }
        hashMap.put("android-allow-cross-domain-redirect", "0");
        try {
            a().setDataSource(V60.a, parse, hashMap);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean setDataSourceFromFd(int i, long j, long j2) {
        try {
            ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(i);
            a().setDataSource(adoptFd.getFileDescriptor(), j, j2);
            adoptFd.close();
            return true;
        } catch (IOException e) {
            AbstractC4851eH1.a("media", "Failed to set data source from file descriptor: " + e, new Object[0]);
            return false;
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class AllowedOperations {
        public final boolean a;
        public final boolean b;

        public AllowedOperations(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean canSeekForward() {
            return this.a;
        }

        public final boolean canSeekBackward() {
            return this.b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(2:7|(8:9|10|11|(1:13)|20|15|16|17))|30|10|11|(0)|20|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bf, code lost:            if (((java.lang.Boolean) r6.invoke(r1, java.lang.Integer.valueOf(r4))).booleanValue() != false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:            r1 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:            defpackage.AbstractC4851eH1.a("media", "Cannot access metadata: " + r1, new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:            r1 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:            defpackage.AbstractC4851eH1.a("media", "Cannot find matching fields in Metadata class: " + r1, new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:            r1 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:            defpackage.AbstractC4851eH1.a("media", "Cannot find getMetadata() method: " + r1, new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:            r1 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:            defpackage.AbstractC4851eH1.a("media", "Cannot invoke MediaPlayer.getMetadata() method: " + r1, new java.lang.Object[0]);     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad A[Catch: NoSuchFieldException -> 0x00c2, IllegalAccessException -> 0x00c4, InvocationTargetException -> 0x00c6, NoSuchMethodException -> 0x00c8, TRY_LEAVE, TryCatch #4 {IllegalAccessException -> 0x00c4, NoSuchFieldException -> 0x00c2, NoSuchMethodException -> 0x00c8, InvocationTargetException -> 0x00c6, blocks: (B:11:0x0099, B:13:0x00ad), top: B:10:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.chromium.media.MediaPlayerBridge.AllowedOperations getAllowedOperations() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.MediaPlayerBridge.getAllowedOperations():org.chromium.media.MediaPlayerBridge$AllowedOperations");
    }

    public void destroy() {
        C9010qO1 c9010qO1 = this.a;
        if (c9010qO1 != null) {
            c9010qO1.a(true);
            this.a = null;
        }
        this.c = 0L;
    }

    public void release() {
        C9010qO1 c9010qO1 = this.a;
        if (c9010qO1 != null) {
            c9010qO1.a(true);
            this.a = null;
        }
        a().release();
    }

    public boolean setDataUriDataSource(String str) {
        int indexOf;
        C9010qO1 c9010qO1 = this.a;
        if (c9010qO1 != null) {
            c9010qO1.a(true);
            this.a = null;
        }
        if (!str.startsWith("data:") || (indexOf = str.indexOf(44)) == -1) {
            return false;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        String[] split = substring.substring(5).split(";");
        if (split.length != 2 || !"base64".equals(split[1])) {
            return false;
        }
        C9010qO1 c9010qO12 = new C9010qO1(this, substring2);
        this.a = c9010qO12;
        c9010qO12.c(AbstractC0185Bl.e);
        return true;
    }
}
