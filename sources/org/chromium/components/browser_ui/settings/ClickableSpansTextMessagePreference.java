package org.chromium.components.browser_ui.settings;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ClickableSpansTextMessagePreference extends ChromeBasePreference {
    public CharSequence Y;
    public CharSequence Z;
    public TextViewWithClickableSpans a0;
    public TextViewWithClickableSpans b0;

    public ClickableSpansTextMessagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.0_resource_name_obfuscated_res_0x7f0e0089;
        M();
        N();
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeBasePreference, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.a0 = (TextViewWithClickableSpans) c1812Ny2.v(R.id.title);
        this.b0 = (TextViewWithClickableSpans) c1812Ny2.v(R.id.summary);
        if (!TextUtils.isEmpty(this.Y)) {
            this.a0.setText(this.Y);
            this.a0.setVisibility(0);
        } else {
            this.a0.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.Z)) {
            this.b0.setText(this.Z);
            this.b0.setVisibility(0);
            this.b0.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.b0.setVisibility(8);
    }

    @Override // androidx.preference.Preference
    public final void R(CharSequence charSequence) {
        if (TextUtils.equals(this.Y, charSequence)) {
            return;
        }
        this.Y = charSequence;
        q();
    }

    @Override // androidx.preference.Preference
    public final void Q(int i) {
        R(this.a.getString(i));
    }

    @Override // androidx.preference.Preference
    public final void P(CharSequence charSequence) {
        if (TextUtils.equals(this.Z, charSequence)) {
            return;
        }
        this.Z = charSequence;
        q();
    }

    @Override // androidx.preference.Preference
    public final void O(int i) {
        P(this.a.getString(i));
    }
}
