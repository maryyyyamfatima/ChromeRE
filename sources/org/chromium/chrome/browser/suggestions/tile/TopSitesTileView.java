package org.chromium.chrome.browser.suggestions.tile;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.PL3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TopSitesTileView extends SuggestionsTileView {
    public TopSitesTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.chrome.browser.suggestions.tile.SuggestionsTileView
    public final void a(PL3 pl3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
        Resources resources = getResources();
        if (pl3.c == 1) {
            marginLayoutParams.width = resources.getDimensionPixelOffset(R.dimen.f42040_resource_name_obfuscated_res_0x7f0807e9);
            marginLayoutParams.height = resources.getDimensionPixelSize(R.dimen.f42040_resource_name_obfuscated_res_0x7f0807e9);
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.f42000_resource_name_obfuscated_res_0x7f0807e5);
        } else {
            marginLayoutParams.width = resources.getDimensionPixelSize(R.dimen.f42050_resource_name_obfuscated_res_0x7f0807ea);
            marginLayoutParams.height = resources.getDimensionPixelSize(R.dimen.f42050_resource_name_obfuscated_res_0x7f0807ea);
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.f42020_resource_name_obfuscated_res_0x7f0807e7);
        }
        this.i.setLayoutParams(marginLayoutParams);
    }
}
