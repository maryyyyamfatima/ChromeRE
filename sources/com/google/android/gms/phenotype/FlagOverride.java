package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8155nt2;
import defpackage.FP0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new FP0();
    public final String a;
    public final String g;
    public final Flag h;
    public final boolean i;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.a = str;
        this.g = str2;
        this.h = flag;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        return AbstractC8155nt2.a(this.a, flagOverride.a) && AbstractC8155nt2.a(this.g, flagOverride.g) && AbstractC8155nt2.a(this.h, flagOverride.h) && this.i == flagOverride.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.n(parcel, 4, this.h, i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.b(a, parcel);
    }

    public final String toString() {
        return r1(new StringBuilder());
    }

    public final String r1(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        this.h.r1(sb);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
