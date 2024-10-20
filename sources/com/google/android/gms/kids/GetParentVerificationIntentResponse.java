package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.QY0;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GetParentVerificationIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new QY0();
    public final PendingIntent a;

    public GetParentVerificationIntentResponse(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetParentVerificationIntentResponse) {
            return W82.a(this.a, ((GetParentVerificationIntentResponse) obj).a);
        }
        return false;
    }
}
