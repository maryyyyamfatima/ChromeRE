package defpackage;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KL0 extends Binder implements LL0 {
    public C6905kF3 a;

    @Override // defpackage.LL0
    public final void a(C6905kF3 c6905kF3) {
        this.a = c6905kF3;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        parcel.enforceInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
        if (i == 1) {
            this.a.b(Boolean.valueOf(parcel.readInt() != 0));
        } else {
            if (i != 2) {
                return false;
            }
            this.a.a(new C10114td(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null));
        }
        parcel2.writeNoException();
        return true;
    }
}
