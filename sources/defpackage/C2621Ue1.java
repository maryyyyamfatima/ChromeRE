package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ue1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2621Ue1 extends AbstractC2444Sv implements InterfaceC2751Ve1 {
    public C2621Ue1(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchService");
    }

    public final InterfaceC3141Ye1 f1(String str, InterfaceC3602af1 interfaceC3602af1, byte[] bArr) {
        InterfaceC3141Ye1 c2881We1;
        Parcel a = a();
        a.writeString(str);
        AbstractC11786yV.c(a, interfaceC3602af1);
        a.writeByteArray(bArr);
        Parcel e = e(1, a);
        IBinder readStrongBinder = e.readStrongBinder();
        int i = AbstractBinderC3011Xe1.a;
        if (readStrongBinder == null) {
            c2881We1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
            if (queryLocalInterface instanceof InterfaceC3141Ye1) {
                c2881We1 = (InterfaceC3141Ye1) queryLocalInterface;
            } else {
                c2881We1 = new C2881We1(readStrongBinder);
            }
        }
        e.recycle();
        return c2881We1;
    }
}
