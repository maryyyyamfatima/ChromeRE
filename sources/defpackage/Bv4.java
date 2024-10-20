package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Bv4 implements Es4 {
    public final /* synthetic */ Hs4 c;

    public /* synthetic */ Bv4(Hs4 hs4) {
        this.c = hs4;
    }

    @Override // defpackage.Es4
    public final void a(C10221tu4 c10221tu4) {
        C4394cw4 c4394cw4 = this.c.e0;
        synchronized (c4394cw4) {
            if (c10221tu4 != null) {
                Iterator it = new HashSet(c4394cw4.a).iterator();
                while (it.hasNext()) {
                    ((Es4) it.next()).a(c10221tu4);
                }
            } else {
                Log.w("YouTubeAndroidPlayerAPI", String.format("Null error", new Object[0]));
            }
        }
    }
}
