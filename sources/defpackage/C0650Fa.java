package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650Fa extends Preference {
    public C0650Fa(Context context) {
        super(context, null);
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.f38330_resource_name_obfuscated_res_0x7f080660);
        View v = c1812Ny2.v(android.R.id.icon);
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        v.setLayoutParams(layoutParams);
    }
}
