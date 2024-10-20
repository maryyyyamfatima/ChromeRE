package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class T73 {
    public static void a(S73 s73, String str) {
        String str2;
        if (s73.a == 2) {
            return;
        }
        StringBuilder sb = new StringBuilder("Sharing.SharingHubAndroid.");
        switch (s73.b) {
            case 0:
                str2 = "NotSpecified";
                break;
            case 1:
                str2 = "Image";
                break;
            case 2:
                str2 = "Gif";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str2 = "HighlightedText";
                break;
            case 4:
                str2 = "Screenshot";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str2 = "Webnotes";
                break;
            case 6:
                str2 = "LightweightReaction";
                break;
            default:
                str2 = "";
                break;
        }
        EI2.h(s73.a, 2, AbstractC10204ts.a(sb, str2, ".", str));
    }
}
