package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.usage_stats.idl.ParcelableBrowserRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ua1 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC10441ua1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC10441ua1() {
        attachInterface(this, "org.chromium.chrome.browser.usage_stats.idl.IBrowserService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC10098ta1 c9755sa1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.chrome.browser.usage_stats.idl.IBrowserService");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.chrome.browser.usage_stats.idl.IBrowserService");
            return true;
        }
        if (i == 1) {
            String str = null;
            ParcelableBrowserRequest parcelableBrowserRequest = (ParcelableBrowserRequest) (parcel.readInt() != 0 ? ParcelableBrowserRequest.CREATOR.createFromParcel(parcel) : null);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c9755sa1 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.chrome.browser.usage_stats.idl.IBrowserCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10098ta1)) {
                    c9755sa1 = (InterfaceC10098ta1) queryLocalInterface;
                } else {
                    c9755sa1 = new C9755sa1(readStrongBinder);
                }
            }
            BinderC6159i44 binderC6159i44 = (BinderC6159i44) this;
            String[] packagesForUid = binderC6159i44.a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid.length == 1 && !TextUtils.isEmpty(packagesForUid[0])) {
                str = packagesForUid[0];
            }
            if (str != null && str.equals("com.google.android.apps.wellbeing") && C4502dG0.b.g(str)) {
                ThreadUtils.e(new RunnableC5815h44(binderC6159i44, parcelableBrowserRequest, c9755sa1));
                return true;
            }
            throw new SecurityException();
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
