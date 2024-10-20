package defpackage;

import android.graphics.SurfaceTexture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class EG0 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ FG0 a;

    public EG0(FG0 fg0) {
        this.a = fg0;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        GG0 gg0;
        this.a.d.set(true);
        synchronized (this.a.m) {
            if (!this.a.l && (gg0 = this.a.b) != null) {
                gg0.c();
            }
        }
    }
}
