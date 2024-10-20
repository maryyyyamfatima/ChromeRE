package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10525uo1 {
    public final C1157Ix1 a;
    public final HashSet b = new HashSet();

    public C10525uo1() {
        C1157Ix1 c1157Ix1;
        Context context = V60.a;
        synchronized (C1157Ix1.class) {
            Context applicationContext = context.getApplicationContext();
            C1157Ix1 c1157Ix12 = C1157Ix1.c;
            if (c1157Ix12 == null || c1157Ix12.a != applicationContext) {
                C1157Ix1.c = new C1157Ix1(applicationContext);
            }
            c1157Ix1 = C1157Ix1.c;
        }
        this.a = c1157Ix1;
    }
}
