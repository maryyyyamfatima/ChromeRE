package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4391cw1;
import defpackage.RT2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4391cw1();
    public final String a;
    public final String g;
    public final ArrayList h;

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.g = str2;
        this.h = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.t(parcel, 4, this.h);
        RT2.b(a, parcel);
    }
}
