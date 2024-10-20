package org.chromium.chrome.browser.ui.signin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C0140Bc;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SigninView extends LinearLayout {
    public SigninScrollView a;
    public TextView g;
    public View h;
    public ImageView i;
    public TextView j;
    public TextView k;
    public ImageView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public ButtonCompat p;
    public Button q;
    public Button r;
    public View s;
    public C0140Bc t;

    public SigninView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (SigninScrollView) findViewById(R.id.signin_scroll_view);
        this.g = (TextView) findViewById(R.id.signin_title);
        this.h = findViewById(R.id.signin_account_picker);
        this.i = (ImageView) findViewById(R.id.account_image);
        this.j = (TextView) findViewById(R.id.account_text_primary);
        this.k = (TextView) findViewById(R.id.account_text_secondary);
        this.l = (ImageView) findViewById(R.id.account_picker_end_image);
        this.m = (TextView) findViewById(R.id.signin_sync_title);
        this.n = (TextView) findViewById(R.id.signin_sync_description);
        this.o = (TextView) findViewById(R.id.signin_details_description);
        this.p = (ButtonCompat) findViewById(R.id.positive_button);
        this.q = (Button) findViewById(R.id.negative_button);
        this.r = (Button) findViewById(R.id.more_button);
        this.s = findViewById(R.id.positive_button_end_padding);
        this.t = new C0140Bc(((ImageView) findViewById(R.id.signin_header_image)).getDrawable());
    }
}
