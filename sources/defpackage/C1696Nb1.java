package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1696Nb1 extends AbstractC2444Sv implements InterfaceC1956Pb1 {
    public C1696Nb1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final InterfaceC9436re1 f1(ObjectWrapper objectWrapper, String str, boolean z, long j) {
        InterfaceC9436re1 c8408oe1;
        Parcel a = a();
        AbstractC11786yV.c(a, objectWrapper);
        a.writeString(str);
        a.writeInt(z ? 1 : 0);
        a.writeLong(j);
        Parcel e = e(7, a);
        IBinder readStrongBinder = e.readStrongBinder();
        String str2 = AbstractBinderC8751pe1.DESCRIPTOR;
        if (readStrongBinder == null) {
            c8408oe1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(AbstractBinderC8751pe1.DESCRIPTOR);
            if (queryLocalInterface instanceof InterfaceC9436re1) {
                c8408oe1 = (InterfaceC9436re1) queryLocalInterface;
            } else {
                c8408oe1 = new C8408oe1(readStrongBinder);
            }
        }
        e.recycle();
        return c8408oe1;
    }
}
