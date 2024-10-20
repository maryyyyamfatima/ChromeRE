package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11893yn3 {
    public static final int[] a = {R.string.f72780_resource_name_obfuscated_res_0x7f14043e, R.string.f72790_resource_name_obfuscated_res_0x7f14043f, R.string.f72770_resource_name_obfuscated_res_0x7f14043d};

    public static String a(C4266cb2 c4266cb2) {
        Context context = V60.a;
        boolean b = c4266cb2.b();
        long j = c4266cb2.a;
        if (b && j == 0) {
            return context.getResources().getString(R.string.f72990_resource_name_obfuscated_res_0x7f140453);
        }
        Long l = c4266cb2.b;
        int i = c4266cb2.c;
        if (i == 0) {
            String b2 = AbstractC6091ht0.b(j, context);
            if (c4266cb2.b()) {
                return context.getResources().getString(R.string.f73020_resource_name_obfuscated_res_0x7f140456, b2);
            }
            return context.getResources().getString(R.string.f73000_resource_name_obfuscated_res_0x7f140454, b2, AbstractC6091ht0.b(l.longValue(), context));
        }
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            if (c4266cb2.b()) {
                return context.getResources().getString(R.string.f72990_resource_name_obfuscated_res_0x7f140453);
            }
            return NumberFormat.getPercentInstance(Locale.getDefault()).format(c4266cb2.a() / 100.0d);
        }
        if (c4266cb2.b()) {
            int min = (int) Math.min(2147483647L, j);
            return context.getResources().getQuantityString(R.plurals.f62450_resource_name_obfuscated_res_0x7f120017, min, Integer.valueOf(min));
        }
        int longValue = (int) (l.longValue() - j);
        return longValue == 1 ? context.getResources().getString(R.string.f79050_resource_name_obfuscated_res_0x7f140723) : context.getResources().getString(R.string.f73910_resource_name_obfuscated_res_0x7f1404b3, Integer.valueOf(longValue));
    }

    public static String b(long j, Context context) {
        int i;
        int i2;
        int i3;
        long j2 = j / 1000;
        if (j2 >= 86400) {
            i = (int) (j2 / 86400);
            j2 -= i * 86400;
        } else {
            i = 0;
        }
        if (j2 >= 3600) {
            i2 = (int) (j2 / 3600);
            j2 -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (j2 >= 60) {
            i3 = (int) (j2 / 60);
            j2 -= i3 * 60;
        } else {
            i3 = 0;
        }
        int i4 = (int) j2;
        if (i >= 2) {
            return context.getString(R.string.f84390_resource_name_obfuscated_res_0x7f14094b, Integer.valueOf(((i2 + 12) / 24) + i));
        }
        if (i > 0) {
            return context.getString(R.string.f84420_resource_name_obfuscated_res_0x7f14094e);
        }
        if (i2 >= 2) {
            return context.getString(R.string.f84400_resource_name_obfuscated_res_0x7f14094c, Integer.valueOf(((i3 + 30) / 60) + i2));
        }
        if (i2 > 0) {
            return context.getString(R.string.f84430_resource_name_obfuscated_res_0x7f14094f);
        }
        if (i3 >= 2) {
            return context.getString(R.string.f84410_resource_name_obfuscated_res_0x7f14094d, Integer.valueOf(((i4 + 30) / 60) + i3));
        }
        if (i3 > 0) {
            return context.getString(R.string.f84440_resource_name_obfuscated_res_0x7f140950);
        }
        return i4 == 1 ? context.getString(R.string.f84450_resource_name_obfuscated_res_0x7f140951) : context.getString(R.string.f84460_resource_name_obfuscated_res_0x7f140952, Integer.valueOf(i4));
    }
}
