package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import defpackage.C1293Jy2;
import defpackage.C1439Lb3;
import defpackage.JG2;
import defpackage.KH;
import defpackage.RunnableC0253By2;
import defpackage.RunnableC0383Cy2;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class d extends Preference {
    public final C1439Lb3 T;
    public final Handler U;
    public final ArrayList V;
    public boolean W;
    public int X;
    public boolean Y;
    public int Z;
    public KH a0;
    public final RunnableC0253By2 b0;

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T = new C1439Lb3(0);
        this.U = new Handler(Looper.getMainLooper());
        this.W = true;
        this.X = 0;
        this.Y = false;
        this.Z = Integer.MAX_VALUE;
        this.a0 = null;
        this.b0 = new RunnableC0253By2(this);
        this.V = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.z0, i, 0);
        this.W = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            d0(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        obtainStyledAttributes.recycle();
    }

    public final int Z() {
        return this.V.size();
    }

    public final Preference Y(int i) {
        return (Preference) this.V.get(i);
    }

    public final void W(Preference preference) {
        long j;
        if (this.V.contains(preference)) {
            return;
        }
        if (preference.q != null) {
            d dVar = this;
            while (true) {
                d dVar2 = dVar.O;
                if (dVar2 == null) {
                    break;
                } else {
                    dVar = dVar2;
                }
            }
            String str = preference.q;
            if (dVar.X(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.l == Integer.MAX_VALUE) {
            if (this.W) {
                int i = this.X;
                this.X = i + 1;
                preference.L(i);
            }
            if (preference instanceof d) {
                ((d) preference).W = this.W;
            }
        }
        int binarySearch = Collections.binarySearch(this.V, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        boolean T = T();
        if (preference.B == T) {
            preference.B = !T;
            preference.r(preference.T());
            preference.q();
        }
        synchronized (this) {
            this.V.add(binarySearch, preference);
        }
        C1293Jy2 c1293Jy2 = this.g;
        String str2 = preference.q;
        if (str2 == null || !this.T.containsKey(str2)) {
            synchronized (c1293Jy2) {
                j = c1293Jy2.b;
                c1293Jy2.b = 1 + j;
            }
        } else {
            j = ((Long) this.T.get(str2)).longValue();
            this.T.remove(str2);
        }
        preference.h = j;
        preference.i = true;
        try {
            preference.t(c1293Jy2);
            preference.i = false;
            if (preference.O != null) {
                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
            }
            preference.O = this;
            if (this.Y) {
                preference.s();
            }
            e eVar = this.M;
            if (eVar != null) {
                Handler handler = eVar.m;
                RunnableC0383Cy2 runnableC0383Cy2 = eVar.n;
                handler.removeCallbacks(runnableC0383Cy2);
                handler.post(runnableC0383Cy2);
            }
        } catch (Throwable th) {
            preference.i = false;
            throw th;
        }
    }

    public final void b0(Preference preference) {
        c0(preference);
        e eVar = this.M;
        if (eVar != null) {
            Handler handler = eVar.m;
            RunnableC0383Cy2 runnableC0383Cy2 = eVar.n;
            handler.removeCallbacks(runnableC0383Cy2);
            handler.post(runnableC0383Cy2);
        }
    }

    public final boolean c0(Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.V();
                if (preference.O == this) {
                    preference.O = null;
                }
                remove = this.V.remove(preference);
                if (remove) {
                    String str = preference.q;
                    if (str != null) {
                        this.T.put(str, Long.valueOf(preference.m()));
                        this.U.removeCallbacks(this.b0);
                        this.U.post(this.b0);
                    }
                    if (this.Y) {
                        preference.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public final void a0() {
        synchronized (this) {
            ArrayList arrayList = this.V;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    c0((Preference) arrayList.get(0));
                }
            }
        }
        e eVar = this.M;
        if (eVar != null) {
            Handler handler = eVar.m;
            RunnableC0383Cy2 runnableC0383Cy2 = eVar.n;
            handler.removeCallbacks(runnableC0383Cy2);
            handler.post(runnableC0383Cy2);
        }
    }

    @Override // androidx.preference.Preference
    public final void s() {
        super.s();
        this.Y = true;
        int Z = Z();
        for (int i = 0; i < Z; i++) {
            Y(i).s();
        }
    }

    @Override // androidx.preference.Preference
    public final void r(boolean z) {
        super.r(z);
        int Z = Z();
        for (int i = 0; i < Z; i++) {
            Preference Y = Y(i);
            if (Y.B == z) {
                Y.B = !z;
                Y.r(Y.T());
                Y.q();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void k(Bundle bundle) {
        super.k(bundle);
        int Z = Z();
        for (int i = 0; i < Z; i++) {
            Y(i).k(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void j(Bundle bundle) {
        super.j(bundle);
        int Z = Z();
        for (int i = 0; i < Z; i++) {
            Y(i).j(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void A(Parcelable parcelable) {
        if (!parcelable.getClass().equals(PreferenceGroup$SavedState.class)) {
            super.A(parcelable);
            return;
        }
        PreferenceGroup$SavedState preferenceGroup$SavedState = (PreferenceGroup$SavedState) parcelable;
        this.Z = preferenceGroup$SavedState.a;
        super.A(preferenceGroup$SavedState.getSuperState());
    }

    public final Preference X(CharSequence charSequence) {
        Preference X;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.q, charSequence)) {
            return this;
        }
        int Z = Z();
        for (int i = 0; i < Z; i++) {
            Preference Y = Y(i);
            if (TextUtils.equals(Y.q, charSequence)) {
                return Y;
            }
            if ((Y instanceof d) && (X = ((d) Y).X(charSequence)) != null) {
                return X;
            }
        }
        return null;
    }

    public final void d0(int i) {
        if (i != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.q))) {
            Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        this.Z = i;
    }

    @Override // androidx.preference.Preference
    public final void y() {
        V();
        this.Y = false;
        int Z = Z();
        for (int i = 0; i < Z; i++) {
            Y(i).y();
        }
    }

    @Override // androidx.preference.Preference
    public final Parcelable C() {
        this.P = true;
        return new PreferenceGroup$SavedState(AbsSavedState.EMPTY_STATE, this.Z);
    }
}
