package org.chromium.chrome.browser.infobar;

import J.N;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC8540p04;
import defpackage.C1746Nl1;
import defpackage.ViewOnClickListenerC1876Ol1;
import defpackage.Y50;
import java.util.HashMap;
import org.chromium.chrome.browser.instantapps.InstantAppsBannerData;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.infobars.InfoBar;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstantAppsInfoBar extends ConfirmInfoBar {
    public final InstantAppsBannerData s;

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        ChromeImageView chromeImageView = viewOnClickListenerC1876Ol1.r;
        if (chromeImageView != null) {
            C1746Nl1 c1746Nl1 = (C1746Nl1) chromeImageView.getLayoutParams();
            int i = viewOnClickListenerC1876Ol1.a;
            ((ViewGroup.LayoutParams) c1746Nl1).width = i;
            ((ViewGroup.LayoutParams) c1746Nl1).height = i;
            c1746Nl1.b = viewOnClickListenerC1876Ol1.g;
            float dimension = viewOnClickListenerC1876Ol1.getContext().getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080376);
            HashMap hashMap = AbstractC8540p04.a;
            Typeface create = Typeface.create("sans-serif-medium", 0);
            TextView textView = viewOnClickListenerC1876Ol1.q;
            textView.setTypeface(create);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(0, dimension);
        }
        InstantAppsBannerData instantAppsBannerData = this.s;
        viewOnClickListenerC1876Ol1.j(instantAppsBannerData.a);
        viewOnClickListenerC1876Ol1.n.a(0, N.MR6Af3ZS(instantAppsBannerData.c, 1));
        DualControlLayout dualControlLayout = viewOnClickListenerC1876Ol1.s;
        (dualControlLayout == null ? null : (ButtonCompat) dualControlLayout.findViewById(R.id.button_primary)).i.a(Y50.b(this.l, R.color.0_resource_name_obfuscated_res_0x7f07002d));
    }

    public InstantAppsInfoBar(InstantAppsBannerData instantAppsBannerData) {
        super(0, 0, instantAppsBannerData.b, instantAppsBannerData.a, null, instantAppsBannerData.g, null);
        this.s = instantAppsBannerData;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar
    public final void u(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1, String str, String str2) {
        ImageView imageView = new ImageView(viewOnClickListenerC1876Ol1.getContext());
        imageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0901a4);
        viewOnClickListenerC1876Ol1.h(2, imageView, str);
    }

    public static InfoBar create(InstantAppsBannerData instantAppsBannerData) {
        return new InstantAppsInfoBar(instantAppsBannerData);
    }
}
