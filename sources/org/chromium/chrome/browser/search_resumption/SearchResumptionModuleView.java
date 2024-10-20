package org.chromium.chrome.browser.search_resumption;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.chrome.R;
import defpackage.C10596v03;
import defpackage.C10939w03;
import defpackage.O83;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchResumptionModuleView extends LinearLayout {
    public View a;
    public ImageView g;
    public SearchResumptionTileContainerView h;

    public SearchResumptionModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.search_resumption_module_header);
        this.h = (SearchResumptionTileContainerView) findViewById(R.id.search_resumption_module_tiles_container);
        this.g = (ImageView) findViewById(R.id.header_option);
        a(!O83.a.e("Chrome.SearchResumptionModule.Collapse", false), true);
    }

    public final void a(boolean z, boolean z2) {
        if (z2 || this.h.a != z) {
            if (z) {
                this.g.setImageResource(R.drawable.f47550_resource_name_obfuscated_res_0x7f090200);
            } else {
                this.g.setImageResource(R.drawable.f47560_resource_name_obfuscated_res_0x7f090201);
            }
            String string = getContext().getResources().getString(z ? R.string.f65830_resource_name_obfuscated_res_0x7f140133 : R.string.f65700_resource_name_obfuscated_res_0x7f140126);
            String string2 = getContext().getResources().getString(R.string.f85710_resource_name_obfuscated_res_0x7f1409d0);
            this.a.setContentDescription(string2 + string);
        }
        SearchResumptionTileContainerView searchResumptionTileContainerView = this.h;
        boolean z3 = searchResumptionTileContainerView.a;
        if (z3 == z) {
            return;
        }
        boolean z4 = !z2;
        if (z3 == z) {
            return;
        }
        searchResumptionTileContainerView.a = z;
        if (z) {
            searchResumptionTileContainerView.measure(View.MeasureSpec.makeMeasureSpec(searchResumptionTileContainerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = searchResumptionTileContainerView.getMeasuredHeight();
            searchResumptionTileContainerView.getLayoutParams().height = 1;
            searchResumptionTileContainerView.setVisibility(0);
            C10596v03 c10596v03 = new C10596v03(searchResumptionTileContainerView, measuredHeight);
            c10596v03.setDuration(z4 ? 200L : 0L);
            searchResumptionTileContainerView.startAnimation(c10596v03);
            return;
        }
        C10939w03 c10939w03 = new C10939w03(searchResumptionTileContainerView, searchResumptionTileContainerView.getMeasuredHeight());
        c10939w03.setDuration(z4 ? 200L : 0L);
        searchResumptionTileContainerView.startAnimation(c10939w03);
    }
}
