package org.chromium.chrome.browser.safe_browsing;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC7459ls0;
import org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragment;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafeBrowsingSettingsLauncher {
    public static void showSafeBrowsingSettings(WebContents webContents, int i) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            return;
        }
        Context context = (Context) Q0.j.get();
        int i2 = SafeBrowsingSettingsFragment.n0;
        Bundle bundle = new Bundle();
        bundle.putInt("SafeBrowsingSettingsFragment.AccessPoint", i);
        String name = SafeBrowsingSettingsFragment.class.getName();
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
}
