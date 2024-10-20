package defpackage;

import J.N;
import android.media.Image;
import android.media.ImageReader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9622s94 implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ B94 a;

    public C9622s94(B94 b94) {
        this.a = b94;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            B94 b94 = this.a;
            try {
                if (acquireLatestImage != null) {
                    if (acquireLatestImage.getFormat() != 35 || acquireLatestImage.getPlanes().length != 3) {
                        N.MhmwjISE(b94.e, b94, 71, "Unexpected image format: " + acquireLatestImage.getFormat() + " or #planes: " + acquireLatestImage.getPlanes().length);
                        throw new IllegalStateException();
                    }
                    if (imageReader.getWidth() != acquireLatestImage.getWidth() || imageReader.getHeight() != acquireLatestImage.getHeight()) {
                        N.MhmwjISE(b94.e, b94, 72, "ImageReader size (" + imageReader.getWidth() + "x" + imageReader.getHeight() + ") did not match Image size (" + acquireLatestImage.getWidth() + "x" + acquireLatestImage.getHeight() + ")");
                        throw new IllegalStateException();
                    }
                    B94 b942 = this.a;
                    N.MlTacwJQ(b942.e, b942, acquireLatestImage.getPlanes()[0].getBuffer(), acquireLatestImage.getPlanes()[0].getRowStride(), acquireLatestImage.getPlanes()[1].getBuffer(), acquireLatestImage.getPlanes()[2].getBuffer(), acquireLatestImage.getPlanes()[1].getRowStride(), acquireLatestImage.getPlanes()[1].getPixelStride(), acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), b94.a(), acquireLatestImage.getTimestamp());
                    acquireLatestImage.close();
                    return;
                }
                N.M651cEC1(b94.e, b94, 9);
                if (acquireLatestImage != null) {
                    acquireLatestImage.close();
                }
            } catch (Throwable th) {
                if (acquireLatestImage != null) {
                    try {
                        acquireLatestImage.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("VideoCapture", "acquireLatestImage():", e);
        }
    }
}
