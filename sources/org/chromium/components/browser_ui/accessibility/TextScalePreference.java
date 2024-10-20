package org.chromium.components.browser_ui.accessibility;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import java.text.NumberFormat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextScalePreference extends Preference implements SeekBar.OnSeekBarChangeListener {
    public float T;
    public float U;
    public TextView V;
    public TextView W;
    public final NumberFormat X;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public TextScalePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = 0.5f;
        this.X = NumberFormat.getPercentInstance();
        this.K = R.layout.f56790_resource_name_obfuscated_res_0x7f0e00b0;
        this.L = R.layout.f59870_resource_name_obfuscated_res_0x7f0e0212;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        SeekBar seekBar = (SeekBar) c1812Ny2.v(R.id.seekbar);
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(Math.round(30.0f));
        seekBar.setProgress(Math.round((this.T - 0.5f) / 0.05f));
        this.V = (TextView) c1812Ny2.v(R.id.seekbar_amount);
        this.W = (TextView) c1812Ny2.v(R.id.preview);
        this.V.setText(this.X.format(this.T));
        this.W.setTextSize(1, this.U * 12.0f);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            float f = (i * 0.05f) + 0.5f;
            if (f == this.T) {
                return;
            }
            f(Float.valueOf(f));
        }
    }
}
