package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iO2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC6263iO2 extends Fragment {
    public final F5 a;
    public final C5919hO2 g;
    public final HashSet h;
    public ComponentCallbacks2C5575gO2 i;
    public FragmentC6263iO2 j;
    public Fragment k;

    public FragmentC6263iO2() {
        F5 f5 = new F5();
        this.g = new C5919hO2(this);
        this.h = new HashSet();
        this.a = f5;
    }

    public final void a(Activity activity) {
        FragmentC6263iO2 fragmentC6263iO2 = this.j;
        if (fragmentC6263iO2 != null) {
            fragmentC6263iO2.h.remove(this);
            this.j = null;
        }
        C7293lO2 c7293lO2 = a.b(activity).j;
        c7293lO2.getClass();
        FragmentC6263iO2 d = c7293lO2.d(activity.getFragmentManager());
        this.j = d;
        if (equals(d)) {
            return;
        }
        this.j.h.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentC6263iO2 fragmentC6263iO2 = this.j;
        if (fragmentC6263iO2 != null) {
            fragmentC6263iO2.h.remove(this);
            this.j = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
        FragmentC6263iO2 fragmentC6263iO2 = this.j;
        if (fragmentC6263iO2 != null) {
            fragmentC6263iO2.h.remove(this);
            this.j = null;
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        String fragment = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.k;
        }
        return fragment + "{parent=" + String.valueOf(parentFragment) + "}";
    }
}
