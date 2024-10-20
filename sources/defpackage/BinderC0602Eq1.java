package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0602Eq1 extends AbstractBinderC7826mw {
    public final /* synthetic */ C6905kF3 a;

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) AbstractC11786yV.a(parcel, AccountChangeEventsResponse.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        C0992Hq1.f(status, accountChangeEventsResponse, this.a);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0602Eq1(C6905kF3 c6905kF3) {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        this.a = c6905kF3;
    }
}
