package defpackage;

import J.N;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import org.chromium.base.UnguessableToken;
import org.chromium.content.common.SurfaceWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ac1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0012Ac1 extends Binder implements InterfaceC0142Bc1 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC0012Ac1() {
        attachInterface(this, "org.chromium.content.common.IGpuProcessCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.content.common.IGpuProcessCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.content.common.IGpuProcessCallback");
            return true;
        }
        if (i == 1) {
            N.M$O7xE3y((UnguessableToken) (parcel.readInt() != 0 ? UnguessableToken.CREATOR.createFromParcel(parcel) : null), (Surface) (parcel.readInt() != 0 ? Surface.CREATOR.createFromParcel(parcel) : null));
        } else if (i == 2) {
            SurfaceWrapper G0 = ((BinderC4780e41) this).G0(parcel.readInt());
            parcel2.writeNoException();
            if (G0 != null) {
                parcel2.writeInt(1);
                G0.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        } else {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }
}
