package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8207o22;
import defpackage.C1667Mv2;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C1667Mv2();
    public final String a;
    public final int g;
    public final int h;
    public final String i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final int m;
    public final Integer n;
    public final boolean o;
    public final int p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.o(parcel, 5, this.i);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.o(parcel, 8, this.k);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.l ? 1 : 0);
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.m);
        RT2.j(parcel, 11, this.n);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.o ? 1 : 0);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.p);
        RT2.b(a, parcel);
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.g = i;
        this.h = i2;
        this.i = str2;
        this.j = z;
        this.k = str3;
        this.l = z2;
        this.m = i3;
        this.n = num;
        this.o = z3;
        this.p = i4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.g), Integer.valueOf(this.h), this.k, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.l), Integer.valueOf(this.m), this.n, Boolean.valueOf(this.o), Integer.valueOf(this.p)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return W82.a(this.a, playLoggerContext.a) && this.g == playLoggerContext.g && this.h == playLoggerContext.h && W82.a(this.k, playLoggerContext.k) && W82.a(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.l == playLoggerContext.l && this.m == playLoggerContext.m && W82.a(this.n, playLoggerContext.n) && this.o == playLoggerContext.o && this.p == playLoggerContext.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayLoggerContext[package=");
        sb.append(this.a);
        sb.append(",packageVersionCode=");
        sb.append(this.g);
        sb.append(",logSource=");
        sb.append(this.h);
        sb.append(",logSourceName=");
        sb.append(this.k);
        sb.append(",uploadAccount=");
        sb.append(this.i);
        sb.append(",logAndroidId=");
        sb.append(this.j);
        sb.append(",isAnonymous=");
        sb.append(this.l);
        sb.append(",qosTier=");
        sb.append(this.m);
        sb.append(",appMobilespecId=");
        sb.append(this.n);
        sb.append(",scrubMccMnc=");
        sb.append(this.o);
        sb.append("piiLevelset=");
        return AbstractC8207o22.a(sb, this.p, "]");
    }
}
