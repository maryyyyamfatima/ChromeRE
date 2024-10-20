package org.chromium.chrome.browser.payments.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PaymentRequestHeader extends FrameLayout {
    public final int a;
    public final Context g;

    public PaymentRequestHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        this.a = AbstractC11746yN.c(context, R.dimen.f40220_resource_name_obfuscated_res_0x7f08072c);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(this.a);
    }
}
