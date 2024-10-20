package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bb1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0137Bb1 extends Binder implements InterfaceC0267Cb1 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC0137Bb1() {
        attachInterface(this, "org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ((BinderC2640Ui0) this).m0((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
