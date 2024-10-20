package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4716dt1 {
    public static String a(int i) {
        switch (i) {
            case 1:
                return "Total";
            case 2:
                return "OmniboxFocus";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "NewTabPage";
            case 4:
                return "Startup";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "TabSwitcher";
            case 6:
                return "OpenLinkInNewTab";
            case 7:
                return "StartSurfaceHomepage";
            case 8:
                return "StartSurfaceTabSwitcher";
            default:
                throw new IllegalArgumentException("Invalid scenario value");
        }
    }
}
