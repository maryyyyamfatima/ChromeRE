package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11769yR2 {
    public static boolean a(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        return (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) ? false : true;
    }
}
