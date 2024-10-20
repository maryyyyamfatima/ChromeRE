package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fu */
/* loaded from: classes.dex */
public final class C5408fu extends AbstractC1405Kv {
    public final BarcodeDetectorOptions h;

    public C5408fu(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.h = barcodeDetectorOptions;
        d();
    }

    @Override // defpackage.AbstractC1405Kv
    public final Object a(C1146Iv0 c1146Iv0, Context context) {
        IInterface c1836Od1;
        IBinder h = c1146Iv0.h("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        int i = AbstractBinderC1966Pd1.a;
        Object obj = null;
        if (h == null) {
            c1836Od1 = null;
        } else {
            IInterface queryLocalInterface = h.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            if (queryLocalInterface instanceof InterfaceC2096Qd1) {
                c1836Od1 = (InterfaceC2096Qd1) queryLocalInterface;
            } else {
                c1836Od1 = new C1836Od1(h);
            }
        }
        if (c1836Od1 != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            C1836Od1 c1836Od12 = (C1836Od1) c1836Od1;
            Parcel a = c1836Od12.a();
            AbstractC11786yV.c(a, objectWrapper);
            AbstractC11786yV.b(a, this.h);
            Parcel e = c1836Od12.e(1, a);
            IBinder readStrongBinder = e.readStrongBinder();
            int i2 = AbstractBinderC1576Md1.a;
            if (readStrongBinder != null) {
                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                if (queryLocalInterface2 instanceof InterfaceC1706Nd1) {
                    obj = (InterfaceC1706Nd1) queryLocalInterface2;
                } else {
                    obj = new C1447Ld1(readStrongBinder);
                }
            }
            e.recycle();
        }
        return obj;
    }

    @Override // defpackage.AbstractC1405Kv
    public final void c() {
        if (e()) {
            C1447Ld1 c1447Ld1 = (C1447Ld1) ((InterfaceC1706Nd1) d());
            c1447Ld1.h(3, c1447Ld1.a());
        }
    }
}
