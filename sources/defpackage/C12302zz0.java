package defpackage;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12302zz0 extends InputConnectionWrapper {
    public final TextView a;

    public C12302zz0(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = editText;
        C7843mz0 a = C7843mz0.a();
        if (!(a.b() == 1) || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C4749dz0 c4749dz0 = a.e;
        c4749dz0.getClass();
        Bundle bundle = editorInfo.extras;
        KW1 kw1 = c4749dz0.c.a;
        int a2 = kw1.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? kw1.b.getInt(a2 + kw1.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", c4749dz0.a.g);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return C7843mz0.c(this, this.a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return C7843mz0.c(this, this.a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
