package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L43 extends AbstractBinderC7826mw {
    public final /* synthetic */ UH a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L43(UH uh) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.a = uh;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        UH uh = this.a;
        if (i == 1) {
            String readString = parcel.readString();
            AbstractBinderC7826mw.g1(parcel);
            uh.getClass();
            InterfaceC9436re1 a = new QH(uh.a, uh.b, readString, uh.d, new KR1(uh.a, uh.d, uh.e)).a();
            parcel2.writeNoException();
            AbstractC11786yV.c(parcel2, a);
            return true;
        }
        if (i == 2) {
            boolean z = uh.d.j;
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC11786yV.a;
            parcel2.writeInt(z ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String str = uh.b;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        if (i != 4) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(222980000);
        return true;
    }
}
