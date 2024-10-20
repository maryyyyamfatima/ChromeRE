package defpackage;

import J.N;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.chromium.base.BundleUtils;
import org.chromium.chrome.browser.base.SplitChromeApplication;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LM extends a implements InterfaceC4787e52, InterfaceC3562aY1 {
    public InterfaceC5131f52 z;
    public final C8385oa2 y = new C8385oa2();
    public final LinkedHashSet A = new LinkedHashSet();

    public ZX1 p0() {
        return null;
    }

    public void r0() {
    }

    @Override // androidx.appcompat.app.a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        SplitChromeApplication.e("chrome");
        ClassLoader classLoader = LM.class.getClassLoader();
        Context context2 = V60.a;
        if (!classLoader.equals(context2.getClassLoader())) {
            throw new IllegalStateException("ClassLoader mismatch detected.\nA: " + classLoader + "\nB: " + context2.getClassLoader() + "\nC: " + classLoader.getParent() + "\nD: " + context2.getClassLoader().getParent() + "\nE: " + context2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Boolean bool = BundleUtils.a;
            ClassLoader classLoader2 = getClass().getClassLoader();
            if (classLoader2 != context.getClassLoader()) {
                AbstractC4851eH1.f("BundleUtils", "Mismatched ClassLoaders between Activity and context (fixing): %s", getClass());
                BundleUtils.g(classLoader2, context);
            }
        }
        this.z = q0();
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (n0(context, configuration)) {
            applyOverrideConfiguration(configuration);
        }
    }

    public InterfaceC5131f52 q0() {
        if (AbstractC8194o01.a == null) {
            if (!AX.e().g("force-enable-night-mode")) {
                C0624Eu3 a = C0624Eu3.a();
                if (C4403cy2.e == null) {
                    C4403cy2.e = new C4403cy2();
                }
                AbstractC8194o01.a = new C7506m01(a, C4403cy2.e, O83.a);
            } else {
                AbstractC8194o01.a = new C7850n01();
            }
        }
        return AbstractC8194o01.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        return V60.a.getSharedPreferences(str, i);
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onCreate(Bundle bundle) {
        LocaleList locales;
        Boolean bool = BundleUtils.a;
        if (bundle != null) {
            BundleUtils.f = bundle.getStringArrayList("split_compat_loaded_splits");
        }
        this.y.p(p0());
        r0();
        this.z.b(this);
        super.onCreate(bundle);
        o0();
        C6132i01 c6132i01 = C6132i01.d;
        if (c6132i01.c) {
            Configuration a = c6132i01.a(this);
            Resources resources = getResources();
            resources.updateConfiguration(a, resources.getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 24) {
                Locale.setDefault(a.locale);
            } else {
                locales = a.getLocales();
                LocaleList.setDefault(locales);
            }
        }
        s0();
    }

    public boolean t0() {
        return CachedFeatureFlags.b(AbstractC6265iP.d.b("DynamicColorAndroid:dynamic_color_full"), true);
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public void onDestroy() {
        this.z.j(this);
        C8385oa2 c8385oa2 = this.y;
        Object obj = c8385oa2.g;
        if (obj != null) {
            ((ZX1) obj).b();
            c8385oa2.p(null);
        }
        super.onDestroy();
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean bool = BundleUtils.a;
        bundle.putStringArrayList("split_compat_loaded_splits", new ArrayList<>(BundleUtils.d.keySet()));
    }

    @Override // androidx.appcompat.app.a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        this.A.add(Integer.valueOf(i));
    }

    @Override // androidx.appcompat.app.a, defpackage.AbstractActivityC6817k00, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        boolean h = this.z.h();
        LinkedHashSet linkedHashSet = this.A;
        if ((h ? 32 : 16) != (configuration.uiMode & 48)) {
            if (Build.VERSION.SDK_INT >= 29) {
                getTheme().rebase();
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    getTheme().applyStyle(((Integer) it.next()).intValue(), true);
                }
            }
        }
        C6132i01 c6132i01 = C6132i01.d;
        if (c6132i01.c) {
            Configuration a = c6132i01.a(this);
            Resources resources = getResources();
            resources.updateConfiguration(a, resources.getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 24) {
                Locale.setDefault(a.locale);
            } else {
                locales = a.getLocales();
                LocaleList.setDefault(locales);
            }
        }
    }

    @Override // defpackage.InterfaceC3562aY1
    public ZX1 N() {
        return (ZX1) this.y.g;
    }

    public boolean n0(Context context, Configuration configuration) {
        InterfaceC5131f52 interfaceC5131f52 = this.z;
        if (!interfaceC5131f52.d()) {
            return false;
        }
        configuration.uiMode = (interfaceC5131f52.h() ? 32 : 16) | (configuration.uiMode & (-49));
        return true;
    }

    public void o0() {
        setTheme(R.style.f96090_resource_name_obfuscated_res_0x7f1501ae);
        if (t0()) {
            AbstractC6445iv0.a(this);
        }
        C3637al0.b().a(new Runnable() { // from class: KM
            @Override // java.lang.Runnable
            public final void run() {
                boolean b = AbstractC6445iv0.b();
                EI2.b("Android.DynamicColors.IsAvailable", b);
                N.MT4iKtWs("IsDynamicColorAvailable", b ? "Enabled" : "Disabled", 0);
            }
        });
        if (Build.VERSION.SDK_INT >= 31 && !UN.w.a()) {
            setTheme(R.style.f105360_resource_name_obfuscated_res_0x7f150555);
        }
        setTheme(R.style.f105390_resource_name_obfuscated_res_0x7f150558);
        if (UN.u.a()) {
            setTheme(R.style.f105380_resource_name_obfuscated_res_0x7f150557);
        }
    }

    public void s0() {
        Resources resources = getResources();
        setTaskDescription(new ActivityManager.TaskDescription(resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5), BitmapFactory.decodeResource(resources, R.mipmap.app_icon), resources.getColor(R.color.0_resource_name_obfuscated_res_0x7f070133)));
    }

    @Override // defpackage.InterfaceC4787e52
    public void R() {
        if (isFinishing()) {
            return;
        }
        recreate();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        if (BundleUtils.e == null) {
            BundleUtils.e = new C7923nD();
        }
        return BundleUtils.e;
    }
}
