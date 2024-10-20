package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fa1 */
/* loaded from: classes.dex */
public final class C0652Fa1 extends AbstractC2444Sv implements InterfaceC0912Ha1 {
    public C0652Fa1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    public final InterfaceC9785sf1 g1(String str, String str2, D43 d43) {
        InterfaceC9785sf1 c9100qf1;
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        AbstractC11786yV.c(a, d43);
        Parcel e = e(2, a);
        IBinder readStrongBinder = e.readStrongBinder();
        int i = AbstractBinderC9442rf1.a;
        if (readStrongBinder == null) {
            c9100qf1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof InterfaceC9785sf1) {
                c9100qf1 = (InterfaceC9785sf1) queryLocalInterface;
            } else {
                c9100qf1 = new C9100qf1(readStrongBinder);
            }
        }
        e.recycle();
        return c9100qf1;
    }

    public final InterfaceC1691Na1 f1(CastOptions castOptions, InterfaceC9436re1 interfaceC9436re1, NH nh) {
        InterfaceC1691Na1 c1432La1;
        Parcel a = a();
        AbstractC11786yV.b(a, castOptions);
        AbstractC11786yV.c(a, interfaceC9436re1);
        AbstractC11786yV.c(a, nh);
        Parcel e = e(3, a);
        IBinder readStrongBinder = e.readStrongBinder();
        int i = AbstractBinderC1561Ma1.a;
        if (readStrongBinder == null) {
            c1432La1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof InterfaceC1691Na1) {
                c1432La1 = (InterfaceC1691Na1) queryLocalInterface;
            } else {
                c1432La1 = new C1432La1(readStrongBinder);
            }
        }
        e.recycle();
        return c1432La1;
    }
}
