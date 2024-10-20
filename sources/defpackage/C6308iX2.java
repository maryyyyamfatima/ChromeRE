package defpackage;

import J.N;
import android.media.Image;
import android.media.ImageReader;
import org.chromium.media.ScreenCapture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iX2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6308iX2 implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ ScreenCapture a;

    public C6308iX2(ScreenCapture screenCapture) {
        this.a = screenCapture;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        synchronized (this.a.g) {
            ScreenCapture screenCapture = this.a;
            if (screenCapture.h != 2) {
                AbstractC4851eH1.a("ScreenCapture", "Get captured frame in unexpected state.", new Object[0]);
                return;
            }
            if (screenCapture.d()) {
                this.a.b();
                this.a.c();
                return;
            }
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage == null) {
                    if (acquireLatestImage != null) {
                        acquireLatestImage.close();
                        return;
                    }
                    return;
                }
                try {
                    if (imageReader.getWidth() != acquireLatestImage.getWidth() || imageReader.getHeight() != acquireLatestImage.getHeight()) {
                        AbstractC4851eH1.a("ScreenCapture", "ImageReader size (" + imageReader.getWidth() + "x" + imageReader.getHeight() + ") did not match Image size (" + acquireLatestImage.getWidth() + "x" + acquireLatestImage.getHeight() + ")", new Object[0]);
                        throw new IllegalStateException();
                    }
                    int format = acquireLatestImage.getFormat();
                    if (format != 1) {
                        if (format != 35) {
                            AbstractC4851eH1.a("ScreenCapture", "Unexpected image format: " + acquireLatestImage.getFormat(), new Object[0]);
                            throw new IllegalStateException();
                        }
                        if (acquireLatestImage.getPlanes().length != 3) {
                            AbstractC4851eH1.a("ScreenCapture", "Unexpected image planes for YUV_420_888 format: " + acquireLatestImage.getPlanes().length, new Object[0]);
                            throw new IllegalStateException();
                        }
                        ScreenCapture screenCapture2 = this.a;
                        N.MgLL$kUF(screenCapture2.a, screenCapture2, acquireLatestImage.getPlanes()[0].getBuffer(), acquireLatestImage.getPlanes()[0].getRowStride(), acquireLatestImage.getPlanes()[1].getBuffer(), acquireLatestImage.getPlanes()[2].getBuffer(), acquireLatestImage.getPlanes()[1].getRowStride(), acquireLatestImage.getPlanes()[1].getPixelStride(), acquireLatestImage.getCropRect().left, acquireLatestImage.getCropRect().top, acquireLatestImage.getCropRect().width(), acquireLatestImage.getCropRect().height(), acquireLatestImage.getTimestamp());
                    } else {
                        if (acquireLatestImage.getPlanes().length != 1) {
                            AbstractC4851eH1.a("ScreenCapture", "Unexpected image planes for RGBA_8888 format: " + acquireLatestImage.getPlanes().length, new Object[0]);
                            throw new IllegalStateException();
                        }
                        ScreenCapture screenCapture3 = this.a;
                        N.MjDBp6op(screenCapture3.a, screenCapture3, acquireLatestImage.getPlanes()[0].getBuffer(), acquireLatestImage.getPlanes()[0].getRowStride(), acquireLatestImage.getCropRect().left, acquireLatestImage.getCropRect().top, acquireLatestImage.getCropRect().width(), acquireLatestImage.getCropRect().height(), acquireLatestImage.getTimestamp());
                    }
                    acquireLatestImage.close();
                } catch (Throwable th) {
                    try {
                        acquireLatestImage.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (IllegalStateException e) {
                AbstractC4851eH1.a("ScreenCapture", "acquireLatestImage():" + e, new Object[0]);
            } catch (UnsupportedOperationException e2) {
                AbstractC4851eH1.d("ScreenCapture", "acquireLatestImage():" + e2, new Object[0]);
                ScreenCapture screenCapture4 = this.a;
                if (screenCapture4.v == 35) {
                    screenCapture4.v = 1;
                    screenCapture4.b();
                    this.a.c();
                }
            }
        }
    }
}
