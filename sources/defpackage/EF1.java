package defpackage;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import java.lang.ref.WeakReference;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EF1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public MF1 e;
    public SettingsLauncher f;
    public InterfaceC9814sk0 g;
    public WeakReference d = new WeakReference(null);
    public final DF1 h = new DF1(this);

    public abstract boolean c();

    public final void d() {
        Q83 q83 = O83.a;
        boolean e = q83.e("LocaleManager_WAS_IN_SPECIAL_LOCALE", false);
        boolean c = c();
        if (e && !c) {
            if (q83.e("LocaleManager_PREF_AUTO_SWITCH", false) && !c()) {
                N.MeiEg9Vo(a().a);
                f(V60.a.getString(R.string.f89960_resource_name_obfuscated_res_0x7f140b8c));
            }
            if (!c()) {
                MF1 a = a();
                if (a.b) {
                    N.M0j5QnfQ(a.a);
                }
            }
        } else if (c && !e) {
            if (c()) {
                MF1 a2 = a();
                a2.b = N.Mhja8Ht3(a2.a);
            }
            e();
        } else if (c && c()) {
            MF1 a3 = a();
            a3.b = N.Mhja8Ht3(a3.a);
        }
        q83.p("LocaleManager_WAS_IN_SPECIAL_LOCALE", c);
    }

    public final void e() {
        if (O83.a.e("LocaleManager_PREF_AUTO_SWITCH", false) && c()) {
            N.MfBMIJvi(a().a);
            f(V60.a.getString(R.string.f89970_resource_name_obfuscated_res_0x7f140b8d));
        }
    }

    public EF1() {
        this.a = O83.a.f(-1, "com.android.chrome.SEARCH_ENGINE_PROMO_SHOWN") == 1;
    }

    public final void f(String str) {
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = (ViewOnClickListenerC1069If3) this.d.get();
        if (viewOnClickListenerC1069If3 == null) {
            return;
        }
        Context context = V60.a;
        C12188zf3 a = C12188zf3.a(str, this.h, 1, 14);
        a.j = 6000;
        a.d = context.getString(R.string.f86150_resource_name_obfuscated_res_0x7f140a00);
        a.e = null;
        viewOnClickListenerC1069If3.c(a);
    }

    public int b() {
        return (c() && !O83.a.e("LocaleManager_PREF_PROMO_SHOWN", false)) ? 0 : -1;
    }

    public final MF1 a() {
        if (this.e == null) {
            this.e = new MF1();
        }
        return this.e;
    }
}
