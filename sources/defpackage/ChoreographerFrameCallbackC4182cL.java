package defpackage;

import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4182cL implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable a;

    public ChoreographerFrameCallbackC4182cL(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.run();
    }
}
