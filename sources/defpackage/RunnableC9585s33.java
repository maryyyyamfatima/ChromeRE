package defpackage;

import android.view.ViewConfiguration;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s33 */
/* loaded from: classes2.dex */
public final class RunnableC9585s33 implements Runnable {
    public final /* synthetic */ SelectionPopupControllerImpl a;

    public RunnableC9585s33(SelectionPopupControllerImpl selectionPopupControllerImpl) {
        this.a = selectionPopupControllerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = SelectionPopupControllerImpl.N;
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.a;
        selectionPopupControllerImpl.getClass();
        long defaultActionModeHideDuration = ViewConfiguration.getDefaultActionModeHideDuration();
        selectionPopupControllerImpl.g.postDelayed(selectionPopupControllerImpl.p, defaultActionModeHideDuration - 1);
        if (selectionPopupControllerImpl.t()) {
            selectionPopupControllerImpl.r.hide(defaultActionModeHideDuration);
        }
    }
}
