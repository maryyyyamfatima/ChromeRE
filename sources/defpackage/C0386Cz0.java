package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386Cz0 implements KeyListener {
    public final KeyListener a;
    public final C0256Bz0 b;

    public C0386Cz0(KeyListener keyListener) {
        C0256Bz0 c0256Bz0 = new C0256Bz0();
        this.a = keyListener;
        this.b = c0256Bz0;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean a;
        boolean z;
        this.b.getClass();
        Object obj = AbstractC7499lz0.a;
        if (i == 67) {
            a = AbstractC1036Hz0.a(editable, keyEvent, false);
        } else {
            a = i != 112 ? false : AbstractC1036Hz0.a(editable, keyEvent, true);
        }
        if (a) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }
}
