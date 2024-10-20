package org.chromium.components.javascript_dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class JavascriptDialogCustomView extends LinearLayout {
    public EditText a;
    public CheckBox g;

    public JavascriptDialogCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (EditText) findViewById(R.id.js_modal_dialog_prompt);
        this.g = (CheckBox) findViewById(R.id.suppress_js_modal_dialogs);
    }
}
