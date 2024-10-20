package org.chromium.chrome.browser.vr;

import android.view.Choreographer;
import defpackage.ChoreographerFrameCallbackC3920bb;
import defpackage.V60;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class AndroidVSyncHelper {
    public final long a;
    public final Choreographer.FrameCallback b = new ChoreographerFrameCallbackC3920bb(this);

    public static AndroidVSyncHelper create(long j) {
        return new AndroidVSyncHelper(j);
    }

    public AndroidVSyncHelper(long j) {
        this.a = j;
    }

    public final void requestVSync() {
        Choreographer.getInstance().postFrameCallback(this.b);
    }

    public final void cancelVSyncRequest() {
        Choreographer.getInstance().removeFrameCallback(this.b);
    }

    public final float getRefreshRate() {
        return DisplayAndroidManager.a(V60.a).getRefreshRate();
    }
}
