package defpackage;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import org.chromium.media.ScreenCapture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jX2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6650jX2 extends MediaProjection.Callback {
    public final /* synthetic */ ScreenCapture a;

    public C6650jX2(ScreenCapture screenCapture) {
        this.a = screenCapture;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        int i = ScreenCapture.x;
        ScreenCapture screenCapture = this.a;
        screenCapture.a(4);
        screenCapture.i = null;
        VirtualDisplay virtualDisplay = screenCapture.k;
        if (virtualDisplay == null) {
            return;
        }
        virtualDisplay.release();
        screenCapture.k = null;
    }
}
