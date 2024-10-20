package defpackage;

import J.N;
import android.media.Image;
import android.media.ImageReader;
import java.nio.ByteBuffer;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8937q94 implements ImageReader.OnImageAvailableListener {
    public final long a;
    public final /* synthetic */ B94 b;

    public C8937q94(B94 b94, long j) {
        this.b = b94;
        this.a = j;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        byte[] bArr;
        B94 b94 = this.b;
        TraceEvent.h("VideoCaptureCamera2.java", "CrPhotoReaderListener.onImageAvailable");
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            try {
                if (acquireLatestImage == null) {
                    throw new IllegalStateException();
                }
                try {
                } catch (Throwable unused) {
                    bArr = null;
                }
                if (acquireLatestImage.getFormat() == 256) {
                    try {
                        bArr = acquireLatestImage.getPlanes()[0].getBuffer().array();
                    } catch (UnsupportedOperationException unused2) {
                        ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
                        byte[] bArr2 = new byte[buffer.remaining()];
                        try {
                            buffer.get(bArr2);
                        } catch (Throwable unused3) {
                        }
                        bArr = bArr2;
                    }
                    byte[] bArr3 = bArr;
                    B94 b942 = this.b;
                    N.MdZBZ$ST(b942.e, b942, this.a, bArr3);
                    acquireLatestImage.close();
                    B94.e(b94, 73);
                    return;
                }
                AbstractC4851eH1.a("VideoCapture", "Unexpected image format: %d", Integer.valueOf(acquireLatestImage.getFormat()));
                throw new IllegalStateException();
            } catch (Throwable th) {
                if (acquireLatestImage != null) {
                    try {
                        acquireLatestImage.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (IllegalStateException unused5) {
            b94.d(this.a);
        }
    }
}
