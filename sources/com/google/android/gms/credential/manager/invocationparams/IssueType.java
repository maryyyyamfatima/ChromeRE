package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C9863ss1;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IssueType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C9863ss1();
    public final int a;

    public IssueType(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof IssueType) && ((IssueType) obj).a == this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.b(a, parcel);
    }
}
