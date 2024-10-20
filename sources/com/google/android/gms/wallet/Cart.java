package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.NG;
import defpackage.RT2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new NG();
    public String a;
    public String g;
    public final ArrayList h;

    public Cart(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.g = str2;
        this.h = arrayList;
    }

    public Cart() {
        this.h = new ArrayList();
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
