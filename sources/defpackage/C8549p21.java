package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p21 */
/* loaded from: classes.dex */
public final class C8549p21 implements InterfaceC9234r21 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;

    public C8549p21(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.InterfaceC9234r21
    public final Object a(IBinder iBinder) {
        InterfaceC9412ra1 c8727pa1;
        int i = AbstractBinderC9070qa1.a;
        if (iBinder == null) {
            c8727pa1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof InterfaceC9412ra1) {
                c8727pa1 = (InterfaceC9412ra1) queryLocalInterface;
            } else {
                c8727pa1 = new C8727pa1(iBinder);
            }
        }
        C8727pa1 c8727pa12 = (C8727pa1) c8727pa1;
        Parcel a = c8727pa12.a();
        a.writeString(this.a);
        AbstractC11786yV.b(a, this.b);
        Parcel e = c8727pa12.e(2, a);
        Bundle bundle = (Bundle) AbstractC11786yV.a(e, Bundle.CREATOR);
        e.recycle();
        AbstractC9577s21.k(bundle);
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new C6486j21(string);
    }
}
