package org.chromium.chrome.browser.download.home.rename;

import J.N;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.XM2;
import defpackage.YM2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.home.rename.RenameDialogCustomView;
import org.chromium.components.browser_ui.widget.text.AlertDialogEditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RenameDialogCustomView extends ScrollView {
    public TextView a;
    public AlertDialogEditText g;
    public Callback h;

    public RenameDialogCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.error_message);
        AlertDialogEditText alertDialogEditText = (AlertDialogEditText) findViewById(R.id.file_name);
        this.g = alertDialogEditText;
        alertDialogEditText.addTextChangedListener(new XM2(this));
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.g.setText(str);
        }
        this.g.clearFocus();
        this.g.setOnFocusChangeListener(new YM2(this, str.length() - N.MatdI239(str).length()));
        post(new Runnable() { // from class: WM2
            @Override // java.lang.Runnable
            public final void run() {
                RenameDialogCustomView renameDialogCustomView = RenameDialogCustomView.this;
                if (renameDialogCustomView.g.requestFocus()) {
                    ((InputMethodManager) renameDialogCustomView.g.getContext().getSystemService("input_method")).showSoftInput(renameDialogCustomView.g, 2);
                }
            }
        });
    }

    public final void b(boolean z) {
        if (z) {
            this.g.getBackground().setColorFilter(getContext().getColor(R.color.f17900_resource_name_obfuscated_res_0x7f07012e), PorterDuff.Mode.SRC_IN);
        } else {
            this.g.getBackground().clearColorFilter();
        }
    }
}
