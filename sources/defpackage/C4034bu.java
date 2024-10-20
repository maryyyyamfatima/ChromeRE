package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bu */
/* loaded from: classes.dex */
public final class C4034bu extends AbstractC0576El0 {
    public final C5408fu b;

    public final void b() {
        synchronized (this.a) {
        }
        this.b.b();
    }

    public C4034bu(C5408fu c5408fu) {
        this.b = c5408fu;
    }

    public final SparseArray a(C8009nU0 c8009nU0) {
        Barcode[] barcodeArr;
        FrameMetadataParcel a = Cf4.a(c8009nU0);
        Bitmap bitmap = c8009nU0.c;
        C5408fu c5408fu = this.b;
        if (bitmap != null) {
            if (c5408fu.e()) {
                try {
                    ObjectWrapper objectWrapper = new ObjectWrapper(bitmap);
                    C1447Ld1 c1447Ld1 = (C1447Ld1) ((InterfaceC1706Nd1) c5408fu.d());
                    Parcel a2 = c1447Ld1.a();
                    AbstractC11786yV.c(a2, objectWrapper);
                    AbstractC11786yV.b(a2, a);
                    Parcel e = c1447Ld1.e(2, a2);
                    Barcode[] barcodeArr2 = (Barcode[]) e.createTypedArray(Barcode.CREATOR);
                    e.recycle();
                    barcodeArr = barcodeArr2;
                } catch (RemoteException e2) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                    barcodeArr = new Barcode[0];
                }
            } else {
                barcodeArr = new Barcode[0];
            }
            if (barcodeArr == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer a3 = c8009nU0.a();
            if (c5408fu.e()) {
                try {
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(a3);
                    C1447Ld1 c1447Ld12 = (C1447Ld1) ((InterfaceC1706Nd1) c5408fu.d());
                    Parcel a4 = c1447Ld12.a();
                    AbstractC11786yV.c(a4, objectWrapper2);
                    AbstractC11786yV.b(a4, a);
                    Parcel e3 = c1447Ld12.e(1, a4);
                    Barcode[] barcodeArr3 = (Barcode[]) e3.createTypedArray(Barcode.CREATOR);
                    e3.recycle();
                    barcodeArr = barcodeArr3;
                } catch (RemoteException e4) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e4);
                    barcodeArr = new Barcode[0];
                }
            } else {
                barcodeArr = new Barcode[0];
            }
        }
        SparseArray sparseArray = new SparseArray(barcodeArr.length);
        for (Barcode barcode : barcodeArr) {
            sparseArray.append(barcode.g.hashCode(), barcode);
        }
        return sparseArray;
    }
}
