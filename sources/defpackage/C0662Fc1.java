package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.sdk.common.deps.a;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.library.api.ObjectWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fc1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0662Fc1 extends a implements InterfaceC0922Hc1 {
    public C0662Fc1(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrLayout");
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final long getNativeGvrContext() {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final InterfaceC9094qe1 getRootView() {
        InterfaceC9094qe1 c8064ne1;
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        int i = ObjectWrapper.a;
        if (readStrongBinder == null) {
            c8064ne1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            if (queryLocalInterface instanceof InterfaceC9094qe1) {
                c8064ne1 = (InterfaceC9094qe1) queryLocalInterface;
            } else {
                c8064ne1 = new C8064ne1(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c8064ne1;
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final InterfaceC1312Kc1 getUiLayout() {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        InterfaceC1312Kc1 asInterface = AbstractBinderC1182Jc1.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final void onPause() {
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final void onResume() {
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final void shutdown() {
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final void setPresentationView(InterfaceC9094qe1 interfaceC9094qe1) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, interfaceC9094qe1);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final boolean enableAsyncReprojection(int i) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        boolean a = c.a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    @Override // defpackage.InterfaceC0922Hc1
    public final void setReentryIntent(InterfaceC9094qe1 interfaceC9094qe1) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, interfaceC9094qe1);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }
}
