package com.google.android.libraries.surveys;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1648Mr3;
import defpackage.C1518Lr3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SurveyMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1518Lr3();
    public final String a;
    public final String g;
    public final String h;
    public final int i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SurveyMetadata(String str, String str2, String str3, int i) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = i;
    }

    public SurveyMetadata(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = AbstractC1648Mr3.b(parcel.readString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(AbstractC1648Mr3.a(this.i));
    }
}
