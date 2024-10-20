package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class C13 {
    public static String a(Context context, C8545p13 c8545p13, Layout layout, TextPaint textPaint) {
        int d = c8545p13.d();
        C4733dw0 b = c8545p13.b(0);
        String string = context.getString(R.string.f67860_resource_name_obfuscated_res_0x7f14020a);
        String c = b.c(-1, string);
        int i = d - 1;
        if (i == 0) {
            return c;
        }
        int i2 = c8545p13.b;
        int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : R.plurals.f62650_resource_name_obfuscated_res_0x7f12002c : R.plurals.f62640_resource_name_obfuscated_res_0x7f12002b : R.plurals.f62670_resource_name_obfuscated_res_0x7f12002e : R.plurals.f62660_resource_name_obfuscated_res_0x7f12002d;
        String quantityString = context.getResources().getQuantityString(i3, i, c, Integer.valueOf(i));
        if (textPaint != null && layout != null) {
            int ellipsizedWidth = layout.getEllipsizedWidth();
            while (Layout.getDesiredWidth(quantityString, textPaint) > ellipsizedWidth) {
                c = b.c(c.length(), string);
                quantityString = context.getResources().getQuantityString(i3, i, c, Integer.valueOf(i));
            }
        }
        return quantityString;
    }
}
