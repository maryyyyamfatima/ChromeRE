package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NP1 implements SeekBar.OnSeekBarChangeListener {
    public final MP1 a = new MP1(this);
    public final /* synthetic */ d g;

    public NP1(d dVar) {
        this.g = dVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        d dVar = this.g;
        if (dVar.Q != null) {
            dVar.O.removeCallbacks(this.a);
        }
        dVar.Q = (DQ1) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.g.O.postDelayed(this.a, 500L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            DQ1 dq1 = (DQ1) seekBar.getTag();
            int i2 = d.t0;
            dq1.j(i);
        }
    }
}
