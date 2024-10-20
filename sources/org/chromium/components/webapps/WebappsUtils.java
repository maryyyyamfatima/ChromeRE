package org.chromium.components.webapps;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo$Builder;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.android.chrome.R;
import defpackage.AbstractC3641al4;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC4851eH1;
import defpackage.C7432ln3;
import defpackage.V60;
import defpackage.ZN3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebappsUtils {
    public static boolean a;
    public static boolean b;

    public static void a(String str, String str2, Bitmap bitmap, boolean z, Intent intent) {
        if (c()) {
            Context context = V60.a;
            if (bitmap == null) {
                AbstractC4851eH1.a("WebappsUtils", AbstractC4199cO1.a("Failed to find an icon for ", str2, ", not adding."), new Object[0]);
                return;
            } else {
                try {
                    ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(new ShortcutInfo$Builder(context, str).setShortLabel(str2).setLongLabel(str2).setIcon(z ? Icon.createWithAdaptiveBitmap(bitmap) : Icon.createWithBitmap(bitmap)).setIntent(intent).build(), null);
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", str2);
        intent2.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        V60.a.sendBroadcast(intent2);
        ZN3.c(V60.a, V60.a.getString(R.string.f67240_resource_name_obfuscated_res_0x7f1401c9, str2), 0).d();
    }

    public static String queryFirstWebApkPackage(String str) {
        return AbstractC3641al4.d(V60.a, str);
    }

    public static void showWebApkInstallResultToast(int i) {
        Context context = V60.a;
        if (i == 11) {
            ZN3.c(V60.a, context.getString(R.string.f90480_resource_name_obfuscated_res_0x7f140bcf), 0).d();
        } else if (i != 0) {
            ZN3.c(V60.a, context.getString(R.string.f90470_resource_name_obfuscated_res_0x7f140bce), 0).d();
        }
    }

    public static boolean b() {
        if (c()) {
            return true;
        }
        return !V60.a.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 32).isEmpty();
    }

    public static boolean c() {
        boolean isRequestPinShortcutSupported;
        if (!b) {
            if (Build.VERSION.SDK_INT >= 26) {
                ShortcutManager shortcutManager = (ShortcutManager) V60.a.getSystemService(ShortcutManager.class);
                C7432ln3 c = C7432ln3.c();
                try {
                    isRequestPinShortcutSupported = shortcutManager.isRequestPinShortcutSupported();
                    a = isRequestPinShortcutSupported;
                    c.close();
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            b = true;
        }
        return a;
    }
}
