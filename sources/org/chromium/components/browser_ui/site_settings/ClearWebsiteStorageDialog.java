package org.chromium.components.browser_ui.site_settings;

import android.content.res.Configuration;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2;
import java.util.Objects;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ClearWebsiteStorageDialog extends AbstractDialogInterfaceOnClickListenerC10927vy2 {
    public static Callback A0;
    public View z0;

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void S0(View view) {
        this.z0 = view;
        TextView textView = (TextView) view.findViewById(R.id.signed_out_text);
        TextView textView2 = (TextView) view.findViewById(R.id.offline_text);
        textView.setText(R.string.0_resource_name_obfuscated_res_0x7f140c54);
        textView2.setText(R.string.0_resource_name_obfuscated_res_0x7f140c51);
        super.S0(view);
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC10927vy2
    public final void T0(boolean z) {
        A0.onResult(Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        View view = this.z0;
        if (view != null) {
            Handler handler = view.getHandler();
            final View view2 = this.z0;
            Objects.requireNonNull(view2);
            handler.post(new Runnable() { // from class: uT
                @Override // java.lang.Runnable
                public final void run() {
                    view2.requestLayout();
                }
            });
        }
    }
}
