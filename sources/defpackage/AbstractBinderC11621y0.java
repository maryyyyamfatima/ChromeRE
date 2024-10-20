package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC11621y0 extends AbstractBinderC7826mw implements InterfaceC4633df1 {
    public void D(Status status, SafeBrowsingData safeBrowsingData) {
        throw new UnsupportedOperationException();
    }

    public void R0(Status status) {
        throw new UnsupportedOperationException();
    }

    public void o(int i, Status status, String str) {
        throw new UnsupportedOperationException();
    }

    public AbstractBinderC11621y0() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 2) {
            parcel.readString();
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 3) {
            Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
            SafeBrowsingData safeBrowsingData = (SafeBrowsingData) AbstractC11786yV.a(parcel, SafeBrowsingData.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            D(status, safeBrowsingData);
            return true;
        }
        if (i == 4) {
            parcel.readInt();
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 6) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 8) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 10) {
            parcel.readInt();
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 11) {
            Status status2 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            R0(status2);
            return true;
        }
        if (i == 15) {
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 16) {
            return false;
        }
        Status status3 = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        AbstractBinderC7826mw.g1(parcel);
        o(readInt, status3, readString);
        return true;
    }
}
