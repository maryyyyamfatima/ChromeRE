package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC3692au1;
import defpackage.RT2;
import defpackage.VR1;
import defpackage.W82;
import defpackage.WH;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new VR1();
    public MediaQueueData A;
    public boolean B;
    public MediaInfo a;
    public long g;
    public int h;
    public double i;
    public int j;
    public int k;
    public long l;
    public long m;
    public double n;
    public boolean o;
    public long[] p;
    public int q;
    public int r;
    public String s;
    public JSONObject t;
    public int u;
    public boolean w;
    public AdBreakStatus x;
    public VideoInfo y;
    public MediaLiveSeekableRange z;
    public final ArrayList v = new ArrayList();
    public final SparseArray C = new SparseArray();

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.a = mediaInfo;
        this.g = j;
        this.h = i;
        this.i = d;
        this.j = i2;
        this.k = i3;
        this.l = j2;
        this.m = j3;
        this.n = d2;
        this.o = z;
        this.p = jArr;
        this.q = i4;
        this.r = i5;
        this.s = str;
        if (str != null) {
            try {
                this.t = new JSONObject(this.s);
            } catch (JSONException unused) {
                this.t = null;
                this.s = null;
            }
        } else {
            this.t = null;
        }
        this.u = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            t1(arrayList);
        }
        this.w = z2;
        this.x = adBreakStatus;
        this.y = videoInfo;
        this.z = mediaLiveSeekableRange;
        this.A = mediaQueueData;
        this.B = mediaQueueData != null && mediaQueueData.o;
    }

    public final boolean s1(long j) {
        return (j & this.m) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x023e, code lost:            if (r12 != 3) goto L1472;     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0324, code lost:            if (r2 == false) goto L1521;     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0241, code lost:            if (r2 != 2) goto L1472;     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0247, code lost:            if (r13 == 0) goto L1472;     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0382 A[Catch: JSONException -> 0x038d, TryCatch #2 {JSONException -> 0x038d, blocks: (B:189:0x035a, B:191:0x0382, B:192:0x0383), top: B:188:0x035a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r1(org.json.JSONObject r26, int r27) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.r1(org.json.JSONObject, int):int");
    }

    public final void t1(ArrayList arrayList) {
        ArrayList arrayList2 = this.v;
        arrayList2.clear();
        SparseArray sparseArray = this.C;
        sparseArray.clear();
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) arrayList.get(i);
            arrayList2.add(mediaQueueItem);
            sparseArray.put(mediaQueueItem.g, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        if ((this.t == null) != (mediaStatus.t == null)) {
            return false;
        }
        if (this.g == mediaStatus.g && this.h == mediaStatus.h && this.i == mediaStatus.i && this.j == mediaStatus.j && this.k == mediaStatus.k && this.l == mediaStatus.l && this.n == mediaStatus.n && this.o == mediaStatus.o && this.q == mediaStatus.q && this.r == mediaStatus.r && this.u == mediaStatus.u && Arrays.equals(this.p, mediaStatus.p) && WH.a(Long.valueOf(this.m), Long.valueOf(mediaStatus.m)) && WH.a(this.v, mediaStatus.v) && WH.a(this.a, mediaStatus.a)) {
            JSONObject jSONObject2 = this.t;
            if ((jSONObject2 == null || (jSONObject = mediaStatus.t) == null || AbstractC3692au1.a(jSONObject2, jSONObject)) && this.w == mediaStatus.w && WH.a(this.x, mediaStatus.x) && WH.a(this.y, mediaStatus.y) && WH.a(this.z, mediaStatus.z) && W82.a(this.A, mediaStatus.A) && this.B == mediaStatus.B) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.g), Integer.valueOf(this.h), Double.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Long.valueOf(this.l), Long.valueOf(this.m), Double.valueOf(this.n), Boolean.valueOf(this.o), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(this.q), Integer.valueOf(this.r), String.valueOf(this.t), Integer.valueOf(this.u), this.v, Boolean.valueOf(this.w), this.x, this.y, this.z, this.A});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.t;
        this.s = jSONObject == null ? null : jSONObject.toString();
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        long j = this.g;
        RT2.f(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.h;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.i;
        RT2.f(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.j;
        RT2.f(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.k;
        RT2.f(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.l;
        RT2.f(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.m;
        RT2.f(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.n;
        RT2.f(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.o;
        RT2.f(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        RT2.k(parcel, 12, this.p);
        int i5 = this.q;
        RT2.f(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.r;
        RT2.f(parcel, 14, 4);
        parcel.writeInt(i6);
        RT2.o(parcel, 15, this.s);
        int i7 = this.u;
        RT2.f(parcel, 16, 4);
        parcel.writeInt(i7);
        RT2.t(parcel, 17, this.v);
        boolean z2 = this.w;
        RT2.f(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        RT2.n(parcel, 19, this.x, i);
        RT2.n(parcel, 20, this.y, i);
        RT2.n(parcel, 21, this.z, i);
        RT2.n(parcel, 22, this.A, i);
        RT2.b(a, parcel);
    }
}
