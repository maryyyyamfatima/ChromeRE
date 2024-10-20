package defpackage;

import android.graphics.RectF;
import android.view.MotionEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rD0 */
/* loaded from: classes2.dex */
public final class C9296rD0 {
    public final C10948w20 a;

    public C9296rD0(C10948w20 c10948w20) {
        this.a = c10948w20;
    }

    public final void a(MotionEvent motionEvent, boolean z) {
        int a = WS2.a(motionEvent.getActionMasked());
        if (a == 0 || a == 9 || a == 7) {
            C10948w20 c10948w20 = this.a;
            C9897sy1 c9897sy1 = c10948w20.b.k;
            RectF rectF = c10948w20.a;
            if (c9897sy1 != null) {
                c9897sy1.A(rectF);
            }
            b(-rectF.top);
            return;
        }
        if (z) {
            if (a == 1 || a == 3 || a == 10) {
                b(0.0f);
            }
        }
    }

    public final void b(float f) {
        WebContents b;
        Tab tab = this.a.b.B;
        if (tab == null || (b = tab.b()) == null) {
            return;
        }
        EventForwarder r0 = b.r0();
        r0.c = 0.0f;
        r0.d = f;
    }
}
