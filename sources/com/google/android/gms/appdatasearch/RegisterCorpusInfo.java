package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5904hL2;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C5904hL2();
    public final String a;
    public final String g;
    public final Uri h;
    public final RegisterSectionInfo[] i;
    public final GlobalSearchCorpusConfig j;
    public final boolean k;
    public final Account l;
    public final RegisterCorpusIMEInfo m;
    public final String n;
    public final boolean o;
    public final int p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.n(parcel, 3, this.h, i);
        RT2.r(parcel, 4, this.i, i);
        RT2.n(parcel, 7, this.j, i);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.n(parcel, 9, this.l, i);
        RT2.n(parcel, 10, this.m, i);
        RT2.o(parcel, 11, this.n);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.o ? 1 : 0);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.p);
        RT2.b(a, parcel);
    }

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i) {
        this.a = str;
        this.g = str2;
        this.h = uri;
        this.i = registerSectionInfoArr;
        this.j = globalSearchCorpusConfig;
        this.k = z;
        this.l = account;
        this.m = registerCorpusIMEInfo;
        this.n = str3;
        this.o = z2;
        this.p = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, this.h, Integer.valueOf(Arrays.hashCode(this.i)), this.j, Boolean.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), Integer.valueOf(this.p)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusInfo)) {
            return false;
        }
        RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
        return this.o == registerCorpusInfo.o && this.p == registerCorpusInfo.p && this.k == registerCorpusInfo.k && W82.a(this.a, registerCorpusInfo.a) && W82.a(this.g, registerCorpusInfo.g) && W82.a(this.h, registerCorpusInfo.h) && W82.a(this.j, registerCorpusInfo.j) && W82.a(this.m, registerCorpusInfo.m) && W82.a(this.l, registerCorpusInfo.l) && W82.a(this.n, registerCorpusInfo.n) && Arrays.equals(this.i, registerCorpusInfo.i);
    }
}
