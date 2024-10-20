package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LP2 implements InterfaceC0727Fp1 {
    public static final LP2 a = new LP2();

    @Override // defpackage.InterfaceC0727Fp1
    public final boolean a(int i) {
        char c;
        switch (i) {
            case 0:
                c = 1;
                break;
            case 1:
                c = 2;
                break;
            case 2:
                c = 3;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                c = 4;
                break;
            case 4:
                c = 5;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                c = 6;
                break;
            case 6:
                c = 7;
                break;
            default:
                c = 0;
                break;
        }
        return c != 0;
    }
}
