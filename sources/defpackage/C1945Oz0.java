package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945Oz0 extends AbstractC6125hz0 {
    public final WeakReference a;

    public C1945Oz0(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.AbstractC6125hz0
    public final void a() {
        int length;
        EditText editText = (EditText) this.a.get();
        if (editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        C7843mz0 a = C7843mz0.a();
        if (editableText == null) {
            length = 0;
        } else {
            a.getClass();
            length = editableText.length();
        }
        a.f(0, length, editableText, Integer.MAX_VALUE);
        if (selectionStart >= 0 && selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionStart, selectionEnd);
        } else if (selectionStart >= 0) {
            Selection.setSelection(editableText, selectionStart);
        } else if (selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionEnd);
        }
    }
}
