package defpackage;

import android.content.Context;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11746yN {
    public static int a(Context context, boolean z) {
        if (z) {
            return context.getColor(R.color.f26840_resource_name_obfuscated_res_0x7f0708ab);
        }
        return AbstractC9685sM1.c(R.attr.f5490_resource_name_obfuscated_res_0x7f050152, context, "ChromeColors");
    }

    public static int b(Context context, boolean z) {
        if (z) {
            return context.getColor(R.color.f17390_resource_name_obfuscated_res_0x7f0700e8);
        }
        return AbstractC10957w33.a(context);
    }

    public static int c(Context context, int i) {
        float dimension = context.getResources().getDimension(i);
        C2720Uy0 c2720Uy0 = new C2720Uy0(context);
        return c2720Uy0.b(c2720Uy0.d, dimension);
    }
}
