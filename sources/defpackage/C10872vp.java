package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputConnection;
import org.chromium.chrome.browser.omnibox.UrlBarApi26;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10872vp implements InterfaceC11558xp {
    public final InterfaceC11215wp a;
    public int c;
    public String e;
    public boolean f;
    public boolean g;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int d = -1;
    public boolean h = true;
    public final C10186tp m = new C10186tp(this);
    public final C10529up b = new C10529up(this);

    @Override // defpackage.InterfaceC11558xp
    public final boolean l() {
        return false;
    }

    public C10872vp(InterfaceC11215wp interfaceC11215wp) {
        this.a = interfaceC11215wp;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void h(boolean z) {
        this.h = z;
    }

    @Override // defpackage.InterfaceC11558xp
    public final String j() {
        return this.a.getText().toString();
    }

    @Override // defpackage.InterfaceC11558xp
    public final String k() {
        int spanStart = this.a.getText().getSpanStart(this.b);
        if (spanStart < 0) {
            return j();
        }
        return j().substring(0, spanStart);
    }

    @Override // defpackage.InterfaceC11558xp
    public final boolean f() {
        if (this.i) {
            return false;
        }
        InterfaceC11215wp interfaceC11215wp = this.a;
        Editable text = interfaceC11215wp.getText();
        int selectionStart = interfaceC11215wp.getSelectionStart();
        int selectionEnd = interfaceC11215wp.getSelectionEnd();
        int spanStart = interfaceC11215wp.getText().getSpanStart(this.b);
        int length = interfaceC11215wp.getText().length();
        if (spanStart < 0) {
            spanStart = length;
        }
        return (selectionStart == spanStart && selectionEnd == length) && !this.j && this.c == 0 && BaseInputConnection.getComposingSpanEnd(text) == BaseInputConnection.getComposingSpanStart(text);
    }

    @Override // defpackage.InterfaceC11558xp
    public final void i(int i, int i2) {
        if (this.c == 0) {
            InterfaceC11215wp interfaceC11215wp = this.a;
            int length = interfaceC11215wp.getText().length();
            if (o(i, i2)) {
                n(interfaceC11215wp.getText().length() < length, false);
            }
            int selectionStart = interfaceC11215wp.getSelectionStart();
            int selectionEnd = interfaceC11215wp.getSelectionEnd();
            if (selectionStart == this.k && selectionEnd == this.l) {
                return;
            }
            this.k = selectionStart;
            this.l = selectionEnd;
            return;
        }
        this.f = true;
    }

    public final boolean o(int i, int i2) {
        Editable text = this.a.getText();
        C10529up c10529up = this.b;
        int spanStart = text.getSpanStart(c10529up);
        int spanEnd = text.getSpanEnd(c10529up);
        if (spanStart < 0) {
            return false;
        }
        if (spanStart == i && spanEnd == i2) {
            return false;
        }
        CharSequence charSequence = c10529up.b;
        c10529up.a();
        if (i2 > spanStart || !TextUtils.equals(charSequence, text.subSequence(spanStart, text.length()))) {
            return true;
        }
        text.delete(spanStart, text.length());
        return true;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void a(boolean z) {
        if (z) {
            return;
        }
        this.b.a();
    }

    @Override // defpackage.InterfaceC11558xp
    public final void c(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        String j = j();
        CharSequence concat = TextUtils.concat(charSequence, charSequence2);
        this.h = true;
        boolean equals = TextUtils.equals(j, concat);
        InterfaceC11215wp interfaceC11215wp = this.a;
        if (!equals) {
            if (TextUtils.indexOf(concat, j) == 0) {
                interfaceC11215wp.append(concat.subSequence(j.length(), concat.length()));
            } else {
                ((UrlBarApi26) interfaceC11215wp).setText(concat.toString());
            }
        }
        if (interfaceC11215wp.getSelectionStart() != length || interfaceC11215wp.getSelectionEnd() != interfaceC11215wp.getText().length()) {
            interfaceC11215wp.setSelection(length, interfaceC11215wp.getText().length());
            if (charSequence2.length() != 0) {
                interfaceC11215wp.announceForAccessibility(charSequence2);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        C10529up c10529up = this.b;
        if (isEmpty) {
            c10529up.a();
        } else {
            Editable text = c10529up.c.a.getText();
            text.removeSpan(c10529up);
            c10529up.b = charSequence2;
            c10529up.a = charSequence;
            text.setSpan(c10529up, charSequence.length(), text.length(), 33);
        }
        this.h = false;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void b(CharSequence charSequence, int i) {
        boolean z = i == 0;
        if (this.c == 0) {
            n(z, true);
        } else {
            AbstractC4851eH1.f("AutocompleteModel", "onTextChanged: in batch edit", new Object[0]);
            this.g = z;
        }
        this.j = false;
    }

    public final void m() {
        InterfaceC11215wp interfaceC11215wp = this.a;
        Editable editableText = interfaceC11215wp.getEditableText();
        C10529up c10529up = this.b;
        CharSequence charSequence = c10529up.a;
        CharSequence charSequence2 = c10529up.b;
        if (editableText.length() != charSequence2.length() + charSequence.length()) {
            c10529up.a();
        } else {
            if (TextUtils.indexOf(interfaceC11215wp.getText(), charSequence) == 0 && TextUtils.indexOf(interfaceC11215wp.getText(), charSequence2, charSequence.length()) == 0) {
                return;
            }
            c10529up.a();
        }
    }

    @Override // defpackage.InterfaceC11558xp
    public final InputConnection e(InputConnection inputConnection) {
        InterfaceC11215wp interfaceC11215wp = this.a;
        this.k = interfaceC11215wp.getSelectionStart();
        this.l = interfaceC11215wp.getSelectionEnd();
        this.c = 0;
        C10186tp c10186tp = this.m;
        c10186tp.setTarget(inputConnection);
        return c10186tp;
    }

    public final void n(boolean z, boolean z2) {
        if (this.h) {
            AbstractC4851eH1.f("AutocompleteModel", "notification ignored", new Object[0]);
            return;
        }
        this.i = z;
        InterfaceC11215wp interfaceC11215wp = this.a;
        ((UrlBarApi26) interfaceC11215wp).j(z2);
        if (z) {
            interfaceC11215wp.setSelection(interfaceC11215wp.getSelectionStart(), interfaceC11215wp.getSelectionStart());
        }
    }

    @Override // defpackage.InterfaceC11558xp
    public final void d() {
        this.j = true;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void g(CharSequence charSequence) {
        C10529up c10529up = this.b;
        if (c10529up.a == null || c10529up.b == null) {
            return;
        }
        if (this.a.getText().getSpanStart(c10529up) < 0) {
            c10529up.a();
        } else {
            m();
        }
    }

    @Override // defpackage.InterfaceC11558xp
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ((AbstractC9843sp) this.a).d(keyEvent);
    }
}
