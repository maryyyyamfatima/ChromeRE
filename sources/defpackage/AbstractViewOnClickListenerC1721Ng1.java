package defpackage;

import android.content.Context;
import android.view.View;
import com.android.chrome.R;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ng1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC1721Ng1 extends ChromeBasePreference implements View.OnClickListener {
    public int Y;
    public String Z;

    public AbstractViewOnClickListenerC1721Ng1(Context context) {
        super(context);
        M();
        this.L = R.layout.f57920_resource_name_obfuscated_res_0x7f0e012a;
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeBasePreference, androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        ChromeImageButton chromeImageButton = (ChromeImageButton) c1812Ny2.v(R.id.image_button);
        chromeImageButton.setImageResource(this.Y);
        String str = this.Z;
        if (str != null) {
            chromeImageButton.setContentDescription(str);
        }
        chromeImageButton.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC9555ry2 interfaceC9555ry2 = this.k;
        if (interfaceC9555ry2 != null) {
            interfaceC9555ry2.p(this);
        }
    }
}
