package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import org.chromium.components.messages.MessageContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZU1 extends View.AccessibilityDelegate {
    public final /* synthetic */ MessageContainer a;

    public ZU1(MessageContainer messageContainer) {
        this.a = messageContainer;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        InterfaceC3891bV1 interfaceC3891bV1;
        int eventType = accessibilityEvent.getEventType();
        MessageContainer messageContainer = this.a;
        if (eventType == 32768) {
            InterfaceC3891bV1 interfaceC3891bV12 = messageContainer.g;
            if (interfaceC3891bV12 != null) {
                ((C9426rc3) interfaceC3891bV12).a.d.a();
            }
        } else if (accessibilityEvent.getEventType() == 65536 && (interfaceC3891bV1 = messageContainer.g) != null) {
            CU1 cu1 = ((C9426rc3) interfaceC3891bV1).a;
            long longValue = ((Long) cu1.e.get()).longValue();
            C10754vU1 c10754vU1 = cu1.d;
            c10754vU1.a = longValue;
            Runnable runnable = cu1.f;
            c10754vU1.b = runnable;
            c10754vU1.c.postDelayed(runnable, longValue);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
