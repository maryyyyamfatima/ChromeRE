package defpackage;

import J.N;
import android.graphics.SurfaceTexture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xp3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3068Xp3 implements SurfaceTexture.OnFrameAvailableListener {
    public final long a;

    public C3068Xp3(long j) {
        this.a = j;
    }

    public final void finalize() {
        try {
            N.MUH2vhAN(this.a, this);
        } finally {
            super.finalize();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        N.MRbPfCZQ(this.a, this);
    }
}
