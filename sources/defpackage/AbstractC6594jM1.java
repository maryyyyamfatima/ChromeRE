package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6594jM1 {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue b(int i, Context context, String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}