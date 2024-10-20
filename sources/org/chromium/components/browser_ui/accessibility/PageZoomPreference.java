package org.chromium.components.browser_ui.accessibility;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC3027Xh2;
import defpackage.C1812Ny2;
import org.chromium.components.browser_ui.accessibility.PageZoomPreference;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PageZoomPreference extends Preference implements SeekBar.OnSeekBarChangeListener {
    public int T;
    public SeekBar U;
    public ChromeImageButton V;
    public ChromeImageButton W;
    public TextView X;
    public float Y;
    public ImageView Z;
    public LinearLayout.LayoutParams a0;
    public TextView b0;
    public TextView c0;
    public TextView d0;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public PageZoomPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = R.layout.f59310_resource_name_obfuscated_res_0x7f0e01d7;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        LinearLayout linearLayout = (LinearLayout) c1812Ny2.v(R.id.page_zoom_view_container);
        int paddingTop = linearLayout.getPaddingTop();
        int paddingBottom = linearLayout.getPaddingBottom();
        linearLayout.setBackground(null);
        linearLayout.setPadding(0, paddingTop, 0, paddingBottom);
        this.b0 = (TextView) c1812Ny2.v(R.id.page_zoom_preview_large_text);
        this.c0 = (TextView) c1812Ny2.v(R.id.page_zoom_preview_medium_text);
        this.d0 = (TextView) c1812Ny2.v(R.id.page_zoom_preview_small_text);
        Context context = this.a;
        this.Y = context.getResources().getDimensionPixelSize(R.dimen.f38100_resource_name_obfuscated_res_0x7f080649);
        this.Z = (ImageView) c1812Ny2.v(R.id.page_zoom_preview_image);
        this.a0 = new LinearLayout.LayoutParams(this.Z.getWidth(), this.Z.getHeight());
        TextView textView = (TextView) c1812Ny2.v(R.id.page_zoom_current_value_text);
        this.X = textView;
        textView.setText(context.getResources().getString(R.string.f79830_resource_name_obfuscated_res_0x7f140779, 100));
        ChromeImageButton chromeImageButton = (ChromeImageButton) c1812Ny2.v(R.id.page_zoom_decrease_zoom_button);
        this.V = chromeImageButton;
        chromeImageButton.setOnClickListener(new View.OnClickListener() { // from class: Uh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PageZoomPreference pageZoomPreference = PageZoomPreference.this;
                int c = AbstractC3027Xh2.c(AbstractC3027Xh2.a(pageZoomPreference.U.getProgress()), true);
                if (c >= 0) {
                    int b = AbstractC3027Xh2.b(AbstractC3027Xh2.a[c]);
                    pageZoomPreference.U.setProgress(b);
                    pageZoomPreference.f(Integer.valueOf(b));
                }
            }
        });
        ChromeImageButton chromeImageButton2 = (ChromeImageButton) c1812Ny2.v(R.id.page_zoom_increase_zoom_button);
        this.W = chromeImageButton2;
        chromeImageButton2.setOnClickListener(new View.OnClickListener() { // from class: Vh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PageZoomPreference pageZoomPreference = PageZoomPreference.this;
                int c = AbstractC3027Xh2.c(AbstractC3027Xh2.a(pageZoomPreference.U.getProgress()), false);
                double[] dArr = AbstractC3027Xh2.a;
                if (c <= 17) {
                    int b = AbstractC3027Xh2.b(dArr[c]);
                    pageZoomPreference.U.setProgress(b);
                    pageZoomPreference.f(Integer.valueOf(b));
                }
            }
        });
        SeekBar seekBar = (SeekBar) c1812Ny2.v(R.id.page_zoom_slider);
        this.U = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.U.setMax(475);
        this.U.setProgress(this.T);
        W(this.T);
    }

    public final void W(int i) {
        TextView textView = this.X;
        Resources resources = this.a.getResources();
        double[] dArr = AbstractC3027Xh2.a;
        double d = ((i / 475.0f) * 4.75f) + 0.25f;
        textView.setText(resources.getString(R.string.f79830_resource_name_obfuscated_res_0x7f140779, Long.valueOf(Math.round(100.0d * d))));
        float f = (float) d;
        this.b0.setTextSize(2, 16.0f * f);
        this.c0.setTextSize(2, 14.0f * f);
        this.d0.setTextSize(2, 12.0f * f);
        LinearLayout.LayoutParams layoutParams = this.a0;
        int i2 = (int) (this.Y * f);
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.Z.setLayoutParams(layoutParams);
        double a = AbstractC3027Xh2.a(i);
        ChromeImageButton chromeImageButton = this.V;
        double[] dArr2 = AbstractC3027Xh2.a;
        chromeImageButton.setEnabled(a > dArr2[0]);
        this.W.setEnabled(a < dArr2[17]);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        W(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        f(Integer.valueOf(seekBar.getProgress()));
    }
}
