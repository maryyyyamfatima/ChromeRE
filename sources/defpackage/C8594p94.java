package defpackage;

import J.N;
import android.hardware.Camera;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8594p94 implements Camera.PictureCallback {
    public final /* synthetic */ C94 a;

    public C8594p94(C94 c94) {
        this.a = c94;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        try {
            this.a.l.flatten();
            camera.setParameters(this.a.l);
        } catch (RuntimeException e) {
            AbstractC4851eH1.a("VideoCapture", "onPictureTaken, setParameters() " + e, new Object[0]);
        }
        try {
            camera.startPreview();
        } catch (RuntimeException e2) {
            AbstractC4851eH1.a("VideoCapture", "onPictureTaken, startPreview() " + e2, new Object[0]);
        }
        synchronized (this.a.g) {
            C94 c94 = this.a;
            long j = c94.h;
            if (j != 0) {
                N.MdZBZ$ST(c94.e, c94, j, bArr);
            }
            this.a.h = 0L;
        }
    }
}
