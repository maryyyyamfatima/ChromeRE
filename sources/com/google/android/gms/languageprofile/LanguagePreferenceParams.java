package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C2581Tw1;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LanguagePreferenceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C2581Tw1();
    public final float a;
    public final int g;
    public final int h;
    public final Integer i;

    public LanguagePreferenceParams(float f, int i, int i2, Integer num) {
        this.a = f;
        this.g = i;
        this.h = i2;
        this.i = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeFloat(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.j(parcel, 4, this.i);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguagePreferenceParams)) {
            return false;
        }
        LanguagePreferenceParams languagePreferenceParams = (LanguagePreferenceParams) obj;
        return W82.a(Float.valueOf(this.a), Float.valueOf(languagePreferenceParams.a)) && W82.a(Integer.valueOf(this.g), Integer.valueOf(languagePreferenceParams.g)) && W82.a(this.i, languagePreferenceParams.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.g), this.i});
    }
}
