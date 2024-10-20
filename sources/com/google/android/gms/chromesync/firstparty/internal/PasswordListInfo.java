package com.google.android.gms.chromesync.firstparty.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3645am2;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PasswordListInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C3645am2();

    static {
        new PasswordListInfo();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0});
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PasswordListInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RT2.b(RT2.a(20293, parcel), parcel);
    }
}
