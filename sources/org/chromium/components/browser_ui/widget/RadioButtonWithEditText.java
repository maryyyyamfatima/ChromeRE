package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.JG2;
import defpackage.UG2;
import java.util.ArrayList;
import org.chromium.components.browser_ui.widget.RadioButtonWithEditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RadioButtonWithEditText extends RadioButtonWithDescription {
    public static final /* synthetic */ int n = 0;
    public EditText l;
    public final ArrayList m;

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final int c() {
        return R.layout.f60370_resource_name_obfuscated_res_0x7f0e0247;
    }

    public RadioButtonWithEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ArrayList();
    }

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final void i() {
        super.i();
        EditText editText = (EditText) d();
        this.l = editText;
        editText.addTextChangedListener(new UG2(this));
        this.l.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: SG2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                RadioButtonWithEditText.this.l.clearFocus();
                return false;
            }
        });
        this.l.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: TG2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                RadioButtonWithEditText radioButtonWithEditText = RadioButtonWithEditText.this;
                if (z) {
                    int i = RadioButtonWithEditText.n;
                    radioButtonWithEditText.g(true);
                    radioButtonWithEditText.l.setCursorVisible(true);
                } else {
                    radioButtonWithEditText.l.setCursorVisible(false);
                    C11939yv1.g.d(radioButtonWithEditText.l);
                }
            }
        });
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setLabeledBy(this.l);
    }

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final TextView d() {
        return (TextView) findViewById(R.id.edit_text);
    }

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, JG2.E0, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        if (string != null) {
            this.l.setHint(string);
        }
        this.l.setInputType(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    @Override // org.chromium.components.browser_ui.widget.RadioButtonWithDescription
    public final void f(boolean z) {
        super.f(z);
        this.l.clearFocus();
    }
}
