package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.sdk.common.deps.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vf1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2756Vf1 extends a implements InterfaceC3016Xf1 {
    public C2756Vf1(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
    }

    public final long e(int i, int i2, int i3) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }

    public final long a() {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }

    public final long h(String str, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }
}
