package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Hj4 extends AbstractBinderC7826mw implements InterfaceC3146Yf1 {
    @Override // defpackage.InterfaceC3146Yf1
    public void Y(Status status, boolean z) {
    }

    @Override // defpackage.InterfaceC3146Yf1
    public void Z(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC3146Yf1
    public void o0(Status status, WebPaymentData webPaymentData) {
    }

    public Hj4() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        switch (i) {
            case 1:
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 2:
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int readInt = parcel.readInt();
                ClassLoader classLoader = AbstractC11786yV.a;
                z = parcel.readInt() != 0;
                AbstractBinderC7826mw.g1(parcel);
                Z(readInt, z);
                return true;
            case 4:
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            default:
                return false;
            case 6:
                parcel.readInt();
                ClassLoader classLoader2 = AbstractC11786yV.a;
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 7:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 8:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 9:
                Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                z = parcel.readInt() != 0;
                AbstractBinderC7826mw.g1(parcel);
                Y(status, z);
                return true;
            case 10:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 11:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 12:
                Status status2 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) AbstractC11786yV.a(parcel, WebPaymentData.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                o0(status2, webPaymentData);
                return true;
            case 13:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 14:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 15:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 16:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 17:
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 18:
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                return true;
            case 19:
                AbstractBinderC7826mw.g1(parcel);
                return true;
        }
    }
}
