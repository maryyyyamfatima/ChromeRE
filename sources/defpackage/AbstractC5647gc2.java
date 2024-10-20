package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5647gc2 {
    public static int a(int i, Context context, boolean z) {
        if (z) {
            return 2;
        }
        if (AbstractC3494aK3.e(i, context, z)) {
            return 3;
        }
        return AbstractC3899bX.g(i) ? 1 : 0;
    }

    public static int c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 0) {
            return resources.getColor(R.color.f16840_resource_name_obfuscated_res_0x7f070086);
        }
        if (i == 1) {
            return resources.getColor(R.color.f16830_resource_name_obfuscated_res_0x7f070085);
        }
        if (i == 2) {
            return resources.getColor(R.color.f26920_resource_name_obfuscated_res_0x7f0708b3);
        }
        return AbstractC9685sM1.c(R.attr.f5130_resource_name_obfuscated_res_0x7f05012e, context, "OmniboxResourceProvider");
    }

    public static int d(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 0) {
            return resources.getColor(R.color.f16860_resource_name_obfuscated_res_0x7f070088);
        }
        if (i == 1) {
            return resources.getColor(R.color.f16850_resource_name_obfuscated_res_0x7f070087);
        }
        if (i == 2) {
            return resources.getColor(R.color.f26930_resource_name_obfuscated_res_0x7f0708b4);
        }
        return AbstractC9685sM1.c(R.attr.f5170_resource_name_obfuscated_res_0x7f050132, context, "OmniboxResourceProvider");
    }

    public static int b(Context context, int i) {
        if (i == 2) {
            return context.getColor(R.color.f18090_resource_name_obfuscated_res_0x7f070141);
        }
        return AbstractC9685sM1.c(R.attr.f5130_resource_name_obfuscated_res_0x7f05012e, context, "OmniboxResourceProvider");
    }

    public static Drawable e(int i, int i2, Context context) {
        if (i == 2) {
            context = AbstractC5475g52.a(R.style.f103690_resource_name_obfuscated_res_0x7f1504ae, context, true);
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        int i3 = typedValue.resourceId;
        Object obj = Y50.a;
        return context.getDrawable(i3);
    }
}
