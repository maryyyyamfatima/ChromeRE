package org.chromium.chrome.browser.ntp;

import android.content.Context;
import android.graphics.drawable.LevelListDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.LN3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RecentTabsGroupView extends RelativeLayout {
    public RecentTabsGroupView a;
    public ImageView g;
    public TextView h;
    public TextView i;

    public RecentTabsGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (RecentTabsGroupView) getRootView().findViewById(R.id.recent_tabs_group_view);
        this.i = (TextView) findViewById(R.id.time_label);
        this.h = (TextView) findViewById(R.id.device_label);
        this.g = (ImageView) findViewById(R.id.expand_collapse_icon);
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        levelListDrawable.addLevel(0, 0, LN3.b(getContext(), R.drawable.f47560_resource_name_obfuscated_res_0x7f090201));
        levelListDrawable.addLevel(1, 1, LN3.b(getContext(), R.drawable.f47550_resource_name_obfuscated_res_0x7f090200));
        this.g.setImageDrawable(levelListDrawable);
    }

    public final void a(boolean z) {
        this.g.setContentDescription(getResources().getString(z ? R.string.f65690_resource_name_obfuscated_res_0x7f140125 : R.string.f65800_resource_name_obfuscated_res_0x7f140130));
        this.g.getDrawable().setLevel(z ? 1 : 0);
    }

    public final void b(boolean z) {
        this.a.getLayoutParams().height = getResources().getDimensionPixelOffset(z ? R.dimen.f39630_resource_name_obfuscated_res_0x7f0806ee : R.dimen.f39620_resource_name_obfuscated_res_0x7f0806ed);
    }
}
