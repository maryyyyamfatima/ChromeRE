package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C12161zb0;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CredentialsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C12161zb0();
    public final String a;
    public final String g;

    public CredentialsData(String str, String str2) {
        this.a = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialsData)) {
            return false;
        }
        CredentialsData credentialsData = (CredentialsData) obj;
        return W82.a(this.a, credentialsData.a) && W82.a(this.g, credentialsData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g});
    }
}
