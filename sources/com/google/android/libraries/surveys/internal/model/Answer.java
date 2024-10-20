package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1569Mc;
import defpackage.AbstractC3208Yr3;
import defpackage.C1384Kq3;
import defpackage.C1440Lc;
import defpackage.C3676ar3;
import defpackage.D61;
import defpackage.OP0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Answer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1440Lc();
    public C1384Kq3 a;
    public int g;
    public String h;
    public C3676ar3 i;
    public long j;
    public boolean k;
    public String l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Answer() {
        this.a = C1384Kq3.m;
        this.g = 1;
        this.h = "";
        this.i = C3676ar3.l;
        this.j = 0L;
        this.k = false;
        this.l = "";
    }

    public Answer(Parcel parcel) {
        C1384Kq3 c1384Kq3;
        byte[] createByteArray = parcel.createByteArray();
        if (OP0.b == null || !OP0.b(D61.a(OP0.b))) {
            this.a = (C1384Kq3) AbstractC3208Yr3.g(C1384Kq3.m, createByteArray);
        } else {
            if (createByteArray != null) {
                c1384Kq3 = (C1384Kq3) AbstractC3208Yr3.g(C1384Kq3.m, createByteArray);
            } else {
                c1384Kq3 = C1384Kq3.m;
            }
            this.a = c1384Kq3;
        }
        this.g = AbstractC1569Mc.b(parcel.readString());
        this.h = parcel.readString();
        byte[] createByteArray2 = parcel.createByteArray();
        if (createByteArray2 != null) {
            this.i = (C3676ar3) AbstractC3208Yr3.g(C3676ar3.l, createByteArray2);
        } else {
            this.i = C3676ar3.l;
        }
        this.j = parcel.readLong();
        this.k = parcel.readInt() > 0;
        this.l = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeString(AbstractC1569Mc.a(this.g));
        parcel.writeString(this.h);
        parcel.writeByteArray(this.i.toByteArray());
        parcel.writeLong(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
    }
}
