package org.chromium.chrome.browser.findinpage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.C9861ss;
import defpackage.R84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FindToolbar$FindQuery extends R84 implements View.OnKeyListener {
    public a l;

    public FindToolbar$FindQuery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (C9861ss.b()) {
            return;
        }
        setOnKeyListener(this);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        getKeyDispatcherState().handleUpEvent(keyEvent);
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        this.l.d(true);
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 66 || i == 133 || (i == 35 && keyEvent.isCtrlPressed())) {
            a.a(this.l, !keyEvent.isShiftPressed());
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.C1325Kf, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int i3 = 0; i3 < primaryClip.getItemCount(); i3++) {
                sb.append(primaryClip.getItemAt(i3).coerceToText(getContext()));
            }
            int length = getText().length();
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                length = Math.max(0, Math.max(selectionStart, selectionEnd));
                i2 = max;
            }
            Selection.setSelection(getText(), length);
            getText().replace(i2, length, sb.toString());
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // defpackage.C1325Kf, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.l.n()) {
            editorInfo.imeOptions |= 16777216;
        }
        return onCreateInputConnection;
    }
}
