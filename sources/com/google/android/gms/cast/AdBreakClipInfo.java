package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10628v6;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10628v6();
    public final String a;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final long o;
    public final String p;
    public final VastAdsRequest q;
    public final JSONObject r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 8);
        parcel.writeLong(this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.o(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.o(parcel, 9, this.m);
        RT2.o(parcel, 10, this.n);
        RT2.f(parcel, 11, 8);
        parcel.writeLong(this.o);
        RT2.o(parcel, 12, this.p);
        RT2.n(parcel, 13, this.q, i);
        RT2.b(a, parcel);
    }

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.a = str;
        this.g = str2;
        this.h = j;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = j2;
        this.p = str9;
        this.q = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.r = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
                this.l = null;
                this.r = new JSONObject();
                return;
            }
        }
        this.r = new JSONObject();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, Long.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o), this.p, this.q});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return WH.a(this.a, adBreakClipInfo.a) && WH.a(this.g, adBreakClipInfo.g) && this.h == adBreakClipInfo.h && WH.a(this.i, adBreakClipInfo.i) && WH.a(this.j, adBreakClipInfo.j) && WH.a(this.k, adBreakClipInfo.k) && WH.a(this.l, adBreakClipInfo.l) && WH.a(this.m, adBreakClipInfo.m) && WH.a(this.n, adBreakClipInfo.n) && this.o == adBreakClipInfo.o && WH.a(this.p, adBreakClipInfo.p) && WH.a(this.q, adBreakClipInfo.q);
    }

    public final JSONObject r1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            jSONObject.put("duration", WH.b(this.h));
            long j = this.o;
            if (j != -1) {
                jSONObject.put("whenSkippable", WH.b(j));
            }
            String str = this.m;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.j;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.g;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.i;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.k;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.n;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.p;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            VastAdsRequest vastAdsRequest = this.q;
            if (vastAdsRequest != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    String str8 = vastAdsRequest.a;
                    if (str8 != null) {
                        jSONObject3.put("adTagUrl", str8);
                    }
                    String str9 = vastAdsRequest.g;
                    if (str9 != null) {
                        jSONObject3.put("adsResponse", str9);
                    }
                } catch (JSONException unused) {
                }
                jSONObject.put("vastAdsRequest", jSONObject3);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
