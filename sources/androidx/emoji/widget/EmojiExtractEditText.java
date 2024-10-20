package androidx.emoji.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.C10587uz0;
import defpackage.GJ3;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    public C10587uz0 a;
    public boolean g;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.g) {
            return;
        }
        this.g = true;
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, JG2.M, R.attr.editTextStyle, 0);
            i = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
        if (this.a == null) {
            this.a = new C10587uz0(this);
        }
        this.a.a.b.h = i;
        setKeyListener(super.getKeyListener());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.a == null) {
            this.a = new C10587uz0(this);
        }
        return this.a.b(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            if (this.a == null) {
                this.a = new C10587uz0(this);
            }
            keyListener = this.a.a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(GJ3.e(callback, this));
    }
}
