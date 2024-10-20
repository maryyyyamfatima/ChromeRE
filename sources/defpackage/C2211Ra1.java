package defpackage;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ra1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2211Ra1 implements InterfaceC2471Ta1 {
    public final IBinder a;

    public C2211Ra1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final boolean y0(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            obtain.writeString(str);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final ApplicationInfo b0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return (ApplicationInfo) (obtain2.readInt() != 0 ? ApplicationInfo.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void r0(Bundle bundle, InterfaceC0542Ee1 interfaceC0542Ee1, List list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongInterface(interfaceC0542Ee1);
            obtain.writeBinderList(list);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void X0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void W0(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            obtain.writeInt(i);
            this.a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void q0() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            this.a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void n(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.base.process_launcher.IChildProcessService");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
