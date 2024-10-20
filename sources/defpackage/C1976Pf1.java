package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.sdk.common.deps.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pf1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1976Pf1 extends a implements InterfaceC2236Rf1 {
    public C1976Pf1(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
    }

    public final InterfaceC11476xb1 a() {
        InterfaceC11476xb1 c10790vb1;
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        int i = AbstractBinderC11133wb1.a;
        if (readStrongBinder == null) {
            c10790vb1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            if (queryLocalInterface instanceof InterfaceC11476xb1) {
                c10790vb1 = (InterfaceC11476xb1) queryLocalInterface;
            } else {
                c10790vb1 = new C10790vb1(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c10790vb1;
    }
}
