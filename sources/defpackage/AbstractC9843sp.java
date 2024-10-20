package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9843sp extends R84 implements InterfaceC11215wp {
    public final AccessibilityManager l;
    public InterfaceC11558xp m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public View.OnKeyListener s;

    @Override // defpackage.C1325Kf, android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return c();
    }

    public AbstractC9843sp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.l = (AccessibilityManager) context.getSystemService("accessibility");
        addTextChangedListener(new C9500rp(this));
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        InterfaceC11558xp interfaceC11558xp = this.m;
        if (interfaceC11558xp != null) {
            interfaceC11558xp.i(i, i2);
        }
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        InterfaceC11558xp interfaceC11558xp = this.m;
        if (interfaceC11558xp != null) {
            interfaceC11558xp.a(z);
        }
        super.onFocusChanged(z, i, rect);
        if (z) {
            return;
        }
        setCursorVisible(false);
    }

    @Override // defpackage.R84, android.widget.TextView
    public boolean bringPointIntoView(int i) {
        if (this.r) {
            return false;
        }
        return super.bringPointIntoView(i);
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean onPreDraw = super.onPreDraw();
        if (!this.r) {
            return onPreDraw;
        }
        this.r = false;
        bringPointIntoView(getSelectionStart());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:            if (r0.n == false) goto L12;     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            if (r2 != 0) goto L13
            int r2 = r4 - r3
            r3 = 1
            if (r2 <= r3) goto L13
            boolean r2 = r0.p
            if (r2 != 0) goto L13
            boolean r2 = r0.n
            if (r2 != 0) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            r0.o = r3
            xp r2 = r0.m
            if (r2 == 0) goto L1d
            r2.b(r1, r4)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9843sp.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.r = false;
        C7432ln3 c = C7432ln3.c();
        try {
            super.setText(charSequence, bufferType);
            c.close();
            InterfaceC11558xp interfaceC11558xp = this.m;
            if (interfaceC11558xp != null) {
                interfaceC11558xp.g(charSequence);
            }
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.accessibility.AccessibilityEventSource, defpackage.InterfaceC11215wp
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        InterfaceC11558xp interfaceC11558xp;
        if ((this.n || ((interfaceC11558xp = this.m) != null && interfaceC11558xp.l())) && (accessibilityEvent.getEventType() == 8192 || accessibilityEvent.getEventType() == 16)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C7432ln3 c = C7432ln3.c();
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.C1325Kf, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && this.m == null) {
            return null;
        }
        if (this.m == null) {
            C7928nE c7928nE = UN.a;
            if (!AbstractC8293oI0.a() || N.M09VlOh_("SpannableInlineAutocomplete")) {
                AbstractC4851eH1.f("AutocompleteEdit", "Using spannable model...", new Object[0]);
                this.m = new C0424Dg3(this);
            } else {
                AbstractC4851eH1.f("AutocompleteEdit", "Using non-spannable model...", new Object[0]);
                this.m = new C10872vp(this);
            }
            this.m.h(true);
            this.m.a(hasFocus());
            this.m.g(getText());
            this.m.b(getText(), getText().length());
            this.m.i(getSelectionStart(), getSelectionEnd());
            if (this.o) {
                this.m.d();
            }
            this.m.h(false);
            this.m.h(this.n);
        }
        return this.m.e(onCreateInputConnection);
    }

    @Override // android.view.View
    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        this.s = onKeyListener;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View.OnKeyListener onKeyListener = this.s;
        try {
            setOnKeyListener(null);
            if (onKeyListener == null || !onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent)) {
                InterfaceC11558xp interfaceC11558xp = this.m;
                return interfaceC11558xp == null ? super.dispatchKeyEvent(keyEvent) : interfaceC11558xp.dispatchKeyEvent(keyEvent);
            }
            setOnKeyListener(onKeyListener);
            return true;
        } finally {
            setOnKeyListener(onKeyListener);
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
