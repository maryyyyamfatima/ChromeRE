package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.T90;
import defpackage.W82;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new T90();
    public final boolean a;
    public final long g;
    public final long h;
    public final long i;
    public final Bundle j;
    public final String k;
    public final String l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.g);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.h);
        RT2.f(parcel, 4, 8);
        parcel.writeLong(this.i);
        RT2.c(parcel, 5, this.j);
        RT2.o(parcel, 6, this.k);
        RT2.o(parcel, 7, this.l);
        RT2.b(a, parcel);
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.a = z;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = bundle == null ? new Bundle() : bundle;
        this.k = str;
        this.l = str2;
    }

    public final HashMap r1() {
        HashMap hashMap = new HashMap();
        Bundle bundle = this.j;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                int i = bundle.getInt(str, -1);
                if (i != -1) {
                    hashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (W82.a(Boolean.valueOf(this.a), Boolean.valueOf(corpusStatus.a)) && W82.a(Long.valueOf(this.g), Long.valueOf(corpusStatus.g)) && W82.a(Long.valueOf(this.h), Long.valueOf(corpusStatus.h)) && W82.a(Long.valueOf(this.i), Long.valueOf(corpusStatus.i)) && W82.a(r1(), corpusStatus.r1()) && W82.a(this.l, corpusStatus.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), r1(), this.l});
    }

    public final String toString() {
        return "CorpusStatus{found=" + this.a + ", contentIncarnation=" + this.l + ", lastIndexedSeqno=" + this.g + ", lastCommittedSeqno=" + this.h + ", committedNumDocuments=" + this.i + ", counters=" + String.valueOf(this.j) + "}";
    }
}
