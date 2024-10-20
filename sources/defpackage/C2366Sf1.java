package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.sdk.common.deps.a;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.library.api.ObjectWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sf1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2366Sf1 extends a implements InterfaceC2626Uf1 {
    public C2366Sf1(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IVrCreator");
    }

    public final InterfaceC3016Xf1 a(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2) {
        InterfaceC3016Xf1 c2756Vf1;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, objectWrapper);
        c.a(obtainAndWriteInterfaceToken, objectWrapper2);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        int i = AbstractBinderC2886Wf1.a;
        if (readStrongBinder == null) {
            c2756Vf1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
            if (queryLocalInterface instanceof InterfaceC3016Xf1) {
                c2756Vf1 = (InterfaceC3016Xf1) queryLocalInterface;
            } else {
                c2756Vf1 = new C2756Vf1(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c2756Vf1;
    }
}
