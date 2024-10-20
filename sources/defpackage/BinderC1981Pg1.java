package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1981Pg1 extends Binder implements InterfaceC12162zb1 {
    public static final /* synthetic */ int g = 0;
    public boolean a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC1981Pg1() {
        attachInterface(this, "org.chromium.components.browser_ui.photo_picker.IDecoderService");
    }

    @Override // android.os.Binder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.components.browser_ui.photo_picker.IDecoderService");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.components.browser_ui.photo_picker.IDecoderService");
            return true;
        }
        if (i == 1) {
            InterfaceC0267Cb1 interfaceC0267Cb1 = null;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0267Cb1)) {
                    interfaceC0267Cb1 = (InterfaceC0267Cb1) queryLocalInterface;
                } else {
                    interfaceC0267Cb1 = new C0007Ab1(readStrongBinder);
                }
            }
            l(bundle, interfaceC0267Cb1);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [long] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.InterfaceC12162zb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.os.Bundle r21, defpackage.InterfaceC0267Cb1 r22) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BinderC1981Pg1.l(android.os.Bundle, Cb1):void");
    }

    public static void e(Bundle bundle, InterfaceC0267Cb1 interfaceC0267Cb1) {
        try {
            interfaceC0267Cb1.m0(bundle);
        } catch (RemoteException e) {
            AbstractC4851eH1.a("ImageDecoder", "Remote error while replying: " + e, new Object[0]);
        }
    }
}
