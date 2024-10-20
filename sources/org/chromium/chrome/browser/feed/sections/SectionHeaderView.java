package org.chromium.chrome.browser.feed.sections;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.C0249Bx3;
import defpackage.C3734b13;
import defpackage.C7170l13;
import defpackage.C7514m13;
import defpackage.M41;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC7858n13;
import org.chromium.chrome.browser.feed.sections.SectionHeaderView;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SectionHeaderView extends LinearLayout {
    public static final /* synthetic */ int o = 0;
    public ImageView a;
    public TabLayout g;
    public TextView h;
    public ListMenuButton i;
    public C7170l13 j;
    public RelativeLayout k;
    public View l;
    public boolean m;
    public int n;

    public SectionHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (TextView) findViewById(R.id.header_title);
        this.i = (ListMenuButton) findViewById(R.id.header_menu);
        this.a = (ImageView) findViewById(R.id.section_status_indicator);
        this.g = (TabLayout) findViewById(R.id.tab_list_view);
        this.k = (RelativeLayout) findViewById(R.id.main_content);
        TabLayout tabLayout = this.g;
        if (tabLayout != null) {
            C7170l13 c7170l13 = new C7170l13(this);
            this.j = c7170l13;
            tabLayout.b(c7170l13);
        }
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f32160_resource_name_obfuscated_res_0x7f080232);
        this.i.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: e13
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = SectionHeaderView.o;
                SectionHeaderView sectionHeaderView = SectionHeaderView.this;
                sectionHeaderView.getClass();
                Rect rect = new Rect();
                sectionHeaderView.i.getHitRect(rect);
                int width = sectionHeaderView.i.getWidth();
                int i10 = dimensionPixelSize;
                int max = Math.max((i10 - width) / 2, 0);
                int max2 = Math.max((i10 - sectionHeaderView.i.getHeight()) / 2, 0);
                rect.left -= max;
                rect.right += max;
                rect.top -= max2;
                rect.bottom += max2;
                sectionHeaderView.setTouchDelegate(new TouchDelegate(rect, sectionHeaderView.i));
            }
        });
    }

    public final void a(C0249Bx3 c0249Bx3) {
        C7514m13 c7514m13 = (C7514m13) c0249Bx3.a;
        c0249Bx3.d(c7514m13.c);
        c0249Bx3.h.setClickable(this.m);
        c0249Bx3.h.setEnabled(this.m);
        String str = c7514m13.c;
        if (c7514m13.a && this.m) {
            StringBuilder a = M41.a(str, ", ");
            a.append(getResources().getString(R.string.f66040_resource_name_obfuscated_res_0x7f140149));
            str = a.toString();
            if (c7514m13.b == null && c0249Bx3.f != null) {
                c7514m13.b = new ViewTreeObserverOnGlobalLayoutListenerC7858n13(this, c0249Bx3.h.findViewById(android.R.id.text1));
            }
        } else {
            ViewTreeObserverOnGlobalLayoutListenerC7858n13 viewTreeObserverOnGlobalLayoutListenerC7858n13 = c7514m13.b;
            if (viewTreeObserverOnGlobalLayoutListenerC7858n13 != null) {
                View view = viewTreeObserverOnGlobalLayoutListenerC7858n13.a;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC7858n13);
                C3734b13 c3734b13 = viewTreeObserverOnGlobalLayoutListenerC7858n13.g;
                c3734b13.getClass();
                view.getOverlay().remove(c3734b13);
                c3734b13.invalidateSelf();
                c7514m13.b = null;
            }
        }
        c0249Bx3.c(str);
    }
}
