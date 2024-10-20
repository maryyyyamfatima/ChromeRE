package defpackage;

import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RG implements InterfaceC5599gT1 {
    public final /* synthetic */ TG a;

    public RG(TG tg) {
        this.a = tg;
    }

    @Override // defpackage.InterfaceC5599gT1
    public final void h(BS1 bs1, MenuItem menuItem) {
        this.a.l.removeCallbacksAndMessages(bs1);
    }

    @Override // defpackage.InterfaceC5599gT1
    public final void l(BS1 bs1, C6287iT1 c6287iT1) {
        TG tg = this.a;
        tg.l.removeCallbacksAndMessages(null);
        ArrayList arrayList = tg.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (bs1 == ((SG) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        tg.l.postAtTime(new QG(this, i2 < arrayList.size() ? (SG) arrayList.get(i2) : null, c6287iT1, bs1), bs1, SystemClock.uptimeMillis() + 200);
    }
}
