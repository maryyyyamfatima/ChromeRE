package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.CL0;
import defpackage.RT2;
import defpackage.W82;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new CL0();
    public final List a;
    public ArrayList g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.t(parcel, 2, r1());
        RT2.b(a, parcel);
    }

    public FetchBackUpDeviceContactInfoResponseEntity(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List r1() {
        List list;
        if (this.g == null && (list = this.a) != null) {
            this.g = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.g.add((BackedUpContactsPerDevice) it.next());
            }
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return W82.a(r1(), ((FetchBackUpDeviceContactInfoResponseEntity) ((FetchBackUpDeviceContactInfoResponse) obj)).r1());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{r1()});
    }
}
