package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Df1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0417Df1 extends AbstractBinderC7826mw implements InterfaceC0547Ef1 {
    public AbstractBinderC0417Df1() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        b(status);
        return true;
    }
}
