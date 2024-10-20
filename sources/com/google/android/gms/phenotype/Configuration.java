package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8155nt2;
import defpackage.RT2;
import defpackage.X20;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new X20();
    public final int a;
    public final Flag[] g;
    public final String[] h;
    public final TreeMap i = new TreeMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((Configuration) obj).a;
    }

    public Configuration(int i, Flag[] flagArr, String[] strArr) {
        this.a = i;
        this.g = flagArr;
        for (Flag flag : flagArr) {
            this.i.put(flag.a, flag);
        }
        this.h = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.r(parcel, 3, this.g, i);
        RT2.p(parcel, 4, this.h);
        RT2.b(a, parcel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            sb.append((Flag) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.h;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.a == configuration.a && AbstractC8155nt2.a(this.i, configuration.i) && Arrays.equals(this.h, configuration.h)) {
                return true;
            }
        }
        return false;
    }
}
