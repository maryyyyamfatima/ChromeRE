package org.chromium.chrome.browser.video_tutorials.bridges;

import J.N;
import java.util.Arrays;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class VideoTutorialServiceBridge {
    public long a;

    public static VideoTutorialServiceBridge create(long j) {
        return new VideoTutorialServiceBridge(j);
    }

    public VideoTutorialServiceBridge(long j) {
        this.a = j;
    }

    public final void b(Callback callback) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MscHdp7R(j, this, callback);
    }

    public final List a(int i) {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        return Arrays.asList(N.MxyQGOBV(j, this, i));
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }
}
