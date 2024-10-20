package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class g extends Preference {
    public boolean T;
    public CharSequence U;
    public CharSequence V;
    public boolean W;
    public boolean X;

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.preference.Preference
    public void w() {
        boolean z = !this.T;
        if (f(Boolean.valueOf(z))) {
            W(z);
        }
    }

    public final void W(boolean z) {
        boolean z2 = this.T != z;
        if (z2 || !this.W) {
            this.T = z;
            this.W = true;
            if (U()) {
                boolean z3 = !z;
                if (U()) {
                    z3 = this.g.c().getBoolean(this.q, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor b = this.g.b();
                    b.putBoolean(this.q, z);
                    if (!this.g.e) {
                        b.apply();
                    }
                }
            }
            if (z2) {
                r(T());
                q();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return (this.X ? this.T : !this.T) || super.T();
    }

    public final void Y(String str) {
        this.U = str;
        if (this.T) {
            q();
        }
    }

    public final void X(String str) {
        this.V = str;
        if (this.T) {
            return;
        }
        q();
    }

    @Override // androidx.preference.Preference
    public final Object z(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void D(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (U()) {
            booleanValue = this.g.c().getBoolean(this.q, booleanValue);
        }
        W(booleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.T
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.U
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.U
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.T
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.V
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.V
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.n()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.g.Z(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public final void A(Parcelable parcelable) {
        if (!parcelable.getClass().equals(TwoStatePreference$SavedState.class)) {
            super.A(parcelable);
            return;
        }
        TwoStatePreference$SavedState twoStatePreference$SavedState = (TwoStatePreference$SavedState) parcelable;
        super.A(twoStatePreference$SavedState.getSuperState());
        W(twoStatePreference$SavedState.a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable C() {
        this.P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.x) {
            return absSavedState;
        }
        TwoStatePreference$SavedState twoStatePreference$SavedState = new TwoStatePreference$SavedState(absSavedState);
        twoStatePreference$SavedState.a = this.T;
        return twoStatePreference$SavedState;
    }
}
