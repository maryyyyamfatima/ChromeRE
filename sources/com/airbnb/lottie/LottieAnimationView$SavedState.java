package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class LottieAnimationView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new a();
    public String a;
    public int g;
    public float h;
    public boolean i;
    public String j;
    public int k;
    public int l;

    public LottieAnimationView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public LottieAnimationView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.h = parcel.readFloat();
        this.i = parcel.readInt() == 1;
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
    }
}
