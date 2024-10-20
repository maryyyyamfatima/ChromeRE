package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QG0 implements NG0 {
    public final int a;
    public final boolean g;
    public final C5882hH0 h;

    public QG0(C6226iH0 c6226iH0) {
        boolean z;
        int i;
        boolean z2;
        Context context = V60.a;
        int min = Math.min(c6226iH0.b, 32);
        this.a = min;
        boolean z3 = c6226iH0.c;
        this.g = z3;
        int i2 = !z3 ? 1 : 0;
        boolean z4 = false;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            z = min == 1;
            i = 1;
        } else {
            try {
                throw new IllegalArgumentException("Invalid mode: " + i2);
            } catch (IllegalArgumentException e) {
                AbstractC4851eH1.a("FaceDetectionImpl", "Unexpected exception " + e, new Object[0]);
                i2 = 0;
                z = false;
                i = 0;
            }
        }
        FaceSettingsParcel faceSettingsParcel = new FaceSettingsParcel();
        faceSettingsParcel.a = i2;
        faceSettingsParcel.g = i;
        faceSettingsParcel.h = 0;
        faceSettingsParcel.i = z;
        faceSettingsParcel.j = true;
        faceSettingsParcel.k = -1.0f;
        if (i2 == 2 || i != 2) {
            z2 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z2 = false;
        }
        if (faceSettingsParcel.g == 2 && faceSettingsParcel.h == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z4 = z2;
        }
        if (z4) {
            this.h = new C5882hH0(new C6568jH0(context, faceSettingsParcel));
            return;
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    @Override // defpackage.NG0
    public final void N0(C10924vy c10924vy, C4507dH0 c4507dH0) {
        ByteBuffer a;
        MG0[] h;
        int i;
        int i2;
        int min;
        int i3 = 0;
        if (!this.h.c.e()) {
            AbstractC4851eH1.a("FaceDetectionImpl", "FaceDetector is not operational", new Object[0]);
            C6226iH0 c6226iH0 = new C6226iH0(0);
            c6226iH0.c = this.g;
            c6226iH0.b = this.a;
            new PG0(c6226iH0).N0(c10924vy, c4507dH0);
            return;
        }
        C8009nU0 b = AbstractC0510Dy.b(c10924vy);
        if (b == null) {
            AbstractC4851eH1.a("FaceDetectionImpl", "Error converting Mojom Bitmap to Frame", new Object[0]);
            c4507dH0.a(new YG0[0]);
            return;
        }
        C5882hH0 c5882hH0 = this.h;
        c5882hH0.getClass();
        Bitmap bitmap = b.c;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i4 = width * height;
            int[] iArr = new int[i4];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            a = ByteBuffer.allocateDirect((((int) Math.ceil(height / 2.0d)) * 2 * ((int) Math.ceil(width / 2.0d))) + i4);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = i4;
            while (i5 < height) {
                int i9 = i3;
                while (i9 < width) {
                    int i10 = iArr[i7];
                    int i11 = (16711680 & i10) >> 16;
                    int i12 = (i10 & 65280) >> 8;
                    int i13 = (i10 & 255) >> i3;
                    int i14 = ((((i13 * 25) + ((i12 * 129) + (i11 * 66))) + 128) >> 8) + 16;
                    int i15 = ((((i13 * 112) + ((i11 * (-38)) - (i12 * 74))) + 128) >> 8) + 128;
                    int i16 = (((((i11 * 112) - (i12 * 94)) - (i13 * 18)) + 128) >> 8) + 128;
                    int i17 = i6 + 1;
                    a.put(i6, (byte) (i14 < 0 ? 0 : Math.min(255, i14)));
                    if (i5 % 2 == 0 && i7 % 2 == 0) {
                        int i18 = i8 + 1;
                        if (i16 < 0) {
                            i2 = 255;
                            min = 0;
                        } else {
                            i2 = 255;
                            min = Math.min(255, i16);
                        }
                        a.put(i8, (byte) min);
                        i8 = i18 + 1;
                        a.put(i18, (byte) (i15 < 0 ? 0 : Math.min(i2, i15)));
                    }
                    i7++;
                    i9++;
                    i6 = i17;
                    i3 = 0;
                }
                i5++;
                i3 = 0;
            }
        } else {
            a = b.a();
        }
        synchronized (c5882hH0.d) {
            if (!c5882hH0.e) {
                throw new IllegalStateException("Cannot use detector after release()");
            }
            h = c5882hH0.c.h(a, Cf4.a(b));
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(h.length);
        int i19 = 0;
        for (MG0 mg0 : h) {
            int i20 = mg0.a;
            i19 = Math.max(i19, i20);
            if (hashSet.contains(Integer.valueOf(i20))) {
                i20 = i19 + 1;
                i19 = i20;
            }
            hashSet.add(Integer.valueOf(i20));
            C0422Dg1 c0422Dg1 = c5882hH0.b;
            c0422Dg1.getClass();
            synchronized (C0422Dg1.c) {
                i = c0422Dg1.a.get(i20, -1);
                if (i == -1) {
                    i = C0422Dg1.d;
                    C0422Dg1.d = i + 1;
                    c0422Dg1.a.append(i20, i);
                    c0422Dg1.b.append(i, i20);
                }
            }
            sparseArray.append(i, mg0);
        }
        YG0[] yg0Arr = new YG0[sparseArray.size()];
        for (int i21 = 0; i21 < sparseArray.size(); i21++) {
            yg0Arr[i21] = new YG0(0);
            MG0 mg02 = (MG0) sparseArray.valueAt(i21);
            mg02.getClass();
            PointF pointF = mg02.b;
            PointF pointF2 = new PointF(pointF.x - (mg02.c / 2.0f), pointF.y - (mg02.d / 2.0f));
            YG0 yg0 = yg0Arr[i21];
            KI2 ki2 = new KI2(0);
            yg0.b = ki2;
            ki2.b = pointF2.x;
            ki2.c = pointF2.y;
            ki2.d = mg02.c;
            ki2.e = mg02.d;
            List list = mg02.e;
            ArrayList arrayList = new ArrayList(list.size());
            for (int i22 = 0; i22 < list.size(); i22++) {
                C6110hw1 c6110hw1 = (C6110hw1) list.get(i22);
                int i23 = c6110hw1.b;
                if (i23 == 4 || i23 == 10 || i23 == 0 || i23 == 6) {
                    C5766gw1 c5766gw1 = new C5766gw1(0);
                    c5766gw1.b = r14;
                    C2452Sw2 c2452Sw2 = new C2452Sw2(0);
                    C2452Sw2[] c2452Sw2Arr = {c2452Sw2};
                    PointF pointF3 = c6110hw1.a;
                    c2452Sw2.b = pointF3.x;
                    c2452Sw2.c = pointF3.y;
                    if (i23 == 4) {
                        c5766gw1.c = 1;
                    } else if (i23 == 10) {
                        c5766gw1.c = 1;
                    } else if (i23 == 0) {
                        c5766gw1.c = 0;
                        arrayList.add(c5766gw1);
                    } else {
                        c5766gw1.c = 2;
                        arrayList.add(c5766gw1);
                    }
                    arrayList.add(c5766gw1);
                }
            }
            yg0Arr[i21].c = (C5766gw1[]) arrayList.toArray(new C5766gw1[arrayList.size()]);
        }
        c4507dH0.a(yg0Arr);
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.a();
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        close();
    }
}
