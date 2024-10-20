package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jw */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6794jw extends AbstractBinderC7826mw implements InterfaceC11157wf1 {
    public AbstractBinderC6794jw() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                AbstractBinderC7826mw.g1(parcel);
                break;
            case 4:
                AbstractBinderC7826mw.g1(parcel);
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            default:
                return false;
            case 6:
                AbstractBinderC7826mw.g1(parcel);
                break;
            case 7:
                AbstractBinderC7826mw.g1(parcel);
                break;
            case 8:
                SignInResponse signInResponse = (SignInResponse) AbstractC11786yV.a(parcel, SignInResponse.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                H(signInResponse);
                break;
            case 9:
                AbstractBinderC7826mw.g1(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
