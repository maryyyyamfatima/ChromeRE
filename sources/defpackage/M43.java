package defpackage;

import java.util.HashMap;
import org.chromium.components.content_capture.ContentCaptureFrame;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M43 extends R72 {
    public M43(C10753vU0 c10753vU0, C0108Av2 c0108Av2) {
        super(c10753vU0, c0108Av2);
    }

    @Override // defpackage.R72
    public final void r() {
        C12283zv2 c12283zv2;
        R72.p("SessionRemovedTask.removeSession");
        C0108Av2 c0108Av2 = this.i;
        HashMap a = c0108Av2.a();
        C10753vU0 c10753vU0 = this.h;
        C12283zv2 c12283zv22 = (C12283zv2) a.remove(Long.valueOf(((ContentCaptureFrame) c10753vU0.get(0)).a));
        if (c12283zv22 == null) {
            return;
        }
        ((C4043bv2) AbstractC2572Tu2.b()).getClass();
        c12283zv22.a.destroy();
        if (c10753vU0.size() <= 2) {
            c12283zv2 = c0108Av2.a;
        } else {
            c12283zv2 = (C12283zv2) c0108Av2.a().get(Long.valueOf(((ContentCaptureFrame) c10753vU0.get(1)).a));
        }
        if (c12283zv2 == null) {
            return;
        }
        ((C4043bv2) AbstractC2572Tu2.b()).getClass();
        c12283zv2.a.notifyViewDisappeared(c12283zv22.b);
    }
}
