package org.chromium.chrome.browser.ui.signin.fre;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SigninFirstRunView extends RelativeLayout {
    public TextView a;
    public TextView g;
    public View h;
    public ProgressBar i;
    public ViewGroup j;
    public ImageView k;
    public ButtonCompat l;
    public ButtonCompat m;
    public TextViewWithClickableSpans n;
    public ProgressBar o;
    public TextView p;

    public SigninFirstRunView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.g = (TextView) findViewById(R.id.subtitle);
        this.h = findViewById(R.id.fre_browser_managed_by_organization);
        this.i = (ProgressBar) findViewById(R.id.fre_native_and_policy_load_progress_spinner);
        this.j = (ViewGroup) findViewById(R.id.signin_fre_selected_account);
        this.k = (ImageView) findViewById(R.id.signin_fre_selected_account_expand_icon);
        this.l = (ButtonCompat) findViewById(R.id.signin_fre_continue_button);
        this.m = (ButtonCompat) findViewById(R.id.signin_fre_dismiss_button);
        this.n = (TextViewWithClickableSpans) findViewById(R.id.signin_fre_footer);
        this.o = (ProgressBar) findViewById(R.id.fre_signin_progress_spinner);
        this.p = (TextView) findViewById(R.id.fre_signin_progress_text);
        int a = FREMobileIdentityConsistencyFieldTrial.a();
        if ((a == -1 || a == 0) ? false : true) {
            this.a.setVisibility(4);
        }
    }
}
