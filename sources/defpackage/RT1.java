package defpackage;

import android.os.Handler;
import android.util.Pair;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RT1 {
    public final InterfaceC4578dV1 a;
    public final WT1 b;
    public final InterfaceC7697ma2 c;
    public final Handler d = new Handler(ThreadUtils.c());
    public Pair e;

    public RT1(InterfaceC4578dV1 interfaceC4578dV1, WT1 wt1, C6166i6 c6166i6) {
        this.a = interfaceC4578dV1;
        this.b = wt1;
        this.c = c6166i6;
    }

    public final void a(int i) {
        Object obj;
        this.d.removeCallbacksAndMessages(null);
        Pair pair = this.e;
        if (pair != null && (obj = pair.second) != null) {
            ((C5265fV1) this.a).a(8, (PropertyModel) obj);
        }
        b(i);
    }

    public final void b(int i) {
        if (this.e != null) {
            WT1 wt1 = this.b;
            wt1.d();
            EI2.h(i, 5, "MerchantTrust.Message.ClearReason");
            wt1.a = false;
            wt1.b = false;
            wt1.c = 0L;
            wt1.d = 0L;
        }
        synchronized (this.d) {
            this.e = null;
        }
    }
}
