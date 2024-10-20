package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class X03 {
    public static void a(int i, BitSet bitSet, String[] strArr) {
        if (bitSet != null) {
            if (bitSet.nextClearBit(0) < i) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    if (!bitSet.get(i2)) {
                        arrayList.add(strArr[i2]);
                    }
                }
                throw new IllegalStateException(AbstractC4809e90.a("The following props are not marked as optional and were not supplied: ", Arrays.toString(arrayList.toArray())));
            }
        }
    }
}
