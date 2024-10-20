package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.Collections;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: li4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7403li4 implements InterfaceC11521xi4, InterfaceC7458ls {
    public static final Set a = Collections.unmodifiableSet(AbstractC9048qW.d("G950", "N950", "G955", "G892"));
    public static final Set g = Collections.unmodifiableSet(AbstractC9048qW.d("SC-02J", "SCV36", "SC-03J", "SCV35", "SC-01K", "SCV37"));
    public static final boolean h;
    public static Boolean i;

    public abstract boolean A(int i2, int i3);

    public abstract void B(boolean z);

    public abstract void D();

    public abstract void G(Activity activity, Intent intent);

    public abstract void H(Bundle bundle);

    public abstract void I();

    public abstract void N(C10369uM c10369uM);

    public abstract void O(int i2, Runnable runnable);

    public abstract void R(Runnable runnable);

    public abstract void V(Activity activity);

    @Override // defpackage.InterfaceC11521xi4
    public abstract boolean a();

    public abstract boolean d();

    public abstract void e(Activity activity, Bundle bundle);

    public abstract boolean f();

    public abstract boolean g();

    public abstract void i();

    public abstract boolean n();

    public abstract void o(Activity activity, Intent intent);

    public abstract boolean onBackPressed();

    public abstract void t(Activity activity);

    public abstract void u();

    public abstract void v(Activity activity);

    public abstract boolean x(int i2, int i3);

    public abstract void y(Activity activity);

    static {
        h = Build.VERSION.SDK_INT < 26;
    }

    public static boolean c() {
        int i2;
        if (i == null) {
            try {
                i2 = ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.boot.vr", 0)).intValue();
            } catch (Exception e) {
                AbstractC4851eH1.a("Exception while getting system property %s. Using default %s.", "ro.boot.vr", 0, e);
                i2 = 0;
            }
            i = Boolean.valueOf(i2 == 1);
        }
        return i.booleanValue();
    }

    public static void U(Activity activity) {
        activity.getWindow().addFlags(128);
        activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 5894);
    }

    public static void b(Activity activity) {
        if (activity.getWindow().findViewById(R.id.vr_overlay_view) != null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view = new View(activity);
        view.setId(R.id.vr_overlay_view);
        view.setBackgroundColor(-16777216);
        ((FrameLayout) activity.getWindow().getDecorView()).addView(view, layoutParams);
    }

    public static void L(Activity activity, boolean z) {
        View findViewById = activity.getWindow().findViewById(R.id.vr_overlay_view);
        if (findViewById == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
        if (!z) {
            frameLayout.removeView(findViewById);
        } else {
            findViewById.animate().alpha(0.0f).setDuration(activity.getResources().getInteger(android.R.integer.config_mediumAnimTime)).setListener(new C7059ki4(frameLayout, findViewById));
        }
    }

    public static boolean J(Activity activity, Intent intent) {
        Bundle bundle;
        if (AbstractC1895Op0.b(activity).b == 0) {
            return false;
        }
        AbstractC4851eH1.d("VrDelegate", "Relaunching Chrome onto the main display.", new Object[0]);
        activity.finish();
        if (Build.VERSION.SDK_INT >= 26) {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            makeBasic.setLaunchDisplayId(0);
            bundle = makeBasic.toBundle();
        } else {
            bundle = null;
        }
        activity.startActivity(intent, bundle);
        return true;
    }
}
