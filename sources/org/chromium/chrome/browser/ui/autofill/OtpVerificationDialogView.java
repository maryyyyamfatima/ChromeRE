package org.chromium.chrome.browser.ui.autofill;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OtpVerificationDialogView extends RelativeLayout {
    public static final /* synthetic */ int k = 0;
    public View a;
    public View g;
    public EditText h;
    public TextView i;
    public TextView j;

    public OtpVerificationDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.progress_bar_overlay);
        this.a = findViewById;
        findViewById.setVisibility(8);
        this.g = findViewById(R.id.otp_verification_dialog_contents);
        this.h = (EditText) findViewById(R.id.otp_input);
        TextView textView = (TextView) findViewById(R.id.otp_error_message);
        this.i = textView;
        textView.setVisibility(8);
        TextView textView2 = (TextView) findViewById(R.id.otp_resend_message);
        this.j = textView2;
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
