package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ic1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6334ic1 extends AbstractBinderC7826mw {
    public AbstractBinderC6334ic1() {
        super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) AbstractC11786yV.a(parcel, GmsDeviceComplianceResponse.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        RF3.b(status, gmsDeviceComplianceResponse, ((BinderC9851sq1) this).a);
        return true;
    }
}
