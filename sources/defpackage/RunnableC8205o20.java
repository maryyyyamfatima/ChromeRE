package defpackage;

import org.chromium.chrome.browser.compositor.CompositorView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o20 */
/* loaded from: classes.dex */
public final class RunnableC8205o20 implements Runnable {
    public final /* synthetic */ SurfaceHolderCallback2C9576s20 a;

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceHolderCallback2C9576s20 surfaceHolderCallback2C9576s20 = this.a;
        C9233r20 c9233r20 = surfaceHolderCallback2C9576s20.h;
        if (c9233r20 == null) {
            return;
        }
        ((CompositorView) surfaceHolderCallback2C9576s20.j).i(c9233r20.b().getSurface(), true);
        surfaceHolderCallback2C9576s20.h = null;
        surfaceHolderCallback2C9576s20.k(c9233r20);
    }

    public RunnableC8205o20(SurfaceHolderCallback2C9576s20 surfaceHolderCallback2C9576s20) {
        this.a = surfaceHolderCallback2C9576s20;
    }
}
