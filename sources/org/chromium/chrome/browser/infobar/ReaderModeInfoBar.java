package org.chromium.chrome.browser.infobar;

import J.N;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.GH2;
import defpackage.K44;
import defpackage.NH2;
import defpackage.V1;
import defpackage.ViewOnClickListenerC7418ll1;
import defpackage.Y50;
import java.util.LinkedHashSet;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ReaderModeInfoBar extends InfoBar {
    public boolean p;
    public final GH2 q;

    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return true;
    }

    public ReaderModeInfoBar() {
        super(R.drawable.0_resource_name_obfuscated_res_0x7f09035e, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, null);
        this.q = new GH2(this);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void s() {
        this.p = true;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        V1 v1 = new V1(this.l);
        v1.setText(R.string.0_resource_name_obfuscated_res_0x7f140932);
        v1.setTextSize(0, this.l.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080389));
        v1.setTextColor(Y50.b(this.l, R.color.0_resource_name_obfuscated_res_0x7f07014a));
        v1.setGravity(16);
        GH2 gh2 = this.q;
        v1.setOnClickListener(gh2);
        ImageView imageView = (ImageView) viewOnClickListenerC7418ll1.findViewById(R.id.infobar_icon);
        imageView.setOnClickListener(gh2);
        imageView.setImportantForAccessibility(2);
        int dimensionPixelOffset = this.l.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080378);
        v1.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        viewOnClickListenerC7418ll1.a(v1);
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void i() {
        if (u() != null) {
            u().X0();
        }
        super.i();
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final CharSequence o(CharSequence charSequence) {
        return this.l.getString(R.string.0_resource_name_obfuscated_res_0x7f140932);
    }

    public static ReaderModeInfoBar create() {
        return new ReaderModeInfoBar();
    }

    public final NH2 u() {
        long j = this.o;
        Tab tab = j == 0 ? null : (Tab) N.MTkhOevD(j, this);
        if (tab == null) {
            return null;
        }
        K44 F = tab.F();
        LinkedHashSet linkedHashSet = NH2.v;
        return (NH2) F.b(NH2.class);
    }
}
