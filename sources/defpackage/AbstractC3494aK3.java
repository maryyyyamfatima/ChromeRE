package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aK3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3494aK3 {
    public static final C7569mB a = new C7569mB("DynamicColorAndroid", "dynamic_color_full", true);

    public static int d(int i) {
        return i == 2 ? R.color.f17820_resource_name_obfuscated_res_0x7f070122 : i == 0 ? R.color.f17760_resource_name_obfuscated_res_0x7f070118 : i == 1 ? R.color.f17880_resource_name_obfuscated_res_0x7f07012c : R.color.f17870_resource_name_obfuscated_res_0x7f07012b;
    }

    public static int a(Context context, Tab tab, int i) {
        int b = b(i, context, tab != null && tab.isIncognito());
        InterfaceC5451g12 x = tab != null ? tab.x() : null;
        return x != null ? x.p(b) : b;
    }

    public static int b(int i, Context context, boolean z) {
        if (z) {
            return AbstractC3899bX.a(i, context.getColor(R.color.f26880_resource_name_obfuscated_res_0x7f0708af) & (-16777216), Color.alpha(r3) / 255.0f, false);
        }
        if (e(i, context, false)) {
            return AbstractC11746yN.c(context, R.dimen.f42440_resource_name_obfuscated_res_0x7f080811);
        }
        if (AbstractC3899bX.h(i)) {
            return -1;
        }
        return AbstractC3899bX.a(i, -1, 0.2f, false);
    }

    public static ColorStateList c(Context context, int i) {
        return Y50.b(context, d(i));
    }

    public static boolean e(int i, Context context, boolean z) {
        return i == AbstractC11746yN.a(context, z);
    }
}
