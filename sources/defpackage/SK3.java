package defpackage;

import android.view.KeyEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class SK3 implements Runnable {
    public final /* synthetic */ KeyEvent a;
    public final /* synthetic */ C5561gL3 g;

    @Override // java.lang.Runnable
    public final void run() {
        C5561gL3 c5561gL3 = this.g;
        c5561gL3.getClass();
        KeyEvent keyEvent = this.a;
        int action = keyEvent.getAction();
        int unicodeChar = keyEvent.getUnicodeChar();
        boolean z = false;
        if (action == 0) {
            if (keyEvent.getKeyCode() == 67) {
                c5561gL3.i = 0;
            } else {
                if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                    int i = Integer.MAX_VALUE & unicodeChar;
                    int i2 = c5561gL3.i;
                    if (i2 == 0) {
                        c5561gL3.i = i;
                    } else if (i == i2) {
                        c5561gL3.b(i2, 0);
                    } else {
                        c5561gL3.b(i2, i);
                    }
                } else {
                    int i3 = c5561gL3.i;
                    if (i3 != 0 && unicodeChar != 0) {
                        int deadChar = KeyEvent.getDeadChar(i3, unicodeChar);
                        if (deadChar != 0) {
                            c5561gL3.b(deadChar, 0);
                        } else {
                            c5561gL3.b(c5561gL3.i, 0);
                            c5561gL3.d();
                        }
                    }
                }
                z = true;
            }
        }
        if (z) {
            return;
        }
        c5561gL3.e.q(keyEvent);
    }

    public SK3(C5561gL3 c5561gL3, KeyEvent keyEvent) {
        this.g = c5561gL3;
        this.a = keyEvent;
    }
}
