package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1821Oa1 extends AbstractC2444Sv implements InterfaceC2081Qa1 {
    public C1821Oa1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.InterfaceC2081Qa1
    public final InterfaceC9436re1 L() {
        InterfaceC9436re1 c8408oe1;
        Parcel e = e(1, a());
        IBinder readStrongBinder = e.readStrongBinder();
        String str = AbstractBinderC8751pe1.DESCRIPTOR;
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

    @Override // defpackage.InterfaceC2081Qa1
    public final int i() {
        Parcel e = e(2, a());
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }
}
