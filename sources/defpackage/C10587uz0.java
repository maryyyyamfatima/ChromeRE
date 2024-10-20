package defpackage;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10587uz0 {
    public final C9216qz0 a;

    public C10587uz0(EditText editText) {
        this.a = new C9216qz0(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        this.a.getClass();
        return keyListener instanceof C0516Dz0 ? keyListener : new C0516Dz0(keyListener);
    }

    public final InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        C9216qz0 c9216qz0 = this.a;
        c9216qz0.getClass();
        return inputConnection instanceof C12302zz0 ? inputConnection : new C12302zz0(c9216qz0.a, inputConnection, editorInfo);
    }
}
