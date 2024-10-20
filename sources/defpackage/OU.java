package defpackage;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class OU extends ImageView {
    public final ColorDrawable a;
    public int g;
    public float h;
    public int i;

    public OU(Context context, int i) {
        super(context);
        this.i = getVisibility();
        int b = AbstractC10957w33.b(getContext());
        this.g = getContext().getColor(R.color.f25840_resource_name_obfuscated_res_0x7f070827);
        ColorDrawable colorDrawable = new ColorDrawable(b);
        this.a = colorDrawable;
        setImageDrawable(new ClipDrawable(colorDrawable, 8388611, 1));
        setBackgroundColor(this.g);
        setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    public void a(float f) {
        if (this.h == f) {
            return;
        }
        this.h = f;
        getDrawable().setLevel(Math.round(f * 10000.0f));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        int visibility = getVisibility();
        int i2 = this.i;
        if (getAlpha() == 0.0f && this.i == 0) {
            i2 = 4;
        }
        if (visibility != i2) {
            super.setVisibility(i2);
        }
        return super.onSetAlpha(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        this.i = i;
        int visibility = getVisibility();
        int i2 = this.i;
        if (getAlpha() == 0.0f && this.i == 0) {
            i2 = 4;
        }
        if (visibility != i2) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (i == 0) {
            setBackground(null);
        } else {
            super.setBackgroundColor(i);
        }
        this.g = i;
    }
}
