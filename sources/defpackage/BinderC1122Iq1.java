package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1122Iq1 extends AbstractBinderC7826mw {
    public final /* synthetic */ C6905kF3 a;

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        byte[] createByteArray = parcel.createByteArray();
        AbstractBinderC7826mw.g1(parcel);
        boolean r1 = status.r1();
        C6905kF3 c6905kF3 = this.a;
        if (r1) {
            c6905kF3.b(createByteArray);
            return true;
        }
        c6905kF3.a(AbstractC10800vd.a(status));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1122Iq1(C6905kF3 c6905kF3) {
        super("com.google.android.gms.auth.folsom.internal.IByteArrayCallback");
        this.a = c6905kF3;
    }
}
