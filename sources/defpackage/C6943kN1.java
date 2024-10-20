package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.third_party.android.media.MediaController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kN1 */
/* loaded from: classes2.dex */
public final class C6943kN1 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MediaController a;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        MediaController mediaController = this.a;
        JE je = mediaController.a;
        if (je != null && z) {
            CafExpandedControllerActivity cafExpandedControllerActivity = je.a;
            long j = ((!cafExpandedControllerActivity.z.g() ? 0L : cafExpandedControllerActivity.z.f.a.a) * i) / 1000;
            mediaController.a.b(j);
            TextView textView = mediaController.j;
            if (textView != null) {
                textView.setText(mediaController.a((int) j));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.k = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        MediaController mediaController = this.a;
        mediaController.k = false;
        mediaController.d();
        mediaController.c();
    }

    public C6943kN1(MediaController mediaController) {
        this.a = mediaController;
    }
}
