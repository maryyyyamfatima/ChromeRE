package defpackage;

import android.view.View;
import android.widget.Button;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: It3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139It3 implements InterfaceC1269Jt3 {
    public final View.OnClickListener a;

    public C1139It3(ViewOnClickListenerC0879Gt3 viewOnClickListenerC0879Gt3) {
        this.a = viewOnClickListenerC0879Gt3;
    }

    @Override // defpackage.InterfaceC1269Jt3
    public final void a(Button button) {
        button.setVisibility(0);
        button.setText(R.string.f73270_resource_name_obfuscated_res_0x7f14046f);
        button.setOnClickListener(this.a);
    }
}
