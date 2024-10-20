package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractC8207o22;
import defpackage.C7257lH1;
import defpackage.RT2;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7257lH1();
    public final String a;
    public final int g;
    public int h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        int i2 = this.h;
        RT2.f(parcel, 3, 4);
        parcel.writeInt(i2);
        RT2.b(a, parcel);
    }

    public LogErrorParcelable(int i, int i2, String str) {
        this.a = str;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogErrorParcelable)) {
            return false;
        }
        LogErrorParcelable logErrorParcelable = (LogErrorParcelable) obj;
        return Objects.equals(this.a, logErrorParcelable.a) && this.g == logErrorParcelable.g && this.h == logErrorParcelable.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogErrorParcelable[LogSourceName: ");
        sb.append(this.a);
        sb.append(", ClearcutStatusCode: ");
        sb.append(this.g);
        sb.append(", ErrorCount: ");
        return AbstractC8207o22.a(sb, this.h, "]");
    }
}
