package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4720du;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4720du();
    public int a;
    public final boolean g;

    public BarcodeDetectorOptions() {
    }

    public BarcodeDetectorOptions(int i, boolean z) {
        this.a = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeDetectorOptions)) {
            return false;
        }
        BarcodeDetectorOptions barcodeDetectorOptions = (BarcodeDetectorOptions) obj;
        return this.a == barcodeDetectorOptions.a && W82.a(Boolean.valueOf(this.g), Boolean.valueOf(barcodeDetectorOptions.g));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = this.a;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.b(a, parcel);
    }
}
