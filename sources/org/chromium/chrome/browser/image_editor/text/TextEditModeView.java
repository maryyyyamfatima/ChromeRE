package org.chromium.chrome.browser.image_editor.text;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.VH3;
import org.chromium.chrome.browser.image_editor.text.TextEditModeView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class TextEditModeView extends ScrollView {
    public static final /* synthetic */ int k = 0;
    public final String a;
    public TextView g;
    public DismissWithKeyboardEditText h;
    public View i;
    public final TextWatcher j;

    public TextEditModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new VH3(this);
        this.a = context.getResources().getString(R.string.f85450_resource_name_obfuscated_res_0x7f1409b5);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.edit_mode_text);
        DismissWithKeyboardEditText dismissWithKeyboardEditText = (DismissWithKeyboardEditText) findViewById(R.id.edit_mode_input);
        this.h = dismissWithKeyboardEditText;
        dismissWithKeyboardEditText.addTextChangedListener(this.j);
        View findViewById = findViewById(R.id.edit_mode_input_clear);
        this.i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: SH3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextEditModeView.this.h.getText().clear();
            }
        });
    }
}
