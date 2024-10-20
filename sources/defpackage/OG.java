package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OG implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ TG a;

    public OG(TG tg) {
        this.a = tg;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TG tg = this.a;
        if (tg.a()) {
            ArrayList arrayList = tg.n;
            if (arrayList.size() <= 0 || ((SG) arrayList.get(0)).a.D) {
                return;
            }
            View view = tg.u;
            if (view == null || !view.isShown()) {
                tg.dismiss();
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SG) it.next()).a.b();
            }
        }
    }
}
