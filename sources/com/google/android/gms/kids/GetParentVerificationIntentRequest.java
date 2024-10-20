package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.PY0;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GetParentVerificationIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PY0();
    public final int a;
    public int g;
    public String h;
    public int i;
    public final byte[] j;

    public /* synthetic */ GetParentVerificationIntentRequest(int i) {
        this();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        int i2 = this.g;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        RT2.o(parcel, 3, this.h);
        int i3 = this.i;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i3);
        RT2.d(parcel, 5, this.j);
        RT2.b(a, parcel);
    }

    private GetParentVerificationIntentRequest() {
    }

    public GetParentVerificationIntentRequest(int i, int i2, String str, int i3, byte[] bArr) {
        this.a = i;
        this.g = i2;
        this.h = str;
        this.i = i3;
        this.j = bArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), Integer.valueOf(Arrays.hashCode(this.j))});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetParentVerificationIntentRequest)) {
            return false;
        }
        GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) obj;
        return W82.a(Integer.valueOf(this.a), Integer.valueOf(getParentVerificationIntentRequest.a)) && W82.a(Integer.valueOf(this.g), Integer.valueOf(getParentVerificationIntentRequest.g)) && W82.a(this.h, getParentVerificationIntentRequest.h) && W82.a(Integer.valueOf(this.i), Integer.valueOf(getParentVerificationIntentRequest.i)) && Arrays.equals(this.j, getParentVerificationIntentRequest.j);
    }
}
