package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC8155nt2;
import defpackage.C3810bF0;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C3810bF0();
    public final String a;
    public final byte[] g;
    public final byte[][] h;
    public final byte[][] i;
    public final byte[][] j;
    public final byte[][] k;
    public final int[] l;
    public final byte[][] m;
    public final int[] n;

    static {
        byte[][] bArr = new byte[0];
        new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.d(parcel, 3, this.g);
        RT2.e(parcel, 4, this.h);
        RT2.e(parcel, 5, this.i);
        RT2.e(parcel, 6, this.j);
        RT2.e(parcel, 7, this.k);
        RT2.h(parcel, 8, this.l);
        RT2.e(parcel, 9, this.m);
        RT2.h(parcel, 10, this.n);
        RT2.b(a, parcel);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.a = str;
        this.g = bArr;
        this.h = bArr2;
        this.i = bArr3;
        this.j = bArr4;
        this.k = bArr5;
        this.l = iArr;
        this.m = bArr6;
        this.n = iArr2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.a;
        sb.append(str == null ? "null" : AbstractC4199cO1.a("'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.g;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        u1(sb, "GAIA=", this.h);
        sb.append(", ");
        u1(sb, "PSEUDO=", this.i);
        sb.append(", ");
        u1(sb, "ALWAYS=", this.j);
        sb.append(", ");
        u1(sb, "OTHER=", this.k);
        sb.append(", ");
        sb.append("weak=");
        sb.append(Arrays.toString(this.l));
        sb.append(", ");
        u1(sb, "directs=", this.m);
        sb.append(", ");
        sb.append("genDims=");
        sb.append(Arrays.toString(t1(this.n).toArray()));
        sb.append(")");
        return sb.toString();
    }

    public static void u1(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExperimentTokens)) {
            return false;
        }
        ExperimentTokens experimentTokens = (ExperimentTokens) obj;
        return AbstractC8155nt2.a(this.a, experimentTokens.a) && Arrays.equals(this.g, experimentTokens.g) && AbstractC8155nt2.a(s1(this.h), s1(experimentTokens.h)) && AbstractC8155nt2.a(s1(this.i), s1(experimentTokens.i)) && AbstractC8155nt2.a(s1(this.j), s1(experimentTokens.j)) && AbstractC8155nt2.a(s1(this.k), s1(experimentTokens.k)) && AbstractC8155nt2.a(r1(this.l), r1(experimentTokens.l)) && AbstractC8155nt2.a(s1(this.m), s1(experimentTokens.m)) && AbstractC8155nt2.a(t1(this.n), t1(experimentTokens.n));
    }

    public static List s1(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List r1(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List t1(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length / 2);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
