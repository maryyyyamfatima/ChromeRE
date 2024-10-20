package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.chrome.browser.sync.SyncServiceImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rt3 */
/* loaded from: classes.dex */
public abstract class AbstractC2308Rt3 {
    public static int a() {
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        if (b == null || !b.j()) {
            return -1;
        }
        if (b.d() == 1) {
            return 0;
        }
        long j = ((SyncServiceImpl) b).c;
        if (N.MuE0jZeQ(j)) {
            return 6;
        }
        if (b.d() != 0 || N.Mmbpwv9L(j)) {
            return 128;
        }
        if (b.h() && b.i()) {
            return 1;
        }
        return (b.h() && N.MXx$a024(j)) ? b.g() ? 2 : 3 : (b.h() && N.MTllqxqb(j)) ? b.g() ? 4 : 5 : !N.M_K26FRY(j) ? 7 : -1;
    }

    public static String c(Context context, int i) {
        if (i != 128) {
            switch (i) {
                case 0:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f1404fe);
                case 1:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f1404fd);
                case 2:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140501);
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140502);
                case 4:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f1404ff);
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140500);
                case 6:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f1404fa, AbstractC6547jD.a.a);
                case 7:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140503);
                default:
                    return null;
            }
        }
        return context.getString(R.string.0_resource_name_obfuscated_res_0x7f1404fc);
    }

    public static String b(Context context, int i) {
        if (i != 128) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 6:
                case 7:
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f1407df);
                case 4:
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140aea);
                default:
                    return null;
            }
        }
        return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140ada);
    }

    public static String d(Context context, int i) {
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140adc);
        }
        if (i == 3) {
            return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140adb);
        }
        if (i != 7) {
            return (i == 9 || i == 11 || i == 12) ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f140add) : "";
        }
        return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140ade);
    }

    public static void e(String str, Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setData(Uri.parse(str));
        Intent e = C0507Dx1.e(activity, intent);
        e.setPackage(activity.getPackageName());
        e.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE", 0);
        e.putExtra("com.android.browser.application_id", activity.getPackageName());
        AbstractC2281Ro1.a(e);
        try {
            activity.startActivity(e, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
