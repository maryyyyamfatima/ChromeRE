package org.chromium.components.webapps.installable;

import J.N;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.V1;
import defpackage.ViewOnClickListenerC7418ll1;
import org.chromium.components.infobars.InfoBar;
import org.chromium.components.webapps.WebappsIconUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InstallableAmbientBadgeInfoBar extends InfoBar implements View.OnClickListener {
    public final String p;
    public boolean q;

    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return true;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void s() {
        this.q = true;
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        V1 v1 = new V1(this.l);
        Resources resources = viewOnClickListenerC7418ll1.getResources();
        v1.setText(this.p);
        v1.setTextAppearance(v1.getContext(), R.style.f102570_resource_name_obfuscated_res_0x7f15043e);
        v1.setGravity(16);
        v1.setOnClickListener(this);
        ImageView imageView = (ImageView) viewOnClickListenerC7418ll1.findViewById(R.id.infobar_icon);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080387);
        imageView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        imageView.setOnClickListener(this);
        imageView.setImportantForAccessibility(2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080378);
        v1.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        viewOnClickListenerC7418ll1.a(v1);
    }

    public InstallableAmbientBadgeInfoBar(String str, Bitmap bitmap, int i) {
        super(i, 0, null, bitmap);
        this.p = str;
    }

    public static InfoBar show(int i, Bitmap bitmap, String str, String str2, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                bitmap = WebappsIconUtils.generateAdaptiveIconBitmap(bitmap);
            }
        }
        return new InstallableAmbientBadgeInfoBar(str, bitmap, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j = this.o;
        if (j == 0 || this.q) {
            return;
        }
        N.MzHO1MxZ(j, this);
    }
}
