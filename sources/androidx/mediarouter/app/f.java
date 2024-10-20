package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractC4242cX;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class f {
    public static ContextThemeWrapper a(int i, Context context, boolean z) {
        if (i == 0) {
            i = g(context, !z ? R.attr.f6260_resource_name_obfuscated_res_0x7f05019f : R.attr.f2520_resource_name_obfuscated_res_0x7f050029);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return g(contextThemeWrapper, R.attr.f10530_resource_name_obfuscated_res_0x7f05034a) != 0 ? new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(ContextThemeWrapper contextThemeWrapper) {
        int g = g(contextThemeWrapper, R.attr.f10530_resource_name_obfuscated_res_0x7f05034a);
        return g == 0 ? e(contextThemeWrapper) : g;
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int c(Context context) {
        return AbstractC4242cX.c(-1, f(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context)) >= 3.0d ? -1 : -570425344;
    }

    public static void i(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, ViewGroup viewGroup) {
        int c = c(context);
        if (Color.alpha(c) != 255) {
            c = AbstractC4242cX.f(c, ((Integer) viewGroup.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c, c);
    }

    public static boolean h(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.f8550_resource_name_obfuscated_res_0x7f050284, typedValue, true) && typedValue.data != 0;
    }

    public static int f(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int e(Context context) {
        return h(context) ? c(context) == -570425344 ? R.style.f105050_resource_name_obfuscated_res_0x7f150536 : R.style.f105060_resource_name_obfuscated_res_0x7f150537 : c(context) == -570425344 ? R.style.f105070_resource_name_obfuscated_res_0x7f150538 : R.style.f105040_resource_name_obfuscated_res_0x7f150535;
    }
}
