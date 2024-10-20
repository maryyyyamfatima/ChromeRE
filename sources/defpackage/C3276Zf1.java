package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import org.chromium.webapk.lib.runtime_library.IWebApkApi;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3276Zf1 implements InterfaceC3952bg1 {
    public final IBinder a;

    public C3276Zf1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final int a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
