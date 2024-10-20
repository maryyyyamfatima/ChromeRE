package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC9465rj0 extends AbstractBinderC7826mw implements InterfaceC2991Xa1 {
    public void x(Status status) {
        throw new UnsupportedOperationException();
    }

    public void a1(Status status) {
        throw new UnsupportedOperationException();
    }

    public AbstractBinderC9465rj0() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                x(status);
                return true;
            case 2:
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                parcel.readLong();
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 4:
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                parcel.readLong();
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 6:
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 7:
                AbstractBinderC7826mw.g1(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                a1(status2);
                return true;
            default:
                return false;
        }
    }
}
