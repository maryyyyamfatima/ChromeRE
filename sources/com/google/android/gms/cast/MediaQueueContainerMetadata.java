package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11410xO1;
import defpackage.RT2;
import defpackage.W82;
import defpackage.WW1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11410xO1();
    public int a;
    public String g;
    public List h;
    public List i;
    public double j;

    public /* synthetic */ MediaQueueContainerMetadata(int i) {
        this();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = this.a;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        RT2.o(parcel, 3, this.g);
        List list = this.h;
        RT2.t(parcel, 4, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.i;
        RT2.t(parcel, 5, list2 != null ? Collections.unmodifiableList(list2) : null);
        double d = this.j;
        RT2.f(parcel, 6, 8);
        parcel.writeDouble(d);
        RT2.b(a, parcel);
    }

    public MediaQueueContainerMetadata(int i, String str, ArrayList arrayList, ArrayList arrayList2, double d) {
        this.a = i;
        this.g = str;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = d;
    }

    private MediaQueueContainerMetadata() {
        this.a = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0.0d;
    }

    public MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
        this.a = mediaQueueContainerMetadata.a;
        this.g = mediaQueueContainerMetadata.g;
        this.h = mediaQueueContainerMetadata.h;
        this.i = mediaQueueContainerMetadata.i;
        this.j = mediaQueueContainerMetadata.j;
    }

    public final JSONObject r1() {
        JSONArray a;
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            if (i == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("title", this.g);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaMetadata) it.next()).u1());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.i;
            if (list2 != null && !list2.isEmpty() && (a = WW1.a(this.i)) != null) {
                jSONObject.put("containerImages", a);
            }
            jSONObject.put("containerDuration", this.j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.a == mediaQueueContainerMetadata.a && TextUtils.equals(this.g, mediaQueueContainerMetadata.g) && W82.a(this.h, mediaQueueContainerMetadata.h) && W82.a(this.i, mediaQueueContainerMetadata.i) && this.j == mediaQueueContainerMetadata.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.g, this.h, this.i, Double.valueOf(this.j)});
    }
}
