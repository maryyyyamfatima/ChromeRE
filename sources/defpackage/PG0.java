package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.media.FaceDetector;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PG0 implements NG0 {
    public final int a;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public PG0(C6226iH0 c6226iH0) {
        boolean z = c6226iH0.c;
        this.a = Math.min(c6226iH0.b, 32);
    }

    @Override // defpackage.NG0
    public final void N0(C10924vy c10924vy, final C4507dH0 c4507dH0) {
        Bitmap bitmap;
        Bitmap a = AbstractC0510Dy.a(c10924vy);
        if (a == null) {
            AbstractC4851eH1.a("FaceDetectionImpl", "Error converting Mojom Bitmap to Android Bitmap", new Object[0]);
            c4507dH0.a(new YG0[0]);
            return;
        }
        C11267wy c11267wy = c10924vy.b;
        int i = c11267wy.c;
        final int i2 = (i % 2) + i;
        final int i3 = c11267wy.d;
        if (i2 != i) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(a, 0.0f, 0.0f, (Paint) null);
            bitmap = createBitmap;
        } else {
            bitmap = a;
        }
        int[] iArr = new int[i2 * i3];
        bitmap.getPixels(iArr, 0, i2, 0, 0, i2, i3);
        final Bitmap createBitmap2 = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.RGB_565);
        PostTask.c(QF3.h, new Runnable() { // from class: OG0
            @Override // java.lang.Runnable
            public final void run() {
                PG0 pg0 = PG0.this;
                pg0.getClass();
                int i4 = i2;
                int i5 = i3;
                int i6 = pg0.a;
                FaceDetector faceDetector = new FaceDetector(i4, i5, i6);
                FaceDetector.Face[] faceArr = new FaceDetector.Face[i6];
                int findFaces = faceDetector.findFaces(createBitmap2, faceArr);
                YG0[] yg0Arr = new YG0[findFaces];
                for (int i7 = 0; i7 < findFaces; i7++) {
                    yg0Arr[i7] = new YG0(0);
                    FaceDetector.Face face = faceArr[i7];
                    PointF pointF = new PointF();
                    face.getMidPoint(pointF);
                    float eyesDistance = face.eyesDistance();
                    YG0 yg0 = yg0Arr[i7];
                    KI2 ki2 = new KI2(0);
                    yg0.b = ki2;
                    ki2.b = pointF.x - eyesDistance;
                    ki2.c = pointF.y - eyesDistance;
                    float f = eyesDistance * 2.0f;
                    ki2.d = f;
                    ki2.e = f;
                    yg0.c = new C5766gw1[0];
                }
                c4507dH0.a(yg0Arr);
            }
        });
    }
}
