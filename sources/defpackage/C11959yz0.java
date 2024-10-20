package defpackage;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11959yz0 extends InputConnectionWrapper {
    public final TextView a;
    public final C11616xz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11959yz0(EditText editText, InputConnection inputConnection) {
        super(inputConnection, false);
        C11616xz0 c11616xz0 = new C11616xz0();
        this.a = editText;
        this.b = c11616xz0;
        Object obj = AbstractC7499lz0.a;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C11616xz0.a(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C11616xz0.a(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
