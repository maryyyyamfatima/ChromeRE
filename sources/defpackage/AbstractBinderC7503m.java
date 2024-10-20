package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.VisitedApplication;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7503m extends AbstractBinderC7826mw {
    public AbstractBinderC7503m() {
        super("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 13) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 9) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 10) {
            parcel.readInt();
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 26) {
            parcel.readInt();
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 27) {
            switch (i) {
                case 18:
                    AbstractBinderC7826mw.g1(parcel);
                    throw new UnsupportedOperationException();
                case 19:
                    Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
                    LaunchData launchData = (LaunchData) AbstractC11786yV.a(parcel, LaunchData.CREATOR);
                    AbstractBinderC7826mw.g1(parcel);
                    ((BinderC6748jo1) this).a.a(new C7436lo1(status, launchData));
                    return true;
                case 20:
                    parcel.createTypedArrayList(VisitedApplication.CREATOR);
                    AbstractBinderC7826mw.g1(parcel);
                    throw new UnsupportedOperationException();
                case 21:
                    AbstractBinderC7826mw.g1(parcel);
                    throw new UnsupportedOperationException();
                case 22:
                    AbstractBinderC7826mw.g1(parcel);
                    throw new UnsupportedOperationException();
                case 23:
                    AbstractBinderC7826mw.g1(parcel);
                    throw new UnsupportedOperationException();
                default:
                    return false;
            }
        }
        parcel.readInt();
        AbstractBinderC7826mw.g1(parcel);
        throw new UnsupportedOperationException();
    }
}
