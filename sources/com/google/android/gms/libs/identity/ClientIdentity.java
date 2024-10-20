package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC0562Ei1;
import defpackage.C6290iU;
import defpackage.RT2;
import defpackage.V82;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C6290iU();
    public final int a;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;
    public final ClientIdentity l;
    public final AbstractC0562Ei1 m;

    static {
        Process.myUid();
        Process.myPid();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j);
        RT2.o(parcel, 6, this.k);
        RT2.n(parcel, 7, this.l, i);
        RT2.t(parcel, 8, this.m);
        RT2.b(a, parcel);
    }

    public ClientIdentity(int i, int i2, String str, String str2, String str3, int i3, List list, ClientIdentity clientIdentity) {
        this.a = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.k = str3;
        this.j = i3;
        this.m = AbstractC0562Ei1.o(list);
        this.l = clientIdentity;
    }

    public final String toString() {
        String str = this.h;
        int length = str.length() + 18;
        String str2 = this.i;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (str2.startsWith(str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.k;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.a == clientIdentity.a && this.g == clientIdentity.g && this.j == clientIdentity.j && this.h.equals(clientIdentity.h) && V82.a(this.i, clientIdentity.i) && V82.a(this.k, clientIdentity.k) && V82.a(this.l, clientIdentity.l) && this.m.equals(clientIdentity.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.h, this.i, this.k});
    }
}
