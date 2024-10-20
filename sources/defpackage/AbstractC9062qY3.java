package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.site_settings.AllSiteSettings;
import org.chromium.components.browser_ui.site_settings.SingleWebsiteSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qY3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9062qY3 {
    public static void a(Context context, Collection collection, Collection collection2) {
        if (collection.size() == 1) {
            b(context, (String) collection.iterator().next());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("category", C7034ke3.m(0));
        bundle.putString("title", context.getString(R.string.f89610_resource_name_obfuscated_res_0x7f140b67));
        bundle.putStringArrayList("selected_domains", new ArrayList<>(collection2));
        bundle.putInt("org.chromium.chrome.preferences.navigation_source", 1);
        String name = AllSiteSettings.class.getName();
        Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            a.addFlags(268435456);
            a.addFlags(67108864);
        }
        a.putExtra("show_fragment", name);
        a.putExtra("show_fragment_args", bundle);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(a, null);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static void b(Context context, String str) {
        Bundle R0 = SingleWebsiteSettings.R0(str);
        R0.putInt("org.chromium.chrome.preferences.navigation_source", 1);
        String name = SingleWebsiteSettings.class.getName();
        Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            a.addFlags(268435456);
            a.addFlags(67108864);
        }
        a.putExtra("show_fragment", name);
        a.putExtra("show_fragment_args", R0);
        context.startActivity(a);
    }
}
