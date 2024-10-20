package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C6248iL2;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C6248iL2();
    public final String a;
    public final String g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final String k;
    public final Feature[] l;
    public final String m;
    public final ScoringConfig n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.o(parcel, 6, this.k);
        RT2.r(parcel, 7, this.l, i);
        RT2.o(parcel, 11, this.m);
        RT2.n(parcel, 12, this.n, i);
        RT2.b(a, parcel);
    }

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.a = str;
        this.g = str2;
        this.h = z;
        this.i = i;
        this.j = z2;
        this.k = str3;
        this.l = featureArr;
        this.m = str4;
        this.n = scoringConfig;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, Boolean.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.j), this.k, Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSectionInfo)) {
            return false;
        }
        RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
        return this.h == registerSectionInfo.h && this.i == registerSectionInfo.i && this.j == registerSectionInfo.j && W82.a(this.a, registerSectionInfo.a) && W82.a(this.g, registerSectionInfo.g) && W82.a(this.k, registerSectionInfo.k) && W82.a(this.m, registerSectionInfo.m) && W82.a(this.n, registerSectionInfo.n) && Arrays.equals(this.l, registerSectionInfo.l);
    }
}
