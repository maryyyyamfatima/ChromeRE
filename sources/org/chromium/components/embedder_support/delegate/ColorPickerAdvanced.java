package org.chromium.components.embedder_support.delegate;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.android.chrome.R;
import defpackage.FW;
import defpackage.InterfaceC1183Jc2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ColorPickerAdvanced extends LinearLayout implements SeekBar.OnSeekBarChangeListener {
    public FW a;
    public FW g;
    public FW h;
    public InterfaceC1183Jc2 i;
    public int j;
    public final float[] k;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public ColorPickerAdvanced(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new float[3];
        setOrientation(1);
        this.a = a(R.string.f70880_resource_name_obfuscated_res_0x7f140376, 360, this);
        this.g = a(R.string.f70890_resource_name_obfuscated_res_0x7f140377, 100, this);
        this.h = a(R.string.f70900_resource_name_obfuscated_res_0x7f140378, 100, this);
        b();
    }

    public final FW a(int i, int i2, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.f56450_resource_name_obfuscated_res_0x7f0e008d, (ViewGroup) null);
        addView(inflate);
        return new FW(inflate, i, i2, onSeekBarChangeListener);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            float progress = this.a.b.getProgress();
            float[] fArr = this.k;
            fArr[0] = progress;
            fArr[1] = this.g.b.getProgress() / 100.0f;
            fArr[2] = this.h.b.getProgress() / 100.0f;
            this.j = Color.HSVToColor(fArr);
            c();
            d();
            e();
            InterfaceC1183Jc2 interfaceC1183Jc2 = this.i;
            if (interfaceC1183Jc2 != null) {
                interfaceC1183Jc2.a(this.j);
            }
        }
    }

    public final void c() {
        float[] fArr = new float[3];
        float[] fArr2 = this.k;
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        int[] iArr = new int[7];
        for (int i = 0; i < 7; i++) {
            fArr[0] = i * 60.0f;
            iArr[i] = Color.HSVToColor(fArr);
        }
        this.a.a(iArr);
    }

    public final void d() {
        float[] fArr = this.k;
        float[] fArr2 = {fArr[0], 0.0f, fArr[2]};
        fArr2[1] = 1.0f;
        this.g.a(new int[]{Color.HSVToColor(fArr2), Color.HSVToColor(fArr2)});
    }

    public final void e() {
        float[] fArr = this.k;
        float[] fArr2 = {fArr[0], fArr[1], 0.0f};
        fArr2[2] = 1.0f;
        this.h.a(new int[]{Color.HSVToColor(fArr2), Color.HSVToColor(fArr2)});
    }

    public final void b() {
        float[] fArr = this.k;
        int max = Math.max(Math.min(Math.round(fArr[1] * 100.0f), 100), 0);
        int max2 = Math.max(Math.min(Math.round(fArr[2] * 100.0f), 100), 0);
        this.a.b.setProgress((int) fArr[0]);
        this.g.b.setProgress(max);
        this.h.b.setProgress(max2);
        c();
        d();
        e();
    }
}
