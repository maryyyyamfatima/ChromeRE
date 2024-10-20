package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class S23 extends U23 {
    public static final /* synthetic */ int E = 0;
    public int A;
    public boolean B;
    public boolean C;
    public ViewGroup D;
    public final int n;
    public final int o;
    public final C6674jc p;
    public int q;
    public LinearLayout r;
    public ImageView s;
    public C1844Of t;
    public C1844Of u;
    public TextView v;
    public TextView w;
    public ColorStateList x;
    public Drawable y;
    public int z;

    public ColorStateList p() {
        return null;
    }

    public S23(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = ColorStateList.valueOf(AbstractC10957w33.d(context));
        this.n = getResources().getInteger(R.integer.f54680_resource_name_obfuscated_res_0x7f0c0043);
        this.o = getResources().getInteger(R.integer.f54700_resource_name_obfuscated_res_0x7f0c0045);
        this.p = C6674jc.b(getContext(), R.drawable.f47160_resource_name_obfuscated_res_0x7f0901d6);
        this.A = R.drawable.f51090_resource_name_obfuscated_res_0x7f090371;
        this.z = R.layout.f58800_resource_name_obfuscated_res_0x7f0e0187;
    }

    public final void r(View view) {
        if (this.C) {
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    @Override // defpackage.U23, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        q();
        this.B = true;
    }

    public final void q() {
        LayoutInflater.from(getContext()).inflate(this.z, this);
        this.r = (LinearLayout) findViewById(R.id.content);
        this.s = (ImageView) findViewById(R.id.start_icon);
        this.u = (C1844Of) findViewById(R.id.end_button);
        this.v = (TextView) findViewById(R.id.title);
        this.w = (TextView) findViewById(R.id.description);
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setBackgroundResource(this.A);
            this.s.setImageTintList(p());
        }
        if (this.C) {
            this.t = (C1844Of) findViewById(R.id.optional_button);
            this.D = (ViewGroup) findViewById(R.id.custom_content_container);
            this.s.getLayoutParams().width = this.q;
            this.s.getLayoutParams().height = this.q;
            this.s.requestLayout();
        }
    }

    public final void s(Drawable drawable) {
        this.y = drawable;
        o(false);
    }

    @Override // defpackage.U23
    public void o(boolean z) {
        if (this.s == null) {
            return;
        }
        if (isChecked()) {
            this.s.getBackground().setLevel(this.o);
            ImageView imageView = this.s;
            C6674jc c6674jc = this.p;
            imageView.setImageDrawable(c6674jc);
            this.s.setImageTintList(this.x);
            if (z) {
                c6674jc.start();
                return;
            }
            return;
        }
        this.s.getBackground().setLevel(this.n);
        this.s.setImageDrawable(this.y);
        this.s.setImageTintList(p());
    }
}
