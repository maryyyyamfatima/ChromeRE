package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC3692au1;
import defpackage.BO1;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new BO1();
    public MediaInfo a;
    public int g;
    public boolean h;
    public double i;
    public double j;
    public double k;
    public long[] l;
    public String m;
    public JSONObject n;

    public MediaQueueItem(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.a = mediaInfo;
        this.g = i;
        this.h = z;
        this.i = d;
        this.j = d2;
        this.k = d3;
        this.l = jArr;
        this.m = str;
        if (str != null) {
            try {
                this.n = new JSONObject(this.m);
                return;
            } catch (JSONException unused) {
                this.n = null;
                this.m = null;
                return;
            }
        }
        this.n = null;
    }

    public MediaQueueItem(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        r1(jSONObject);
    }

    public final boolean r1(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.g != (i = jSONObject.getInt("itemId"))) {
            this.g = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.h != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.h = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.i) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.i) > 1.0E-7d)) {
            this.i = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.j) > 1.0E-7d) {
                this.j = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.k) > 1.0E-7d) {
                this.k = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.l;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.l[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.l = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.n = jSONObject.getJSONObject("customData");
        return true;
    }

    public final JSONObject s1() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.s1());
            }
            int i = this.g;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.h);
            if (!Double.isNaN(this.i)) {
                jSONObject.put("startTime", this.i);
            }
            double d = this.j;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.k);
            if (this.l != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.l) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.n;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.n;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null || AbstractC3692au1.a(jSONObject, jSONObject2)) {
            return WH.a(this.a, mediaQueueItem.a) && this.g == mediaQueueItem.g && this.h == mediaQueueItem.h && ((Double.isNaN(this.i) && Double.isNaN(mediaQueueItem.i)) || this.i == mediaQueueItem.i) && this.j == mediaQueueItem.j && this.k == mediaQueueItem.k && Arrays.equals(this.l, mediaQueueItem.l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.g), Boolean.valueOf(this.h), Double.valueOf(this.i), Double.valueOf(this.j), Double.valueOf(this.k), Integer.valueOf(Arrays.hashCode(this.l)), String.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.n;
        this.m = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        int i2 = this.g;
        RT2.f(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.h;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.i;
        RT2.f(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.j;
        RT2.f(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.k;
        RT2.f(parcel, 7, 8);
        parcel.writeDouble(d3);
        RT2.k(parcel, 8, this.l);
        RT2.o(parcel, 9, this.m);
        RT2.b(a, parcel);
    }
}
