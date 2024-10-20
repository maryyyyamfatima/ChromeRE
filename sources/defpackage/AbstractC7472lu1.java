package defpackage;

import android.view.KeyEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7472lu1 {
    public static boolean a(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160;
    }

    public static boolean b(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 20) {
                return true;
            }
            if (!keyEvent.isNumLockOn() && keyEvent.getKeyCode() == 146) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return true;
            }
            if (!keyEvent.isNumLockOn() && keyEvent.getKeyCode() == 148) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 22) {
                return true;
            }
            if (!keyEvent.isNumLockOn() && keyEvent.getKeyCode() == 150) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 19) {
                return true;
            }
            if (!keyEvent.isNumLockOn() && keyEvent.getKeyCode() == 152) {
                return true;
            }
        }
        return false;
    }
}
