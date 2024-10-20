package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.sdk.common.deps.a;
import com.google.vr.sdk.common.deps.c;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ic1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1052Ic1 extends a implements InterfaceC1312Kc1 {
    public C1052Ic1(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    @Override // defpackage.InterfaceC1312Kc1
    public final void setCloseButtonListener(InterfaceC9094qe1 interfaceC9094qe1) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, interfaceC9094qe1);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    @Override // defpackage.InterfaceC1312Kc1
    public final void setTransitionViewEnabled(boolean z) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    @Override // defpackage.InterfaceC1312Kc1
    public final void setSettingsButtonListener(InterfaceC9094qe1 interfaceC9094qe1) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, interfaceC9094qe1);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }
}
