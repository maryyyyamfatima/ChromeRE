package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.vr.sdk.common.deps.b;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tb1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC10104tb1 extends b implements InterfaceC10447ub1 {
    public AbstractBinderC10104tb1() {
        attachInterface(this, "com.google.vr.vrcore.common.api.IDaydreamListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                int targetApiVersion = getTargetApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(targetApiVersion);
                return true;
            case 2:
                HeadTrackingState requestStopTracking = requestStopTracking();
                parcel2.writeNoException();
                c.b(parcel2, requestStopTracking);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                applyFade(parcel.readInt(), parcel.readLong());
                return true;
            case 4:
                recenterHeadTracking();
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                dumpDebugData();
                return true;
            case 6:
                resumeHeadTracking((HeadTrackingState) c.a(parcel, HeadTrackingState.CREATOR));
                return true;
            case 7:
                invokeCloseAction();
                return true;
            case 8:
                deprecated_setLensOffsets(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                return true;
            case 9:
                setLensOffset(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                return true;
            case 10:
                applyColorfulFade(parcel.readInt(), parcel.readLong(), parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
