package org.chromium.chrome.browser.explore_sites;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C5590gR2;
import defpackage.C6964kR2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExperimentalExploreSitesCategoryTileView extends LinearLayout {
    public ExploreSitesCategoryTile a;
    public final Context g;
    public C6964kR2 h;
    public TextView i;
    public ImageView j;
    public int k;
    public int l;

    public ExperimentalExploreSitesCategoryTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (TextView) findViewById(R.id.experimental_explore_sites_category_tile_title);
        this.j = (ImageView) findViewById(R.id.experimental_explore_sites_category_tile_icon);
    }

    public final void a(Bitmap bitmap) {
        Drawable drawable;
        Resources resources = this.g.getResources();
        if (bitmap == null) {
            drawable = new BitmapDrawable(resources, this.h.a(this.a.c));
        } else {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.k, this.l, false);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f31650_resource_name_obfuscated_res_0x7f0801ff);
            C5590gR2 c5590gR2 = new C5590gR2(resources, createScaledBitmap);
            c5590gR2.b(dimensionPixelSize);
            drawable = c5590gR2;
        }
        this.a.getClass();
        this.j.setImageDrawable(drawable);
    }
}
