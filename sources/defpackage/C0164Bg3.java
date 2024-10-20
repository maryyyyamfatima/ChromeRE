package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164Bg3 extends InputConnectionWrapper {
    public final C1505Lp a;
    public final /* synthetic */ C0424Dg3 b;

    public final boolean b() {
        C0424Dg3 c0424Dg3 = this.b;
        c0424Dg3.i--;
        boolean endBatchEdit = super.endBatchEdit();
        if (c0424Dg3.i == 0) {
            c0424Dg3.n();
        }
        return endBatchEdit;
    }

    public final boolean c() {
        this.b.i++;
        return super.beginBatchEdit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:            if (r7.d() != false) goto L76;     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0164Bg3.e():boolean");
    }

    public final void a() {
        C0424Dg3 c0424Dg3 = this.b;
        if (c0424Dg3.b.c()) {
            C1505Lp c1505Lp = c0424Dg3.b;
            String str = c1505Lp.b;
            c1505Lp.a += c1505Lp.b;
            c1505Lp.b = "";
            c0424Dg3.d.a(c1505Lp);
            c0424Dg3.g = false;
            if (c0424Dg3.i != 0) {
                c0424Dg3.a.append(str);
                return;
            }
            c();
            C0294Cg3 c0294Cg3 = c0424Dg3.e;
            c0294Cg3.a.getEditableText().removeSpan(c0294Cg3.b);
            InterfaceC11215wp interfaceC11215wp = c0294Cg3.a;
            if (interfaceC11215wp.isFocused()) {
                interfaceC11215wp.setCursorVisible(true);
            }
            b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164Bg3(C0424Dg3 c0424Dg3) {
        super(null, true);
        this.b = c0424Dg3;
        this.a = new C1505Lp(c0424Dg3.b);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        d();
        c();
        return e();
    }

    public final void d() {
        c();
        C0424Dg3 c0424Dg3 = this.b;
        if (c0424Dg3.i == 1) {
            this.a.a(c0424Dg3.b);
        } else if (c0424Dg3.j > 0) {
            InterfaceC11215wp interfaceC11215wp = c0424Dg3.a;
            int length = interfaceC11215wp.getText().length();
            interfaceC11215wp.getText().delete(length - c0424Dg3.j, length);
        }
        c0424Dg3.j = 0;
        c0424Dg3.e.a();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        d();
        b();
        return e();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        d();
        boolean commitText = super.commitText(charSequence, i);
        e();
        return commitText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        d();
        boolean composingText = super.setComposingText(charSequence, i);
        e();
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        d();
        boolean composingRegion = super.setComposingRegion(i, i2);
        e();
        return composingRegion;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        d();
        boolean finishComposingText = super.finishComposingText();
        e();
        return finishComposingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        d();
        boolean deleteSurroundingText = super.deleteSurroundingText(i, i2);
        e();
        return deleteSurroundingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        d();
        boolean selection = super.setSelection(i, i2);
        e();
        return selection;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        d();
        a();
        boolean performEditorAction = super.performEditorAction(i);
        e();
        return performEditorAction;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        d();
        boolean sendKeyEvent = super.sendKeyEvent(keyEvent);
        e();
        return sendKeyEvent;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        d();
        ExtractedText extractedText = super.getExtractedText(extractedTextRequest, i);
        e();
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        d();
        CharSequence textAfterCursor = super.getTextAfterCursor(i, i2);
        e();
        return textAfterCursor;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        d();
        CharSequence textBeforeCursor = super.getTextBeforeCursor(i, i2);
        e();
        return textBeforeCursor;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        d();
        CharSequence selectedText = super.getSelectedText(i);
        e();
        return selectedText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        d();
        boolean commitCompletion = super.commitCompletion(completionInfo);
        e();
        return commitCompletion;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        d();
        boolean commitContent = super.commitContent(inputContentInfo, i, bundle);
        e();
        return commitContent;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        d();
        boolean commitCorrection = super.commitCorrection(correctionInfo);
        e();
        return commitCorrection;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        d();
        boolean deleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i, i2);
        e();
        return deleteSurroundingTextInCodePoints;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        d();
        int cursorCapsMode = super.getCursorCapsMode(i);
        e();
        return cursorCapsMode;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        d();
        boolean requestCursorUpdates = super.requestCursorUpdates(i);
        e();
        return requestCursorUpdates;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        d();
        boolean clearMetaKeyStates = super.clearMetaKeyStates(i);
        e();
        return clearMetaKeyStates;
    }
}
