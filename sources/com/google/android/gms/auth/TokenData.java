package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C6950kO3;
import defpackage.RT2;
import defpackage.W82;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C6950kO3();
    public final int a;
    public final String g;
    public final Long h;
    public final boolean i;
    public final boolean j;
    public final List k;
    public final String l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 2, this.g);
        RT2.m(parcel, 3, this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.q(parcel, 6, this.k);
        RT2.o(parcel, 7, this.l);
        RT2.b(a, parcel);
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, ArrayList arrayList, String str2) {
        this.a = i;
        this.g = str;
        this.h = l;
        this.i = z;
        this.j = z2;
        this.k = arrayList;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.g, tokenData.g) && W82.a(this.h, tokenData.h) && this.i == tokenData.i && this.j == tokenData.j && W82.a(this.k, tokenData.k) && W82.a(this.l, tokenData.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), this.k, this.l});
    }
}
