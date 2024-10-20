package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8155nt2;
import defpackage.C3399a30;
import defpackage.RT2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Configurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C3399a30();
    public final String a;
    public final byte[] g;
    public final String h;
    public final Configuration[] i;
    public final TreeMap j = new TreeMap();
    public final boolean k;
    public final long l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.h);
        RT2.r(parcel, 4, this.i, i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.d(parcel, 6, this.g);
        RT2.f(parcel, 7, 8);
        parcel.writeLong(this.l);
        RT2.b(a, parcel);
    }

    public Configurations(String str, String str2, Configuration[] configurationArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.h = str2;
        this.i = configurationArr;
        this.k = z;
        this.g = bArr;
        this.l = j;
        for (Configuration configuration : configurationArr) {
            this.j.put(Integer.valueOf(configuration.a), configuration);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.h);
        sb.append("', (");
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            sb.append((Configuration) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.k);
        sb.append(", ");
        byte[] bArr = this.g;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.l);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configurations) {
            Configurations configurations = (Configurations) obj;
            if (AbstractC8155nt2.a(this.a, configurations.a) && AbstractC8155nt2.a(this.h, configurations.h) && this.j.equals(configurations.j) && this.k == configurations.k && Arrays.equals(this.g, configurations.g) && this.l == configurations.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.h, this.j, Boolean.valueOf(this.k), this.g, Long.valueOf(this.l)});
    }
}
