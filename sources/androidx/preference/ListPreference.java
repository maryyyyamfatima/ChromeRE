package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC9826sm0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ListPreference extends AbstractC9826sm0 {
    public CharSequence[] Z;
    public CharSequence[] a0;
    public String b0;
    public String c0;
    public boolean d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ListPreference(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r0 = 2131034525(0x7f05019d, float:1.767957E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.AbstractC9067qZ3.a(r0, r1, r6)
            r5.<init>(r6, r7, r0)
            int[] r1 = defpackage.JG2.e0
            r2 = 0
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            r3 = 2
            java.lang.CharSequence[] r3 = r1.getTextArray(r3)
            if (r3 != 0) goto L1f
            java.lang.CharSequence[] r3 = r1.getTextArray(r2)
        L1f:
            r5.Z = r3
            r3 = 3
            java.lang.CharSequence[] r3 = r1.getTextArray(r3)
            if (r3 != 0) goto L2d
            r3 = 1
            java.lang.CharSequence[] r3 = r1.getTextArray(r3)
        L2d:
            r5.a0 = r3
            r3 = 4
            boolean r4 = r1.getBoolean(r3, r2)
            boolean r3 = r1.getBoolean(r3, r4)
            if (r3 == 0) goto L4c
            CD1 r3 = defpackage.CD1.a
            if (r3 != 0) goto L45
            CD1 r3 = new CD1
            r3.<init>()
            defpackage.CD1.a = r3
        L45:
            CD1 r3 = defpackage.CD1.a
            r5.R = r3
            r5.q()
        L4c:
            r1.recycle()
            int[] r1 = defpackage.JG2.x0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            r7 = 33
            r0 = 7
            java.lang.String r7 = defpackage.AbstractC9067qZ3.f(r6, r7, r0)
            r5.c0 = r7
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.ListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final void P(CharSequence charSequence) {
        super.P(charSequence);
        if (charSequence == null) {
            this.c0 = null;
        } else {
            this.c0 = charSequence.toString();
        }
    }

    public final void Y(String str) {
        boolean z = !TextUtils.equals(this.b0, str);
        if (z || !this.d0) {
            this.b0 = str;
            this.d0 = true;
            if (U()) {
                if (!TextUtils.equals(str, U() ? this.g.c().getString(this.q, null) : null)) {
                    SharedPreferences.Editor b = this.g.b();
                    b.putString(this.q, str);
                    if (!this.g.e) {
                        b.apply();
                    }
                }
            }
            if (z) {
                q();
            }
        }
    }

    public final int W(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.a0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.a0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence X() {
        CharSequence[] charSequenceArr;
        int W = W(this.b0);
        if (W < 0 || (charSequenceArr = this.Z) == null) {
            return null;
        }
        return charSequenceArr[W];
    }

    @Override // androidx.preference.Preference
    public final Object z(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void D(Object obj) {
        String str = (String) obj;
        if (U()) {
            str = this.g.c().getString(this.q, str);
        }
        Y(str);
    }

    @Override // androidx.preference.Preference
    public final void A(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.A(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A(savedState.getSuperState());
        Y(savedState.a);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new b();
        public String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        public SavedState(AbsSavedState absSavedState) {
            super(absSavedState);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence n() {
        if (this.R == null) {
            CharSequence X = X();
            CharSequence n = super.n();
            String str = this.c0;
            if (str == null) {
                return n;
            }
            Object[] objArr = new Object[1];
            if (X == null) {
                X = "";
            }
            objArr[0] = X;
            String format = String.format(str, objArr);
            if (TextUtils.equals(format, n)) {
                return n;
            }
            Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
            return format;
        }
        if (TextUtils.isEmpty(X())) {
            return this.a.getString(R.string.f78330_resource_name_obfuscated_res_0x7f1406d6);
        }
        return X();
    }

    @Override // androidx.preference.Preference
    public final Parcelable C() {
        this.P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.x) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.a = this.b0;
        return savedState;
    }
}
