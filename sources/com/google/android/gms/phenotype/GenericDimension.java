package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8207o22;
import defpackage.C4935eY0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GenericDimension extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new C4935eY0();
    public final int a;
    public final int g;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        GenericDimension genericDimension = (GenericDimension) obj;
        int i = genericDimension.a;
        int i2 = this.a;
        if (i2 < i) {
            return -1;
        }
        if (i2 <= i) {
            int i3 = this.g;
            int i4 = genericDimension.g;
            if (i3 < i4) {
                return -1;
            }
            if (i3 <= i4) {
                return 0;
            }
        }
        return 1;
    }

    public GenericDimension(int i, int i2) {
        this.a = i;
        this.g = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenericDimension(");
        sb.append(this.a);
        sb.append(", ");
        return AbstractC8207o22.a(sb, this.g, ")");
    }

    public final int hashCode() {
        return (this.a * 31) + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericDimension)) {
            return false;
        }
        GenericDimension genericDimension = (GenericDimension) obj;
        int i = genericDimension.a;
        char c = 65535;
        int i2 = this.a;
        if (i2 >= i) {
            if (i2 <= i) {
                int i3 = this.g;
                int i4 = genericDimension.g;
                if (i3 >= i4) {
                    if (i3 <= i4) {
                        c = 0;
                    }
                }
            }
            c = 1;
        }
        return c == 0;
    }
}
