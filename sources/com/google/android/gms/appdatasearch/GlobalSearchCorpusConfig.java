package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C9565s01;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GlobalSearchCorpusConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C9565s01();
    public final int[] a;
    public final Feature[] g;

    public GlobalSearchCorpusConfig(int[] iArr, Feature[] featureArr) {
        this.a = iArr;
        this.g = featureArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.h(parcel, 1, this.a);
        RT2.r(parcel, 2, this.g, i);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.g))});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchCorpusConfig)) {
            return false;
        }
        GlobalSearchCorpusConfig globalSearchCorpusConfig = (GlobalSearchCorpusConfig) obj;
        return Arrays.equals(this.g, globalSearchCorpusConfig.g) && Arrays.equals(this.a, globalSearchCorpusConfig.a);
    }
}
