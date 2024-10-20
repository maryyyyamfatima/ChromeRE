package defpackage;

import J.N;
import android.content.Intent;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u33 */
/* loaded from: classes2.dex */
public final class C10271u33 implements InterfaceC4352cp4 {
    public final /* synthetic */ SelectionPopupControllerImpl a;

    public C10271u33(SelectionPopupControllerImpl selectionPopupControllerImpl) {
        this.a = selectionPopupControllerImpl;
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        CharSequence charSequenceExtra;
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.a;
        WebContentsImpl webContentsImpl = selectionPopupControllerImpl.j;
        if (webContentsImpl == null || i != -1 || intent == null || !selectionPopupControllerImpl.D || !selectionPopupControllerImpl.v || (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.PROCESS_TEXT")) == null) {
            return;
        }
        String charSequence = charSequenceExtra.toString();
        webContentsImpl.q();
        N.MevqfbP8(webContentsImpl.g, charSequence);
    }
}
