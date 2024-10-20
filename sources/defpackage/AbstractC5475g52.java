package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g52, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5475g52 {
    public static ContextThemeWrapper a(int i, Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = (z ? 32 : 16) | (configuration.uiMode & (-49));
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        return contextThemeWrapper;
    }
}
