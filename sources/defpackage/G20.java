package defpackage;

import J.N;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.chromium.components.thinwebview.internal.CompositorViewImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class G20 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ CompositorViewImpl a;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        CompositorViewImpl compositorViewImpl = this.a;
        long j = compositorViewImpl.b;
        if (j == 0) {
            return;
        }
        N.MYFXTzso(j, compositorViewImpl);
        CompositorViewImpl compositorViewImpl2 = this.a;
        N.M5WiS8XV(compositorViewImpl2.b, compositorViewImpl2, -1, i, i2, false, new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CompositorViewImpl compositorViewImpl = this.a;
        long j = compositorViewImpl.b;
        if (j == 0) {
            return false;
        }
        N.M3gcibnY(j, compositorViewImpl);
        return false;
    }

    public G20(CompositorViewImpl compositorViewImpl) {
        this.a = compositorViewImpl;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        CompositorViewImpl compositorViewImpl = this.a;
        long j = compositorViewImpl.b;
        if (j == 0) {
            return;
        }
        N.M5WiS8XV(j, compositorViewImpl, -1, i, i2, false, new Surface(surfaceTexture));
    }
}
