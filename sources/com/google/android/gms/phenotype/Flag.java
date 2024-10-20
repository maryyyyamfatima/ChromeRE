package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AP0;
import defpackage.AbstractC8155nt2;
import defpackage.AbstractC8207o22;
import defpackage.AbstractC9076qb1;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new AP0();
    public final String a;
    public final long g;
    public final boolean h;
    public final double i;
    public final String j;
    public final byte[] k;
    public final int l;
    public final int m;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:            if (r3 != false) goto L62;     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.phenotype.Flag r8 = (com.google.android.gms.phenotype.Flag) r8
            java.lang.String r0 = r8.a
            java.lang.String r1 = r7.a
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Le
            goto L9d
        Le:
            r0 = 0
            r1 = -1
            r2 = 1
            int r3 = r7.l
            int r4 = r8.l
            if (r3 >= r4) goto L19
            r4 = r1
            goto L1e
        L19:
            if (r3 != r4) goto L1d
            r4 = r0
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r4 == 0) goto L23
            r0 = r4
            goto L9d
        L23:
            if (r3 == r2) goto L8f
            r4 = 2
            if (r3 == r4) goto L85
            r4 = 3
            if (r3 == r4) goto L7c
            r4 = 4
            if (r3 == r4) goto L6a
            r4 = 5
            if (r3 != r4) goto L5e
            byte[] r3 = r7.k
            byte[] r8 = r8.k
            if (r3 != r8) goto L39
            goto L9d
        L39:
            if (r3 != 0) goto L3d
            goto L97
        L3d:
            if (r8 != 0) goto L41
            goto L9c
        L41:
            r4 = r0
        L42:
            int r5 = r3.length
            int r6 = r8.length
            int r5 = java.lang.Math.min(r5, r6)
            if (r4 >= r5) goto L56
            r5 = r3[r4]
            r6 = r8[r4]
            int r5 = r5 - r6
            if (r5 == 0) goto L53
            r0 = r5
            goto L9d
        L53:
            int r4 = r4 + 1
            goto L42
        L56:
            int r3 = r3.length
            int r8 = r8.length
            if (r3 >= r8) goto L5b
            goto L97
        L5b:
            if (r3 != r8) goto L9c
            goto L9d
        L5e:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "Invalid enum value: "
            java.lang.String r0 = defpackage.AbstractC9076qb1.a(r0, r3)
            r8.<init>(r0)
            throw r8
        L6a:
            java.lang.String r3 = r7.j
            java.lang.String r8 = r8.j
            if (r3 != r8) goto L71
            goto L9d
        L71:
            if (r3 != 0) goto L74
            goto L97
        L74:
            if (r8 != 0) goto L77
            goto L9c
        L77:
            int r0 = r3.compareTo(r8)
            goto L9d
        L7c:
            double r0 = r7.i
            double r2 = r8.i
            int r0 = java.lang.Double.compare(r0, r2)
            goto L9d
        L85:
            boolean r8 = r8.h
            boolean r3 = r7.h
            if (r3 != r8) goto L8c
            goto L9d
        L8c:
            if (r3 == 0) goto L97
            goto L9c
        L8f:
            long r3 = r7.g
            long r5 = r8.g
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L99
        L97:
            r0 = r1
            goto L9d
        L99:
            if (r8 != 0) goto L9c
            goto L9d
        L9c:
            r0 = r2
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.Flag.compareTo(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        String str = this.a;
        if ((str == null) == false) {
            RT2.o(parcel, 2, str);
        }
        long j = this.g;
        if ((j == 0) == false) {
            RT2.f(parcel, 3, 8);
            parcel.writeLong(j);
        }
        boolean z = this.h;
        if ((!z ? 1 : 0) == 0) {
            RT2.f(parcel, 4, 4);
            parcel.writeInt(z ? 1 : 0);
        }
        double d = this.i;
        if ((d == 0.0d) == false) {
            RT2.f(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.j;
        if ((str2 == null) == false) {
            RT2.o(parcel, 6, str2);
        }
        byte[] bArr = this.k;
        if ((bArr == null) == false) {
            RT2.d(parcel, 7, bArr);
        }
        int i2 = this.l;
        if ((i2 == 0) == false) {
            RT2.f(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.m;
        if (!(i3 == 0)) {
            RT2.f(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        RT2.b(a, parcel);
    }

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.a = str;
        this.g = j;
        this.h = z;
        this.i = d;
        this.j = str2;
        this.k = bArr;
        this.l = i;
        this.m = i2;
    }

    public final String toString() {
        return r1(new StringBuilder());
    }

    public final String r1(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.l;
        if (i == 1) {
            sb.append(this.g);
        } else if (i == 2) {
            sb.append(this.h);
        } else if (i == 3) {
            sb.append(this.i);
        } else if (i == 4) {
            sb.append("'");
            sb.append(this.j);
            sb.append("'");
        } else if (i == 5) {
            sb.append("'");
            sb.append(Base64.encodeToString(this.k, 3));
            sb.append("'");
        } else {
            throw new AssertionError("Invalid type: " + str + ", " + i);
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        return AbstractC8207o22.a(sb, this.m, ")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (!AbstractC8155nt2.a(this.a, flag.a)) {
            return false;
        }
        int i = flag.l;
        int i2 = this.l;
        if (i2 != i || this.m != flag.m) {
            return false;
        }
        if (i2 == 1) {
            return this.g == flag.g;
        }
        if (i2 == 2) {
            return this.h == flag.h;
        }
        if (i2 == 3) {
            return this.i == flag.i;
        }
        if (i2 == 4) {
            return AbstractC8155nt2.a(this.j, flag.j);
        }
        if (i2 == 5) {
            return Arrays.equals(this.k, flag.k);
        }
        throw new AssertionError(AbstractC9076qb1.a("Invalid enum value: ", i2));
    }
}
