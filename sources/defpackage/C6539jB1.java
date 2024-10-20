package defpackage;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jB1 */
/* loaded from: classes.dex */
public final class C6539jB1 {
    public final /* synthetic */ C7227lB1 a;

    public final void a(Callback callback) {
        ZV2 zv2 = this.a.o;
        zv2.getClass();
        HashSet hashSet = zv2.c;
        AtomicInteger atomicInteger = new AtomicInteger(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C9661sH2 c9661sH2 = ((ReactionLayout) it.next()).k;
            WV2 wv2 = new WV2(atomicInteger, callback);
            if (c9661sH2.h0 == null) {
                c9661sH2.h0 = wv2;
                boolean z = c9661sH2.g0;
                if (!z) {
                    c9661sH2.g0 = true;
                    c9661sH2.stop();
                    Handler handler = RunnableC4383cv.e0;
                    handler.sendMessage(handler.obtainMessage(12, c9661sH2));
                }
                if (c9661sH2.i0 && !z) {
                    c9661sH2.j0 = true;
                } else {
                    c9661sH2.run();
                }
            }
        }
    }

    public C6539jB1(C7227lB1 c7227lB1) {
        this.a = c7227lB1;
    }
}
