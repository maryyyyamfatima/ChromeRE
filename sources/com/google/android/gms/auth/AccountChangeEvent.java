package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8207o22;
import defpackage.AbstractC9972tB0;
import defpackage.C9575s2;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C9575s2();
    public final int a;
    public final long g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.g = j;
        this.h = str;
        this.i = i2;
        this.j = i3;
        this.k = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.g);
        RT2.o(parcel, 3, this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j);
        RT2.o(parcel, 6, this.k);
        RT2.b(a, parcel);
    }

    public final String toString() {
        int i = this.i;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        StringBuilder sb = new StringBuilder("AccountChangeEvent {accountName = ");
        AbstractC9972tB0.a(sb, this.h, ", changeType = ", str, ", changeData = ");
        sb.append(this.k);
        sb.append(", eventIndex = ");
        return AbstractC8207o22.a(sb, this.j, "}");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.g), this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), this.k});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.g == accountChangeEvent.g && W82.a(this.h, accountChangeEvent.h) && this.i == accountChangeEvent.i && this.j == accountChangeEvent.j && W82.a(this.k, accountChangeEvent.k);
    }
}
