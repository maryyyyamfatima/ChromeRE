package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: La0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431La0 {
    public static final C1431La0 b = new C1431La0();
    public final Q83 a = O83.a;

    public static String b(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -430201629:
                if (str.equals("Renderer")) {
                    c = 0;
                    break;
                }
                break;
            case 70796:
                if (str.equals("GPU")) {
                    c = 1;
                    break;
                }
                break;
            case 76517104:
                if (str.equals("Other")) {
                    c = 2;
                    break;
                }
                break;
            case 1815593736:
                if (str.equals("Browser")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "renderer_crash_success_upload";
            case 1:
                return "gpu_crash_success_upload";
            case 2:
                return "other_crash_success_upload";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "browser_crash_success_upload";
            default:
                throw new IllegalArgumentException("Process type unknown: ".concat(str));
        }
    }

    public static String a(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -430201629:
                if (str.equals("Renderer")) {
                    c = 0;
                    break;
                }
                break;
            case 70796:
                if (str.equals("GPU")) {
                    c = 1;
                    break;
                }
                break;
            case 76517104:
                if (str.equals("Other")) {
                    c = 2;
                    break;
                }
                break;
            case 1815593736:
                if (str.equals("Browser")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "renderer_crash_failure_upload";
            case 1:
                return "gpu_crash_failure_upload";
            case 2:
                return "other_crash_failure_upload";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "browser_crash_failure_upload";
            default:
                throw new IllegalArgumentException("Process type unknown: ".concat(str));
        }
    }
}
