package org.chromium.chrome.browser.password_manager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordManagerDialogView extends ScrollView {
    public static final /* synthetic */ int k = 0;
    public ChromeImageButton a;
    public ChromeImageButton g;
    public ImageView h;
    public TextView i;
    public TextView j;

    public PasswordManagerDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ChromeImageButton) findViewById(R.id.password_dialog_help_button);
        this.g = (ChromeImageButton) findViewById(R.id.password_dialog_inline_help_button);
        this.h = (ImageView) findViewById(R.id.password_manager_dialog_illustration);
        this.i = (TextView) findViewById(R.id.password_manager_dialog_title);
        this.j = (TextView) findViewById(R.id.password_manager_dialog_details);
    }
}
