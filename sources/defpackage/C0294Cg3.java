package defpackage;

import android.text.Editable;
import android.text.style.BackgroundColorSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294Cg3 {
    public final InterfaceC11215wp a;
    public BackgroundColorSpan b;

    public C0294Cg3(InterfaceC11215wp interfaceC11215wp) {
        this.a = interfaceC11215wp;
    }

    public final void a() {
        BackgroundColorSpan backgroundColorSpan;
        InterfaceC11215wp interfaceC11215wp = this.a;
        if (interfaceC11215wp.isFocused()) {
            interfaceC11215wp.setCursorVisible(true);
        }
        Editable editableText = interfaceC11215wp.getEditableText();
        int spanStart = (editableText == null || (backgroundColorSpan = this.b) == null) ? -1 : editableText.getSpanStart(backgroundColorSpan);
        if (spanStart == -1) {
            return;
        }
        editableText.removeSpan(this.b);
        editableText.delete(spanStart, editableText.length());
        this.b = null;
    }
}
