package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class A04 {
    public static String a(int i) {
        switch (i) {
            case 0:
                return "All";
            case 1:
                return "OfflinePage";
            case 2:
                return "Video";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "Audio";
            case 4:
                return "Image";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "Document";
            case 6:
                return "Other";
            case 7:
                return "PrefetchedOfflinePage";
            default:
                return "Invalid";
        }
    }

    public static void b(int i) {
        String str;
        switch (i) {
            case 0:
                str = "Open";
                break;
            case 1:
                str = "Resume";
                break;
            case 2:
                str = "Pause";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "Cancel";
                break;
            case 4:
                str = "MenuShare";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str = "MenuDelete";
                break;
            case 6:
                str = "Retry";
                break;
            case 7:
                str = "MenuRename";
                break;
            case 8:
                str = "MenuChange";
                break;
            default:
                return;
        }
        EI2.h(i, 9, "Android.DownloadManager.List.View.Action");
        FI2.a("Android.DownloadManager.List.View.Action.".concat(str));
    }
}
