package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.GetParentVerificationIntentResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2811Vq1 extends AbstractBinderC7826mw {
    public final /* synthetic */ C6905kF3 a;

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        GetParentVerificationIntentResponse getParentVerificationIntentResponse = (GetParentVerificationIntentResponse) AbstractC11786yV.a(parcel, GetParentVerificationIntentResponse.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        RF3.a(status, getParentVerificationIntentResponse.a, this.a);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2811Vq1(C6905kF3 c6905kF3) {
        super("com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
        this.a = c6905kF3;
    }
}
