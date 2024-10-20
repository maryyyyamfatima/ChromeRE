package defpackage;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class V51 implements ImageReader.OnImageAvailableListener {
    public int a;
    public ImageReader b;
    public U51 d;
    public final /* synthetic */ X51 f;
    public int c = 0;
    public final N33 e = PostTask.a(QF3.i);

    public V51(X51 x51, int i, int i2) {
        this.f = x51;
        b(i, i2);
    }

    public static void a(float f, RenderNode renderNode, View view, Callback callback, V51 v51) {
        v51.getClass();
        HardwareRenderer hardwareRenderer = new HardwareRenderer();
        TraceEvent i = TraceEvent.i("AcceleratedImageReader::requestDraw", null);
        try {
            X51 x51 = v51.f;
            W51 w51 = x51.d;
            int i2 = 1;
            if (w51 != null) {
                i2 = 1 + w51.a;
            }
            x51.d = new W51(i2, view, f, callback);
            Surface surface = v51.b.getSurface();
            hardwareRenderer.setContentRoot(renderNode);
            hardwareRenderer.setSurface(surface);
            hardwareRenderer.createRenderRequest().syncAndDraw();
            hardwareRenderer.destroy();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:            r0.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "AcceleratedImageReader::init"
            r1 = 0
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.i(r0, r1)
            android.media.ImageReader r2 = r4.b     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto Le
            r2.close()     // Catch: java.lang.Throwable -> L34
        Le:
            if (r5 == 0) goto L2e
            if (r6 != 0) goto L13
            goto L2e
        L13:
            r2 = 1
            r3 = 3
            android.media.ImageReader r5 = android.media.ImageReader.newInstance(r5, r6, r2, r3)     // Catch: java.lang.Throwable -> L34
            r4.b = r5     // Catch: java.lang.Throwable -> L34
            android.os.Handler r6 = defpackage.X51.e     // Catch: java.lang.Throwable -> L34
            r5.setOnImageAvailableListener(r4, r6)     // Catch: java.lang.Throwable -> L34
            U51 r5 = new U51     // Catch: java.lang.Throwable -> L34
            r6 = 0
            r5.<init>(r6, r6, r6, r1)     // Catch: java.lang.Throwable -> L34
            r4.d = r5     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2d
            r0.close()
        L2d:
            return
        L2e:
            if (r0 == 0) goto L33
            r0.close()
        L33:
            return
        L34:
            r5 = move-exception
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V51.b(int, int):void");
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        TraceEvent i = TraceEvent.i("AcceleratedImageReader::onImageAvailable", null);
        try {
            final Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage == null) {
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            }
            final W51 w51 = this.f.d;
            int i2 = w51.a;
            if (i2 == this.a) {
                acquireLatestImage.close();
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            }
            this.a = i2;
            final Image.Plane[] planes = acquireLatestImage.getPlanes();
            final ByteBuffer buffer = planes[0].getBuffer();
            this.e.b(new Runnable() { // from class: R51
                @Override // java.lang.Runnable
                public final void run() {
                    Image image = acquireLatestImage;
                    Image.Plane[] planeArr = planes;
                    ByteBuffer byteBuffer = buffer;
                    final W51 w512 = w51;
                    final V51 v51 = V51.this;
                    v51.getClass();
                    TraceEvent i3 = TraceEvent.i("AcceleratedImageReader::onImageAvailable::postTask", null);
                    try {
                        final int width = image.getWidth();
                        final int height = image.getHeight();
                        int pixelStride = planeArr[0].getPixelStride();
                        final int rowStride = (planeArr[0].getRowStride() - (pixelStride * width)) / pixelStride;
                        final Bitmap createBitmap = Bitmap.createBitmap(width + rowStride, height, Bitmap.Config.ARGB_8888);
                        createBitmap.setHasAlpha(true);
                        createBitmap.copyPixelsFromBuffer(byteBuffer);
                        image.close();
                        w512.b.getHandler().post(new Runnable() { // from class: S51
                            @Override // java.lang.Runnable
                            public final void run() {
                                Bitmap bitmap;
                                V51 v512 = V51.this;
                                v512.getClass();
                                int i4 = width;
                                int i5 = height;
                                U51 u51 = new U51(i4, i5, rowStride, createBitmap);
                                v512.d = u51;
                                W51 w513 = w512;
                                float width2 = w513.b.getWidth();
                                float f = w513.c;
                                int i6 = (int) (width2 * f);
                                int height2 = (int) (w513.b.getHeight() * f);
                                V51 v513 = v512.f.b;
                                v513.f.a.getClass();
                                Bitmap bitmap2 = u51.b;
                                boolean z = false;
                                if (bitmap2 != null && i4 == i6 && i5 == height2) {
                                    v513.c = 2;
                                    if (u51.a != 0) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, i6, height2);
                                        u51.b = createBitmap2;
                                        createBitmap2.setHasAlpha(true);
                                        u51.a = 0;
                                        bitmap2.recycle();
                                    }
                                    z = true;
                                }
                                if (!z || (bitmap = u51.b) == null) {
                                    return;
                                }
                                w513.d.onResult(bitmap);
                            }
                        });
                        if (i3 != null) {
                            i3.close();
                        }
                    } catch (Throwable th) {
                        if (i3 != null) {
                            try {
                                i3.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
            });
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
