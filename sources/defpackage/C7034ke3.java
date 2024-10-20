package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.style.ForegroundColorSpan;
import androidx.preference.Preference;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ke3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7034ke3 {
    public final BrowserContextHandle a;
    public final int b;
    public final String c;

    public static int b(int i) {
        switch (i) {
            case 1:
                return 25;
            case 2:
                return 57;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 12;
            case 4:
                return 21;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 43;
            case 6:
                return 9;
            case 7:
                return 53;
            case 8:
                return 0;
            case 9:
                return 4;
            case 10:
                return 38;
            case 11:
                return 2;
            case 12:
                return 8;
            case 13:
                return 51;
            case 14:
                return 5;
            case 15:
                return 3;
            case 16:
                return 15;
            case 17:
                return 32;
            case 18:
                return 30;
            case 19:
                return 35;
            case 20:
                return 20;
            case 21:
                return 56;
            case 22:
            default:
                return -1;
            case 23:
                return 73;
            case 24:
                return 74;
            case 25:
                return 75;
        }
    }

    public static String m(int i) {
        switch (i) {
            case 0:
                return "all_sites";
            case 1:
                return "ads";
            case 2:
                return "augmented_reality";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "automatic_downloads";
            case 4:
                return "background_sync";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "bluetooth_scanning";
            case 6:
                return "camera";
            case 7:
                return "clipboard";
            case 8:
                return "cookies";
            case 9:
                return "device_location";
            case 10:
                return "idle_detection";
            case 11:
                return "javascript";
            case 12:
                return "microphone";
            case 13:
                return "nfc";
            case 14:
                return "notifications";
            case 15:
                return "popups";
            case 16:
                return "protected_content";
            case 17:
                return "sensors";
            case 18:
                return "sound";
            case 19:
                return "usb";
            case 20:
                return "bluetooth";
            case 21:
                return "virtual_reality";
            case 22:
                return "use_storage";
            case 23:
                return "auto_dark_web_content";
            case 24:
                return "request_desktop_site";
            case 25:
                return "federated_identity_api";
            default:
                return "";
        }
    }

    public boolean e() {
        return true;
    }

    public Intent h() {
        return null;
    }

    public String i(Context context) {
        return null;
    }

    public String j(Context context) {
        return null;
    }

    public boolean p() {
        return true;
    }

    public C7034ke3(int i, String str, Profile profile) {
        this.a = profile;
        this.b = i;
        this.c = str;
    }

    public static C7034ke3 c(Profile profile, int i) {
        String str;
        if (i == 9) {
            return new C7596mG1(profile);
        }
        if (i == 13) {
            return new C4781e42(profile);
        }
        if (i == 14) {
            return new C6511j62(profile);
        }
        if (i != 6) {
            if (i == 12) {
                str = "android.permission.RECORD_AUDIO";
            } else if (i != 2) {
                str = "";
            }
            return new C7034ke3(i, str, profile);
        }
        str = "android.permission.CAMERA";
        return new C7034ke3(i, str, profile);
    }

    public final int f() {
        return b(this.b);
    }

    public final boolean o(int i) {
        return i == this.b;
    }

    public final boolean k() {
        boolean o = o(3);
        BrowserContextHandle browserContextHandle = this.a;
        if (!o && !o(4) && !o(11) && !o(15)) {
            if (o(8) || o(9) || o(6) || o(12)) {
                return !N.MB23OvTV(browserContextHandle, f());
            }
            return false;
        }
        return N.MnAiqOhu(browserContextHandle, f());
    }

    public final boolean l() {
        if (!o(8) && !o(9) && !o(6) && !o(12)) {
            return false;
        }
        return N.M1hZJgqW(this.a, f());
    }

    public static Drawable g(Context context) {
        Drawable c = AbstractC9771sd.c(context.getResources(), R.drawable.f46320_resource_name_obfuscated_res_0x7f090178, 0);
        c.mutate();
        c.setColorFilter(AbstractC10957w33.b(context), PorterDuff.Mode.SRC_IN);
        return c;
    }

    public final boolean d(Context context) {
        String str = this.c;
        return str.isEmpty() || AbstractC9771sd.a(Process.myPid(), Process.myUid(), context, str) == 0;
    }

    public boolean n(Context context) {
        return (d(context) && e()) ? false : true;
    }

    public final void a(Preference preference, Preference preference2, Context context, boolean z, String str) {
        Intent intent;
        if (d(context)) {
            intent = null;
        } else {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(new Uri.Builder().scheme("package").opaquePart(context.getPackageName()).build());
        }
        Intent h = h();
        boolean z2 = !z;
        int f = f();
        int i = f == 4 ? R.string.f67510_resource_name_obfuscated_res_0x7f1401e4 : f == 8 ? R.string.f67520_resource_name_obfuscated_res_0x7f1401e5 : f == 9 ? R.string.f67460_resource_name_obfuscated_res_0x7f1401df : f == 57 ? R.string.f67450_resource_name_obfuscated_res_0x7f1401de : f == 5 ? R.string.f67550_resource_name_obfuscated_res_0x7f1401e8 : R.string.f67580_resource_name_obfuscated_res_0x7f1401eb;
        Resources resources = context.getResources();
        if (z2) {
            i = R.string.f67590_resource_name_obfuscated_res_0x7f1401ec;
        }
        String string = resources.getString(i, str);
        String i2 = i(context);
        String j = j(context);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AbstractC10957w33.b(context));
        if (intent != null) {
            preference.R(AbstractC9108qg3.a(string, new C8765pg3(foregroundColorSpan, "<link>", "</link>")));
            preference.r = intent;
            if (!z) {
                preference.J(g(context));
            }
        }
        if (!p()) {
            preference2.R(j);
            preference2.J(g(context));
        } else if (h != null) {
            preference2.R(AbstractC9108qg3.a(i2, new C8765pg3(foregroundColorSpan, "<link>", "</link>")));
            preference2.r = h;
            if (z) {
                return;
            }
            if (intent == null) {
                preference2.J(g(context));
            } else {
                preference2.J(new ColorDrawable(0));
            }
        }
    }
}
