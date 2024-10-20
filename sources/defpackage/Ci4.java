package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import org.chromium.chrome.browser.vr.keyboard.TextEditAction;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ci4 implements Runnable {
    public final /* synthetic */ InputConnection a;
    public final /* synthetic */ TextEditAction[] g;

    public Ci4(UR ur, TextEditAction[] textEditActionArr) {
        this.a = ur;
        this.g = textEditActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputConnection inputConnection = this.a;
        inputConnection.beginBatchEdit();
        for (TextEditAction textEditAction : this.g) {
            int i = textEditAction.a;
            if (i != 0) {
                int i2 = textEditAction.c;
                String str = textEditAction.b;
                if (i == 1) {
                    inputConnection.commitText(str, i2);
                } else if (i == 2) {
                    inputConnection.setComposingText(str, i2);
                } else if (i == 3) {
                    inputConnection.sendKeyEvent(new KeyEvent(0, 67));
                    inputConnection.sendKeyEvent(new KeyEvent(1, 67));
                }
            } else {
                inputConnection.setComposingText("", 1);
            }
        }
        inputConnection.endBatchEdit();
    }
}
