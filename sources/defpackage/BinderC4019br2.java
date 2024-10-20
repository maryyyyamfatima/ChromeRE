package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: br2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4019br2 extends AbstractBinderC7826mw {
    public final C6905kF3 a;

    public BinderC4019br2(C6905kF3 c6905kF3) {
        super("com.google.android.gms.credential.manager.common.IPendingIntentCallback");
        this.a = c6905kF3;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) AbstractC11786yV.a(parcel, PendingIntent.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        RF3.a(status, pendingIntent, this.a);
        return true;
    }
}
