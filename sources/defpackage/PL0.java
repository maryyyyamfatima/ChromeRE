package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PL0 extends Binder implements LL0 {
    public final boolean a;
    public C6905kF3 g;

    public PL0(RL0 rl0) {
        this.a = rl0.k;
    }

    @Override // defpackage.LL0
    public final void a(C6905kF3 c6905kF3) {
        this.g = c6905kF3;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        parcel.enforceInterface(this.a ? "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks" : "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
        Status status = parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null;
        PendingIntent pendingIntent = parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null;
        if (status.r1()) {
            this.g.b(pendingIntent);
        } else {
            this.g.a(new C10114td(status));
        }
        parcel2.writeNoException();
        return true;
    }
}
