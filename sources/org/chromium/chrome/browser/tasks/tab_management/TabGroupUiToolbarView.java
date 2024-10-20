package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabGroupUiToolbarView extends FrameLayout {
    public ChromeImageView a;
    public ChromeImageView g;
    public ChromeImageView h;
    public ChromeImageView i;
    public ChromeImageView j;
    public ViewGroup k;
    public EditText l;
    public LinearLayout m;

    public TabGroupUiToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (ChromeImageView) findViewById(R.id.toolbar_left_button);
        this.a = (ChromeImageView) findViewById(R.id.toolbar_right_button);
        this.h = (ChromeImageView) findViewById(R.id.toolbar_menu_button);
        this.i = (ChromeImageView) findViewById(R.id.tab_strip_fading_edge_start);
        this.j = (ChromeImageView) findViewById(R.id.tab_strip_fading_edge_end);
        this.k = (ViewGroup) findViewById(R.id.toolbar_container_view);
        this.l = (EditText) findViewById(R.id.title);
        this.m = (LinearLayout) findViewById(R.id.main_content);
    }
}
