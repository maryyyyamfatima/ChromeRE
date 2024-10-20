package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gD3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5521gD3 {
    public static ColorStateList a(Context context, boolean z, boolean z2) {
        int c;
        if (z) {
            return Y50.b(context, z2 ? R.color.f22330_resource_name_obfuscated_res_0x7f07059e : R.color.f22320_resource_name_obfuscated_res_0x7f07059d);
        }
        if (z2) {
            c = AbstractC9685sM1.c(R.attr.f4980_resource_name_obfuscated_res_0x7f05011f, context, "TabUiThemeProvider");
        } else {
            c = AbstractC9685sM1.c(R.attr.f5170_resource_name_obfuscated_res_0x7f050132, context, "TabUiThemeProvider");
        }
        return ColorStateList.valueOf(c);
    }

    public static int f(Context context, boolean z, boolean z2) {
        if (z) {
            return context.getColor(z2 ? R.color.f22460_resource_name_obfuscated_res_0x7f0705ab : R.color.f22450_resource_name_obfuscated_res_0x7f0705aa);
        }
        if (z2) {
            return AbstractC9685sM1.c(R.attr.f4980_resource_name_obfuscated_res_0x7f05011f, context, "TabUiThemeProvider");
        }
        return AbstractC9685sM1.c(R.attr.f5130_resource_name_obfuscated_res_0x7f05012e, context, "TabUiThemeProvider");
    }

    public static int g(Context context, boolean z, boolean z2) {
        if (z) {
            return context.getColor(z2 ? R.color.f22480_resource_name_obfuscated_res_0x7f0705ad : R.color.f22470_resource_name_obfuscated_res_0x7f0705ac);
        }
        if (z2) {
            return AbstractC9685sM1.c(R.attr.f4980_resource_name_obfuscated_res_0x7f05011f, context, "TabUiThemeProvider");
        }
        return AbstractC9685sM1.c(R.attr.f5130_resource_name_obfuscated_res_0x7f05012e, context, "TabUiThemeProvider");
    }

    public static int b(Context context, boolean z, boolean z2) {
        if (z) {
            return context.getColor(z2 ? R.color.f22440_resource_name_obfuscated_res_0x7f0705a9 : R.color.f22430_resource_name_obfuscated_res_0x7f0705a8);
        }
        int integer = context.getResources().getInteger(z2 ? R.integer.f55020_resource_name_obfuscated_res_0x7f0c0099 : R.integer.f55010_resource_name_obfuscated_res_0x7f0c0098);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z2 ? R.style.f99510_resource_name_obfuscated_res_0x7f15030c : R.style.f99500_resource_name_obfuscated_res_0x7f15030b, JG2.V0);
        int color = obtainStyledAttributes.getColor(0, 0);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
        if (dimension != 0.0f) {
            color = new C2720Uy0(context).a(color, dimension);
        }
        return AbstractC9685sM1.a(color, integer);
    }

    public static int d(Context context, boolean z, boolean z2) {
        if (z) {
            return context.getColor(z2 ? R.color.f22370_resource_name_obfuscated_res_0x7f0705a2 : R.color.f22360_resource_name_obfuscated_res_0x7f0705a1);
        }
        return AbstractC9685sM1.c(z2 ? R.attr.f5250_resource_name_obfuscated_res_0x7f05013a : R.attr.f5490_resource_name_obfuscated_res_0x7f050152, context, "TabUiThemeProvider");
    }

    public static int e(Context context, boolean z, boolean z2) {
        if (z) {
            return context.getColor(z2 ? R.color.f22390_resource_name_obfuscated_res_0x7f0705a4 : R.color.f22380_resource_name_obfuscated_res_0x7f0705a3);
        }
        return AbstractC9685sM1.c(z2 ? R.attr.f4980_resource_name_obfuscated_res_0x7f05011f : R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context, "TabUiThemeProvider");
    }

    public static float c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.f107030_resource_name_obfuscated_res_0x7f1505fc, new int[]{R.attr.f13300_resource_name_obfuscated_res_0x7f05045f});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return context.getResources().getDimension(resourceId);
    }
}
