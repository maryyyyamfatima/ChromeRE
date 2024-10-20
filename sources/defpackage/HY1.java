package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HY1 extends RuntimeException {
    public final int a;

    public HY1(int i) {
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MojoResult(");
        int i = this.a;
        sb.append(i);
        sb.append("): ");
        switch (i) {
            case 0:
                str = "OK";
                break;
            case 1:
                str = "CANCELLED";
                break;
            case 2:
            default:
                str = "UNKNOWN";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "INVALID_ARGUMENT";
                break;
            case 4:
                str = "DEADLINE_EXCEEDED";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str = "NOT_FOUND";
                break;
            case 6:
                str = "ALREADY_EXISTS";
                break;
            case 7:
                str = "PERMISSION_DENIED";
                break;
            case 8:
                str = "RESOURCE_EXHAUSTED";
                break;
            case 9:
                str = "FAILED_PRECONDITION";
                break;
            case 10:
                str = "ABORTED";
                break;
            case 11:
                str = "OUT_OF_RANGE";
                break;
            case 12:
                str = "UNIMPLEMENTED";
                break;
            case 13:
                str = "INTERNAL";
                break;
            case 14:
                str = "UNAVAILABLE";
                break;
            case 15:
                str = "DATA_LOSS";
                break;
            case 16:
                str = "BUSY";
                break;
            case 17:
                str = "SHOULD_WAIT";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
