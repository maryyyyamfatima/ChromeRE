package org.chromium.chrome.browser.search_resumption;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.Y50;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchResumptionTileView extends RelativeLayout {
    public GURL a;
    public TextView g;

    public SearchResumptionTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.tile_content);
    }

    public final void a(int i, int i2) {
        if (i == 0) {
            Context context = getContext();
            Object obj = Y50.a;
            setBackground(context.getDrawable(R.drawable.f53140_resource_name_obfuscated_res_0x7f09047e));
        } else if (i == i2 - 1) {
            Context context2 = getContext();
            Object obj2 = Y50.a;
            setBackground(context2.getDrawable(R.drawable.f53120_resource_name_obfuscated_res_0x7f09047c));
        }
    }
}
