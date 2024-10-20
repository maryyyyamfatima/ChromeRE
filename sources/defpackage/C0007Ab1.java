package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ab1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0007Ab1 implements InterfaceC0267Cb1 {
    public final IBinder a;

    public C0007Ab1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0267Cb1
    public final void m0(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
