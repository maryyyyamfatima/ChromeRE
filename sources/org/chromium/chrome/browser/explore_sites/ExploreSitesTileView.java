package org.chromium.chrome.browser.explore_sites;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.C6964kR2;
import defpackage.JG2;
import org.chromium.components.browser_ui.widget.tile.TileView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesTileView extends TileView {
    public final int k;
    public C6964kR2 l;

    public ExploreSitesTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.N);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(R.dimen.f30450_resource_name_obfuscated_res_0x7f080177));
        obtainStyledAttributes.recycle();
    }
}
