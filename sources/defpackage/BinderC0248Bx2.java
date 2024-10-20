package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0248Bx2 extends AbstractBinderC2361Se1 {
    @Override // defpackage.InterfaceC2491Te1
    public final void Y0(InterfaceC8733pb1 interfaceC8733pb1, Bundle bundle) {
        C7702mb1 c7702mb1 = (C7702mb1) interfaceC8733pb1;
        c7702mb1.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            AbstractC8390ob1.a(obtain, bundle);
            c7702mb1.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2491Te1
    public final void D0(InterfaceC8733pb1 interfaceC8733pb1, String str, Bundle bundle) {
        C7702mb1 c7702mb1 = (C7702mb1) interfaceC8733pb1;
        c7702mb1.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            obtain.writeString(str);
            AbstractC8390ob1.a(obtain, bundle);
            c7702mb1.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
