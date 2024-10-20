package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C2451Sw1;
import defpackage.QF1;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LanguagePreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C2451Sw1();
    public final Locale a;
    public final float g;
    public final float h;

    public LanguagePreference(String str, float f, float f2) {
        int i = QF1.a;
        Locale forLanguageTag = Locale.forLanguageTag(str);
        this.a = forLanguageTag == null ? new Locale("") : forLanguageTag;
        this.g = f;
        this.h = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = QF1.a;
        String languageTag = this.a.toLanguageTag();
        if (languageTag == null) {
            languageTag = "und";
        }
        RT2.o(parcel, 1, languageTag);
        RT2.f(parcel, 2, 4);
        parcel.writeFloat(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeFloat(this.h);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguagePreference)) {
            return false;
        }
        LanguagePreference languagePreference = (LanguagePreference) obj;
        return W82.a(this.a, languagePreference.a) && W82.a(Float.valueOf(this.g), Float.valueOf(languagePreference.g)) && W82.a(Float.valueOf(this.h), Float.valueOf(languagePreference.h));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.g), Float.valueOf(this.h)});
    }
}
