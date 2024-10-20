package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LI3 extends EditText implements TextView.OnEditorActionListener {
    public C6206iD0 a;
    public C6206iD0 g;
    public C6206iD0 h;
    public C6206iD0 i;
    public C6206iD0 j;
    public C6206iD0 k;
    public C7849n00 l;
    public AtomicReference m;
    public int n;
    public TextWatcher o;
    public C10587uz0 p;
    public boolean q;

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (this.q && keyListener != null) {
            if (this.p == null) {
                this.p = new C10587uz0(this);
            }
            keyListener = this.p.a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection a = a(editorInfo);
        if (!this.q) {
            return a;
        }
        if (this.p == null) {
            this.p = new C10587uz0(this);
        }
        return this.p.b(a, editorInfo);
    }

    public LI3(Context context) {
        super(context);
        this.n = -1;
        setOnEditorActionListener(this);
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void requestLayout() {
        if (Build.VERSION.SDK_INT != 23 || LK3.b()) {
            super.requestLayout();
        }
    }

    @Override // android.widget.TextView
    /* renamed from: g */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C7849n00 c7849n00;
        super.onTextChanged(charSequence, i, i2, i3);
        AtomicReference atomicReference = this.m;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        C6206iD0 c6206iD0 = this.a;
        if (c6206iD0 != null) {
            String charSequence2 = charSequence.toString();
            int i4 = BI3.k0;
            C4853eH3 c4853eH3 = new C4853eH3();
            c4853eH3.a = this;
            c4853eH3.b = charSequence2;
            c6206iD0.a.b().c(c6206iD0, c4853eH3);
        }
        int lineCount = getLineCount();
        int i5 = this.n;
        if (i5 == -1 || i5 == lineCount || (c7849n00 = this.l) == null) {
            return;
        }
        int i6 = BI3.k0;
        if (c7849n00.f == null) {
            return;
        }
        c7849n00.o(new C6383ik3(0, new Object[0]), "updateState:TextInput.remeasureForUpdatedText");
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: e */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.n = getLineCount();
    }

    @Override // android.widget.TextView
    /* renamed from: f */
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C6206iD0 c6206iD0 = this.g;
        if (c6206iD0 != null) {
            int i3 = BI3.k0;
            c6206iD0.a.b().c(c6206iD0, new C5120f33());
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    /* renamed from: d */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C6206iD0 c6206iD0 = this.h;
        if (c6206iD0 != null) {
            int i2 = BI3.k0;
            return ((Boolean) c6206iD0.a.b().c(c6206iD0, new C12276zu1())).booleanValue();
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    /* renamed from: c */
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C6206iD0 c6206iD0 = this.i;
        if (c6206iD0 != null) {
            int i2 = BI3.k0;
            return ((Boolean) c6206iD0.a.b().c(c6206iD0, new C9875su1())).booleanValue();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    /* renamed from: b */
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C6206iD0 c6206iD0 = this.j;
        if (c6206iD0 == null) {
            return false;
        }
        int i2 = BI3.k0;
        C9886sw0 c9886sw0 = new C9886sw0();
        c9886sw0.a = textView;
        return ((Boolean) c6206iD0.a.b().c(c6206iD0, c9886sw0)).booleanValue();
    }

    public final InputConnection a(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C6206iD0 c6206iD0 = this.k;
        if (c6206iD0 == null) {
            return onCreateInputConnection;
        }
        int i = BI3.k0;
        return (InputConnection) c6206iD0.a.b().c(c6206iD0, new C6050hm1());
    }
}
