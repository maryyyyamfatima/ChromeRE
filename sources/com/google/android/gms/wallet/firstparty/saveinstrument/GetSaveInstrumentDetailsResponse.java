package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.SY0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new SY0();
    public final String[] a;
    public final int[] g;
    public final RemoteViews h;
    public final byte[] i;

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.g = iArr;
        this.h = remoteViews;
        this.i = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.p(parcel, 1, this.a);
        RT2.h(parcel, 2, this.g);
        RT2.n(parcel, 3, this.h, i);
        RT2.d(parcel, 4, this.i);
        RT2.b(a, parcel);
    }
}
