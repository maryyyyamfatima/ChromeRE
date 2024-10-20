package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E01 {
    public static void a(InterfaceC7364lc1 interfaceC7364lc1, BinderC6444iv binderC6444iv, GetServiceRequest getServiceRequest) {
        C6676jc1 c6676jc1 = (C6676jc1) interfaceC7364lc1;
        c6676jc1.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC6444iv.asBinder());
            obtain.writeInt(1);
            getServiceRequest.writeToParcel(obtain, 0);
            c6676jc1.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
