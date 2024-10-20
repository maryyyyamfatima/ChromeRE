package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yb1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11819yb1 implements InterfaceC12162zb1 {
    public final IBinder a;

    public C11819yb1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.InterfaceC12162zb1
    public final void l(Bundle bundle, InterfaceC0267Cb1 interfaceC0267Cb1) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.components.browser_ui.photo_picker.IDecoderService");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongInterface(interfaceC0267Cb1);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
