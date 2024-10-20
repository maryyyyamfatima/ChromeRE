package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ik2 */
/* loaded from: classes.dex */
public final class C1093Ik2 {
    public final Context a;
    public final SettingsLauncher b;
    public final KH c;
    public final KH d;

    public C1093Ik2(Activity activity, SettingsLauncher settingsLauncher, KH kh, KH kh2) {
        this.a = activity;
        this.b = settingsLauncher;
        this.c = kh;
        this.d = kh2;
    }

    public final Intent a(int i, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setData(Uri.parse(str));
        this.c.getClass();
        Context context = this.a;
        Intent e = C0507Dx1.e(context, intent);
        e.setPackage(context.getPackageName());
        e.putExtra("com.android.browser.application_id", context.getPackageName());
        e.putExtra("org.chromium.chrome.browser.password_check.PASSWORD_CHANGE_TYPE", i);
        this.d.getClass();
        AbstractC2281Ro1.a(e);
        return e;
    }
}
