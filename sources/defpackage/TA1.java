package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TA1 extends AbstractBinderC7826mw {
    public final InterfaceC8851pv a;

    public TA1(InterfaceC8851pv interfaceC8851pv) {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.a = interfaceC8851pv;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            ((Y34) this).a.a(status);
            return true;
        }
        if (i == 2) {
            AbstractBinderC7826mw.g1(parcel);
            return true;
        }
        if (i != 4) {
            return false;
        }
        AbstractBinderC7826mw.g1(parcel);
        return true;
    }
}
