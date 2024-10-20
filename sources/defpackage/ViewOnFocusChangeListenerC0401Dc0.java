package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.text.BreakIterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dc0 */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0401Dc0 extends EditText implements TextView.OnEditorActionListener, View.OnFocusChangeListener {
    public static final InputFilter[] l = new InputFilter[0];
    public static final ColorStateList m = ColorStateList.valueOf(-3355444);
    public static final BreakIterator n = BreakIterator.getCharacterInstance();
    public C3314Zn a;
    public boolean g;
    public C10587uz0 h;
    public C0271Cc0 i;
    public final Handler j;
    public final boolean k;

    public ViewOnFocusChangeListenerC0401Dc0(Context context, boolean z) {
        super(context);
        this.j = new Handler(Looper.getMainLooper());
        this.k = z;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.k) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (this.k && drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3314Zn c3314Zn = this.a;
        if (c3314Zn == null) {
            return;
        }
        QP0 qp0 = c3314Zn.a;
        if (qp0 != null) {
            ((C10081tX) c3314Zn.i).a(qp0.a(), a(this, charSequence.toString(), ((C3184Yn) this.a.k).v), 2).c();
        }
        QP0 qp02 = this.a.b;
        if (qp02 == null || !TextUtils.isEmpty(charSequence)) {
            return;
        }
        ((C10081tX) this.a.i).a(qp02.a(), a(this, "", ((C3184Yn) this.a.k).v), 2).c();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        QP0 qp0;
        QP0 qp02;
        C3314Zn c3314Zn = this.a;
        if (c3314Zn == null) {
            return;
        }
        InterfaceC9738sX interfaceC9738sX = c3314Zn.i;
        if (z && (qp02 = c3314Zn.c) != null) {
            ((C10081tX) interfaceC9738sX).a(qp02.a(), a(this, getText().toString(), ((C3184Yn) this.a.k).v), 2).c();
        } else {
            if (z || (qp0 = c3314Zn.d) == null) {
                return;
            }
            ((C10081tX) interfaceC9738sX).a(qp0.a(), a(this, getText().toString(), ((C3184Yn) this.a.k).v), 2).c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C8858pw0 r19, defpackage.C3314Zn r20) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnFocusChangeListenerC0401Dc0.c(pw0, Zn):void");
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (this.g && keyListener != null) {
            if (this.h == null) {
                this.h = new C10587uz0(this);
            }
            keyListener = this.h.a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!this.g) {
            return onCreateInputConnection;
        }
        if (this.h == null) {
            this.h = new C10587uz0(this);
        }
        return this.h.b(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C3314Zn c3314Zn = this.a;
        if (c3314Zn == null || c3314Zn.e == null) {
            return false;
        }
        b();
        return true;
    }

    public final void b() {
        C3314Zn c3314Zn = this.a;
        QP0 qp0 = c3314Zn.e;
        if (qp0 == null) {
            return;
        }
        ((C10081tX) c3314Zn.i).a(qp0.a(), a(this, getText().toString(), ((C3184Yn) this.a.k).v), 2).c();
    }

    public static C2924Wn a(EditText editText, String str, C3998bo c3998bo) {
        C2794Vn a = AbstractC9053qX.a();
        a.a = editText;
        a.h = c3998bo;
        C6048hm c6048hm = (C6048hm) C6391im.n.j();
        if (c6048hm.h) {
            c6048hm.l();
            c6048hm.h = false;
        }
        C6391im c6391im = (C6391im) c6048hm.g;
        c6391im.getClass();
        str.getClass();
        c6391im.j |= 1;
        c6391im.k = str;
        C6391im c6391im2 = (C6391im) c6048hm.j();
        C9201qw0 c9201qw0 = (C9201qw0) C9543rw0.p.j();
        if (c9201qw0.h) {
            c9201qw0.l();
            c9201qw0.h = false;
        }
        C9543rw0 c9543rw0 = (C9543rw0) c9201qw0.g;
        c9543rw0.getClass();
        c6391im2.getClass();
        c9543rw0.k = c6391im2;
        c9543rw0.j |= 1;
        boolean isFocused = editText.isFocused();
        if (c9201qw0.h) {
            c9201qw0.l();
            c9201qw0.h = false;
        }
        C9543rw0 c9543rw02 = (C9543rw0) c9201qw0.g;
        c9543rw02.j |= 8;
        c9543rw02.m = isFocused;
        int selectionEnd = editText.getSelectionEnd();
        if (c9201qw0.h) {
            c9201qw0.l();
            c9201qw0.h = false;
        }
        C9543rw0 c9543rw03 = (C9543rw0) c9201qw0.g;
        c9543rw03.j |= 2;
        c9543rw03.l = selectionEnd;
        BreakIterator breakIterator = n;
        breakIterator.setText(str);
        breakIterator.first();
        int i = 0;
        while (breakIterator.next() != -1) {
            i++;
        }
        if (c9201qw0.h) {
            c9201qw0.l();
            c9201qw0.h = false;
        }
        C9543rw0 c9543rw04 = (C9543rw0) c9201qw0.g;
        c9543rw04.j |= 16;
        c9543rw04.n = i;
        C9543rw0 c9543rw05 = (C9543rw0) c9201qw0.j();
        K33 k33 = (K33) SenderStateOuterClass$SenderState.l.j();
        k33.p(C9543rw0.r, c9543rw05);
        a.e = (SenderStateOuterClass$SenderState) k33.j();
        return a.a();
    }
}
