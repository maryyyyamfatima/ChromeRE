package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LP1 extends AbstractC6958kQ1 {
    public final /* synthetic */ d a;

    public LP1(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void i() {
        this.a.n(false);
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void e(MQ1 mq1, DQ1 dq1) {
        this.a.n(true);
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void k(DQ1 dq1) {
        d dVar = this.a;
        SeekBar seekBar = (SeekBar) dVar.V.get(dq1);
        int i = dq1.o;
        int i2 = d.t0;
        if (seekBar == null || dVar.Q == dq1) {
            return;
        }
        seekBar.setProgress(i);
    }
}
