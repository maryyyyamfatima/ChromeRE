package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import androidx.preference.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.chrome.browser.settings.SettingsActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ay2 */
/* loaded from: classes.dex */
public abstract class AbstractC0123Ay2 extends c implements InterfaceC1163Iy2, InterfaceC0903Gy2, InterfaceC1033Hy2, InterfaceC9483rm0 {
    public C1293Jy2 c0;
    public RecyclerView d0;
    public boolean e0;
    public boolean f0;
    public final C11956yy2 b0 = new C11956yy2(this);
    public int g0 = R.layout.0_resource_name_obfuscated_res_0x7f0e020c;
    public final HandlerC11270wy2 h0 = new HandlerC11270wy2(this, Looper.getMainLooper());
    public final RunnableC11613xy2 i0 = new RunnableC11613xy2(this);

    public abstract void O0(String str, Bundle bundle);

    @Override // androidx.fragment.app.c
    public void g0(Bundle bundle) {
        super.g0(bundle);
        TypedValue typedValue = new TypedValue();
        B0().getTheme().resolveAttribute(R.attr.0_resource_name_obfuscated_res_0x7f0503b1, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.f97640_resource_name_obfuscated_res_0x7f150250;
        }
        B0().getTheme().applyStyle(i, false);
        C1293Jy2 c1293Jy2 = new C1293Jy2(B0());
        this.c0 = c1293Jy2;
        c1293Jy2.j = this;
        Bundle bundle2 = this.l;
        O0(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null, bundle);
    }

    @Override // androidx.fragment.app.c
    public View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = B0().obtainStyledAttributes(null, JG2.y0, R.attr.0_resource_name_obfuscated_res_0x7f0503ab, 0);
        this.g0 = obtainStyledAttributes.getResourceId(0, this.g0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(B0());
        View inflate = cloneInContext.inflate(this.g0, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!B0().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e020e, viewGroup2, false);
            B0();
            recyclerView.q0(new LinearLayoutManager());
            C1552Ly2 c1552Ly2 = new C1552Ly2(recyclerView);
            recyclerView.u0 = c1552Ly2;
            Ec4.m(recyclerView, c1552Ly2);
        }
        this.d0 = recyclerView;
        C11956yy2 c11956yy2 = this.b0;
        recyclerView.g(c11956yy2);
        P0(drawable);
        if (dimensionPixelSize != -1) {
            c11956yy2.g = dimensionPixelSize;
            c11956yy2.i.d0.R();
        }
        c11956yy2.h = z;
        if (this.d0.getParent() == null) {
            viewGroup2.addView(this.d0);
        }
        this.h0.post(this.i0);
        return inflate;
    }

    public final void P0(Drawable drawable) {
        C11956yy2 c11956yy2 = this.b0;
        if (drawable != null) {
            c11956yy2.getClass();
            c11956yy2.g = drawable.getIntrinsicHeight();
        } else {
            c11956yy2.g = 0;
        }
        c11956yy2.a = drawable;
        c11956yy2.i.d0.R();
    }

    @Override // androidx.fragment.app.c
    public void v0(View view, Bundle bundle) {
        PreferenceScreen N0;
        Bundle bundle2;
        PreferenceScreen N02;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (N02 = N0()) != null) {
            N02.j(bundle2);
        }
        if (this.e0 && (N0 = N0()) != null) {
            this.d0.n0(new e(N0));
            N0.s();
        }
        this.f0 = true;
    }

    @Override // androidx.fragment.app.c
    public void k0() {
        RunnableC11613xy2 runnableC11613xy2 = this.i0;
        HandlerC11270wy2 handlerC11270wy2 = this.h0;
        handlerC11270wy2.removeCallbacks(runnableC11613xy2);
        handlerC11270wy2.removeMessages(1);
        if (this.e0) {
            this.d0.n0(null);
            PreferenceScreen N0 = N0();
            if (N0 != null) {
                N0.y();
            }
        }
        this.d0 = null;
        this.f11484J = true;
    }

    @Override // androidx.fragment.app.c
    public void s0(Bundle bundle) {
        PreferenceScreen N0 = N0();
        if (N0 != null) {
            Bundle bundle2 = new Bundle();
            N0.k(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final PreferenceScreen N0() {
        C1293Jy2 c1293Jy2 = this.c0;
        if (c1293Jy2 == null) {
            return null;
        }
        return c1293Jy2.g;
    }

    public final void Q0(PreferenceScreen preferenceScreen) {
        boolean z;
        C1293Jy2 c1293Jy2 = this.c0;
        PreferenceScreen preferenceScreen2 = c1293Jy2.g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.y();
            }
            c1293Jy2.g = preferenceScreen;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.e0 = true;
            if (this.f0) {
                HandlerC11270wy2 handlerC11270wy2 = this.h0;
                if (handlerC11270wy2.hasMessages(1)) {
                    return;
                }
                handlerC11270wy2.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // defpackage.InterfaceC1163Iy2
    public boolean D(Preference preference) {
        if (preference.s == null) {
            return false;
        }
        boolean z = false;
        for (c cVar = this; !z && cVar != null; cVar = cVar.A) {
            if (cVar instanceof InterfaceC12299zy2) {
                ((SettingsActivity) ((InterfaceC12299zy2) cVar)).v0(preference);
                z = true;
            }
        }
        if (!z && (K() instanceof InterfaceC12299zy2)) {
            ((SettingsActivity) ((InterfaceC12299zy2) K())).v0(preference);
            z = true;
        }
        if (!z && (getActivity() instanceof InterfaceC12299zy2)) {
            ((SettingsActivity) ((InterfaceC12299zy2) getActivity())).v0(preference);
            z = true;
        }
        if (!z) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            h M = M();
            Bundle l = preference.l();
            C8348oT0 E = M.E();
            z0().getClassLoader();
            c a = E.a(preference.s);
            a.E0(l);
            a.H0(0, this);
            C10547us c10547us = new C10547us(M);
            c10547us.j(((View) C0().getParent()).getId(), a, null);
            c10547us.c();
            c10547us.e(false);
        }
        return true;
    }

    public final Preference M0(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C1293Jy2 c1293Jy2 = this.c0;
        if (c1293Jy2 == null || (preferenceScreen = c1293Jy2.g) == null) {
            return null;
        }
        return preferenceScreen.X(charSequence);
    }

    public final void L0(int i) {
        C1293Jy2 c1293Jy2 = this.c0;
        if (c1293Jy2 != null) {
            Context B0 = B0();
            PreferenceScreen N0 = N0();
            c1293Jy2.e = true;
            C0773Fy2 c0773Fy2 = new C0773Fy2(B0, c1293Jy2);
            XmlResourceParser xml = B0.getResources().getXml(i);
            try {
                d c = c0773Fy2.c(xml, N0);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) c;
                preferenceScreen.t(c1293Jy2);
                SharedPreferences.Editor editor = c1293Jy2.d;
                if (editor != null) {
                    editor.apply();
                }
                c1293Jy2.e = false;
                Q0(preferenceScreen);
                return;
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    @Override // defpackage.InterfaceC0903Gy2
    public void x(Preference preference) {
        for (c cVar = this; cVar != null; cVar = cVar.A) {
        }
        K();
        getActivity();
        if (M().B("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (!(preference instanceof ListPreference)) {
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        String str = preference.q;
        ED1 ed1 = new ED1();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        ed1.E0(bundle);
        ed1.H0(0, this);
        ed1.Q0(M(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    @Override // androidx.fragment.app.c
    public void t0() {
        this.f11484J = true;
        C1293Jy2 c1293Jy2 = this.c0;
        c1293Jy2.h = this;
        c1293Jy2.i = this;
    }

    @Override // androidx.fragment.app.c
    public void u0() {
        this.f11484J = true;
        C1293Jy2 c1293Jy2 = this.c0;
        c1293Jy2.h = null;
        c1293Jy2.i = null;
    }
}
