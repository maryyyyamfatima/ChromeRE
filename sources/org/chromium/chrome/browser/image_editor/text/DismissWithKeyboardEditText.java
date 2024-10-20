package org.chromium.chrome.browser.image_editor.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import defpackage.C9861ss;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class DismissWithKeyboardEditText extends EditText {
    public Runnable a;

    public DismissWithKeyboardEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        Runnable runnable;
        boolean onKeyPreIme = super.onKeyPreIme(i, keyEvent);
        if (!C9861ss.b() && keyEvent.getKeyCode() == 4 && (runnable = this.a) != null) {
            runnable.run();
        }
        return onKeyPreIme;
    }
}
