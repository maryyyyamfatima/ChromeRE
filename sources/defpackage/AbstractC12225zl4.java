package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.night_mode.settings.ThemeSettingsFragment;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zl4 */
/* loaded from: classes.dex */
public abstract class AbstractC12225zl4 {
    public static void a(final Activity activity, final Profile profile, final SettingsLauncher settingsLauncher, InterfaceC4578dV1 interfaceC4578dV1, String str) {
        Resources resources = activity.getResources();
        BD2 bd2 = new BD2(HU1.F);
        bd2.c(HU1.a, 21);
        bd2.c(HU1.m, R.drawable.0_resource_name_obfuscated_res_0x7f0901cb);
        bd2.c(HU1.p, 0);
        bd2.e(HU1.f, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140206));
        bd2.e(HU1.h, str);
        bd2.e(HU1.c, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140202));
        bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: tl4
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                Bundle bundle = new Bundle();
                bundle.putInt("theme_settings_entry", 1);
                settingsLauncher.b(activity, ThemeSettingsFragment.class, bundle);
                return 1;
            }
        });
        bd2.e(HU1.x, new Callback() { // from class: ul4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ((Integer) obj).intValue();
                LU3.a(Profile.this).dismissed("IPH_AutoDarkUserEducationMessage");
            }
        });
        ((C5265fV1) interfaceC4578dV1).c(bd2.a(), false);
    }
}
