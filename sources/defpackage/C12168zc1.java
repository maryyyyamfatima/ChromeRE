package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import org.chromium.base.UnguessableToken;
import org.chromium.content.common.SurfaceWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zc1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12168zc1 implements InterfaceC0142Bc1 {
    public final IBinder a;

    public C12168zc1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0142Bc1
    public final void C(UnguessableToken unguessableToken, Surface surface) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.content.common.IGpuProcessCallback");
            if (unguessableToken != null) {
                obtain.writeInt(1);
                unguessableToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (surface != null) {
                obtain.writeInt(1);
                surface.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC0142Bc1
    public final SurfaceWrapper G0(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.content.common.IGpuProcessCallback");
            obtain.writeInt(i);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (SurfaceWrapper) (obtain2.readInt() != 0 ? SurfaceWrapper.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
