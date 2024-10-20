package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11030wH;
import defpackage.RT2;
import defpackage.WH;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C11030wH();
    public final String a;
    public final String g;
    public final InetAddress h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final List m;
    public final int n;
    public final int o;
    public final String p;
    public final String q;
    public final int r;
    public final String s;
    public final byte[] t;
    public final String u;
    public final boolean v;
    public final CastEurekaInfo w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.i);
        RT2.o(parcel, 5, this.j);
        RT2.o(parcel, 6, this.k);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.l);
        RT2.t(parcel, 8, Collections.unmodifiableList(this.m));
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.n);
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.o);
        RT2.o(parcel, 11, this.p);
        RT2.o(parcel, 12, this.q);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.r);
        RT2.o(parcel, 14, this.s);
        RT2.d(parcel, 15, this.t);
        RT2.o(parcel, 16, this.u);
        RT2.f(parcel, 17, 4);
        parcel.writeInt(this.v ? 1 : 0);
        RT2.n(parcel, 18, r1(), i);
        RT2.b(a, parcel);
    }

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, CastEurekaInfo castEurekaInfo) {
        this.a = str == null ? "" : str;
        String str10 = str2 == null ? "" : str2;
        this.g = str10;
        if (!TextUtils.isEmpty(str10)) {
            try {
                this.h = InetAddress.getByName(str10);
            } catch (UnknownHostException e) {
                Log.i("CastDevice", "Unable to convert host address (" + this.g + ") to ipaddress: " + e.getMessage());
            }
        }
        this.i = str3 == null ? "" : str3;
        this.j = str4 == null ? "" : str4;
        this.k = str5 == null ? "" : str5;
        this.l = i;
        this.m = arrayList != null ? arrayList : new ArrayList();
        this.n = i2;
        this.o = i3;
        this.p = str6 != null ? str6 : "";
        this.q = str7;
        this.r = i4;
        this.s = str8;
        this.t = bArr;
        this.u = str9;
        this.v = z;
        this.w = castEurekaInfo;
    }

    public final String s1() {
        String str = this.a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    public final CastEurekaInfo r1() {
        CastEurekaInfo castEurekaInfo = this.w;
        if (castEurekaInfo == null) {
            return u1(32) || u1(64) ? new CastEurekaInfo(1, false) : castEurekaInfo;
        }
        return castEurekaInfo;
    }

    public final boolean u1(int i) {
        return (this.n & i) == i;
    }

    public final String toString() {
        return String.format("\"%s\" (%s)", this.i, this.a);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.a;
        if (str == null) {
            return castDevice.a == null;
        }
        if (WH.a(str, castDevice.a) && WH.a(this.h, castDevice.h) && WH.a(this.j, castDevice.j) && WH.a(this.i, castDevice.i)) {
            String str2 = this.k;
            String str3 = castDevice.k;
            if (WH.a(str2, str3) && (i = this.l) == (i2 = castDevice.l) && WH.a(this.m, castDevice.m) && this.n == castDevice.n && this.o == castDevice.o && WH.a(this.p, castDevice.p) && WH.a(Integer.valueOf(this.r), Integer.valueOf(castDevice.r)) && WH.a(this.s, castDevice.s) && WH.a(this.q, castDevice.q) && WH.a(str2, str3) && i == i2) {
                byte[] bArr = castDevice.t;
                byte[] bArr2 = this.t;
                if (((bArr2 == null && bArr == null) || Arrays.equals(bArr2, bArr)) && WH.a(this.u, castDevice.u) && this.v == castDevice.v && WH.a(r1(), castDevice.r1())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static CastDevice t1(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }
}
