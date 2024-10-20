package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10186tp extends InputConnectionWrapper {
    public final char[] a;
    public final /* synthetic */ C10872vp b;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        C10872vp c10872vp = this.b;
        int i = c10872vp.c + 1;
        c10872vp.c = i;
        if (i != 1) {
            return super.beginBatchEdit();
        }
        c10872vp.d = c10872vp.a.getText().getSpanStart(c10872vp.b);
        c10872vp.e = c10872vp.a.getText().toString();
        boolean beginBatchEdit = super.beginBatchEdit();
        c10872vp.g = false;
        return beginBatchEdit;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        C10872vp c10872vp = this.b;
        Editable text = c10872vp.a.getText();
        if (text == null) {
            return super.commitText(charSequence, i);
        }
        int selectionStart = Selection.getSelectionStart(text);
        int selectionEnd = Selection.getSelectionEnd(text);
        C10529up c10529up = c10872vp.b;
        int spanStart = text.getSpanStart(c10529up);
        if (i == 1 && selectionStart > 0 && selectionStart != selectionEnd && selectionEnd >= text.length() && spanStart == selectionStart && charSequence.length() == 1) {
            int i2 = selectionStart + 1;
            char[] cArr = this.a;
            text.getChars(selectionStart, i2, cArr, 0);
            if (cArr[0] == charSequence.charAt(0)) {
                InterfaceC11215wp interfaceC11215wp = c10872vp.a;
                AccessibilityManager accessibilityManager = ((AbstractC9843sp) interfaceC11215wp).l;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16);
                    obtain.setBeforeText(text.toString().substring(0, selectionStart));
                    obtain.setFromIndex(selectionStart);
                    obtain.setRemovedCount(0);
                    obtain.setAddedCount(1);
                    interfaceC11215wp.sendAccessibilityEventUnchecked(obtain);
                }
                c10872vp.c(text.subSequence(0, i2), text.subSequence(i2, selectionEnd));
                if (c10872vp.c == 0) {
                    c10872vp.n(false, false);
                }
                return true;
            }
        }
        boolean commitText = super.commitText(charSequence, i);
        if (text.getSpanStart(c10529up) >= 0) {
            c10872vp.m();
        }
        return commitText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        String str;
        C10872vp c10872vp = this.b;
        int max = Math.max(c10872vp.c - 1, 0);
        c10872vp.c = max;
        if (max == 0) {
            boolean endBatchEdit = super.endBatchEdit();
            boolean z = c10872vp.f;
            InterfaceC11215wp interfaceC11215wp = c10872vp.a;
            if (z) {
                c10872vp.o(interfaceC11215wp.getSelectionStart(), interfaceC11215wp.getSelectionEnd());
                c10872vp.f = false;
            }
            String obj = interfaceC11215wp.getText().toString();
            if (!TextUtils.equals(c10872vp.e, obj) || interfaceC11215wp.getText().getSpanStart(c10872vp.b) != c10872vp.d) {
                if (c10872vp.f() && c10872vp.d != -1 && (str = c10872vp.e) != null && str.startsWith(obj) && !c10872vp.g && obj.length() - c10872vp.d == 1) {
                    c10872vp.c(obj, c10872vp.e.substring(obj.length()));
                }
                c10872vp.n(c10872vp.g, true);
            }
            c10872vp.g = false;
            c10872vp.d = -1;
            c10872vp.e = null;
            int selectionStart = interfaceC11215wp.getSelectionStart();
            int selectionEnd = interfaceC11215wp.getSelectionEnd();
            if (selectionStart != c10872vp.k || selectionEnd != c10872vp.l) {
                c10872vp.k = selectionStart;
                c10872vp.l = selectionEnd;
            }
            return endBatchEdit;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C10872vp c10872vp = this.b;
        Editable text = c10872vp.a.getText();
        int spanStart = text.getSpanStart(c10872vp.b);
        if (spanStart >= 0) {
            if (BaseInputConnection.getComposingSpanEnd(text) == text.length() && spanStart >= charSequence.length() && TextUtils.equals(text.subSequence(spanStart - charSequence.length(), spanStart), charSequence)) {
                setComposingRegion(spanStart - charSequence.length(), spanStart);
            }
            c10872vp.b.a();
            Selection.setSelection(text, spanStart);
            text.delete(spanStart, text.length());
        }
        return super.setComposingText(charSequence, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10186tp(C10872vp c10872vp) {
        super(null, true);
        this.b = c10872vp;
        this.a = new char[1];
    }
}
