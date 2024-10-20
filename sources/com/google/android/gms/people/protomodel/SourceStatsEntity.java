package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C8422og3;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats {
    public static final Parcelable.Creator CREATOR = new C8422og3();
    public final String a;
    public final Integer g;
    public final Integer h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.j(parcel, 3, this.g);
        RT2.j(parcel, 4, this.h);
        RT2.b(a, parcel);
    }

    public SourceStatsEntity(String str, Integer num, Integer num2) {
        this.a = str;
        this.g = num;
        this.h = num2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, this.h});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourceStatsEntity sourceStatsEntity = (SourceStatsEntity) ((SourceStats) obj);
        if (W82.a(this.a, sourceStatsEntity.a)) {
            return W82.a(this.g, sourceStatsEntity.g) && W82.a(this.h, sourceStatsEntity.h);
        }
        return false;
    }
}
