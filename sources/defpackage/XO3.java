package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.toolbar.top.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XO3 extends AbstractC10894vs3 {
    public final /* synthetic */ ToolbarControlContainer g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XO3(ToolbarControlContainer toolbarControlContainer, Context context, InterfaceC10551us3 interfaceC10551us3) {
        super(context, interfaceC10551us3);
        this.g = toolbarControlContainer;
    }

    @Override // defpackage.AbstractC10894vs3
    public final boolean b(MotionEvent motionEvent) {
        int i = ToolbarControlContainer.k;
        ToolbarControlContainer toolbarControlContainer = this.g;
        toolbarControlContainer.getClass();
        if (motionEvent.getY() <= toolbarControlContainer.g) {
            return false;
        }
        DO3 do3 = toolbarControlContainer.h;
        return (do3 == null || !((e) do3).a.U()) && !C11939yv1.g.f(toolbarControlContainer.getContext(), toolbarControlContainer);
    }
}
