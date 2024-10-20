package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5216fL2;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C5216fL2();
    public final int a;
    public final String[] g;
    public final String h;
    public final String i;
    public final String[] j;
    public final String k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.p(parcel, 2, this.g);
        RT2.o(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.o(parcel, 6, this.k);
        RT2.p(parcel, 7, this.j);
        RT2.b(a, parcel);
    }

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.a = i;
        this.g = strArr;
        this.h = str;
        this.i = str2;
        this.j = strArr2;
        this.k = str3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i, Integer.valueOf(Arrays.hashCode(this.j)), this.k});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusIMEInfo)) {
            return false;
        }
        RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
        return this.a == registerCorpusIMEInfo.a && Arrays.equals(this.g, registerCorpusIMEInfo.g) && W82.a(this.h, registerCorpusIMEInfo.h) && W82.a(this.i, registerCorpusIMEInfo.i) && Arrays.equals(this.j, registerCorpusIMEInfo.j) && W82.a(this.k, registerCorpusIMEInfo.k);
    }
}
