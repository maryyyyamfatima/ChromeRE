package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5390fr extends View.AccessibilityDelegate {
    public final /* synthetic */ C5734gr a;

    public C5390fr(C5734gr c5734gr) {
        this.a = c5734gr;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C5734gr c5734gr = this.a;
        ListView d = c5734gr.a.d();
        RunnableC5046er runnableC5046er = c5734gr.j;
        d.removeCallbacks(runnableC5046er);
        if (accessibilityEvent.getEventType() == 65536) {
            c5734gr.a.d().postDelayed(runnableC5046er, 100L);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
