package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class UT0 {
    public static final C3541aU0 a = new C3541aU0();
    public static final AbstractC4228cU0 b;

    static {
        AbstractC4228cU0 abstractC4228cU0;
        try {
            abstractC4228cU0 = (AbstractC4228cU0) C6633jU0.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC4228cU0 = null;
        }
        b = abstractC4228cU0;
    }

    public static void a(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
