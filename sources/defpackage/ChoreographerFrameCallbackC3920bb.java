package defpackage;

import J.N;
import android.view.Choreographer;
import org.chromium.chrome.browser.vr.AndroidVSyncHelper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ChoreographerFrameCallbackC3920bb implements Choreographer.FrameCallback {
    public final /* synthetic */ AndroidVSyncHelper a;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        AndroidVSyncHelper androidVSyncHelper = this.a;
        long j2 = androidVSyncHelper.a;
        if (j2 == 0) {
            return;
        }
        N.Mabi$gAF(j2, androidVSyncHelper, j);
    }

    public ChoreographerFrameCallbackC3920bb(AndroidVSyncHelper androidVSyncHelper) {
        this.a = androidVSyncHelper;
    }
}
