package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9942t6 {
    public static Activity a(WebContents webContents) {
        WindowAndroid Q0;
        if (webContents == null || webContents.isDestroyed() || (Q0 = webContents.Q0()) == null) {
            return null;
        }
        return (Activity) Q0.k().get();
    }

    public static int b() {
        return SysUtils.isLowEndDevice() ? R.style.f103730_resource_name_obfuscated_res_0x7f1504b2 : R.style.f103720_resource_name_obfuscated_res_0x7f1504b1;
    }

    public static void c(Intent intent, ComponentName componentName) {
        Context context = V60.a;
        if (TextUtils.equals(componentName.getPackageName(), context.getPackageName())) {
            if (componentName.getClassName() != null && TextUtils.equals(componentName.getClassName(), "com.google.android.apps.chrome.Main")) {
                intent.setClass(context, ChromeTabbedActivity.class);
            } else {
                intent.setComponent(componentName);
            }
        }
    }
}
