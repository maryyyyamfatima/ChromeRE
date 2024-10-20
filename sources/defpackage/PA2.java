package defpackage;

import J.N;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsFragmentV3;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PA2 extends Dialog implements View.OnClickListener {
    public final Context a;
    public final SettingsLauncher g;

    public PA2(Context context, SettingsLauncher settingsLauncher) {
        super(context, R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        this.a = context;
        this.g = settingsLauncher;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f60100_resource_name_obfuscated_res_0x7f0e0229, (ViewGroup) null);
        setContentView(inflate);
        ((ButtonCompat) inflate.findViewById(R.id.ack_button)).setOnClickListener(this);
        ((ButtonCompat) inflate.findViewById(R.id.settings_button)).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ack_button) {
            N.Mq9orIwX(2);
            dismiss();
        } else if (id == R.id.settings_button) {
            N.Mq9orIwX(1);
            dismiss();
            PrivacySandboxSettingsFragmentV3.S0(this.a, this.g, 2);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        N.Mq9orIwX(0);
        super.show();
    }
}
