package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC3692au1;
import defpackage.C5938hS1;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C5938hS1();
    public final long a;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final List m;
    public String n;
    public final JSONObject o;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.a = j;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = i2;
        this.m = list;
        this.o = jSONObject;
    }

    public final JSONObject r1() {
        String str = this.k;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.a);
            int i = this.g;
            if (i == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i == 2) {
                jSONObject.put("type", "AUDIO");
            } else if (i == 3) {
                jSONObject.put("type", "VIDEO");
            }
            String str2 = this.h;
            if (str2 != null) {
                jSONObject.put("trackContentId", str2);
            }
            String str3 = this.i;
            if (str3 != null) {
                jSONObject.put("trackContentType", str3);
            }
            String str4 = this.j;
            if (str4 != null) {
                jSONObject.put("name", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("language", str);
            }
            int i2 = this.l;
            if (i2 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i2 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i2 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i2 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i2 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List list = this.m;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.o;
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
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.o;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.o;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null || AbstractC3692au1.a(jSONObject, jSONObject2)) {
            return this.a == mediaTrack.a && this.g == mediaTrack.g && WH.a(this.h, mediaTrack.h) && WH.a(this.i, mediaTrack.i) && WH.a(this.j, mediaTrack.j) && WH.a(this.k, mediaTrack.k) && this.l == mediaTrack.l && WH.a(this.m, mediaTrack.m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.g), this.h, this.i, this.j, this.k, Integer.valueOf(this.l), this.m, String.valueOf(this.o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.o(parcel, 7, this.k);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.l);
        RT2.q(parcel, 9, this.m);
        RT2.o(parcel, 10, this.n);
        RT2.b(a, parcel);
    }
}
