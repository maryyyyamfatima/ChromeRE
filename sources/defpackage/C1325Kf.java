package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1325Kf extends EditText implements InterfaceC5997hd2, JN3 {
    public final C3944bf a;
    public final C10132tg g;
    public final C6698jg h;
    public final HJ3 i;
    public final C1455Lf j;

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        InterfaceC8223o50 c8566p50;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 && Ec4.e(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i2 >= 31) {
                    c8566p50 = new C7879n50(primaryClip, 1);
                } else {
                    c8566p50 = new C8566p50(primaryClip, 1);
                }
                c8566p50.b(i != 16908322 ? 1 : 0);
                Ec4.i(this, c8566p50.build());
            }
            r2 = 1;
        }
        if (r2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onDragEvent(android.view.DragEvent r6) {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 31
            if (r0 >= r2) goto L93
            r3 = 24
            if (r0 < r3) goto L93
            java.lang.Object r0 = r6.getLocalState()
            if (r0 != 0) goto L93
            java.lang.String[] r0 = defpackage.Ec4.e(r5)
            if (r0 != 0) goto L19
            goto L93
        L19:
            android.content.Context r0 = r5.getContext()
        L1d:
            boolean r3 = r0 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L2f
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L28
            android.app.Activity r0 = (android.app.Activity) r0
            goto L30
        L28:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L1d
        L2f:
            r0 = 0
        L30:
            if (r0 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't handle drop: no activity: view="
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ReceiveContent"
            android.util.Log.i(r2, r0)
            goto L93
        L46:
            int r3 = r6.getAction()
            if (r3 != r1) goto L4d
            goto L93
        L4d:
            int r3 = r6.getAction()
            r4 = 3
            if (r3 != r4) goto L93
            defpackage.AbstractC2754Vf.a(r0, r6)
            float r0 = r6.getX()
            float r3 = r6.getY()
            int r0 = r5.getOffsetForPosition(r0, r3)
            r5.beginBatchEdit()
            java.lang.CharSequence r3 = r5.getText()     // Catch: java.lang.Throwable -> L8e
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L8e
            android.text.Selection.setSelection(r3, r0)     // Catch: java.lang.Throwable -> L8e
            android.content.ClipData r0 = r6.getClipData()     // Catch: java.lang.Throwable -> L8e
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8e
            if (r3 < r2) goto L7d
            n50 r2 = new n50     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L7d:
            p50 r2 = new p50     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L8e
        L82:
            w50 r0 = r2.build()     // Catch: java.lang.Throwable -> L8e
            defpackage.Ec4.i(r5, r0)     // Catch: java.lang.Throwable -> L8e
            r5.endBatchEdit()
            r0 = r1
            goto L94
        L8e:
            r6 = move-exception
            r5.endBatchEdit()
            throw r6
        L93:
            r0 = 0
        L94:
            if (r0 == 0) goto L97
            return r1
        L97:
            boolean r6 = super.onDragEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1325Kf.onDragEvent(android.view.DragEvent):boolean");
    }

    public C1325Kf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325Kf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.f6630_resource_name_obfuscated_res_0x7f0501c4);
        FN3.a(context);
        AbstractC3838bK3.a(getContext(), this);
        C3944bf c3944bf = new C3944bf(this);
        this.a = c3944bf;
        c3944bf.d(attributeSet, R.attr.f6630_resource_name_obfuscated_res_0x7f0501c4);
        C10132tg c10132tg = new C10132tg(this);
        this.g = c10132tg;
        c10132tg.d(attributeSet, R.attr.f6630_resource_name_obfuscated_res_0x7f0501c4);
        c10132tg.b();
        this.h = new C6698jg(this);
        this.i = new HJ3();
        C1455Lf c1455Lf = new C1455Lf(this);
        this.j = c1455Lf;
        c1455Lf.b(attributeSet, R.attr.f6630_resource_name_obfuscated_res_0x7f0501c4);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = c1455Lf.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.a();
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.e(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e;
        InputConnection c5706gm1;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            AbstractC1800Nw0.c(editorInfo, getText());
        }
        AbstractC1714Nf.a(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && i <= 30 && (e = Ec4.e(this)) != null) {
            AbstractC1800Nw0.b(editorInfo, e);
            C5018em1 c5018em1 = new C5018em1(this);
            if (i >= 25) {
                c5706gm1 = new C5362fm1(onCreateInputConnection, c5018em1);
            } else if (AbstractC1800Nw0.a(editorInfo).length != 0) {
                c5706gm1 = new C5706gm1(onCreateInputConnection, c5018em1);
            }
            onCreateInputConnection = c5706gm1;
        }
        return this.j.c(onCreateInputConnection);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(GJ3.e(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return GJ3.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        C6698jg c6698jg;
        if (Build.VERSION.SDK_INT < 28 && (c6698jg = this.h) != null) {
            c6698jg.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        C6698jg c6698jg;
        if (Build.VERSION.SDK_INT < 28 && (c6698jg = this.h) != null) {
            TextClassifier textClassifier = c6698jg.b;
            return textClassifier == null ? AbstractC6355ig.a(c6698jg.a) : textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override // defpackage.InterfaceC5997hd2
    public final C10966w50 b(C10966w50 c10966w50) {
        this.i.getClass();
        return HJ3.a(this, c10966w50);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.a(keyListener));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // defpackage.JN3
    public final void f(ColorStateList colorStateList) {
        C10132tg c10132tg = this.g;
        c10132tg.i(colorStateList);
        c10132tg.b();
    }

    @Override // defpackage.JN3
    public final void a(PorterDuff.Mode mode) {
        C10132tg c10132tg = this.g;
        c10132tg.j(mode);
        c10132tg.b();
    }
}
