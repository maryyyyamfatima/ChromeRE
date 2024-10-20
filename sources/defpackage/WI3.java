package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WI3 extends AbstractC1405Kv {
    public final TextRecognizerOptions h;

    public WI3(Context context, TextRecognizerOptions textRecognizerOptions) {
        super(context, "TextNativeHandle", "ocr");
        this.h = textRecognizerOptions;
        d();
    }

    @Override // defpackage.AbstractC1405Kv
    public final Object a(C1146Iv0 c1146Iv0, Context context) {
        IInterface c3596ae1;
        IBinder h = c1146Iv0.h("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        int i = AbstractBinderC3940be1.a;
        Object obj = null;
        if (h == null) {
            c3596ae1 = null;
        } else {
            IInterface queryLocalInterface = h.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            if (queryLocalInterface instanceof InterfaceC4283ce1) {
                c3596ae1 = (InterfaceC4283ce1) queryLocalInterface;
            } else {
                c3596ae1 = new C3596ae1(h);
            }
        }
        if (c3596ae1 != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            C3596ae1 c3596ae12 = (C3596ae1) c3596ae1;
            Parcel a = c3596ae12.a();
            AbstractC11786yV.c(a, objectWrapper);
            AbstractC11786yV.b(a, this.h);
            Parcel e = c3596ae12.e(1, a);
            IBinder readStrongBinder = e.readStrongBinder();
            int i2 = AbstractBinderC3136Yd1.a;
            if (readStrongBinder != null) {
                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
                if (queryLocalInterface2 instanceof InterfaceC3266Zd1) {
                    obj = (InterfaceC3266Zd1) queryLocalInterface2;
                } else {
                    obj = new C3006Xd1(readStrongBinder);
                }
            }
            e.recycle();
        }
        return obj;
    }

    @Override // defpackage.AbstractC1405Kv
    public final void c() {
        C3006Xd1 c3006Xd1 = (C3006Xd1) ((InterfaceC3266Zd1) d());
        c3006Xd1.h(2, c3006Xd1.a());
    }
}
