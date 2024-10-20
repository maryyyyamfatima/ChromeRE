package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d33, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4433d33 {
    public static void a(Context context, C1844Of c1844Of, String str, int i) {
        int i2;
        String string;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (i == 0) {
            i2 = isEmpty ? R.string.f84470_resource_name_obfuscated_res_0x7f140953 : R.string.f65930_resource_name_obfuscated_res_0x7f14013d;
        } else if (i != 1) {
            return;
        } else {
            i2 = isEmpty ? R.string.f66670_resource_name_obfuscated_res_0x7f14018d : R.string.f65940_resource_name_obfuscated_res_0x7f14013e;
        }
        if (isEmpty) {
            string = context.getResources().getString(i2);
        } else {
            string = context.getResources().getString(i2, str);
        }
        c1844Of.setContentDescription(string);
    }
}
