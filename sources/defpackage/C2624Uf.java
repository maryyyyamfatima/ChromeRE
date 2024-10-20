package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2624Uf extends RatingBar {
    public final C2364Sf a;

    public C2624Uf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f11750_resource_name_obfuscated_res_0x7f0503c4);
        AbstractC3838bK3.a(getContext(), this);
        C2364Sf c2364Sf = new C2364Sf(this);
        this.a = c2364Sf;
        c2364Sf.a(attributeSet, R.attr.f11750_resource_name_obfuscated_res_0x7f0503c4);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.a.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
