package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC9972tB0;
import defpackage.C9122qj;
import defpackage.RT2;
import defpackage.WH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C9122qj();
    public final String a;
    public final String g;
    public final List h;
    public final String i;
    public final Uri j;
    public final String k;
    public final String l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.q(parcel, 5, Collections.unmodifiableList(this.h));
        RT2.o(parcel, 6, this.i);
        RT2.n(parcel, 7, this.j, i);
        RT2.o(parcel, 8, this.k);
        RT2.o(parcel, 9, this.l);
        RT2.b(a, parcel);
    }

    public ApplicationMetadata(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5) {
        this.a = str;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = uri;
        this.k = str4;
        this.l = str5;
    }

    public final String toString() {
        List list = this.h;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder("applicationId: ");
        sb.append(this.a);
        sb.append(", name: ");
        sb.append(this.g);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        AbstractC9972tB0.a(sb, this.i, ", senderAppLaunchUrl: ", valueOf, ", iconUrl: ");
        sb.append(this.k);
        sb.append(", type: ");
        sb.append(this.l);
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, this.h, this.i, this.j, this.k});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return WH.a(this.a, applicationMetadata.a) && WH.a(this.g, applicationMetadata.g) && WH.a(this.h, applicationMetadata.h) && WH.a(this.i, applicationMetadata.i) && WH.a(this.j, applicationMetadata.j) && WH.a(this.k, applicationMetadata.k) && WH.a(this.l, applicationMetadata.l);
    }
}
