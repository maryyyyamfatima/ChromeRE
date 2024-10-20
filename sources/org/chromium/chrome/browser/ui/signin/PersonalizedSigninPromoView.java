package org.chromium.chrome.browser.ui.signin;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C7928nE;
import defpackage.UN;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PersonalizedSigninPromoView extends LinearLayout {
    public ImageView a;
    public ImageView g;
    public ImageButton h;
    public TextView i;
    public TextView j;
    public ButtonCompat k;
    public Button l;

    public PersonalizedSigninPromoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.sync_promo_illustration);
        this.g = (ImageView) findViewById(R.id.signin_promo_image);
        this.h = (ImageButton) findViewById(R.id.signin_promo_close_button);
        this.k = (ButtonCompat) findViewById(R.id.signin_promo_signin_button);
        this.l = (Button) findViewById(R.id.signin_promo_choose_account_button);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("SyncAndroidPromosWithTitle")) {
            this.i = (TextView) findViewById(R.id.signin_promo_title);
            this.j = (TextView) findViewById(R.id.new_signin_promo_description);
            findViewById(R.id.signin_promo_description).setVisibility(8);
        } else {
            this.i = (TextView) findViewById(R.id.signin_promo_status_message);
            this.j = (TextView) findViewById(R.id.signin_promo_description);
            findViewById(R.id.new_signin_promo_description).setVisibility(8);
        }
    }
}
