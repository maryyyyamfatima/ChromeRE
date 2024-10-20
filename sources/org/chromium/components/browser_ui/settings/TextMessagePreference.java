package org.chromium.components.browser_ui.settings;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.C1812Ny2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextMessagePreference extends ChromeBasePreference {
    public TextView Y;
    public MovementMethod Z;

    public TextMessagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z = LinkMovementMethod.getInstance();
        M();
        N();
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeBasePreference, androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        TextView textView = (TextView) c1812Ny2.v(R.id.summary);
        this.Y = textView;
        MovementMethod movementMethod = this.Z;
        this.Z = movementMethod;
        if (textView != null) {
            textView.setMovementMethod(movementMethod);
        }
    }
}
