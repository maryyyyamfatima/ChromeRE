package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class sw4 implements Runnable {
    public final /* synthetic */ Set a;
    public final /* synthetic */ C8771ph3 g;

    public sw4(C8771ph3 c8771ph3, HashSet hashSet) {
        this.g = c8771ph3;
        this.a = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                C3701av4.d(this.g.a.b((String) it.next()));
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
