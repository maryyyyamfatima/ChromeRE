package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C8644pJ3;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TextRecognizerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C8644pJ3();
    public final String a;

    public TextRecognizerOptions(String str) {
        this.a = str;
    }

    public TextRecognizerOptions() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.b(a, parcel);
    }
}
