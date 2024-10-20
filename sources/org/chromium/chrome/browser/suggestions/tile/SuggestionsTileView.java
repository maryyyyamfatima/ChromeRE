package org.chromium.chrome.browser.suggestions.tile;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.C7722me3;
import defpackage.PL3;
import org.chromium.components.browser_ui.widget.tile.TileView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SuggestionsTileView extends TileView {
    public C7722me3 k;

    public SuggestionsTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(PL3 pl3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
        Resources resources = getResources();
        int i = pl3.c;
        if (i == 2 || i == 3) {
            marginLayoutParams.width = resources.getDimensionPixelSize(R.dimen.f42090_resource_name_obfuscated_res_0x7f0807ee);
            marginLayoutParams.height = resources.getDimensionPixelSize(R.dimen.f42090_resource_name_obfuscated_res_0x7f0807ee);
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.f42080_resource_name_obfuscated_res_0x7f0807ed);
        } else {
            marginLayoutParams.width = resources.getDimensionPixelSize(R.dimen.f42050_resource_name_obfuscated_res_0x7f0807ea);
            marginLayoutParams.height = resources.getDimensionPixelSize(R.dimen.f42050_resource_name_obfuscated_res_0x7f0807ea);
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.f42020_resource_name_obfuscated_res_0x7f0807e7);
        }
        this.i.setLayoutParams(marginLayoutParams);
    }
}
