package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import defpackage.C2359Se;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C2359Se();
    public boolean h;
    public boolean i;
    public int j;
    public float k;
    public boolean l;

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.j);
        parcel.writeFloat(this.k);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
    }

    public AppBarLayout$BaseBehavior$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readInt();
        this.k = parcel.readFloat();
        this.l = parcel.readByte() != 0;
    }

    public AppBarLayout$BaseBehavior$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
