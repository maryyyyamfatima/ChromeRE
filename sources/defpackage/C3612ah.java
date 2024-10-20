package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3612ah implements InterfaceC0727Fp1 {
    public static final C3612ah a = new C3612ah();

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
            case 7:
                c = '\b';
                break;
            default:
                c = 0;
                break;
        }
        return c != 0;
    }
}
