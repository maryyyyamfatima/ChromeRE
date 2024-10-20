package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC3692au1;
import defpackage.C4856eI1;
import defpackage.RT2;
import defpackage.W82;
import defpackage.ZN1;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public final MediaInfo a;
    public final MediaQueueData g;
    public final Boolean h;
    public final long i;
    public final double j;
    public final long[] k;
    public String l;
    public final JSONObject m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public static final C4856eI1 s = new C4856eI1("MediaLoadRequestData");
    public static final Parcelable.Creator CREATOR = new ZN1();

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.g = mediaQueueData;
        this.h = bool;
        this.i = j;
        this.j = d;
        this.k = jArr;
        this.m = jSONObject;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        if (AbstractC3692au1.a(this.m, mediaLoadRequestData.m)) {
            return W82.a(this.a, mediaLoadRequestData.a) && W82.a(this.g, mediaLoadRequestData.g) && W82.a(this.h, mediaLoadRequestData.h) && this.i == mediaLoadRequestData.i && this.j == mediaLoadRequestData.j && Arrays.equals(this.k, mediaLoadRequestData.k) && W82.a(this.n, mediaLoadRequestData.n) && W82.a(this.o, mediaLoadRequestData.o) && W82.a(this.p, mediaLoadRequestData.p) && W82.a(this.q, mediaLoadRequestData.q) && this.r == mediaLoadRequestData.r;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, this.h, Long.valueOf(this.i), Double.valueOf(this.j), this.k, String.valueOf(this.m), this.n, this.o, this.p, this.q, Long.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.n(parcel, 3, this.g, i);
        Boolean bool = this.h;
        if (bool != null) {
            RT2.f(parcel, 4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        RT2.f(parcel, 5, 8);
        parcel.writeLong(this.i);
        RT2.f(parcel, 6, 8);
        parcel.writeDouble(this.j);
        RT2.k(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.o(parcel, 9, this.n);
        RT2.o(parcel, 10, this.o);
        RT2.o(parcel, 11, this.p);
        RT2.o(parcel, 12, this.q);
        RT2.f(parcel, 13, 8);
        parcel.writeLong(this.r);
        RT2.b(a, parcel);
    }
}
