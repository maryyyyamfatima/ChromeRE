package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qH3 */
/* loaded from: classes2.dex */
public final class C8977qH3 implements InterfaceC8634pH3 {
    public final C8301oJ3 a = new C8301oJ3(new WI3(V60.a, new TextRecognizerOptions()));

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.a();
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        close();
    }

    @Override // defpackage.InterfaceC8634pH3
    public final void k1(C10924vy c10924vy, C11720yH3 c11720yH3) {
        byte[] bArr;
        int i;
        LineBoxParcel[] lineBoxParcelArr;
        String sb;
        int i2;
        C8301oJ3 c8301oJ3 = this.a;
        if (!c8301oJ3.b.e()) {
            AbstractC4851eH1.a("TextDetectionImpl", "TextDetector is not operational", new Object[0]);
            c11720yH3.a(new C9319rH3[0]);
            return;
        }
        C8009nU0 b = AbstractC0510Dy.b(c10924vy);
        if (b == null) {
            AbstractC4851eH1.a("TextDetectionImpl", "Error converting Mojom Bitmap to Frame", new Object[0]);
            c11720yH3.a(new C9319rH3[0]);
            return;
        }
        RecognitionOptions recognitionOptions = new RecognitionOptions(new Rect());
        FrameMetadataParcel a = Cf4.a(b);
        Bitmap bitmap = b.c;
        C7665mU0 c7665mU0 = b.a;
        if (bitmap == null) {
            ByteBuffer a2 = b.a();
            int i3 = c7665mU0.c;
            int i4 = a.a;
            int i5 = a.g;
            if (a2.hasArray() && a2.arrayOffset() == 0) {
                bArr = a2.array();
            } else {
                byte[] bArr2 = new byte[a2.capacity()];
                a2.get(bArr2);
                bArr = bArr2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new YuvImage(bArr, i3, i4, i5, null).compressToJpeg(new Rect(0, 0, i4, i5), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        if (a.j != 0) {
            Matrix matrix = new Matrix();
            int i6 = a.j;
            if (i6 == 0) {
                i2 = 0;
            } else if (i6 == 1) {
                i2 = 90;
            } else if (i6 == 2) {
                i2 = 180;
            } else {
                if (i6 != 3) {
                    throw new IllegalArgumentException("Unsupported rotation degree.");
                }
                i2 = 270;
            }
            matrix.postRotate(i2);
            i = 1;
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, false);
        } else {
            i = 1;
        }
        int i7 = a.j;
        if (i7 == i || i7 == 3) {
            a.a = height;
            a.g = width;
        }
        Rect rect = recognitionOptions.a;
        if (!rect.isEmpty()) {
            int i8 = c7665mU0.a;
            int i9 = c7665mU0.b;
            int i10 = a.j;
            rect.set(i10 != i ? i10 != 2 ? i10 != 3 ? rect : new Rect(rect.top, i8 - rect.right, rect.bottom, i8 - rect.left) : new Rect(i8 - rect.right, i9 - rect.bottom, i8 - rect.left, i9 - rect.top) : new Rect(i9 - rect.bottom, rect.left, i9 - rect.top, rect.right));
        }
        a.j = 0;
        WI3 wi3 = c8301oJ3.b;
        if (wi3.e()) {
            try {
                ObjectWrapper objectWrapper = new ObjectWrapper(bitmap2);
                C3006Xd1 c3006Xd1 = (C3006Xd1) ((InterfaceC3266Zd1) wi3.d());
                Parcel a3 = c3006Xd1.a();
                AbstractC11786yV.c(a3, objectWrapper);
                AbstractC11786yV.b(a3, a);
                AbstractC11786yV.b(a3, recognitionOptions);
                Parcel e = c3006Xd1.e(3, a3);
                LineBoxParcel[] lineBoxParcelArr2 = (LineBoxParcel[]) e.createTypedArray(LineBoxParcel.CREATOR);
                e.recycle();
                lineBoxParcelArr = lineBoxParcelArr2;
            } catch (RemoteException e2) {
                Log.e("TextNativeHandle", "Error calling native text recognizer", e2);
                lineBoxParcelArr = new LineBoxParcel[0];
            }
        } else {
            lineBoxParcelArr = new LineBoxParcel[0];
        }
        SparseArray sparseArray = new SparseArray();
        for (LineBoxParcel lineBoxParcel : lineBoxParcelArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(lineBoxParcel.o);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(lineBoxParcel.o, sparseArray2);
            }
            sparseArray2.append(lineBoxParcel.p, lineBoxParcel);
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray3.append(sparseArray.keyAt(i11), new XG3((SparseArray) sparseArray.valueAt(i11)));
        }
        C9319rH3[] c9319rH3Arr = new C9319rH3[sparseArray3.size()];
        for (int i12 = 0; i12 < sparseArray3.size(); i12++) {
            c9319rH3Arr[i12] = new C9319rH3(0);
            XG3 xg3 = (XG3) sparseArray3.valueAt(i12);
            C9319rH3 c9319rH3 = c9319rH3Arr[i12];
            LineBoxParcel[] lineBoxParcelArr3 = xg3.a;
            if (lineBoxParcelArr3.length == 0) {
                sb = "";
            } else {
                StringBuilder sb2 = new StringBuilder(lineBoxParcelArr3[0].j);
                for (int i13 = i; i13 < lineBoxParcelArr3.length; i13++) {
                    sb2.append("\n");
                    sb2.append(lineBoxParcelArr3[i13].j);
                }
                sb = sb2.toString();
            }
            c9319rH3.b = sb;
            if (xg3.c == null) {
                int i14 = Integer.MAX_VALUE;
                int i15 = Integer.MIN_VALUE;
                int i16 = Integer.MIN_VALUE;
                int i17 = Integer.MAX_VALUE;
                for (Point point : xg3.a()) {
                    i14 = Math.min(i14, point.x);
                    i15 = Math.max(i15, point.x);
                    i17 = Math.min(i17, point.y);
                    i16 = Math.max(i16, point.y);
                }
                xg3.c = new Rect(i14, i17, i15, i16);
            }
            Rect rect2 = xg3.c;
            C9319rH3 c9319rH32 = c9319rH3Arr[i12];
            KI2 ki2 = new KI2(0);
            c9319rH32.c = ki2;
            ki2.b = rect2.left;
            ki2.c = rect2.top;
            ki2.d = rect2.width();
            c9319rH3Arr[i12].c.e = rect2.height();
            Point[] a4 = xg3.a();
            c9319rH3Arr[i12].d = new C2452Sw2[a4.length];
            for (int i18 = 0; i18 < a4.length; i18++) {
                c9319rH3Arr[i12].d[i18] = new C2452Sw2(0);
                C2452Sw2 c2452Sw2 = c9319rH3Arr[i12].d[i18];
                Point point2 = a4[i18];
                c2452Sw2.b = point2.x;
                c2452Sw2.c = point2.y;
            }
        }
        c11720yH3.a(c9319rH3Arr);
    }
}
