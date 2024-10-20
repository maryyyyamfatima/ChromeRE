package defpackage;

import android.widget.SeekBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class FB1 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ GB1 a;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public FB1(GB1 gb1) {
        this.a = gb1;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float max = (i / (seekBar.getMax() / 0.5f)) + 0.3f;
        GB1 gb1 = this.a;
        gb1.getClass();
        AbstractC9454rh1.a(13);
        gb1.a.l(HB1.d, max);
        C2786Vl1 c2786Vl1 = gb1.b;
        if (c2786Vl1.d != VR3.h) {
            return;
        }
        c2786Vl1.e = max;
        ((BK3) c2786Vl1.c).s(C2786Vl1.c(c2786Vl1.f, max));
    }
}
