package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8739pc1 extends AbstractC2444Sv implements InterfaceC9424rc1 {
    public C8739pc1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean f1() {
        Parcel e = e(7, a());
        ClassLoader classLoader = AbstractC11786yV.a;
        boolean z = e.readInt() != 0;
        e.recycle();
        return z;
    }
}
