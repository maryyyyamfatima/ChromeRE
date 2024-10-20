package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C8861pw3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabGridIphDialogView extends LinearLayout {
    public final int a;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final Context k;
    public View l;
    public Drawable m;
    public Animatable n;
    public C8861pw3 o;
    public ViewGroup.MarginLayoutParams p;
    public ViewGroup.MarginLayoutParams q;
    public int r;

    public TabGridIphDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = context;
        this.a = (int) context.getResources().getDimension(R.dimen.f41160_resource_name_obfuscated_res_0x7f080790);
        this.g = (int) context.getResources().getDimension(R.dimen.f41200_resource_name_obfuscated_res_0x7f080794);
        this.h = (int) context.getResources().getDimension(R.dimen.f41170_resource_name_obfuscated_res_0x7f080791);
        this.i = (int) context.getResources().getDimension(R.dimen.f41190_resource_name_obfuscated_res_0x7f080793);
        this.j = (int) context.getResources().getDimension(R.dimen.f41180_resource_name_obfuscated_res_0x7f080792);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = ((ImageView) findViewById(R.id.animation_drawable)).getDrawable();
        this.m = drawable;
        this.n = (Animatable) drawable;
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.description);
        this.o = new C8861pw3(this);
        this.p = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        this.q = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
    }

    public final void a() {
        int i;
        if (this.r == this.l.getHeight()) {
            return;
        }
        this.r = this.l.getHeight();
        if (this.k.getResources().getConfiguration().orientation == 1) {
            i = this.i;
        } else {
            i = this.j;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.p;
        int i2 = this.h;
        marginLayoutParams.setMargins(i2, i, i2, i);
        this.q.setMargins(i2, 0, i2, i);
        setMinimumHeight(Math.min(this.a, this.r - (this.g * 2)));
    }
}
