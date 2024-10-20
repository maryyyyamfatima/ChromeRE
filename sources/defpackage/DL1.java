package defpackage;

import java.security.InvalidParameterException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DL1 {
    public static String a(int i, String str) {
        if (i == 0) {
            return str;
        }
        if (i == 1) {
            return str.concat(".Passwords");
        }
        if (i != 2) {
            return i != 3 ? "" : str.concat(".Addresses");
        }
        return str.concat(".CreditCards");
    }

    public static void b(int i, int i2) {
        EI2.h(i2, 3, a(i, "KeyboardAccessory.AccessorySheetTriggered"));
        if (i != 0) {
            EI2.h(i2, 3, a(0, "KeyboardAccessory.AccessorySheetTriggered"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static void c(int i, boolean z) {
        if (i != 0) {
            ?? r4 = z;
            if (i != 1) {
                r4 = 2;
                if (i != 2) {
                    r4 = 3;
                    if (i != 3) {
                        if (i == 4) {
                            throw new InvalidParameterException(AbstractC9076qb1.a("Obsolete tabType: ", i));
                        }
                        r4 = 5;
                    }
                }
            }
            EI2.h(r4, 5, a(0, "KeyboardAccessory.AccessorySheetSuggestionsSelected"));
            EI2.h(r4, 5, a(i, "KeyboardAccessory.AccessorySheetSuggestionsSelected"));
            return;
        }
        throw new InvalidParameterException(AbstractC9076qb1.a("Unable to handle tabType: ", i));
    }
}
