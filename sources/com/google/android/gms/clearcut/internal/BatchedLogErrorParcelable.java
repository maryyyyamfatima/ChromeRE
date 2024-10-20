package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7488lx;
import defpackage.RT2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BatchedLogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7488lx();
    public final List a;

    public BatchedLogErrorParcelable(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BatchedLogErrorParcelable) {
            return this.a.equals(((BatchedLogErrorParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.t(parcel, 1, this.a);
        RT2.b(a, parcel);
    }
}
