package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC4194cN1;
import defpackage.C12096zO1;
import defpackage.RT2;
import defpackage.W82;
import defpackage.WH;
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
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C12096zO1();
    public String a;
    public String g;
    public int h;
    public String i;
    public MediaQueueContainerMetadata j;
    public int k;
    public List l;
    public int m;
    public long n;
    public boolean o;

    public /* synthetic */ MediaQueueData(int i) {
        this();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        int i2 = this.h;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i2);
        RT2.o(parcel, 5, this.i);
        RT2.n(parcel, 6, this.j, i);
        int i3 = this.k;
        RT2.f(parcel, 7, 4);
        parcel.writeInt(i3);
        List list = this.l;
        RT2.t(parcel, 8, list == null ? null : Collections.unmodifiableList(list));
        int i4 = this.m;
        RT2.f(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.n;
        RT2.f(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.o;
        RT2.f(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        RT2.b(a, parcel);
    }

    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, ArrayList arrayList, int i3, long j, boolean z) {
        this.a = str;
        this.g = str2;
        this.h = i;
        this.i = str3;
        this.j = mediaQueueContainerMetadata;
        this.k = i2;
        this.l = arrayList;
        this.m = i3;
        this.n = j;
        this.o = z;
    }

    private MediaQueueData() {
        this.a = null;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.k = 0;
        this.l = null;
        this.m = 0;
        this.n = -1L;
        this.o = false;
    }

    public MediaQueueData(MediaQueueData mediaQueueData) {
        this.a = mediaQueueData.a;
        this.g = mediaQueueData.g;
        this.h = mediaQueueData.h;
        this.i = mediaQueueData.i;
        this.j = mediaQueueData.j;
        this.k = mediaQueueData.k;
        this.l = mediaQueueData.l;
        this.m = mediaQueueData.m;
        this.n = mediaQueueData.n;
        this.o = mediaQueueData.o;
    }

    public final JSONObject r1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("id", this.a);
            }
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("entity", this.g);
            }
            switch (this.h) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.i)) {
                jSONObject.put("name", this.i);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.j;
            if (mediaQueueContainerMetadata != null) {
                jSONObject.put("containerMetadata", mediaQueueContainerMetadata.r1());
            }
            String b = AbstractC4194cN1.b(Integer.valueOf(this.k));
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            List list = this.l;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaQueueItem) it.next()).s1());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.m);
            long j = this.n;
            if (j != -1) {
                jSONObject.put("startTime", WH.b(j));
            }
            jSONObject.put("shuffle", this.o);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.a, mediaQueueData.a) && TextUtils.equals(this.g, mediaQueueData.g) && this.h == mediaQueueData.h && TextUtils.equals(this.i, mediaQueueData.i) && W82.a(this.j, mediaQueueData.j) && this.k == mediaQueueData.k && W82.a(this.l, mediaQueueData.l) && this.m == mediaQueueData.m && this.n == mediaQueueData.n && this.o == mediaQueueData.o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, Integer.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, Integer.valueOf(this.m), Long.valueOf(this.n), Boolean.valueOf(this.o)});
    }
}
