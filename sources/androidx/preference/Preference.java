package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC9067qZ3;
import defpackage.C1293Jy2;
import defpackage.C8870py2;
import defpackage.CD1;
import defpackage.InterfaceC1163Iy2;
import defpackage.InterfaceC9213qy2;
import defpackage.InterfaceC9555ry2;
import defpackage.JG2;
import defpackage.RunnableC0383Cy2;
import defpackage.ViewOnClickListenerC8527oy2;
import defpackage.ViewOnCreateContextMenuListenerC9898sy2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Preference implements Comparable {
    public boolean A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final boolean E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11487J;
    public int K;
    public int L;
    public e M;
    public ArrayList N;
    public d O;
    public boolean P;
    public ViewOnCreateContextMenuListenerC9898sy2 Q;
    public CD1 R;
    public final ViewOnClickListenerC8527oy2 S;
    public final Context a;
    public C1293Jy2 g;
    public long h;
    public boolean i;
    public InterfaceC9213qy2 j;
    public InterfaceC9555ry2 k;
    public int l;
    public CharSequence m;
    public CharSequence n;
    public int o;
    public Drawable p;
    public String q;
    public Intent r;
    public String s;
    public Bundle t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final String y;
    public Object z;

    public void D(Object obj) {
    }

    public void w() {
    }

    public Object z(TypedArray typedArray, int i) {
        return null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.l = Integer.MAX_VALUE;
        this.u = true;
        this.v = true;
        this.x = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.G = true;
        this.f11487J = true;
        this.K = R.layout.f59730_resource_name_obfuscated_res_0x7f0e0202;
        this.S = new ViewOnClickListenerC8527oy2(this);
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.x0, i, 0);
        this.o = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        this.q = AbstractC9067qZ3.f(obtainStyledAttributes, 26, 6);
        CharSequence text = obtainStyledAttributes.getText(34);
        this.m = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.n = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.l = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        this.s = AbstractC9067qZ3.f(obtainStyledAttributes, 22, 13);
        this.K = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.f59730_resource_name_obfuscated_res_0x7f0e0202));
        this.L = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.u = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.v = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.x = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        this.y = AbstractC9067qZ3.f(obtainStyledAttributes, 19, 10);
        this.D = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.v));
        this.E = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.v));
        if (obtainStyledAttributes.hasValue(18)) {
            this.z = z(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.z = z(obtainStyledAttributes, 11);
        }
        this.f11487J = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.F = hasValue;
        if (hasValue) {
            this.G = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.H = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.C = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.I = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC9067qZ3.a(R.attr.f11550_resource_name_obfuscated_res_0x7f0503b0, android.R.attr.preferenceStyle, context));
    }

    public final Bundle l() {
        if (this.t == null) {
            this.t = new Bundle();
        }
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(defpackage.C1812Ny2 r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.v(Ny2):void");
    }

    public static void H(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                H(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void L(int i) {
        if (i != this.l) {
            this.l = i;
            e eVar = this.M;
            if (eVar != null) {
                Handler handler = eVar.m;
                RunnableC0383Cy2 runnableC0383Cy2 = eVar.n;
                handler.removeCallbacks(runnableC0383Cy2);
                handler.post(runnableC0383Cy2);
            }
        }
    }

    public void R(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.m)) {
            return;
        }
        this.m = charSequence;
        q();
    }

    public void Q(int i) {
        R(this.a.getString(i));
    }

    public final void J(Drawable drawable) {
        if (this.p != drawable) {
            this.p = drawable;
            this.o = 0;
            q();
        }
    }

    public final void I(int i) {
        J(AbstractC2884Wf.a(this.a, i));
        this.o = i;
    }

    public void O(int i) {
        P(this.a.getString(i));
    }

    public final void G(boolean z) {
        if (this.u != z) {
            this.u = z;
            r(T());
            q();
        }
    }

    public boolean o() {
        return this.u && this.A && this.B;
    }

    public final void M() {
        if (this.v) {
            this.v = false;
            q();
        }
    }

    public final void S(boolean z) {
        if (this.C != z) {
            this.C = z;
            e eVar = this.M;
            if (eVar != null) {
                Handler handler = eVar.m;
                RunnableC0383Cy2 runnableC0383Cy2 = eVar.n;
                handler.removeCallbacks(runnableC0383Cy2);
                handler.post(runnableC0383Cy2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m() {
        return this.h;
    }

    public final void K(String str) {
        this.q = str;
        if (!this.w || (!TextUtils.isEmpty(str))) {
            return;
        }
        if (TextUtils.isEmpty(this.q)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.w = true;
    }

    public void j(Bundle bundle) {
        Parcelable parcelable;
        if (!(!TextUtils.isEmpty(this.q)) || (parcelable = bundle.getParcelable(this.q)) == null) {
            return;
        }
        this.P = false;
        A(parcelable);
        if (!this.P) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void k(Bundle bundle) {
        if (!TextUtils.isEmpty(this.q)) {
            this.P = false;
            Parcelable C = C();
            if (!this.P) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (C != null) {
                bundle.putParcelable(this.q, C);
            }
        }
    }

    public final boolean U() {
        return this.g != null && this.x && (TextUtils.isEmpty(this.q) ^ true);
    }

    public final void N() {
        this.F = true;
        this.G = false;
    }

    public void P(CharSequence charSequence) {
        if (this.R != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.n, charSequence)) {
            return;
        }
        this.n = charSequence;
        q();
    }

    public CharSequence n() {
        if (this.R != null) {
            ListPreference listPreference = (ListPreference) this;
            if (TextUtils.isEmpty(listPreference.X())) {
                return listPreference.a.getString(R.string.f78330_resource_name_obfuscated_res_0x7f1406d6);
            }
            return listPreference.X();
        }
        return this.n;
    }

    public final boolean f(Object obj) {
        InterfaceC9213qy2 interfaceC9213qy2 = this.j;
        return interfaceC9213qy2 == null || interfaceC9213qy2.l(this, obj);
    }

    public void F(View view) {
        Intent intent;
        InterfaceC1163Iy2 interfaceC1163Iy2;
        if (o() && this.v) {
            w();
            InterfaceC9555ry2 interfaceC9555ry2 = this.k;
            if (interfaceC9555ry2 == null || !interfaceC9555ry2.p(this)) {
                C1293Jy2 c1293Jy2 = this.g;
                if ((c1293Jy2 == null || (interfaceC1163Iy2 = c1293Jy2.h) == null || !interfaceC1163Iy2.D(this)) && (intent = this.r) != null) {
                    this.a.startActivity(intent);
                }
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i = this.l;
        int i2 = preference.l;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.m;
        CharSequence charSequence2 = preference.m;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.m.toString());
    }

    public final void q() {
        int indexOf;
        e eVar = this.M;
        if (eVar == null || (indexOf = eVar.k.indexOf(this)) == -1) {
            return;
        }
        eVar.a.d(this, indexOf, 1);
    }

    public final void t(C1293Jy2 c1293Jy2) {
        long j;
        this.g = c1293Jy2;
        if (!this.i) {
            synchronized (c1293Jy2) {
                j = c1293Jy2.b;
                c1293Jy2.b = 1 + j;
            }
            this.h = j;
        }
        if (U()) {
            C1293Jy2 c1293Jy22 = this.g;
            if ((c1293Jy22 != null ? c1293Jy22.c() : null).contains(this.q)) {
                D(null);
                return;
            }
        }
        Object obj = this.z;
        if (obj != null) {
            D(obj);
        }
    }

    public void y() {
        V();
    }

    public void s() {
        PreferenceScreen preferenceScreen;
        String str = this.y;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1293Jy2 c1293Jy2 = this.g;
        Preference preference = null;
        if (c1293Jy2 != null && (preferenceScreen = c1293Jy2.g) != null) {
            preference = preferenceScreen.X(str);
        }
        if (preference == null) {
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.q + "\" (title: \"" + ((Object) this.m) + "\"");
        }
        if (preference.N == null) {
            preference.N = new ArrayList();
        }
        preference.N.add(this);
        boolean T = preference.T();
        if (this.A == T) {
            this.A = !T;
            r(T());
            q();
        }
    }

    public final void V() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.y;
        if (str != null) {
            C1293Jy2 c1293Jy2 = this.g;
            Preference preference = null;
            if (c1293Jy2 != null && (preferenceScreen = c1293Jy2.g) != null) {
                preference = preferenceScreen.X(str);
            }
            if (preference == null || (arrayList = preference.N) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public void r(boolean z) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Preference) arrayList.get(i)).x(z);
        }
    }

    public final void x(boolean z) {
        if (this.A == z) {
            this.A = !z;
            r(T());
            q();
        }
    }

    public boolean T() {
        return !o();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.m;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence n = n();
        if (!TextUtils.isEmpty(n)) {
            sb.append(n);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Parcelable C() {
        this.P = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void A(Parcelable parcelable) {
        this.P = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C8870py2();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(AbsSavedState absSavedState) {
            super(absSavedState);
        }
    }
}
