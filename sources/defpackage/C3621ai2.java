package defpackage;

import android.widget.SeekBar;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ai2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3621ai2 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ PropertyModel a;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C3621ai2(PropertyModel propertyModel) {
        this.a = propertyModel;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((Callback) this.a.i(AbstractC2897Wh2.c)).onResult(Integer.valueOf(i));
        }
    }
}
