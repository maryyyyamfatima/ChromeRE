package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gl4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5703gl4 {
    public static void a(int i) {
        boolean z;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
                z = true;
                break;
            case 7:
            case 26:
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new C12221zl0("Invalid enum value.");
        }
    }
}
