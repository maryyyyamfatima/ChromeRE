package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1958Pb3 extends AbstractBinderC7826mw implements InterfaceC9767sc1 {
    @Override // defpackage.InterfaceC9767sc1
    public void S0() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC9767sc1
    public void s0() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                GoogleHelp googleHelp = (GoogleHelp) AbstractC11786yV.a(parcel, GoogleHelp.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                G(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                S0();
                return true;
            case 8:
                s0();
                return true;
            case 9:
                parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case 12:
                throw new UnsupportedOperationException();
            case 13:
                parcel.createByteArray();
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 14:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    public AbstractBinderC1958Pb3() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }
}
