package com.google.android.gms.chromesync.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C8612pD1;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;
import java.util.Date;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ListOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C8612pD1();
    public String a;
    public int g;
    public final int h;
    public Date i;
    public Date j;

    public /* synthetic */ ListOptions(int i) {
        this();
    }

    static {
        new ListOptions();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        int i2 = this.g;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        Date date = this.i;
        RT2.m(parcel, 4, date == null ? null : Long.valueOf(date.getTime()));
        Date date2 = this.j;
        RT2.m(parcel, 5, date2 != null ? Long.valueOf(date2.getTime()) : null);
        RT2.b(a, parcel);
    }

    private ListOptions() {
    }

    public ListOptions(String str, int i, int i2, Long l, Long l2) {
        this.a = str;
        this.g = i;
        this.h = i2;
        this.i = l == null ? null : new Date(l.longValue());
        this.j = l2 != null ? new Date(l2.longValue()) : null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOptions)) {
            return false;
        }
        ListOptions listOptions = (ListOptions) obj;
        return W82.a(this.a, listOptions.a) && W82.a(Integer.valueOf(this.g), Integer.valueOf(listOptions.g)) && W82.a(Integer.valueOf(this.h), Integer.valueOf(listOptions.h));
    }
}
