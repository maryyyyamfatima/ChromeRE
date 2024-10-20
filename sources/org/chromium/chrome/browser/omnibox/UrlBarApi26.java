package org.chromium.chrome.browser.omnibox;

import J.N;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.AbstractC10761vV3;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC7712md;
import defpackage.AbstractC9843sp;
import defpackage.C1415Kx;
import defpackage.C6153i34;
import defpackage.C7183l34;
import defpackage.FI2;
import defpackage.InterfaceC11558xp;
import defpackage.InterfaceC3403a34;
import defpackage.InterfaceC3747b34;
import defpackage.InterfaceC4090c34;
import defpackage.N63;
import defpackage.V60;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC10224tv1;
import defpackage.W24;
import defpackage.X24;
import defpackage.Y24;
import defpackage.Z24;
import java.net.MalformedURLException;
import java.net.URL;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UrlBarApi26 extends AbstractC9843sp {
    public final GestureDetector A;
    public final ViewTreeObserverOnGlobalLayoutListenerC10224tv1 B;
    public boolean C;
    public boolean D;
    public MotionEvent E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public String f11526J;
    public int K;
    public int L;
    public float M;
    public boolean N;
    public boolean O;
    public final int[] P;
    public float Q;
    public int R;
    public int S;
    public CharSequence T;
    public boolean U;
    public boolean t;
    public int u;
    public InterfaceC3403a34 v;
    public InterfaceC4090c34 w;
    public TextWatcher x;
    public InterfaceC3747b34 y;
    public Callback z;

    @Override // android.view.View
    public final void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.U = true;
        super.onProvideAutofillStructure(viewStructure, i);
        this.U = false;
    }

    @Override // android.widget.TextView, android.view.View
    public final int getAutofillType() {
        if (Build.VERSION.SDK_INT >= 29) {
            return 0;
        }
        return super.getAutofillType();
    }

    public final void w(boolean z) {
        this.n = z;
        InterfaceC11558xp interfaceC11558xp = this.m;
        if (interfaceC11558xp != null) {
            interfaceC11558xp.h(z);
        }
    }

    public UrlBarApi26(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = true;
        this.P = new int[2];
        this.u = 3;
        setFocusable(false);
        setFocusableInTouchMode(false);
        setInputType(524305);
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if (string != null && string.contains("com.htc.android.htcime")) {
            setInputType(getInputType() | 176);
        }
        GestureDetector gestureDetector = new GestureDetector(getContext(), new W24(this), ThreadUtils.b());
        this.A = gestureDetector;
        gestureDetector.setOnDoubleTapListener(null);
        this.B = new ViewTreeObserverOnGlobalLayoutListenerC10224tv1(this, new X24(this));
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7712md.a(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (4 == i && keyEvent.getAction() == 1) {
            ViewTreeObserverOnGlobalLayoutListenerC10224tv1 viewTreeObserverOnGlobalLayoutListenerC10224tv1 = this.B;
            viewTreeObserverOnGlobalLayoutListenerC10224tv1.b();
            View view = viewTreeObserverOnGlobalLayoutListenerC10224tv1.a;
            if (view.getResources().getConfiguration().keyboard != 2) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC10224tv1);
                viewTreeObserverOnGlobalLayoutListenerC10224tv1.k = true;
                viewTreeObserverOnGlobalLayoutListenerC10224tv1.l = viewTreeObserverOnGlobalLayoutListenerC10224tv1.a();
                view.postDelayed(viewTreeObserverOnGlobalLayoutListenerC10224tv1.h, 1000L);
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // defpackage.AbstractC9843sp, android.widget.TextView, android.view.View
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        this.C = z;
        super.onFocusChanged(z, i, rect);
        if (z) {
            this.G = false;
        }
        if (this.C || length() == 0) {
            setTextDirection(0);
        } else {
            setTextDirection(3);
        }
        setTextAlignment(2);
    }

    @Override // android.view.View
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setPrivateImeOptions("restrictDirectWritingArea=true");
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && isFocused()) {
            post(new Y24(this));
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final View focusSearch(int i) {
        InterfaceC3403a34 interfaceC3403a34 = this.v;
        if (interfaceC3403a34 != null && i == 1 && interfaceC3403a34.f() != null) {
            return this.v.f();
        }
        return super.focusSearch(i);
    }

    @Override // defpackage.AbstractC9843sp, android.widget.TextView
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AutofillManager autofillManager;
        super.onTextChanged(charSequence, i, i2, i3);
        if (Build.VERSION.SDK_INT < 29 || (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) == null) {
            return;
        }
        autofillManager.notifyValueChanged(this);
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            getLocationInWindow(this.P);
            this.Q = r1[1];
            this.D = !this.C;
        }
        if (!this.C) {
            if (motionEvent.getActionMasked() == 0) {
                this.E = MotionEvent.obtain(motionEvent);
            }
            this.A.onTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.E = null;
        }
        if (this.D && motionEvent.getActionMasked() == 2) {
            return true;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException e) {
            AbstractC4851eH1.f("UrlBar", "Ignoring IndexOutOfBoundsException in UrlBar#onTouchEvent.", e);
            return true;
        } catch (NullPointerException e2) {
            if (Build.VERSION.SDK_INT >= 24) {
                throw e2;
            }
            AbstractC4851eH1.f("UrlBar", "Ignoring NPE in UrlBar#onTouchEvent.", e2);
            return true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final boolean performLongClick() {
        int[] iArr = this.P;
        getLocationInWindow(iArr);
        if (!(this.Q == ((float) iArr[1]))) {
            return false;
        }
        MotionEvent motionEvent = this.E;
        if (motionEvent != null) {
            super.onTouchEvent(motionEvent);
            this.E = null;
        }
        return super.performLongClick();
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (!this.t) {
            this.t = true;
            setFocusable(this.F);
            setFocusableInTouchMode(this.F);
        }
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        if (length() == 0) {
            i = 3;
        } else {
            i = layout.getParagraphDirection(0) == 1 ? 0 : 1;
        }
        if (i != this.u) {
            this.u = i;
            Callback callback = this.z;
            if (callback != null) {
                callback.onResult(Integer.valueOf(i));
            }
            if (isLayoutRequested()) {
                this.G = this.S != 0;
            } else {
                v(this.S);
            }
        }
    }

    @Override // defpackage.C1325Kf, android.widget.EditText, android.widget.TextView
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean onTextContextMenuItem(int i) {
        int indexOf;
        int indexOf2;
        if (this.y == null) {
            return super.onTextContextMenuItem(i);
        }
        int i2 = 0;
        String str = null;
        if (i == 16908322) {
            Context context = V60.a;
            ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < primaryClip.getItemCount(); i3++) {
                    sb.append(primaryClip.getItemAt(i3).coerceToText(context));
                }
                str = N.M14CHwRm(sb.toString());
            }
            if (str != null) {
                int length = getText().length();
                if (isFocused()) {
                    int selectionStart = getSelectionStart();
                    int selectionEnd = getSelectionEnd();
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    length = Math.max(0, Math.max(selectionStart, selectionEnd));
                    i2 = max;
                }
                Selection.setSelection(getText(), length);
                getText().replace(i2, length, str);
                this.o = true;
                InterfaceC11558xp interfaceC11558xp = this.m;
                if (interfaceC11558xp != null) {
                    interfaceC11558xp.d();
                }
            }
            return true;
        }
        if (i == 16908320 || i == 16908321) {
            if (i == 16908320) {
                FI2.a("Omnibox.LongPress.Cut");
            } else {
                FI2.a("Omnibox.LongPress.Copy");
            }
            String obj = getText().toString();
            InterfaceC3747b34 interfaceC3747b34 = this.y;
            int selectionStart2 = getSelectionStart();
            int selectionEnd2 = getSelectionEnd();
            C7183l34 c7183l34 = (C7183l34) interfaceC3747b34;
            C6153i34 c6153i34 = c7183l34.i;
            if (c6153i34 != null && c6153i34.a != null && selectionStart2 == 0) {
                String substring = obj.substring(selectionStart2, selectionEnd2);
                try {
                    URL url = new URL(c7183l34.i.a);
                    C6153i34 c6153i342 = c7183l34.i;
                    CharSequence charSequence = c6153i342.c;
                    if (charSequence == null) {
                        charSequence = c6153i342.b;
                    }
                    String charSequence2 = charSequence.toString();
                    int indexOf3 = charSequence2.indexOf(url.getHost());
                    if (indexOf3 != -1 && (indexOf = charSequence2.indexOf(47, indexOf3)) > 0) {
                        charSequence2 = charSequence2.substring(0, indexOf);
                    }
                    String str2 = c7183l34.i.a;
                    int indexOf4 = str2.indexOf(url.getHost());
                    if (indexOf4 != -1 && (indexOf2 = str2.indexOf(47, indexOf4)) > 0) {
                        str2 = str2.substring(0, indexOf2);
                    }
                    if (substring.startsWith(charSequence2) && selectionEnd2 >= charSequence2.length()) {
                        StringBuilder a = AbstractC10761vV3.a(str2);
                        a.append(substring.substring(charSequence2.length()));
                        str = a.toString();
                    }
                } catch (MalformedURLException unused) {
                }
            }
            if (str == null) {
                return super.onTextContextMenuItem(i);
            }
            w(true);
            setText(str);
            setSelection(0, str.length());
            w(false);
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            if (TextUtils.equals(getText(), str)) {
                w(true);
                setText(obj);
                setSelection(getText().length());
                w(false);
            }
            return onTextContextMenuItem;
        }
        if (i == 16908341) {
            FI2.a("Omnibox.LongPress.Share");
            N63.d(0);
        }
        return super.onTextContextMenuItem(i);
    }

    public final void v(int i) {
        int i2;
        float max;
        this.G = false;
        if (this.C) {
            return;
        }
        Editable text = getText();
        int i3 = TextUtils.isEmpty(text) ? 2 : i;
        setSelection(0);
        float textSize = getTextSize();
        boolean z = getLayoutDirection() == 1;
        int measuredWidth = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
        if (i3 == this.I && TextUtils.equals(text, this.f11526J) && measuredWidth == this.K && textSize == this.M && z == this.N) {
            scrollTo(this.L, getScrollY());
            return;
        }
        float f = 0.0f;
        if (i3 == 1) {
            Editable text2 = getText();
            int measuredWidth2 = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
            Layout layout = getLayout();
            int min = Math.min(this.R, text2.length());
            text2.length();
            float primaryHorizontal = layout.getPrimaryHorizontal(min);
            if ((text2.length() == 1 ? 0.0f : layout.getPrimaryHorizontal(Math.max(0, min - 1))) < primaryHorizontal) {
                max = Math.max(0.0f, primaryHorizontal - measuredWidth2);
            } else {
                int i4 = min - 1;
                int i5 = min - 2;
                while (true) {
                    int i6 = i5;
                    i2 = i4;
                    i4 = i6;
                    if (i4 >= 0) {
                        if (layout.getPrimaryHorizontal(i4) <= primaryHorizontal) {
                            i2 = Math.max(0, i2 - 1);
                            break;
                        }
                        i5 = i4 - 1;
                    } else {
                        break;
                    }
                }
                float measureText = layout.getPaint().measureText(text2.subSequence(i2, min).toString());
                float f2 = measuredWidth2;
                max = measureText < f2 ? Math.max(0.0f, (primaryHorizontal + measureText) - f2) : primaryHorizontal + f2;
            }
            scrollTo((int) max, getScrollY());
        } else {
            if (i3 != 2) {
                return;
            }
            Editable text3 = getText();
            if (TextUtils.isEmpty(text3)) {
                if (getLayoutDirection() == 1) {
                    C1415Kx c = C1415Kx.c();
                    CharSequence hint = getHint();
                    c.getClass();
                    if (c.c.b(hint, hint.length())) {
                        f = ((int) getLayout().getPrimaryHorizontal(0)) - getMeasuredWidth();
                    }
                }
            } else {
                C1415Kx c2 = C1415Kx.c();
                c2.getClass();
                if (c2.c.b(text3, text3.length())) {
                    f = Math.max(0.0f, (getLayout().getPrimaryHorizontal(text3.length()) - getMeasuredWidth()) + getLayout().getPaint().measureText(text3.toString()));
                }
            }
            scrollTo((int) f, getScrollY());
        }
        this.I = i3;
        this.f11526J = text.toString();
        this.K = measuredWidth;
        this.M = textSize;
        this.L = getScrollX();
        this.N = z;
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.G) {
            v(this.S);
            return;
        }
        int i5 = i3 - i;
        if (this.H != i5) {
            v(this.S);
            this.H = i5;
        }
    }

    @Override // defpackage.AbstractC9843sp, defpackage.R84, android.widget.TextView
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean bringPointIntoView(int i) {
        if (this.C) {
            return super.bringPointIntoView(i);
        }
        return false;
    }

    @Override // defpackage.AbstractC9843sp, defpackage.C1325Kf, android.widget.TextView, android.view.View
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        InterfaceC3403a34 interfaceC3403a34 = this.v;
        if (interfaceC3403a34 == null || !interfaceC3403a34.g()) {
            editorInfo.imeOptions |= 16777216;
        }
        return onCreateInputConnection;
    }

    @Override // defpackage.AbstractC9843sp, android.widget.EditText, android.widget.TextView
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.C || length() == 0) {
            setTextDirection(0);
        } else {
            setTextDirection(3);
        }
        setTextAlignment(2);
    }

    @Override // defpackage.AbstractC9843sp, defpackage.C1325Kf, android.widget.EditText, android.widget.TextView
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Editable getText() {
        if (this.U) {
            CharSequence charSequence = this.T;
            if (charSequence == null) {
                charSequence = "";
            }
            return new SpannableStringBuilder(charSequence);
        }
        return super.getText();
    }

    @Override // android.widget.EditText, android.widget.TextView, android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final CharSequence getAccessibilityClassName() {
        if (isEnabled()) {
            return super.getAccessibilityClassName();
        }
        return TextView.class.getName();
    }

    public final void j(boolean z) {
        Z24[] z24Arr;
        if (this.w == null) {
            return;
        }
        if (z) {
            int i = SysUtils.isLowEndDevice() ? 1000 : 4000;
            Editable text = getText();
            int length = text.length();
            if (length <= i) {
                if (this.O && (z24Arr = (Z24[]) text.getSpans(0, length, Z24.class)) != null && z24Arr.length > 0) {
                    for (Z24 z24 : z24Arr) {
                        text.removeSpan(z24);
                    }
                }
                this.O = false;
            } else {
                this.O = true;
                if (text.nextSpanTransition(0, length, Z24.class) == length) {
                    int i2 = i / 2;
                    text.setSpan(Z24.a, i2, length - i2, 17);
                }
            }
        }
        AbstractC4851eH1.f("UrlBar", "Text change observed, triggering autocomplete.", new Object[0]);
        InterfaceC4090c34 interfaceC4090c34 = this.w;
        InterfaceC11558xp interfaceC11558xp = this.m;
        String k = interfaceC11558xp == null ? "" : interfaceC11558xp.k();
        InterfaceC11558xp interfaceC11558xp2 = this.m;
        interfaceC4090c34.a(k, interfaceC11558xp2 != null ? interfaceC11558xp2.j() : "");
    }
}
