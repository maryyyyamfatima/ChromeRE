package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC3208Yr3;
import defpackage.AbstractC7243lE2;
import defpackage.C0172Bi1;
import defpackage.C0349Cr3;
import defpackage.C2553Tq3;
import defpackage.C7456lr3;
import defpackage.OL2;
import defpackage.XF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SurveyDataImpl implements SurveyData {
    public static final Parcelable.Creator CREATOR = new C0349Cr3();
    public final String a;
    public final String g;
    public final C2553Tq3 h;
    public final C7456lr3 i;
    public final String j;
    public final long k;
    public final AbstractC0562Ei1 l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SurveyDataImpl(Parcel parcel) {
        this.a = parcel.readString();
        this.g = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readLong();
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        OL2 ol2 = OL2.j;
        this.l = ol2;
        parcel.readStringList(ol2);
        C2553Tq3 c2553Tq3 = C2553Tq3.p;
        XF0 c = XF0.c();
        Parcelable.Creator creator = ProtoParsers$InternalDontUse.CREATOR;
        this.h = (C2553Tq3) AbstractC7243lE2.a((ProtoParsers$InternalDontUse) parcel.readTypedObject(creator), c2553Tq3, c);
        this.i = (C7456lr3) AbstractC7243lE2.a((ProtoParsers$InternalDontUse) parcel.readTypedObject(creator), C7456lr3.l, XF0.c());
    }

    public SurveyDataImpl(String str, String str2, long j, C7456lr3 c7456lr3, C2553Tq3 c2553Tq3, String str3, AbstractC0562Ei1 abstractC0562Ei1) {
        this.a = str;
        this.g = str2;
        this.k = j;
        this.j = str3;
        this.l = abstractC0562Ei1;
        this.h = c2553Tq3;
        this.i = c7456lr3;
    }

    public final SurveyMetadata a() {
        int i = AbstractC3208Yr3.n(this.h) ? 3 : 2;
        C7456lr3 c7456lr3 = this.i;
        return new SurveyMetadata(this.a, this.g, c7456lr3 != null ? c7456lr3.j : null, i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g);
        parcel.writeString(this.j);
        parcel.writeLong(this.k);
        parcel.writeStringList(this.l);
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, this.h), 0);
        parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, this.i), 0);
    }
}
