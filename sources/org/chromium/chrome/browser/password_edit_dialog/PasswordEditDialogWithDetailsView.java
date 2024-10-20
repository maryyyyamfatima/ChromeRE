package org.chromium.chrome.browser.password_edit_dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.android.chrome.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.AbstractC0292Cg1;
import defpackage.C2267Rl2;
import defpackage.C2397Sl2;
import defpackage.C6849k52;
import defpackage.ZA0;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.password_edit_dialog.PasswordEditDialogWithDetailsView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordEditDialogWithDetailsView extends b {
    public AutoCompleteTextView g;
    public TextInputEditText h;
    public TextInputLayout i;
    public Callback j;
    public Callback k;

    public PasswordEditDialogWithDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.username_view);
        this.g = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(new C2267Rl2(this));
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.username_input_layout);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Ql2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordEditDialogWithDetailsView.this.g.showDropDown();
            }
        };
        ZA0 za0 = textInputLayout.h;
        View.OnLongClickListener onLongClickListener = za0.r;
        CheckableImageButton checkableImageButton = za0.k;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0292Cg1.c(checkableImageButton, onLongClickListener);
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.password);
        this.h = textInputEditText;
        textInputEditText.setInputType(131201);
        this.h.addTextChangedListener(new C2397Sl2(this));
        this.i = (TextInputLayout) findViewById(R.id.password_text_input_layout);
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void e(String str, List list) {
        C6849k52 c6849k52 = new C6849k52(getContext(), list);
        c6849k52.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.g.setAdapter(c6849k52);
        this.g.setText(str);
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void d(Callback callback) {
        this.j = callback;
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void a(String str) {
        if (this.h.getText().toString().equals(str)) {
            return;
        }
        this.h.setText(str);
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void b(Callback callback) {
        this.k = callback;
    }

    @Override // org.chromium.chrome.browser.password_edit_dialog.b
    public final void c(String str) {
        this.i.l(str);
    }
}
