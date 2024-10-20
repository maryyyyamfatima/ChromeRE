package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.math.RoundingMode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Do1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0462Do1 {
    public static int a(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC9307rF1.a("x (", i, ") must be > 0"));
        }
        switch (AbstractC0332Co1.a[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                break;
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
