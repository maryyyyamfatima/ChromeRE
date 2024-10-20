package org.chromium.chrome.browser.browsing_data;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C1202Jg1;
import defpackage.C8765pg3;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.IG3;
import defpackage.KH;
import defpackage.US;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragmentBasic;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.components.browser_ui.settings.ClickableSpansTextMessagePreference;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearBrowsingDataFragmentBasic extends ClearBrowsingDataFragment {
    public static final /* synthetic */ int q0 = 0;
    public KH p0;

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment
    public final int T0() {
        return 0;
    }

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment
    public final void Y0() {
        EI2.h(0, 2, "History.ClearBrowsingData.UserDeletedFromTab");
        FI2.a("ClearBrowsingData_BasicTab");
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        boolean z = false;
        ClearBrowsingDataCheckBoxPreference clearBrowsingDataCheckBoxPreference = (ClearBrowsingDataCheckBoxPreference) M0(ClearBrowsingDataFragment.W0(0));
        ClearBrowsingDataCheckBoxPreference clearBrowsingDataCheckBoxPreference2 = (ClearBrowsingDataCheckBoxPreference) M0(ClearBrowsingDataFragment.W0(1));
        clearBrowsingDataCheckBoxPreference.a0 = new Runnable() { // from class: YS
            @Override // java.lang.Runnable
            public final void run() {
                int i = ClearBrowsingDataFragmentBasic.q0;
                new C11598xv3(false).f(2, "https://myactivity.google.com/myactivity?utm_source=chrome_cbd");
            }
        };
        if (US.a(C1202Jg1.a(), 0)) {
            AbstractC1658Mt3 b = AbstractC1658Mt3.b();
            if (b != null && b.j()) {
                int[] MVqF80Hk = N.MVqF80Hk(((SyncServiceImpl) b).c);
                HashSet hashSet = new HashSet();
                for (int i : MVqF80Hk) {
                    hashSet.add(Integer.valueOf(i));
                }
                if (hashSet.contains(17)) {
                    z = true;
                }
            }
            if (z) {
                clearBrowsingDataCheckBoxPreference.O(R.string.0_resource_name_obfuscated_res_0x7f14034d);
            }
            clearBrowsingDataCheckBoxPreference2.O(R.string.0_resource_name_obfuscated_res_0x7f140350);
        }
    }

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment, defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        super.O0(str, bundle);
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        IdentityManager b = C1202Jg1.b(d);
        ClickableSpansTextMessagePreference clickableSpansTextMessagePreference = (ClickableSpansTextMessagePreference) M0("clear_google_data_text");
        Preference M0 = M0("clear_search_history_non_google_text");
        TemplateUrlService a2 = IG3.a();
        TemplateUrl c = a2.c();
        boolean e = a2.e();
        final boolean z = true;
        final boolean z2 = false;
        if (c == null || !b.c(0)) {
            Preference M02 = M0("clear_google_data_text");
            if (M02 != null) {
                N0().b0(M02);
            }
        } else if (e) {
            clickableSpansTextMessagePreference.P(AbstractC9108qg3.a(K().getString(R.string.0_resource_name_obfuscated_res_0x7f140356), new C8765pg3(new C11997z52(K(), new Callback() { // from class: ZS
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str2;
                    int i = ClearBrowsingDataFragmentBasic.q0;
                    ClearBrowsingDataFragmentBasic clearBrowsingDataFragmentBasic = ClearBrowsingDataFragmentBasic.this;
                    clearBrowsingDataFragmentBasic.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle2);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    if (z) {
                        EI2.h(1, 2, "Settings.ClearBrowsingData.OpenMyActivity");
                        str2 = "https://myactivity.google.com/product/search?utm_source=chrome_cbd";
                    } else {
                        EI2.h(0, 2, "Settings.ClearBrowsingData.OpenMyActivity");
                        str2 = "https://myactivity.google.com/myactivity?utm_source=chrome_cbd";
                    }
                    intent.setData(Uri.parse(str2));
                    KH kh = clearBrowsingDataFragmentBasic.p0;
                    Context K = clearBrowsingDataFragmentBasic.K();
                    kh.getClass();
                    Intent e2 = C0507Dx1.e(K, intent);
                    e2.setPackage(clearBrowsingDataFragmentBasic.K().getPackageName());
                    e2.putExtra("com.android.browser.application_id", clearBrowsingDataFragmentBasic.K().getPackageName());
                    AbstractC2281Ro1.a(e2);
                    try {
                        clearBrowsingDataFragmentBasic.K().startActivity(e2, null);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }), "<link1>", "</link1>"), new C8765pg3(new C11997z52(K(), new Callback() { // from class: ZS
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str2;
                    int i = ClearBrowsingDataFragmentBasic.q0;
                    ClearBrowsingDataFragmentBasic clearBrowsingDataFragmentBasic = ClearBrowsingDataFragmentBasic.this;
                    clearBrowsingDataFragmentBasic.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle2);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    if (z2) {
                        EI2.h(1, 2, "Settings.ClearBrowsingData.OpenMyActivity");
                        str2 = "https://myactivity.google.com/product/search?utm_source=chrome_cbd";
                    } else {
                        EI2.h(0, 2, "Settings.ClearBrowsingData.OpenMyActivity");
                        str2 = "https://myactivity.google.com/myactivity?utm_source=chrome_cbd";
                    }
                    intent.setData(Uri.parse(str2));
                    KH kh = clearBrowsingDataFragmentBasic.p0;
                    Context K = clearBrowsingDataFragmentBasic.K();
                    kh.getClass();
                    Intent e2 = C0507Dx1.e(K, intent);
                    e2.setPackage(clearBrowsingDataFragmentBasic.K().getPackageName());
                    e2.putExtra("com.android.browser.application_id", clearBrowsingDataFragmentBasic.K().getPackageName());
                    AbstractC2281Ro1.a(e2);
                    try {
                        clearBrowsingDataFragmentBasic.K().startActivity(e2, null);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }), "<link2>", "</link2>")));
        } else {
            clickableSpansTextMessagePreference.P(AbstractC9108qg3.a(K().getString(R.string.0_resource_name_obfuscated_res_0x7f140357), new C8765pg3(new C11997z52(K(), new Callback() { // from class: ZS
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    String str2;
                    int i = ClearBrowsingDataFragmentBasic.q0;
                    ClearBrowsingDataFragmentBasic clearBrowsingDataFragmentBasic = ClearBrowsingDataFragmentBasic.this;
                    clearBrowsingDataFragmentBasic.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle2);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    if (z2) {
                        EI2.h(1, 2, "Settings.ClearBrowsingData.OpenMyActivity");
                        str2 = "https://myactivity.google.com/product/search?utm_source=chrome_cbd";
                    } else {
                        EI2.h(0, 2, "Settings.ClearBrowsingData.OpenMyActivity");
                        str2 = "https://myactivity.google.com/myactivity?utm_source=chrome_cbd";
                    }
                    intent.setData(Uri.parse(str2));
                    KH kh = clearBrowsingDataFragmentBasic.p0;
                    Context K = clearBrowsingDataFragmentBasic.K();
                    kh.getClass();
                    Intent e2 = C0507Dx1.e(K, intent);
                    e2.setPackage(clearBrowsingDataFragmentBasic.K().getPackageName());
                    e2.putExtra("com.android.browser.application_id", clearBrowsingDataFragmentBasic.K().getPackageName());
                    AbstractC2281Ro1.a(e2);
                    try {
                        clearBrowsingDataFragmentBasic.K().startActivity(e2, null);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }), "<link1>", "</link1>")));
        }
        if (c != null && !e) {
            if (c.a()) {
                M0.P(K().getString(R.string.0_resource_name_obfuscated_res_0x7f140358, c.c()));
                return;
            } else {
                M0.O(R.string.0_resource_name_obfuscated_res_0x7f140359);
                return;
            }
        }
        Preference M03 = M0("clear_search_history_non_google_text");
        if (M03 != null) {
            N0().b0(M03);
        }
    }

    @Override // org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment
    public final List V0() {
        return Arrays.asList(0, 1, 2);
    }
}
