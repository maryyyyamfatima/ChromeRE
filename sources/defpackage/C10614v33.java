package defpackage;

import org.chromium.content.browser.selection.SelectionPopupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v33, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10614v33 {
    public final /* synthetic */ SelectionPopupControllerImpl a;

    public final void a(C5808h33 c5808h33) {
        int i;
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.a;
        if (!selectionPopupControllerImpl.D) {
            selectionPopupControllerImpl.f11539J = null;
            return;
        }
        int i2 = c5808h33.a;
        if (i2 > 0 || (i = c5808h33.b) < 0) {
            selectionPopupControllerImpl.f11539J = null;
            selectionPopupControllerImpl.z();
            return;
        }
        selectionPopupControllerImpl.f11539J = c5808h33;
        if (i2 != 0 || i != 0) {
            selectionPopupControllerImpl.j.a0(i2, i, true);
            return;
        }
        C2493Te3 c2493Te3 = selectionPopupControllerImpl.H;
        if (c2493Te3 != null) {
            c2493Te3.d(selectionPopupControllerImpl.A, selectionPopupControllerImpl.B, c5808h33);
        }
        selectionPopupControllerImpl.z();
    }

    public C10614v33(SelectionPopupControllerImpl selectionPopupControllerImpl) {
        this.a = selectionPopupControllerImpl;
    }
}
