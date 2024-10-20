package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C12262zs;
import defpackage.RT2;
import defpackage.W82;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new C12262zs();
    public final String a;
    public final Long g;
    public final List h;
    public final String i;
    public final Long j;
    public final Long k;
    public final DeviceVersionEntity l;
    public ArrayList m;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.t(parcel, 3, r1());
        RT2.o(parcel, 4, this.i);
        RT2.m(parcel, 5, this.j);
        RT2.m(parcel, 6, this.k);
        RT2.m(parcel, 7, this.g);
        RT2.n(parcel, 8, this.l, i);
        RT2.b(a, parcel);
    }

    public BackedUpContactsPerDeviceEntity(String str, Long l, ArrayList arrayList, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.g = l;
        this.h = arrayList;
        this.i = str2;
        this.j = l2;
        this.k = l3;
        this.l = deviceVersionEntity;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, r1(), this.i, this.j, this.k, this.l});
    }

    public final List r1() {
        List list;
        if (this.m == null && (list = this.h) != null) {
            this.m = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.m.add((SourceStats) it.next());
            }
        }
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) ((BackedUpContactsPerDevice) obj);
        if (W82.a(this.a, backedUpContactsPerDeviceEntity.a)) {
            return W82.a(this.g, backedUpContactsPerDeviceEntity.g) && W82.a(r1(), backedUpContactsPerDeviceEntity.r1()) && W82.a(this.i, backedUpContactsPerDeviceEntity.i) && W82.a(this.j, backedUpContactsPerDeviceEntity.j) && W82.a(this.k, backedUpContactsPerDeviceEntity.k) && W82.a(this.l, backedUpContactsPerDeviceEntity.l);
        }
        return false;
    }
}
