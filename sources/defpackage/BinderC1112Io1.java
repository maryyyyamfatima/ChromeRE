package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Io1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1112Io1 extends AbstractBinderC7826mw {
    public final C6905kF3 a;

    public BinderC1112Io1(C6905kF3 c6905kF3) {
        super("com.google.android.gms.credential.manager.common.IIntegerCallback");
        this.a = c6905kF3;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        int readInt = parcel.readInt();
        AbstractBinderC7826mw.g1(parcel);
        RF3.a(status, status.r1() ? Integer.valueOf(readInt) : null, this.a);
        return true;
    }
}
