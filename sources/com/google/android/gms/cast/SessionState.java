package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC3692au1;
import defpackage.N43;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SessionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new N43();
    public final MediaLoadRequestData a;
    public String g;
    public final JSONObject h;

    public SessionState(MediaLoadRequestData mediaLoadRequestData, JSONObject jSONObject) {
        this.a = mediaLoadRequestData;
        this.h = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (AbstractC3692au1.a(this.h, sessionState.h)) {
            return W82.a(this.a, sessionState.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.h;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.o(parcel, 3, this.g);
        RT2.b(a, parcel);
    }
}
