package org.chromium.components.browser_ui.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface SettingsLauncher {
    Intent a(Context context, String str, Bundle bundle);

    void b(Context context, Class cls, Bundle bundle);

    void c(Context context, Class cls);

    void d(Context context);

    Intent e(Activity activity, String str);
}
