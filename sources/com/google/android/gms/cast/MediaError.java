package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.TN1;
import defpackage.WH;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new TN1();
    public final String a;
    public final long g;
    public final Integer h;
    public final String i;
    public String j;
    public final JSONObject k;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.g = j;
        this.h = num;
        this.i = str2;
        this.k = jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.k;
        this.j = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.g);
        RT2.j(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.b(a, parcel);
    }

    public static MediaError r1(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, WH.c(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }
}
