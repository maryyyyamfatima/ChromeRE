package org.chromium.components.browser_ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import defpackage.JG2;
import org.chromium.components.browser_ui.settings.ButtonPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ButtonPreference extends Preference {
    public ButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.f56270_resource_name_obfuscated_res_0x7f0e0075;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.w);
        this.L = obtainStyledAttributes.getResourceId(0, R.layout.f56260_resource_name_obfuscated_res_0x7f0e0074);
        obtainStyledAttributes.recycle();
        M();
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        Button button = (Button) c1812Ny2.v(R.id.button_preference);
        button.setText(this.m);
        button.setOnClickListener(new View.OnClickListener() { // from class: sD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ButtonPreference buttonPreference = ButtonPreference.this;
                InterfaceC9555ry2 interfaceC9555ry2 = buttonPreference.k;
                if (interfaceC9555ry2 != null) {
                    interfaceC9555ry2.p(buttonPreference);
                }
            }
        });
    }
}
