package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C10334uF;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C10334uF();
    public final String a;
    public final String g;
    public final String h;
    public final String i;

    public CallerInfo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.o(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerInfo)) {
            return false;
        }
        CallerInfo callerInfo = (CallerInfo) obj;
        if (!callerInfo.a.equals(this.a)) {
            return false;
        }
        if (!callerInfo.g.equals(this.g)) {
            return false;
        }
        if (callerInfo.h.equals(this.h)) {
            return callerInfo.i.equals(this.i);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g, this.h, this.i});
    }
}
