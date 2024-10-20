package org.chromium.chrome.browser;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ShortcutInfo$Builder;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import com.android.chrome.R;
import defpackage.C1761No1;
import defpackage.O83;
import defpackage.Q83;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LauncherShortcutActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!action.equals("chromium.shortcut.action.OPEN_NEW_TAB") && !action.equals("chromium.shortcut.action.OPEN_NEW_INCOGNITO_TAB")) {
            finish();
            return;
        }
        Intent b = C1761No1.b(this, action.equals("chromium.shortcut.action.OPEN_NEW_INCOGNITO_TAB"));
        b.putExtra("com.android.chrome.invoked_from_shortcut", true);
        startActivity(b);
        finish();
    }

    public static void a(ChromeTabbedActivity chromeTabbedActivity) {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        Q83 q83 = O83.a;
        boolean M$3vpOHw = N.M$3vpOHw();
        boolean e = q83.e("incognito-shortcut-added", false);
        if (M$3vpOHw) {
            Intent intent = new Intent("chromium.shortcut.action.OPEN_NEW_INCOGNITO_TAB");
            intent.setPackage(chromeTabbedActivity.getPackageName());
            intent.setClass(chromeTabbedActivity, LauncherShortcutActivity.class);
            if (((ShortcutManager) chromeTabbedActivity.getSystemService(ShortcutManager.class)).addDynamicShortcuts(Arrays.asList(new ShortcutInfo$Builder(chromeTabbedActivity, "dynamic-new-incognito-tab-shortcut").setShortLabel(chromeTabbedActivity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14017f)).setLongLabel(chromeTabbedActivity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140632)).setIcon(Icon.createWithResource(chromeTabbedActivity, R.drawable.0_resource_name_obfuscated_res_0x7f090497)).setIntent(intent).build()))) {
                q83.p("incognito-shortcut-added", true);
                return;
            }
            return;
        }
        if (M$3vpOHw || !e) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("dynamic-new-incognito-tab-shortcut");
        ShortcutManager shortcutManager = (ShortcutManager) chromeTabbedActivity.getSystemService(ShortcutManager.class);
        shortcutManager.disableShortcuts(arrayList);
        shortcutManager.removeDynamicShortcuts(arrayList);
        q83.p("incognito-shortcut-added", false);
    }
}
