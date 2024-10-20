package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E30 {
    public static final C1439Lb3 a = new C1439Lb3();
    public static Locale b;

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14037e);
            case 2:
                return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140385);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14037b);
            case 4:
            case 6:
            case 18:
                return null;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14037d, a2);
        }
        if (i == 2) {
            if (AbstractC2655Ul0.a(context)) {
                return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140387);
            }
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140384, a2);
        }
        if (i == 3) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14037a, a2);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140382, a2);
        }
        if (i != 20) {
            switch (i) {
                case 16:
                    return d(context, "common_google_play_services_api_unavailable_text", a2);
                case 17:
                    return d(context, "common_google_play_services_sign_in_failed_text", a2);
                case 18:
                    return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140386, a2);
                default:
                    return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140381, a2);
            }
        }
        return d(context, "common_google_play_services_restricted_profile_text", a2);
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C4021br4.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140381);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        C8965qF1 c8965qF1;
        Resources resources;
        LocaleList locales;
        C1439Lb3 c1439Lb3 = a;
        synchronized (c1439Lb3) {
            Configuration configuration = context.getResources().getConfiguration();
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                locales = configuration.getLocales();
                c8965qF1 = new C8965qF1(new C11365xF1(locales));
            } else {
                Locale[] localeArr = {configuration.locale};
                if (i >= 24) {
                    int i2 = C8965qF1.b;
                    c8965qF1 = new C8965qF1(new C11365xF1(AbstractC8622pF1.a(localeArr)));
                } else {
                    c8965qF1 = new C8965qF1(new C9650sF1(localeArr));
                }
            }
            Locale locale = c8965qF1.a.get();
            if (!locale.equals(b)) {
                c1439Lb3.clear();
                b = locale;
            }
            String str2 = (String) c1439Lb3.get(str);
            if (str2 != null) {
                return str2;
            }
            int i3 = W31.e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }
}
