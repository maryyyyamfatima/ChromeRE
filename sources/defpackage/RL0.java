package defpackage;

import android.content.Context;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RL0 extends AbstractC7856n11 {
    public static final C3588ad l = new C3588ad("Fido.FIDO2_API", new ML0(148, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService", "com.google.android.gms.fido.fido2.regular.START"), new C3259Zc());
    public static final C3588ad m = new C3588ad("Fido.FIDO2_PRIVILEGED_API", new ML0(149, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService", "com.google.android.gms.fido.fido2.privileged.START"), new C3259Zc());
    public final boolean k;

    public final AF3 f(int i, final int i2, final Parcel parcel, final LL0 ll0) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: JL0
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                int i3 = i2;
                Parcel parcel2 = parcel;
                NL0 nl0 = (NL0) obj;
                LL0.this.a((C6905kF3) obj2);
                Parcel obtain = Parcel.obtain();
                try {
                    ((OL0) nl0.m()).a.transact(i3, parcel2, obtain, 0);
                    obtain.readException();
                } finally {
                    parcel2.recycle();
                    obtain.recycle();
                }
            }
        };
        c5531gF3.d = i;
        return b(0, c5531gF3.a());
    }

    public RL0(Context context, int i) {
        super(context, i == 1 ? l : m, new C10457ud());
        this.k = i == 1;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.k ? "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService" : "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return obtain;
    }
}
