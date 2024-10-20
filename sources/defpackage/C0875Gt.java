package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gt */
/* loaded from: classes2.dex */
public final class C0875Gt implements InterfaceC0745Ft {
    public final C4034bu a;

    public C0875Gt(C4377cu c4377cu) {
        int[] iArr = c4377cu.b;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = c4377cu.b;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i2];
                if (i4 == 0) {
                    i3 |= 4096;
                } else if (i4 == 1) {
                    i3 |= 1;
                } else if (i4 == 2) {
                    i3 |= 2;
                } else if (i4 == 3) {
                    i3 |= 4;
                } else if (i4 == 4) {
                    i3 |= 8;
                } else if (i4 == 5) {
                    i3 |= 16;
                } else if (i4 == 6) {
                    i3 |= 32;
                } else if (i4 == 7) {
                    i3 |= 64;
                } else if (i4 == 8) {
                    i3 |= 128;
                } else if (i4 == 9) {
                    i3 |= 2048;
                } else if (i4 == 10) {
                    i3 |= 256;
                } else if (i4 == 12) {
                    i3 |= 512;
                } else if (i4 == 13) {
                    i3 |= 1024;
                } else {
                    AbstractC4851eH1.a("BarcodeDetectionImpl", "Unsupported barcode format hint: " + c4377cu.b[i2], new Object[0]);
                }
                i2++;
            }
            i = i3;
        }
        Context context = V60.a;
        BarcodeDetectorOptions barcodeDetectorOptions = new BarcodeDetectorOptions();
        barcodeDetectorOptions.a = i;
        this.a = new C4034bu(new C5408fu(context, barcodeDetectorOptions));
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        close();
    }

    @Override // defpackage.InterfaceC0745Ft
    public final void f0(C10924vy c10924vy, C3084Xt c3084Xt) {
        int i;
        C4034bu c4034bu = this.a;
        if (!c4034bu.b.e()) {
            AbstractC4851eH1.a("BarcodeDetectionImpl", "BarcodeDetector is not operational", new Object[0]);
            c3084Xt.a(new C2434St[0]);
            return;
        }
        C8009nU0 b = AbstractC0510Dy.b(c10924vy);
        if (b == null) {
            AbstractC4851eH1.a("BarcodeDetectionImpl", "Error converting Mojom Bitmap to Frame", new Object[0]);
            c3084Xt.a(new C2434St[0]);
            return;
        }
        SparseArray a = c4034bu.a(b);
        C2434St[] c2434StArr = new C2434St[a.size()];
        for (int i2 = 0; i2 < a.size(); i2++) {
            c2434StArr[i2] = new C2434St(0);
            Barcode barcode = (Barcode) a.valueAt(i2);
            c2434StArr[i2].b = barcode.g;
            int i3 = Integer.MAX_VALUE;
            int i4 = 0;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            while (true) {
                Point[] pointArr = barcode.j;
                if (i4 < pointArr.length) {
                    Point point = pointArr[i4];
                    i3 = Math.min(i3, point.x);
                    i5 = Math.max(i5, point.x);
                    i7 = Math.min(i7, point.y);
                    i6 = Math.max(i6, point.y);
                    i4++;
                } else {
                    Rect rect = new Rect(i3, i7, i5, i6);
                    C2434St c2434St = c2434StArr[i2];
                    KI2 ki2 = new KI2(0);
                    c2434St.c = ki2;
                    ki2.b = rect.left;
                    ki2.c = rect.top;
                    ki2.d = rect.width();
                    c2434StArr[i2].c.e = rect.height();
                    c2434StArr[i2].e = new C2452Sw2[pointArr.length];
                    for (int i8 = 0; i8 < pointArr.length; i8++) {
                        c2434StArr[i2].e[i8] = new C2452Sw2(0);
                        C2452Sw2 c2452Sw2 = c2434StArr[i2].e[i8];
                        Point point2 = pointArr[i8];
                        c2452Sw2.b = point2.x;
                        c2452Sw2.c = point2.y;
                    }
                    C2434St c2434St2 = c2434StArr[i2];
                    int i9 = 1;
                    int i10 = barcode.a;
                    if (i10 != 1) {
                        i9 = 2;
                        if (i10 != 2) {
                            switch (i10) {
                                case 4:
                                    i = 3;
                                    break;
                                case 8:
                                    i = 4;
                                    break;
                                case 16:
                                    i = 5;
                                    break;
                                case 32:
                                    i = 6;
                                    break;
                                case 64:
                                    i = 7;
                                    break;
                                case 128:
                                    i = 8;
                                    break;
                                case 256:
                                    i = 10;
                                    break;
                                case 512:
                                    i = 12;
                                    break;
                                case 1024:
                                    i = 13;
                                    break;
                                case 2048:
                                    i = 9;
                                    break;
                                case 4096:
                                    i = 0;
                                    break;
                                default:
                                    i = 11;
                                    break;
                            }
                            c2434St2.d = i;
                        }
                    }
                    i = i9;
                    c2434St2.d = i;
                }
            }
        }
        c3084Xt.a(c2434StArr);
    }
}
