package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FN2 extends Fragment {
    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            DN2.a(activity, new EN2());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FN2(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Activity activity, EnumC11340xA1 enumC11340xA1) {
        if (activity instanceof JA1) {
            LA1 Z = ((JA1) activity).Z();
            if (Z instanceof LA1) {
                Z.e(enumC11340xA1);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC11340xA1.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a(EnumC11340xA1.ON_START);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a(EnumC11340xA1.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC11340xA1.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC11340xA1.ON_STOP);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC11340xA1.ON_DESTROY);
    }

    public final void a(EnumC11340xA1 enumC11340xA1) {
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), enumC11340xA1);
        }
    }
}
