package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10971w6;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10971w6();
    public final long a;
    public final String g;
    public final long h;
    public final boolean i;
    public final String[] j;
    public final boolean k;
    public final boolean l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.a);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 8);
        parcel.writeLong(this.h);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.p(parcel, 6, this.j);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        RT2.b(a, parcel);
    }

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.g = str;
        this.h = j2;
        this.i = z;
        this.j = strArr;
        this.k = z2;
        this.l = z3;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return WH.a(this.g, adBreakInfo.g) && this.a == adBreakInfo.a && this.h == adBreakInfo.h && this.i == adBreakInfo.i && Arrays.equals(this.j, adBreakInfo.j) && this.k == adBreakInfo.k && this.l == adBreakInfo.l;
    }

    public final JSONObject r1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.g);
            jSONObject.put("position", WH.b(this.a));
            jSONObject.put("isWatched", this.i);
            jSONObject.put("isEmbedded", this.k);
            jSONObject.put("duration", WH.b(this.h));
            jSONObject.put("expanded", this.l);
            String[] strArr = this.j;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
