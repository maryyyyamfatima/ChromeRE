package defpackage;

import android.view.inputmethod.InputConnection;
import org.chromium.chrome.browser.vr.VrInputConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Bi4 implements Runnable {
    public final /* synthetic */ InputConnection a;
    public final /* synthetic */ VrInputConnection g;

    public Bi4(VrInputConnection vrInputConnection, UR ur) {
        this.g = vrInputConnection;
        this.a = ur;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputConnection inputConnection = this.a;
        inputConnection.beginBatchEdit();
        CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(100, 0);
        CharSequence selectedText = inputConnection.getSelectedText(0);
        CharSequence textAfterCursor = inputConnection.getTextAfterCursor(100, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(textBeforeCursor != null ? textBeforeCursor.toString() : "");
        sb.append(selectedText != null ? selectedText.toString() : "");
        sb.append(textAfterCursor != null ? textAfterCursor.toString() : "");
        String sb2 = sb.toString();
        inputConnection.endBatchEdit();
        this.g.c.post(new Ai4(this, sb2));
    }
}
