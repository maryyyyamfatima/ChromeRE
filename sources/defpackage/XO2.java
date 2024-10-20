package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XO2 {
    public final ArrayList a = new ArrayList();

    public final synchronized VO2 a(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            WO2 wo2 = (WO2) this.a.get(i);
            if (wo2.a.isAssignableFrom(cls)) {
                return wo2.b;
            }
        }
        return null;
    }
}
