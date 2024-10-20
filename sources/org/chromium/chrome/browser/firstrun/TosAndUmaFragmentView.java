package org.chromium.chrome.browser.firstrun;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.android.chrome.R;
import org.chromium.chrome.browser.firstrun.TosAndUmaFragmentView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TosAndUmaFragmentView extends RelativeLayout {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;
    public ScrollView a;
    public LinearLayout g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public View o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public TosAndUmaFragmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ScrollView) findViewById(R.id.scroll_view);
        this.g = (LinearLayout) findViewById(R.id.fre_main_layout);
        this.h = findViewById(R.id.fre_title_and_content);
        this.i = findViewById(R.id.fre_content_wrapper);
        this.j = findViewById(R.id.fre_bottom_group);
        this.k = findViewById(R.id.title);
        this.l = findViewById(R.id.image);
        this.m = findViewById(R.id.loading_view_container);
        this.n = findViewById(R.id.privacy_disclaimer);
        this.o = findViewById(R.id.shadow);
        this.a.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: XS3
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i = TosAndUmaFragmentView.D;
                TosAndUmaFragmentView.this.a();
            }
        });
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: YS3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i = TosAndUmaFragmentView.D;
                TosAndUmaFragmentView.this.a();
            }
        });
        this.r = getResources().getDimensionPixelSize(R.dimen.f32380_resource_name_obfuscated_res_0x7f080248);
        this.s = getResources().getDimensionPixelSize(R.dimen.f32470_resource_name_obfuscated_res_0x7f080251);
        this.t = getResources().getDimensionPixelSize(R.dimen.f32460_resource_name_obfuscated_res_0x7f080250);
        this.u = getResources().getDimensionPixelSize(R.dimen.f32400_resource_name_obfuscated_res_0x7f08024a);
        this.v = getResources().getDimensionPixelSize(R.dimen.f32390_resource_name_obfuscated_res_0x7f080249);
        this.w = getResources().getDimensionPixelSize(R.dimen.f33800_resource_name_obfuscated_res_0x7f080352);
        this.x = getResources().getDimensionPixelSize(R.dimen.f32370_resource_name_obfuscated_res_0x7f080247);
        this.y = getResources().getDimensionPixelSize(R.dimen.f35890_resource_name_obfuscated_res_0x7f0804f2);
        this.z = getResources().getDimensionPixelSize(R.dimen.f32350_resource_name_obfuscated_res_0x7f080245);
        this.A = getResources().getDimensionPixelSize(R.dimen.f32360_resource_name_obfuscated_res_0x7f080246);
        int i = this.z;
        this.B = i;
        this.C = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.firstrun.TosAndUmaFragmentView.onMeasure(int, int):void");
    }

    public final boolean a() {
        int i = this.a.canScrollVertically(1) ? 0 : 8;
        if (i == this.o.getVisibility()) {
            return false;
        }
        this.o.setVisibility(i);
        return true;
    }
}
