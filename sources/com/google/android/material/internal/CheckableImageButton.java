package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import defpackage.C1844Of;
import defpackage.C4859eJ;
import defpackage.Ec4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CheckableImageButton extends C1844Of implements Checkable {
    public static final int[] l = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.android.chrome.R.attr.f8410_resource_name_obfuscated_res_0x7f050276);
        this.j = true;
        this.k = true;
        Ec4.m(this, new C4859eJ(this));
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.j || this.i == z) {
            return;
        }
        this.i = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new a();
        public boolean h;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = parcel.readInt() == 1;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.i) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), l);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.h = this.i;
        return savedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setChecked(savedState.h);
    }
}
