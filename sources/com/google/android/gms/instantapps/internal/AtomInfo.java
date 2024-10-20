package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C0445Dl;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AtomInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0445Dl();
    public final String a;
    public final String g;
    public final String[] h;
    public final int[] i;
    public final int j;
    public final byte[] k;
    public final boolean l;

    public AtomInfo(String str, String str2, String[] strArr, int[] iArr, int i, byte[] bArr, boolean z) {
        this.a = str;
        this.g = str2;
        this.h = strArr;
        this.i = iArr;
        this.j = i;
        this.k = bArr;
        this.l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 4, this.g);
        RT2.p(parcel, 5, this.h);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j);
        RT2.d(parcel, 7, this.k);
        RT2.h(parcel, 8, this.i);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.l ? 1 : 0);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AtomInfo)) {
            return false;
        }
        AtomInfo atomInfo = (AtomInfo) obj;
        return this.a.equals(atomInfo.a) && this.l == atomInfo.l && this.g.equals(atomInfo.g) && this.j == atomInfo.j && Arrays.equals(this.k, atomInfo.k) && Arrays.equals(this.h, atomInfo.h) && Arrays.equals(this.i, atomInfo.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31 * 31;
        Boolean valueOf = Boolean.valueOf(this.l);
        int hashCode2 = ((valueOf == null ? 0 : valueOf.hashCode()) + hashCode) * 31;
        String str2 = this.g;
        int hashCode3 = ((str2 == null ? 0 : str2.hashCode()) + hashCode2) * 31;
        Integer valueOf2 = Integer.valueOf(this.j);
        return Arrays.hashCode(this.i) + (((((valueOf2 != null ? valueOf2.hashCode() : 0) + hashCode3) * 31) + Arrays.hashCode(this.h)) * 31);
    }
}
