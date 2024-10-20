package org.chromium.chrome.browser.feature_guide.notifications;

import android.content.Intent;
import android.net.Uri;
import com.android.chrome.R;
import defpackage.AbstractC8650pL;
import defpackage.AbstractC8780pj0;
import defpackage.C1761No1;
import defpackage.C6861k72;
import defpackage.C7749mj0;
import defpackage.C8636pI0;
import defpackage.InterfaceC8979qI0;
import defpackage.V60;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.settings.SettingsActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FeatureNotificationGuideBridge {
    public static InterfaceC8979qI0 a;

    public final void clearNativePtr() {
    }

    public final String getNotificationParamGuidForFeature(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "guid_voice_search" : "guid_ntp_suggestion_card" : "guid_incognito_tab" : "guid_sign_in" : "guid_default_browser";
    }

    public static FeatureNotificationGuideBridge create(long j) {
        return new FeatureNotificationGuideBridge();
    }

    public final void onNotificationClick(int i) {
        Class cls;
        ((C8636pI0) a).getClass();
        Object obj = ThreadUtils.a;
        boolean z = i == 3 || i == 5 || i == 4;
        if (i != 1 && i == 2) {
            cls = SettingsActivity.class;
        } else {
            cls = ChromeTabbedActivity.class;
        }
        Intent intent = new Intent(V60.a, (Class<?>) cls);
        if (z) {
            intent.setData(Uri.parse("chrome-native://newtab/"));
            intent.putExtra("create_new_tab", true);
        }
        intent.addFlags(268435456);
        intent.putExtra("feature_notification_guide_feature_type", i);
        C1761No1.y(null, intent, null);
    }

    public final boolean shouldSkipFeature(int i) {
        boolean a2;
        if (i == 1) {
            if (C7749mj0.b == null) {
                C7749mj0.b = new C7749mj0();
            }
            a2 = AbstractC8780pj0.b(C7749mj0.b, V60.a, true);
        } else {
            if (i != 4) {
                return false;
            }
            a2 = AbstractC8650pL.a("ntp_snippets.list_visible");
        }
        return !a2;
    }

    public final String getNotificationMessage(int i) {
        return V60.a.getResources().getString(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : R.string.f73620_resource_name_obfuscated_res_0x7f140495 : R.string.f73600_resource_name_obfuscated_res_0x7f140493 : R.string.f73590_resource_name_obfuscated_res_0x7f140492 : R.string.f73610_resource_name_obfuscated_res_0x7f140494 : R.string.f73580_resource_name_obfuscated_res_0x7f140491);
    }

    public final String getNotificationTitle(int i) {
        return V60.a.getResources().getString(R.string.f73630_resource_name_obfuscated_res_0x7f140496);
    }

    public final void closeNotification(String str) {
        new C6861k72(V60.a).b(str.hashCode(), null);
    }
}
