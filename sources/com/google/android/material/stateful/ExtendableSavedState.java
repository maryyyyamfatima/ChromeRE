package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import defpackage.C1439Lb3;
import defpackage.KR0;
import defpackage.SF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new SF0();
    public final C1439Lb3 h;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.h = new C1439Lb3(0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.h = new C1439Lb3(readInt);
        for (int i = 0; i < readInt; i++) {
            this.h.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        return KR0.a("ExtendableSavedState{", Integer.toHexString(System.identityHashCode(this)), " states=", String.valueOf(this.h), "}");
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        C1439Lb3 c1439Lb3 = this.h;
        int i2 = c1439Lb3.h;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) c1439Lb3.f(i3);
            bundleArr[i3] = (Bundle) c1439Lb3.j(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
