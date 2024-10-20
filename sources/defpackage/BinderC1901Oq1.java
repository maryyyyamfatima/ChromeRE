package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1901Oq1 extends AbstractBinderC7826mw {
    public final /* synthetic */ C6905kF3 a;

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        SharedKey[] sharedKeyArr = (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        boolean r1 = status.r1();
        C6905kF3 c6905kF3 = this.a;
        if (r1) {
            c6905kF3.b(Arrays.asList(sharedKeyArr));
            return true;
        }
        c6905kF3.a(AbstractC10800vd.a(status));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1901Oq1(C6905kF3 c6905kF3) {
        super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
        this.a = c6905kF3;
    }
}
