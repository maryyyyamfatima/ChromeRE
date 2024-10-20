package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10221tu4 {
    public final int a;

    public C10221tu4(int i) {
        this.a = i;
    }

    public static C10221tu4 a(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 12;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            return new C10221tu4(i2);
        }
        return null;
    }

    public final String toString() {
        return Fs4.a(this.a);
    }
}
