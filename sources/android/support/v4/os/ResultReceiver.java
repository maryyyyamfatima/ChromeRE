package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C3946bf1;
import defpackage.InterfaceC4289cf1;
import defpackage.TP2;
import defpackage.UP2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new TP2();
    public InterfaceC4289cf1 a;

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new UP2(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        InterfaceC4289cf1 c3946bf1;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = UP2.g;
        if (readStrongBinder == null) {
            c3946bf1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC4289cf1)) {
                c3946bf1 = (InterfaceC4289cf1) queryLocalInterface;
            } else {
                c3946bf1 = new C3946bf1(readStrongBinder);
            }
        }
        this.a = c3946bf1;
    }
}
