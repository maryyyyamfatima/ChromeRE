package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC2373Sg3;
import defpackage.E21;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new E21();
    public final boolean a;
    public final String g;
    public final int h;
    public final int i;

    public GoogleCertificatesLookupResponse(String str, boolean z, int i, int i2) {
        int i3;
        int i4;
        this.a = z;
        this.g = str;
        int[] c = AbstractC2373Sg3.c(6);
        int length = c.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = 1;
            if (i6 >= length) {
                i4 = 1;
                break;
            }
            i4 = c[i6];
            if (AbstractC2373Sg3.b(i4) == i) {
                break;
            } else {
                i6++;
            }
        }
        this.h = AbstractC2373Sg3.b(i4);
        int[] c2 = AbstractC2373Sg3.c(3);
        int length2 = c2.length;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            int i7 = c2[i5];
            if (AbstractC2373Sg3.b(i7) == i2) {
                i3 = i7;
                break;
            }
            i5++;
        }
        this.i = AbstractC2373Sg3.b(i3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        RT2.o(parcel, 2, this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.b(a, parcel);
    }
}
