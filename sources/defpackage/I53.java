package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I53 implements SettingsLauncher {
    @Override // org.chromium.components.browser_ui.settings.SettingsLauncher
    public final void c(Context context, Class cls) {
        b(context, cls, null);
    }

    @Override // org.chromium.components.browser_ui.settings.SettingsLauncher
    public final void d(Context context) {
        b(context, null, null);
    }

    @Override // org.chromium.components.browser_ui.settings.SettingsLauncher
    public final void b(Context context, Class cls, Bundle bundle) {
        Intent a = a(context, cls != null ? cls.getName() : null, bundle);
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(a, null);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // org.chromium.components.browser_ui.settings.SettingsLauncher
    public final Intent e(Activity activity, String str) {
        return a(activity, str, null);
    }

    @Override // org.chromium.components.browser_ui.settings.SettingsLauncher
    public final Intent a(Context context, String str, Bundle bundle) {
        Intent a = AbstractC7459ls0.a(context, SettingsActivity.class);
        if (!(context instanceof Activity)) {
            a.addFlags(268435456);
            a.addFlags(67108864);
        }
        if (str != null) {
            a.putExtra("show_fragment", str);
        }
        if (bundle != null) {
            a.putExtra("show_fragment_args", bundle);
        }
        return a;
    }
}
