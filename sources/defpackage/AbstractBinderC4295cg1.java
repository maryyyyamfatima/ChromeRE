package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.chrome.browser.webapps.WebApkInstallCoordinatorBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4295cg1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC4295cg1() {
        attachInterface(this, "org.chromium.components.webapk_install.IWebApkInstallCoordinatorService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.components.webapk_install.IWebApkInstallCoordinatorService");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.components.webapk_install.IWebApkInstallCoordinatorService");
            return true;
        }
        if (i == 1) {
            byte[] createByteArray = parcel.createByteArray();
            InterfaceC10122te1 interfaceC10122te1 = null;
            Bitmap bitmap = (Bitmap) (parcel.readInt() != 0 ? Bitmap.CREATOR.createFromParcel(parcel) : null);
            boolean z = parcel.readInt() != 0;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.components.webapk_install.IOnFinishInstallCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10122te1)) {
                    interfaceC10122te1 = (InterfaceC10122te1) queryLocalInterface;
                } else {
                    interfaceC10122te1 = new C9779se1(readStrongBinder);
                }
            }
            WebApkInstallCoordinatorBridge webApkInstallCoordinatorBridge = new WebApkInstallCoordinatorBridge();
            webApkInstallCoordinatorBridge.b = interfaceC10122te1;
            N.M2rXsUfq(webApkInstallCoordinatorBridge.a, webApkInstallCoordinatorBridge, createByteArray, bitmap, z);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
