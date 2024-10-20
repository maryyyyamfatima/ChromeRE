package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1455Lf {
    public final EditText a;
    public final C10244tz0 b;

    public C1455Lf(EditText editText) {
        this.a = editText;
        this.b = new C10244tz0(editText);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, JG2.n, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            C2075Pz0 c2075Pz0 = this.b.a.b;
            if (c2075Pz0.h != z) {
                c2075Pz0.getClass();
                c2075Pz0.h = z;
                if (z) {
                    synchronized (AbstractC7499lz0.a) {
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        this.b.a.getClass();
        if (keyListener instanceof C0386Cz0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0386Cz0(keyListener);
    }

    public final InputConnection c(InputConnection inputConnection) {
        C10244tz0 c10244tz0 = this.b;
        if (inputConnection == null) {
            c10244tz0.getClass();
            return null;
        }
        C8873pz0 c8873pz0 = c10244tz0.a;
        c8873pz0.getClass();
        return inputConnection instanceof C11959yz0 ? inputConnection : new C11959yz0(c8873pz0.a, inputConnection);
    }
}
