package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC3692au1;
import defpackage.RT2;
import defpackage.WH;
import defpackage.XN1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int g;
    public final String h;
    public final MediaMetadata i;
    public final long j;
    public final List k;
    public final TextTrackStyle l;
    public String m;
    public List n;
    public List o;
    public final String p;
    public final VastAdsRequest q;
    public final long r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final JSONObject w;

    static {
        Pattern pattern = WH.a;
        CREATOR = new XN1();
    }

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, ArrayList arrayList, TextTrackStyle textTrackStyle, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.g = i;
        this.h = str2;
        this.i = mediaMetadata;
        this.j = j;
        this.k = arrayList;
        this.l = textTrackStyle;
        this.m = str3;
        if (str3 != null) {
            try {
                this.w = new JSONObject(this.m);
            } catch (JSONException unused) {
                this.w = null;
                this.m = null;
            }
        } else {
            this.w = null;
        }
        this.n = arrayList2;
        this.o = arrayList3;
        this.p = str4;
        this.q = vastAdsRequest;
        this.r = j2;
        this.s = str5;
        this.t = str6;
        this.u = str7;
        this.v = str8;
        if (this.a == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaInfo(org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.<init>(org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[LOOP:0: B:4:0x0022->B:22:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183 A[LOOP:2: B:34:0x00c5->B:58:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r1(org.json.JSONObject r41) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.r1(org.json.JSONObject):void");
    }

    public final JSONObject s1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            jSONObject.putOpt("contentUrl", this.t);
            int i = this.g;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.h;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.i;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.u1());
            }
            long j = this.j;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", WH.b(j));
            }
            List list = this.k;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).r1());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.l;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.t1());
            }
            JSONObject jSONObject2 = this.w;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.p;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.n != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.n.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((AdBreakInfo) it2.next()).r1());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.o != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.o.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((AdBreakClipInfo) it3.next()).r1());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.q;
            if (vastAdsRequest != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    String str3 = vastAdsRequest.a;
                    if (str3 != null) {
                        jSONObject3.put("adTagUrl", str3);
                    }
                    String str4 = vastAdsRequest.g;
                    if (str4 != null) {
                        jSONObject3.put("adsResponse", str4);
                    }
                } catch (JSONException unused) {
                }
                jSONObject.put("vmapAdsRequest", jSONObject3);
            }
            long j2 = this.r;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", WH.b(j2));
            }
            jSONObject.putOpt("atvEntity", this.s);
            String str5 = this.u;
            if (str5 != null) {
                jSONObject.put("hlsSegmentFormat", str5);
            }
            String str6 = this.v;
            if (str6 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str6);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.w;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.w;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null || AbstractC3692au1.a(jSONObject, jSONObject2)) {
            return WH.a(this.a, mediaInfo.a) && this.g == mediaInfo.g && WH.a(this.h, mediaInfo.h) && WH.a(this.i, mediaInfo.i) && this.j == mediaInfo.j && WH.a(this.k, mediaInfo.k) && WH.a(this.l, mediaInfo.l) && WH.a(this.n, mediaInfo.n) && WH.a(this.o, mediaInfo.o) && WH.a(this.p, mediaInfo.p) && WH.a(this.q, mediaInfo.q) && this.r == mediaInfo.r && WH.a(this.s, mediaInfo.s) && WH.a(this.t, mediaInfo.t) && WH.a(this.u, mediaInfo.u) && WH.a(this.v, mediaInfo.v);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.g), this.h, this.i, Long.valueOf(this.j), String.valueOf(this.w), this.k, this.l, this.n, this.o, this.p, this.q, Long.valueOf(this.r), this.s, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.w;
        this.m = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        RT2.o(parcel, 2, str);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 4, this.h);
        RT2.n(parcel, 5, this.i, i);
        RT2.f(parcel, 6, 8);
        parcel.writeLong(this.j);
        RT2.t(parcel, 7, this.k);
        RT2.n(parcel, 8, this.l, i);
        RT2.o(parcel, 9, this.m);
        List list = this.n;
        RT2.t(parcel, 10, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.o;
        RT2.t(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null);
        RT2.o(parcel, 12, this.p);
        RT2.n(parcel, 13, this.q, i);
        RT2.f(parcel, 14, 8);
        parcel.writeLong(this.r);
        RT2.o(parcel, 15, this.s);
        RT2.o(parcel, 16, this.t);
        RT2.o(parcel, 17, this.u);
        RT2.o(parcel, 18, this.v);
        RT2.b(a, parcel);
    }
}
